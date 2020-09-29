package com.empleos.model;

import java.util.Date;

public class Vacante {

	private Integer id;
	private String nombre;
	private String descipcion;
	private Date fecha;
	private double salario;
	private Integer destacado;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescipcion() {
		return descipcion;
	}
	
	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Integer getDestacado() {
		return destacado;
	}
	
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	/*
	 * Se sobreescribe el metodo toString para que cuando se imprima en la consola aparezcan los datos
	 * con esta estructura, facilitando la lectura de los valores de cada una de las variables.
	 */
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", nombre=" + nombre + ", descipcion=" + descipcion + ", fecha=" + fecha
				+ ", salario=" + salario + "]";
	}
	
}
