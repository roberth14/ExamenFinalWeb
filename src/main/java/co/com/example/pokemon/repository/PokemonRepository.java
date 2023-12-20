package co.com.example.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.Pokemon;
import co.com.example.pokemon.entity.TipoPokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
	
	List<Pokemon>findByTipoPokemon(TipoPokemon tipo);

}
