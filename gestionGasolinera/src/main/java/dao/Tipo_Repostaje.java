package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlk_tipo_repostaje", schema="bd_gestor_gasolinera")
public class Tipo_Repostaje {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	int id;
	
	@Column(name="gasoil")
	 String gasoil; 
	
	@Column(name="gasolina95")
	 String gasolina95;
	
	@Column(name="gasolina98")
	 String gasolina98;
	

	@Override
	public String toString() {
		return "Tipo_Repostaje [gasoil=" + gasoil + ", gasolina95=" + gasolina95 + ", gasolina98=" + gasolina98 + "]";
	}

	public String getGasoil() {
		return gasoil;
	}

	public void setGasoil(String gasoil) {
		this.gasoil = gasoil;
	}

	public String getGasolina95() {
		return gasolina95;
	}

	public void setGasolina95(String gasolina95) {
		this.gasolina95 = gasolina95;
	}

	public String getGasolina98() {
		return gasolina98;
	}

	public void setGasolina98(String gasolina98) {
		this.gasolina98 = gasolina98;
	}

	public Tipo_Repostaje() {
		super();
	}

	public Tipo_Repostaje(String gasoil, String gasolina95, String gasolina98) {
		super();
		this.gasoil = gasoil;
		this.gasolina95 = gasolina95;
		this.gasolina98 = gasolina98;
	}
}
