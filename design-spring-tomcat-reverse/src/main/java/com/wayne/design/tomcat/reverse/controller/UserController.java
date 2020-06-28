package com.wayne.design.tomcat.reverse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author
 */
@Controller
public class UserController {

	@RequestMapping("/pageIndex")
	public String pageIndex() {
		return "pageIndex";
	}

}
