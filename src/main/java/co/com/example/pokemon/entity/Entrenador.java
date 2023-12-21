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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="entrenador")
public class Entrenador implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name="fecha_vinculacion")
	private Date fechaVinculacion;
	@Column(name="pueblo_id")
	private Integer puebloId;
	private String uuid;
	
	@ManyToMany
	private List<Pokemon>pokemon;
	
	

	
	

}
