package com.apiback_med.api_medellin.model;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table(name = "productos")
public class ProductosModel {

	@Id
	private long codigo_producto;

	private long nitproveedor;

	@NotNull
	private double ivacompra;

	private String nombre_producto;

	@NotNull
	private double precio_compra;

	@NotNull
	private double precio_venta;

	public long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public long getNitproveedor() {
		return nitproveedor;
	}

	public void setNitproveedor(long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public double getIvacompra() {
		return ivacompra;
	}

	public void setIvacompra(double ivacompra) {
		this.ivacompra = ivacompra;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

}
