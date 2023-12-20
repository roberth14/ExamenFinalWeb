package co.com.example.pokemon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.example.pokemon.Dto.LoginRequest;
import co.com.example.pokemon.Dto.LoginResponse;
import co.com.example.pokemon.entity.Captura;
import co.com.example.pokemon.entity.Entrenador;
import co.com.example.pokemon.entity.Pokemon;
import co.com.example.pokemon.repository.CapturaRepository;
import co.com.example.pokemon.repository.EntrenadorRepository;
import co.com.example.pokemon.repository.PokemonRepository;

@RestController
@RequestMapping("/entrenador")
@CrossOrigin
public class EntrenadorController {
	@Autowired
	EntrenadorRepository entrenadorRepository;
	@Autowired
	PokemonRepository pokemonRepository;
	@Autowired
	CapturaRepository capturaRepository;

	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {

		Optional<Entrenador> entrenador = entrenadorRepository.findByEmail(loginRequest.getEmail());
		if (entrenador.isPresent()) {
			LoginResponse loginResponse = new LoginResponse();
			loginResponse.setUuid(entrenador.get().getUuid());
			return loginResponse;
		}
		return null;

	}

	@GetMapping("/lista")
	public List<?> lista() {

		return entrenadorRepository.findAll();

	}

	@GetMapping("/{uuid}/pokemons")
	public List<Captura> pokemones(@PathVariable String uuid) {

		Optional<Entrenador> entrenador = entrenadorRepository.findByUuid(uuid);
		if (entrenador.isPresent()) {
			return null;
		}
		return null;

	}

	@PostMapping("/{uuid}/pokemons/{uuidP}")
	public Captura saveCaptura(@PathVariable String uuid, @PathVariable String uuidP) {

		Optional<Entrenador> entrenador = entrenadorRepository.findByUuid(uuidP);
		Optional<Pokemon> pokemon = pokemonRepository.findByUuid(uuidP);
		if (entrenador.isPresent() && pokemon.isPresent()) {
			Captura captura = new Captura();
			captura.setEntrenador(entrenador.get());
			captura.setPokemon(pokemon.get());
			return capturaRepository.save(captura);
		}
		return null;
	}

}
