package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class RepostajeNormalImpl implements InterfazRepostajeNormal {
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public void InsertarNormal(RepostajeNormal normal) {
		entity.persist(normal);
		entity.clear();
		entity.close();
	}

	@Override
	public List<RepostajeNormal> listaNormal() {
		// TODO Auto-generated method stub
		return entity.createQuery("SELECT normal FROM RepostajeNormal normal").getResultList();
	}

}
