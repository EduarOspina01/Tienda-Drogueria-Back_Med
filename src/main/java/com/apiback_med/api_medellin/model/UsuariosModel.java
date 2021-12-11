package com.apiback_med.api_medellin.model;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table (name = "usuarios")
public class UsuariosModel {
	
	@Id
	private Long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password;
	private String usuario;
	@NotNull
	private String codigo_ciudad;
	@NotNull
	private String rol;
	
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getCodigo_ciudad() {
		return codigo_ciudad;
	}
	public void setCodigo_ciudad(String codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}
	public Long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
