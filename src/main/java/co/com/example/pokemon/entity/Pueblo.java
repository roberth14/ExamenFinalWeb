package co.com.example.pokemon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pueblo")
public class Pueblo {
	
	@Id
	@SequenceGenerator(name="pueblo_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pueblo_id_seq")
	private Integer id;
	private String nombre;
	private String uuid;
	

}
