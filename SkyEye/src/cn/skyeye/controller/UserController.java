package cn.skyeye.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.skyeye.enity.User;
import cn.skyeye.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
   @Resource
   private UserService uservice;
   @RequestMapping("/loginUI.do")
   public String loginUI(){
	   return "/user/loginUI";
   }
   @RequestMapping("/login.do")
   public ModelAndView login(String username,String password,HttpServletRequest request){
	   String md5Password=DigestUtils.md5Hex(password);
	   User user=uservice.findBy(username,md5Password);
	   if(user!=null){
		   request.getSession().setAttribute("user", user);
		   return  new ModelAndView("/index");
	   }else{
		   return new ModelAndView("/user/loginUI", "msg", "’ÀªßªÚ√‹¬Î¥ÌŒÛ");
	   }
	   
	   
   }
   @RequestMapping("/logout.do")
   public String logout(HttpServletRequest request){
	   request.removeAttribute("user");
	   return "/user/loginUI";
   }
   @RequestMapping("/resetPasswordUI.do")
   public String resetPasswordUI(String userId,Model model){
	   User user=uservice.find(userId);
	   model.addAttribute("user",user);
	   return "/user/resetPasswordUI";
   }
   @RequestMapping("/resetPassword.do")
   public void resetPassword(String userId,String password){
	   User user=uservice.find(userId);
	   user.setPassword(DigestUtils.md5Hex(password));
	   uservice.update(user);
   }
   @RequestMapping("/check.do")
   public void check(){
	   
	   
   }
   
}
