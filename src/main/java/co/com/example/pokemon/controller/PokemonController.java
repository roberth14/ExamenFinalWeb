package co.com.example.pokemon.controller;

import java.util.List;

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

@RestController
@RequestMapping("/pokemons")
@CrossOrigin
public class PokemonController {
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	@GetMapping("/{tipo}")
	public List<Pokemon> listTipoPokemon(@PathVariable Integer tipo){
		
		TipoPokemon tipoPokemon=new TipoPokemon();
		tipoPokemon.setId(tipo);
		return pokemonRepository.findByTipoPokemon(tipoPokemon);
		
		
	}
	
	@PostMapping
	public Pokemon savePokemon(@RequestBody Pokemon pokemon) {
		
		return  pokemonRepository.save(pokemon);
	}

}
