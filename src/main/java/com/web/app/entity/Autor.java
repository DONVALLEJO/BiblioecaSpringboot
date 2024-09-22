package com.web.app.entity;

import java.io.Serializable;

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


@Entity    //la clase se convierte en una entidad
@Table(name = "Autores")  //la tabla llevara este nombre y no el de la clase
public class Autor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNumero_contacto() {
		return numero_contacto;
	}

	public void setNumero_contacto(Integer numero_contacto) {
		this.numero_contacto = numero_contacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numero_contacto="
				+ numero_contacto + ", direccion=" + direccion + ", estado=" + estado + "]";
	}
	
	

}

















