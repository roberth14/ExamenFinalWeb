package co.com.example.pokemon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="captura")
public class captura {
	
	@Column(name="pokemon_id")
	private Integer pokemonId;
	@Column(name="entrenador_id")
	private Integer entrenadorId;

}
