package co.com.example.pokemon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.TipoPokemon;

public interface TipoPokemonRepository  extends JpaRepository<TipoPokemon, Integer>{
	
	Optional<TipoPokemon> findByUuid(String uuid);

}
