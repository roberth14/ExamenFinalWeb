package co.com.example.pokemon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="captura")
public class Captura  {
	
	@Id
	private Integer id;
	@Column(name="pokemon_id")
	private Integer pokemonId;
	@ManyToOne
	@JoinColumn(name="entrenador_id")
	private Entrenador entrenador;

}
