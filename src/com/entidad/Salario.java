package com.entidad;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="rhco_salario")
public class Salario {
	
	@Id
	@Column(name="sal_cod")
	private Integer codigo;
	
	@OneToMany(mappedBy="codSalario", cascade={CascadeType.PERSIST}, orphanRemoval=true)
	private Collection<Contrato> contrato;
		
	@Column(name="sal_des")
	private String descripcion;
	
	@Column(name="sal_monto")
	private Double monto;
	
	public Salario() {
		super();
		this.codigo = 0;
		this.descripcion = "";	
		this.monto = new Double(0);	
		}
	
	public Salario(Integer codigo, String descripcion, Double monto) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.monto= monto;
	}

		
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Salario [codigo=" + codigo + ", descripcion=" + descripcion + ", monto=" + monto + "]";
	}
	
	
}
