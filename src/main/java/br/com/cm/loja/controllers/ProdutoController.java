package br.com.cm.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cm.loja.dao.ProdutoDAO;
import br.com.cm.loja.model.Produto;

@Controller
@RequestMapping("produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping("/form")
	private ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("/produtos/form");
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	private ModelAndView gravar(Produto produto) {
		
		System.out.println(produto);
		produtoDao.gravar(produto);
		
		return new ModelAndView("redirect:lista");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	private ModelAndView lista(){
		
		List<Produto> produtos = produtoDao.lista();
		ModelAndView modelAndView = new ModelAndView("/produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
	
}
