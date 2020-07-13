package com.hotel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Admin;
import com.hotel.service.AdminService;

@Controller
@RequestMapping("**.do")
public class LoginController {
	
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@RequestMapping("login")
	public String doLogin(String adminUsername,String password,HttpServletRequest request)
	{
		Admin admin = adminService.findByAnameAndPassword(adminUsername, password);
		if(admin == null)
		{
			request.setAttribute("msg", "用户名或密码有误，请重新输入。");
			return "../../login";
		} else {
			request.getSession().setAttribute("admin", admin);
			return "forward:showstaff.do";
		}
		
	}
	
	@RequestMapping("logout")
	public String doLogout(HttpServletRequest request)
	{
		request.setAttribute("msg", "您已退出系统");
		request.getSession().invalidate();
		return "../../login";
	}
	
}
