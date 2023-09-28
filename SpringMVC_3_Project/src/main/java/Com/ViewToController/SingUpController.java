package Com.ViewToController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import UserDao.User;
import UserDao.UserService;

@Controller
public class SingUpController {
	
	private UserService userService;
	 
	
	@RequestMapping("/contact")
   public String contact( Model model) {
	   return "SignUp";
   }
	
	
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String handleFormData(@ModelAttribute User user,Model model ){
		//model.addAttribute("heading","I have to Qulified the interview any how");
		//model.addAttribute("para", "I hope i can do it by learning this frame work......");
		System.out.println(user);
		
		model.addAttribute("u",user.getUserName());
		model.addAttribute("e",user.getUserEmail());
		model.addAttribute("p",user.getUserPassword());
		
		return "success";
	}
}
