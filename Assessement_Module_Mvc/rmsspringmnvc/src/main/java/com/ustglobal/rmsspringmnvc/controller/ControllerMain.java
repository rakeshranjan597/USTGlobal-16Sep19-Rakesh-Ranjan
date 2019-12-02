package com.ustglobal.rmsspringmnvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.rmsspringmnvc.dto.ProductBean;
import com.ustglobal.rmsspringmnvc.dto.RetailerBean;
import com.ustglobal.rmsspringmnvc.service.RetailerProductService;

@Controller
public class ControllerMain {

	@Autowired
	RetailerProductService service;
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "You are Successfully Registered and Id is "+check);
			
		}else {
			map.addAttribute("msg", "Failed To Register");
		}
		return "login";
		
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request  ) {
		RetailerBean bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", " Failed To Login!!! Plz try again....");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}
	
	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name="bean",required = false)RetailerBean bean ) {
		if(bean == null) {
			map.addAttribute("msg", "Please Login First!!!!");
			return "login";
		}else {
			return "home";
		}
	}
	
	@PostMapping("/home")
	public String home() {
		return "home";		
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("pid") int pid, ModelMap map) {
		ProductBean bean = service.searchProduct(pid);
		if(bean == null) {
			map.addAttribute("msg", "Data Not Avialable!!!");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@GetMapping("/updatepassword")
	public String updatePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "updatepassword";
		}else {
			return "login";
		}
		
	}
	
	@PostMapping("/updatepassword")
	public String updatePassword(String newpassword, String confirmpassword,
			@SessionAttribute(name="bean") RetailerBean bean, ModelMap map) {
		if(newpassword.equals(confirmpassword)) {
			int result = service.updatePassword(bean.getRid(), newpassword);
			if (result == 1)
				map.addAttribute("msg" ,"Password Successfully Updated!!!");
			else
				map.addAttribute("msg" ,"Failed To Update!!!");
		}else {
			map.addAttribute("msg" ,"Password must be matching!!!");
		}
		return "home";
	}
	
	@GetMapping("/buy")
	public String buy(@RequestParam("bid") int bid, ModelMap map) {
		ProductBean bean = service.buyOneProduct(bid);
		if(bean == null) {
			map.addAttribute("msg", "Failed To Buy!!!");
		}else {
			
			map.addAttribute("msg", "One Product "+ bean.getPname()+ " bought Successfully whose cost is: " +bean.getPriceperunit() );
		}
		return "home";
	}
}
