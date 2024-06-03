package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CollectionAlumno;
import ar.edu.unju.fi.collections.CollectionCarrera;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Carrera;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private Alumno alumno;
	
	@GetMapping("/listado")
	public String getAlumnosPage(Model model) {
		model.addAttribute("alumnos", CollectionAlumno.getAlumnos());
		model.addAttribute("titulo", "Alumnos");
		return "alumnos";
	}
	
	@GetMapping("/nuevo")
	public String getNuevoAlumnoPage(Model model) {
		Boolean edicion = false;
		model.addAttribute("alumno", alumno);
		model.addAttribute("edicion", edicion);
		model.addAttribute("titulo", "Nuevo Alumno");
		return "alumno";
	}
	
	@PostMapping("/guardar")
	public ModelAndView guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		ModelAndView modelView = new ModelAndView("alumnos");
		CollectionAlumno.agregarAlumno(alumno);
		modelView.addObject("alumnos", CollectionAlumno.getAlumnos());
		return modelView;
	}
}
