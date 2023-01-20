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
@Table(name="dlk_repostaje_factura", schema="bd_gestor_gasolinera")
public class RepostajeFactura {

	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	private int id;
	
	@Column(name="md_uuid")
	private String md_uuid;
	
	@Column(name="md_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar md_date;
	
	@Column(name="importe")
	private double importe;
	
	@Column(name="dni")
	private String dni;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tipo_Repostaje> getListaRepostajeFactura() {
		return listaRepostajeFactura;
	}

	public void setListaRepostajeFactura(List<Tipo_Repostaje> listaRepostajeFactura) {
		this.listaRepostajeFactura = listaRepostajeFactura;
	}

	@Column(name="matricula")
	private String matricula;
	
	
	@OneToMany(targetEntity=Tipo_Repostaje.class)
	 List<Tipo_Repostaje> listaRepostajeFactura;

	



	public RepostajeFactura( String md_uuid, Calendar md_date, double importe, String dni, String matricula
			) {
		super();
		
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
		
	}

	public RepostajeFactura() {
		super();
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	

	
}
