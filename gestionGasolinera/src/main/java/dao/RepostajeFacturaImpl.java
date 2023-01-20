package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class RepostajeFacturaImpl implements InterfazRepostajeFactura {
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public void InsertarFactura(RepostajeFactura factura) {
		entity.persist(factura);
		entity.clear();
		entity.close();
	}

	@Override
	public List<RepostajeFactura> listaFacturas() {
		// TODO Auto-generated method stub
		return entity.createQuery("SELECT factura FROM RepostajeFactura factura").getResultList();
	}

}
