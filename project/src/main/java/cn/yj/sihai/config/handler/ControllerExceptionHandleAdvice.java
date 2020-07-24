package cn.yj.sihai.config.handler;

import cn.yj.sihai.config.constant.ConstantMethod;
import cn.yj.sihai.config.constant.ConstantParameter;
import dispose.DateDispose;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * controller 错误处理
 */
@Slf4j
@ControllerAdvice("cn.yj.sihai.controller")
public class ControllerExceptionHandleAdvice {
    @ExceptionHandler
    public void handler(HttpServletRequest request, HttpServletResponse response, Exception e) throws IOException {
        log.error(ConstantMethod.logMessage(e));
        log.error("[" + DateDispose.formatting_DateToString(new Date()) + "] 视图控制层异常发生内容为 -> " + e.getMessage(), e);

        response.sendRedirect(ConstantParameter.projectPath + "/templates/error/error.html");
    }
}
