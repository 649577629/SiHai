package cn.yj.sihai.config.interceptor;

import cn.yj.sihai.config.constant.ConstantMethod;
import dispose.DateDispose;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截器
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 拦截方法 不进拦截器的内容在WebMvcConfig中已配置，此处只处理必进拦截器的内容
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //初始化resources地址
        ConstantMethod.initializeRequestConstantParameter(request);

        log.info(">>>: " + request.getRequestURL() + " ----- " + DateDispose.Year_Month_Day_Hour_Minute_Second() + " ----- 访问");

        return true;
    }

}
