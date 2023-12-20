package co.com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.TipoPokemon;

public interface TipoPokemonRepository  extends JpaRepository<TipoPokemon, Integer>{

}
