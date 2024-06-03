package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CollectionMateria;
import ar.edu.unju.fi.model.Materia;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/materia")
public class MateriaController {

	@GetMapping("/listado")
	public String getMateriaPage(Model model) {
		model.addAttribute("materias", CollectionMateria.getMaterias());
		model.addAttribute("titulo", "Materias");
		return "materias";
	}
}
