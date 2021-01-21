package br.com.vanemart.whatsbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vanemart.whatsbot.service.QrCodeService;

@RestController
@RequestMapping("qrcode")
public class QrCodeController {
	
	@Autowired
	private QrCodeService service;
	
	@GetMapping("/obter")
	@ResponseBody
	private String obterQrCode() {
		
		return service.obterQrCode();
	}
	

}
