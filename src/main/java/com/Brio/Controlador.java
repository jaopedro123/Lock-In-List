package com.Brio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

		@GetMapping("")
		public String Index() {
			return "Index";
		}
	
}
