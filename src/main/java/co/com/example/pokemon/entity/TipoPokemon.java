package co.com.example.pokemon.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipo_pokemon")
public class TipoPokemon implements Serializable{
	@Id
	@SequenceGenerator(name="tipo_pokemon_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tipo_pokemon_id_seq")
	private Integer id;
	private String descripcion;
	private String uuid;
	
	

}
