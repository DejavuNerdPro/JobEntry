package ace.jobFinder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ace.jobFinder.Model.User;

@Controller
public class JobFinderController {

	@Autowired
	User user;

	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String doSignup(User user){
		return "This is it.";
	}
}
