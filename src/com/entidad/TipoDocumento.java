package com.entidad;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rhco_tipodocumento")
public class TipoDocumento {
	@Id
	@Column(name="tdo_cod")
	//bi-directional many-to-one association to Pedido
	
	@OneToMany(mappedBy="persona", cascade={CascadeType.PERSIST}, orphanRemoval=true)
	private Integer codigo;
	
	@Column(name="tdo_des")
	private String descripcion;
	
	public TipoDocumento() {
		super();
		this.codigo = 0;
		this.descripcion = "";	
		}
	public TipoDocumento(Integer codigo) {
		super();
		this.codigo = codigo;
		this.descripcion="";
	}
	public TipoDocumento(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
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
	@Override
	public String toString() {
		return "TipoDocumento [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
}
