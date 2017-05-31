package br.com.cm.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cm.loja.model.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto) {
		
		manager.persist(produto);
	}
	
	public List<Produto> lista(){
		
		  return manager.createQuery("select p from Produto p", Produto.class).getResultList();
	}
	
}
