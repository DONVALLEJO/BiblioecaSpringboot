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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



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

	 
	 
	 
	 
	 
	 
	 
	public Libro() {
		super();
	}

	public Libro(int id, String nombre_libro, String editorial, Date fecha_edicion, String genero, BigDecimal precio,
			int numero_paginas, Autor fk_autor_libro, String estado) {
		super();
		this.id = id;
		this.nombre_libro = nombre_libro;
		this.editorial = editorial;
		this.fecha_edicion = fecha_edicion;
		this.genero = genero;
		this.precio = precio;
		this.numero_paginas = numero_paginas;
		this.fk_autor_libro = fk_autor_libro;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_libro() {
		return nombre_libro;
	}

	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Date getFecha_edicion() {
		return fecha_edicion;
	}

	public void setFecha_edicion(Date fecha_edicion) {
		this.fecha_edicion = fecha_edicion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	public Autor getFk_autor_libro() {
		return fk_autor_libro;
	}

	public void setFk_autor_libro(Autor fk_autor_libro) {
		this.fk_autor_libro = fk_autor_libro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre_libro=" + nombre_libro + ", editorial=" + editorial + ", fecha_edicion="
				+ fecha_edicion + ", genero=" + genero + ", precio=" + precio + ", numero_paginas=" + numero_paginas
				+ ", fk_autor_libro=" + fk_autor_libro + ", estado=" + estado + "]";
	}
		
	 

}
