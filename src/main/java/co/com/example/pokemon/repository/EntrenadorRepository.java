package co.com.example.pokemon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.Entrenador;

public interface EntrenadorRepository  extends JpaRepository<Entrenador, Integer>{
	
	Optional<Entrenador>findByEmail(String email);

}
