package com.web.app.entity;

import java.math.BigDecimal;

import java.util.Date;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "libros")  //la tabla llevara este nombre y no el de la clase
public class Libro {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 @Column(nullable = false,unique = true)
	private String nombre_libro;
	 
	 @Column(nullable = false)
		private String editorial;
	 
	 @Column(nullable = false)
		private Date fecha_edicion;
	 
	 @Column(nullable = false)
		private String genero;
	 
	 @Column(nullable = false)
		private BigDecimal precio;
	 
	 @Column(nullable = false)
		private int numero_paginas;
	 
	
	 @ManyToOne
	 @JoinColumn(name = "fk_autor")
	 
	 Autor fk_autor_libro;
	 
	 @Column(nullable = false)
	  @ColumnDefault("'Activo'")
		private String estado;
		

}
