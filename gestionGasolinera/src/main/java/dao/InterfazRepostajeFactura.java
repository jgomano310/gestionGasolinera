package dao;

import java.util.List;

public interface InterfazRepostajeFactura {

	public void InsertarFactura(RepostajeFactura factura);
	
	public List<RepostajeFactura> listaFacturas();
}
