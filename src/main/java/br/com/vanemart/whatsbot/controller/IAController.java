package br.com.vanemart.whatsbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vanemart.whatsbot.service.IAService;

@RestController
@RequestMapping("ia")
public class IAController {
	
	@Autowired
	private IAService service;
	
	@GetMapping("/resposta")
	@ResponseBody
	public String getResposta(@RequestParam String texto) {
		return service.getResposta(texto);
	} 

}
