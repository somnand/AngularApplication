package core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController
{
	@RequestMapping("welcome")
	@ResponseBody
	public String welcome()
	{
		System.out.println("WelcomeController is called");
		return "<b>Welcome new user</b>";
	}
}
