package com.example.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.UserModel;
import com.example.service.UserService;



@Controller
@RequestMapping("/")
public class MainController {

	@Resource
	UserService userService;
	
	//ホーム画面系を表示
	@GetMapping
	public String home() {
		return "home";
	}
	@PostMapping("/home")
	public String home1(){
	
	return "home";	
	}	
	
	//データインポートの画面系
	@GetMapping("/DataInput")
	public String datainput() {
		return "DataInput";
	}
	@PostMapping("/DataInput")
	public String datainputIndex(UserModel userModel,Model model){
		userService.insert(userModel);
		
	return "DataInput";	
	}
	
	//管理者のログイン画面系
	@GetMapping("/AdminLogin")
	public String Admin() {
		return "AdminLogin";
	}
	@PostMapping("/AdminLogin")
	public String Adminlogin(){
	
	return "AdminLogin";
	}
	
	//データを表示画面系
	@GetMapping("/DataList")
	public String DataList() {
		return "DataList";
	}
	
	@PostMapping("/DataList")
	public String Datalist(){
	
	return "DataList";
	}
	
}
