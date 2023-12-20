package co.com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.pokemon.entity.Captura;

public interface CapturaRepository extends JpaRepository<Captura, Integer> {

}
