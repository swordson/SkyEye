package cn.skyeye.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.skyeye.service.SysconfigService;

@Controller
@RequestMapping("/set")
public class SysconfigController {
	@Resource
	private SysconfigService sysconfigService;
	@RequestMapping("/settingUI.do")
	public String settingUI(){
		return "/set/settingUI";
	}
	@RequestMapping("/set.do")
	public void set(){
		
	}
	@RequestMapping("/osList.do")
	public String osList(){
		return "/set/osList";
	}
	@RequestMapping("/osAddUI.do")
	public String osAddUI(){
		return "/set/osAddUI";
	}
	@RequestMapping("/osAdd.do")
	public String osAdd(){
		return "redirect:/set/osList.do";
	}
	@RequestMapping("/osEditUI.do")
	public String osEditUI(){
		return "/set/osEditUI.do";
	}
	@RequestMapping("/osEdit.do")
	public String osEdit(){
		return "redirect:/set/osList.do";
	}
	@RequestMapping("/osDelete.do")
	public String osDelete(){
		return "redirect:/set/osList.do";
	}
	@RequestMapping("/osOpen.do")
	public String osOpen(){
		return "/set/osList.do";
	}
	@RequestMapping("/osClose.do")
	public String osClose(){
		return "/set/osList.do";
	}
	
	

}
