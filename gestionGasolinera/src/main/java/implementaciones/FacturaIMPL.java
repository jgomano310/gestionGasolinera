package implementaciones;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.RepostajeFacturaImpl;
import dao.RepostajeFactura;

@Service
public class FacturaIMPL {

	@Autowired
	private RepostajeFacturaImpl f;
	
	@Transactional
	public void Insertar(RepostajeFactura factura) { 
		f.InsertarFactura(factura);
		
	}
	@Transactional
	public List<RepostajeFactura> mostrar(){
		return f.listaFacturas();
	}
	
}
