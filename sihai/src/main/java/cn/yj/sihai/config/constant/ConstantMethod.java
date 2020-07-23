package cn.yj.sihai.config.constant;

import lombok.extern.slf4j.Slf4j;
import path.HttpPathUtil;
import path.IPPathUtil;
import path.boot.LocalPathUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 静态方法类
 */
@Slf4j
public class ConstantMethod {
    //------------------------------------------------------------------------------------------------------------------初始化项目常量参数

    /**
     * 初始化项目常量参数
     */
    public static void initializeProjectConstantParameter() {
        //本项目本地路径
        if (ConstantParameter.projectLocalPath == null || ConstantParameter.projectLocalPath.isEmpty()) {
            ConstantParameter.projectLocalPath = LocalPathUtil.getFilePath();
            log.info("初始化本项目本地路径成功 : " + ConstantParameter.projectLocalPath);
        }
        //本项目群本地路径
        if (!ConstantParameter.projectLocalPath.isEmpty() && (ConstantParameter.projectGroupLocalPath == null || ConstantParameter.projectGroupLocalPath.isEmpty())) {
            ConstantParameter.projectGroupLocalPath = ConstantParameter.projectLocalPath.substring(0, ConstantParameter.projectLocalPath.lastIndexOf(File.separator));
            log.info("初始化本项目群本地路径成功 : " + ConstantParameter.projectGroupLocalPath);
        }
        //本地static目录
        if (ConstantParameter.staticLocalPath == null || ConstantParameter.staticLocalPath.isEmpty()) {
            ConstantParameter.staticLocalPath = LocalPathUtil.getClassPath() + File.separator + "static";
            log.info("初始化本地static目录成功 : " + ConstantParameter.staticLocalPath);
        }
        //主机IP
        if (ConstantParameter.hostIP == null || ConstantParameter.hostIP.isEmpty()) {
            ConstantParameter.hostIP = IPPathUtil.getHostIP();
            log.info("初始化主机IP成功 : " + ConstantParameter.hostIP);
        }
    }

    /**
     * 初始化请求常量参数
     */
    public static void initializeRequestConstantParameter(HttpServletRequest request) {
        //项目名称
        if (ConstantParameter.projectName == null) {
            ConstantParameter.projectName = HttpPathUtil.getProjectName(request);
            log.info("初始化项目名称成功 : " + ConstantParameter.projectName);
        }
        //项目HTTP访问项目地址
        if (ConstantParameter.projectPath == null || ConstantParameter.projectPath.isEmpty()) {
            ConstantParameter.projectPath = HttpPathUtil.getPath(request);
            log.info("初始化项目HTTP访问项目地址成功 : " + ConstantParameter.projectPath);
        }
        //项目HTTP访问资源目录地址
        if (ConstantParameter.resourcesPath == null || ConstantParameter.resourcesPath.isEmpty()) {
            ConstantParameter.resourcesPath = HttpPathUtil.getResourcesPath(request);
            log.info("初始化项目HTTP访问资源目录地址成功 : " + ConstantParameter.resourcesPath);
        }

        //项目名称
        if (request.getSession().getAttribute(ConstantParameter.SessionProjectNameName) == null) {
            request.getSession().setAttribute(ConstantParameter.SessionProjectNameName, ConstantParameter.projectName);
            log.info("初始化当前用户项目名称成功 : " + ConstantParameter.SessionProjectNameName + " = " + ConstantParameter.projectName);
        }
        //访问者ip地址
        if (request.getSession().getAttribute(ConstantParameter.SessionVisitorIpAddressName) == null) {
            String userIP = IPPathUtil.getVisitorIpAddress(request);
            request.getSession().setAttribute(ConstantParameter.SessionVisitorIpAddressName, userIP);
            log.info("初始化当前访问者ip地址成功 : " + ConstantParameter.SessionVisitorIpAddressName + " = " + userIP);
        }
        //项目地址
        if (request.getSession().getAttribute(ConstantParameter.SessionProjectPathName) == null) {
            request.getSession().setAttribute(ConstantParameter.SessionProjectPathName, ConstantParameter.projectPath);
            log.info("初始化当前用户项目地址成功 : " + ConstantParameter.SessionProjectPathName + " = " + ConstantParameter.projectPath);
        }
    }
    //------------------------------------------------------------------------------------------------------------------日志输出

    /**
     * 日志信息
     *
     * @param e 错误内容
     * @return 日志 -> 类:***   方法:***   行:***  错误:***
     */
    public static String logMessage(Exception e) {
        return "类:" + e.getStackTrace()[0].getClassName() +
                "   方法:" + e.getStackTrace()[0].getMethodName() +
                "   行:" + e.getStackTrace()[0].getLineNumber() +
                "   错误:" + e.getMessage();
    }


}

