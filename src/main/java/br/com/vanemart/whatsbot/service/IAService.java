package br.com.vanemart.whatsbot.service;

import org.springframework.stereotype.Service;

@Service
public class IAService {
	
	public String getResposta(String texto) {
		return "resposta robô ed " + texto;
	}

}
