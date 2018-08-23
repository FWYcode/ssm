package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Student;
import service.IStuService;

@Controller
@RequestMapping("/stu")
public class Login {
	@Autowired
	private IStuService iss;
	@RequestMapping("/tolog")
	public String dolog(){
		
		return "login";
	}
	@RequestMapping("/dolog")
	public String login(Student stu,HttpSession session) throws Exception{
		Student stfind=iss.findById(stu);

		if(stfind==null||!stu.getPass().equals(stfind.getPass())){
			return "redirect:/stu/tolog";
		}
			
		session.setAttribute("stfind", stfind);
		System.out.println(stfind);
		return "index";
	}
}
