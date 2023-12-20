package co.com.example.pokemon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.example.pokemon.Dto.LoginRequest;
import co.com.example.pokemon.Dto.LoginResponse;
import co.com.example.pokemon.entity.Entrenador;
import co.com.example.pokemon.repository.EntrenadorRepository;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {
	
	@Autowired
	EntrenadorRepository entrenadorRepository;
	
	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		
		Optional<Entrenador>entrenador=entrenadorRepository.findByEmail(loginRequest.getEmail());
		if(entrenador.isPresent()) {
			LoginResponse loginResponse=new LoginResponse();
			loginResponse.setUuid(entrenador.get().getUuid());
		}
		return null;
		
	}

}
