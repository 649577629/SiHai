package cn.yj.sihai.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/** 视图控制器 */
@Controller
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class IndexController {
	/**
	 * 首页
	 */
	@GetMapping(value = "/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

}
