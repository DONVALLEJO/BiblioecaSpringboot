package com.web.app.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity    //la clase se convierte en una entidad
@Table(name = "Autores")  //la tabla llevara este nombre y no el de la clase
public class Autor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 @Column(nullable = false)
	private String nombre;
	 
	 @Column(nullable = false)
	private String apellido;
	 
	 @Column(nullable = false,unique = true)
	private Integer numero_contacto;
	 
	 
	 @Column(nullable = false)
	private String direccion;
	
	@Column(nullable = false)
	  @ColumnDefault("'Activo'")
	private String estado;
	

}

















