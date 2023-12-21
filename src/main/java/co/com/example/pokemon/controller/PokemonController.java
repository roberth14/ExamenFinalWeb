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

import co.com.example.pokemon.entity.Pokemon;
import co.com.example.pokemon.entity.TipoPokemon;
import co.com.example.pokemon.repository.PokemonRepository;
import co.com.example.pokemon.repository.TipoPokemonRepository;

@RestController
@RequestMapping("/pokemons")
@CrossOrigin
public class PokemonController {

	@Autowired
	PokemonRepository pokemonRepository;
	@Autowired
	TipoPokemonRepository tipoPokemonRepository;

	@GetMapping("/{tipo}")
	public List<Pokemon> listTipoPokemon(@PathVariable String tipo) {

		Optional<TipoPokemon> tipoPokemon = tipoPokemonRepository.findByUuid(tipo);
		if (tipoPokemon.isPresent()) {
			return pokemonRepository.findByTipoPokemon(tipoPokemon.get());
		}

		return null;

	}

	@PostMapping
	public Pokemon savePokemon(@RequestBody Pokemon pokemon) {
		System.err.print(pokemon.toString());
		return pokemonRepository.save(pokemon);
	}

}
