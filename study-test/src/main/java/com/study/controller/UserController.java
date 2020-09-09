package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuminjun yuminjun@lexiangbao.com
 * @version 1.00
 * @date 2020/9/9 10:38
 * @record <pre>
 * version  author      date      desc
 * -------------------------------------------------
 * 1.00     yuminjun    2020/9/9   新建
 * -------------------------------------------------
 * </pre>
 */
@RequestMapping
@RestController
public class UserController {

	@GetMapping("/user")
	public String getUser(String name) {
		return "user is " + name;
	}

}
