package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hotel.entity.Type;
import com.hotel.service.TypeService;

@Controller
@RequestMapping("**.do")
public class TypeController {
	TypeService typeService;

	public TypeService getTypeService() {
		return typeService;
	}

	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	
	@RequestMapping("showtype")
	public String  showType(Model model)
	{
		List<Type> list = typeService.findAll();
		model.addAttribute("list", list);
		return "type";
	}
	
	@RequestMapping("addtype")
	public String addType(Type type)
	{
		typeService.add(type);
		return "forward:showtype.do";
	}

	@RequestMapping("modifytype")
	public String modifyType(Type type)
	{
		typeService.update(type);
		return "forward:showtype.do";
	}
	
	@RequestMapping("removetype")
	public String removeType(int typeId)
	{
		typeService.delete(typeId);
		return "forward:showtype.do";
	}
	
}
