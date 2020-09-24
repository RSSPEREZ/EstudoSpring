package br.com.rfei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaControler {

	@RequestMapping("/")
	@ResponseBody
	public String OlaSpring(){
		return "Ola mundo";
	}
}
