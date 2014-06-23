package com.duoduo.app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-6-23 下午2:28:15
 * @version 1.0.0
 */
@Controller
public class AppController {

	protected static Logger logger = Logger.getLogger("controller");

	/**
	 * 指向登录页面
	 */
	@RequestMapping(value = {
			"/", "/auth/login"
	}, method = RequestMethod.GET)
	public String getLoginPage(@RequestParam(value = "error", required = false) boolean error, ModelMap model) {

		logger.debug("Received request to show login page");

		if (error == true) {
			// Assign an error message
			model.put("error", "You have entered an invalid username or password!");
		} else {
			model.put("error", "");
		}
		return "loginpage";

	}

	/**
	 * 指定无访问额权限页面
	 * @return
	 */
	@RequestMapping(value = "/auth/denied", method = RequestMethod.GET)
	public String getDeniedPage() {

		logger.debug("Received request to show denied page");

		return "deniedpage";

	}
}
