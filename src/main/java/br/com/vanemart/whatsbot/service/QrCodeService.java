package br.com.vanemart.whatsbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class QrCodeService {
	
	@Value("${url.web.whatsapp}")
	private String urlWhatsappWeb;
	
	public String obterQrCode() {
		
	
		return Unirest.get(urlWhatsappWeb)
				.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
				.asString().getBody();
				
	} 

}
