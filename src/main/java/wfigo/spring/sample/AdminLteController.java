package wfigo.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLteController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/adminlte/portal")
	public String portal() {
		
		return "adminlte/portal_local";
	}
}
