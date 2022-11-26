package com.example.toolshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.toolshop.Service.CirclipPliperService;
import com.example.toolshop.Service.productDetailsService;
import com.example.toolshop.Service.toolService;
import com.example.toolshop.model.CirclipPliper;
import com.example.toolshop.model.productDetails;
import com.example.toolshop.model.toolshop;

@Controller
public class controller {
	@Autowired
	private toolService toolservice;
	
	@Autowired
	private productDetailsService productdetailsservice;
	
	@Autowired
	private CirclipPliperService circlipPliperService;

	@GetMapping("/")
	public String viewHomepage(Model model) {
		model.addAttribute("listproduct2", toolservice.getAlltoolshop());
		model.addAttribute("productDetails", productdetailsservice.getProductDetails());
		model.addAttribute("circlippliper", circlipPliperService.getAllCirclipPliper());
		return "index";
	}

	@GetMapping("/showproductpage")
	public String showProduct(Model model) {
		model.addAttribute("listproduct", toolservice.getAlltoolshop());
		return "product";
	}

	@GetMapping("/showProductForm")
	public String showProductForm(Model model) {
		toolshop toolShop = new toolshop();
		model.addAttribute("toolShop", toolShop);
		return "addNew";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("toolShop") toolshop toolShop) {

		toolservice.saveProduct(toolShop);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		toolshop toolShop = toolservice.gettoolshopById(id);
		model.addAttribute("toolShop", toolShop);
		return "addNew";
	}
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable (value = "id") long id) {
		
		this.toolservice.deleteProductById(id);
		return "redirect:/";
	}
	
	@GetMapping("/showCirclipPliper")
	public String showCirclipPliperpage(Model model) {
		model.addAttribute("circlippliper", circlipPliperService.getAllCirclipPliper());
		return "CirclipPliper";
	}
	@GetMapping("/showcirclippliperFrom")
	public String showcirclipPliperFrom(Model model) {
		CirclipPliper circlipPliper = new CirclipPliper();
		model.addAttribute("circlipPliper", circlipPliper);
		return "addcirclipPliper";
	}
	@PostMapping("/savecirclipPliper")
	public String savecirclipPliper(@ModelAttribute("circlipPliper")CirclipPliper circlipPliper ) {
		circlipPliperService.saveCirclipPliper(circlipPliper);
		return "redirect:/";
	}
	
	@GetMapping("/updatecirclipPliper/{id}")
	public String updateCirclipPliper(@PathVariable(value = "id") long id, Model model) {
		CirclipPliper circlipPliper = circlipPliperService.getCirclipPliperById(id);
		model.addAttribute("circlipPliper", circlipPliper);
		return "addcirclipPliper";
	}
	
	@GetMapping("/deletecirclipPliper/{id}")
	public String deleteCirclipPliper(@PathVariable (value = "id") long id) {
		this.circlipPliperService.deleteCirclipPliperById(id);
		return "redirect:/";
	}

}
