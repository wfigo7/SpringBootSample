package wfigo.spring.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller
public class AdminLteController {
	
	@Autowired
	TableauService tableauService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/adminlte/portal")
	public String portal() {
		
		return "adminlte/portal";
	}
	
	@RequestMapping("/adminlte/tableau")
	public String tableau(Model model) {
		
		List<Category> categoryList = tableauService.getCategoryList();
		Gson gson = new Gson();
		model.addAttribute("categoryList", gson.toJson(categoryList));
		return "adminlte/tableau";
	}
	
	
}
