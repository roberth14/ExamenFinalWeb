package co.com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}
