package com.ipartek.formacion.pojo;

public class Usuario {
	
//propiedades
	private String nombre;
	private String pasword;
	private String email;
	
//Constructores
	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.pasword = "";
		this.email = "";

}


	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
