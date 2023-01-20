package implementaciones;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.RepostajeNormalImpl;
import dao.RepostajeNormal;

@Service
public class NormalIMPL {
	
	
	@Autowired
	private RepostajeNormalImpl n;
	
	
	 @Transactional
	public void Insertar(RepostajeNormal normal) {
		n.InsertarNormal(normal);
	}
	 @Transactional
	 public List<RepostajeNormal> mostrar(){
		 return n.listaNormal();
	 }

}
