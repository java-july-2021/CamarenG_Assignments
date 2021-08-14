package com.camaren.ProductsAndCategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.camaren.ProductsAndCategories.models.Categories;
import com.camaren.ProductsAndCategories.models.Products;
import com.camaren.ProductsAndCategories.services.CatService;
import com.camaren.ProductsAndCategories.services.ProdService;

@Controller
public class MainController {
	@Autowired
	private ProdService prodService;
	@Autowired
	private CatService catService;
	
	
	
	@GetMapping("/")
	public String index(Model viewModel, @ModelAttribute("Categories") Categories cat) {
		List<Categories> allCategories = this.catService.allCategories();
		viewModel.addAttribute("allCategories", allCategories);
		return "index.jsp";
	}
	
	@GetMapping("/createCat")
	public String createCat()  {
		return "createCat.jsp";
	}
	
	@PostMapping("/createCat")
	public String makeCat(@RequestParam("cate") String categories) {
		Categories newCate = new Categories();
		newCate.setName(categories);
		this.catService.create(newCate);
		
		return "redirect:/";
	}
	
	@GetMapping("/createProd")
	public String createProd() {
		return "createProd.jsp";
	}
	
	@PostMapping("/createProd")
	public String makeProd(@Valid @ModelAttribute("Products") Products product, BindingResult rslt, Model model) {
		if(rslt.hasErrors()) {
			List<Categories> allCategories = this.catService.allCategories();
			model.addAttribute("allCategories", allCategories);
			return "createProd.jsp";
		}
		this.prodService.createPro(product);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/showProd/{id}")
	public String showProd(Model model, @PathVariable("id") Long id) {
		model.addAttribute("Categories", this.catService.allCategories());
		model.addAttribute("products", this.prodService.getOneProd(id));
		
		return "showProd.jsp";
	}
	
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("categories") Long id, @PathVariable("id") Long prod_id) {
		this.catService.addProdToCat(this.prodService.getOneProd(prod_id), this.catService.getOneCat(id));
		return "redirect:/showProd/{id}";
	}
	
	@GetMapping("/cats/{id}")
	public String showCats(Model model, @PathVariable("id") Long id) {
		model.addAttribute("Products", this.prodService.allProducts());
		model.addAttribute("category", this.catService.getOneCat(id));
		return "showCat.jsp";
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdsToCats(@RequestParam("products") Long id, @PathVariable("id") Long cat_id) {
		this.catService.addProdToCat(this.prodService.getOneProd(id), this.catService.getOneCat(cat_id));
		return "redirect:/cats/{id}";
	}
	
}
