package dao;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dlk_repostaje_normal", schema="bd_gestor_gasolinera")
public class RepostajeNormal {
	

	
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	 int id;

	@Column(name="md_uuid")
	 String md_uuid;
	
	@Column(name="md_date")
	@Temporal(TemporalType.TIMESTAMP)
	 Calendar md_date;
	
	@Column(name="importe")
	 double importe;
	
	@OneToMany(targetEntity=Tipo_Repostaje.class)
	 List<Tipo_Repostaje> listaRepostajeNormal;

	


	@Override
	public String toString() {
		return "RepostajeNormal [id=" + id + ", md_uuid=" + md_uuid + ", md_date=" + md_date + ", importe=" + importe
				+ "]";
	}

	public RepostajeNormal() {
		super();
	}

	public RepostajeNormal( String md_uuid, Calendar md_date, double importe) {
		super();
		
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tipo_Repostaje> getListaRepostajeNormal() {
		return listaRepostajeNormal;
	}

	public void setListaRepostajeNormal(List<Tipo_Repostaje> listaRepostajeNormal) {
		this.listaRepostajeNormal = listaRepostajeNormal;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	
}
