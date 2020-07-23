package cn.yj.sihai.config.handler;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.sihai.config.constant.ConstantMethod;
import dispose.DateDispose;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * restcontroller 错误处理
 */
@Slf4j
@RestControllerAdvice("cn.yj.sihai.restcontroller")
public class RestControllerExceptionHandleAdvice {
    @ExceptionHandler
    public ResultMessage handler(Exception e) {
        log.error(ConstantMethod.logMessage(e));
        log.error("[" + DateDispose.formatting_DateToString(new Date()) + "] 数据接口异常发生内容为 -> " + e.getMessage(), e);

        if (e instanceof BusinessException) {
            return new ResultMessage(500, "服务器忙,请稍后再试");
        } else if (e instanceof NullPointerException) {
            return new ResultMessage(500, "发生空指针异常");
        } else if (e instanceof NoSuchMethodException) {
            return new ResultMessage(500, "未能找到该执行的方法");
        } else if (e instanceof IllegalArgumentException) {
            return new ResultMessage(500, "请求参数类型不匹配");
        } else {
            return new ResultMessage(500, "服务器代码发生异常,请联系管理员");
        }
    }
}
