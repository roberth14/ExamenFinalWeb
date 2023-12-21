package co.com.example.pokemon.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pokemon")
public class Pokemon  implements Serializable{
	
	@Id
	@SequenceGenerator(name="pokemon_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pokemon_id_seq")
	private Integer id;
	private String nombre;
	@Column(name = "descripcion", nullable = false, columnDefinition = "TEXT")
	private String descripcion;
	@ManyToOne
	@JoinColumn(name="tipo_pokemon")
	private TipoPokemon tipoPokemon;
	@Column(name="fecha_descubrimiento")
	private Date fechaDescubrimiento;
	private Integer generacion;
	private String uuid;
	@ManyToMany
	@JoinTable(
	        name = "captura",
	        joinColumns = @JoinColumn(name = "pokemon_id"),
	        inverseJoinColumns = @JoinColumn(name = "entrenador_id")
	    )
	private List<Entrenador> entrenador;
	

}
