package com.yc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IGoodsInfoBiz;

@Controller
@RequestMapping("goods")
public class GoodInfoController {
	@Autowired
	IGoodsInfoBiz biz;
	
//	@RequestMapping("upload")
//	@ResponseBody
//	public Map<String, Object> upload(@RequestParam("pic")){
//		
//	}
	
}
