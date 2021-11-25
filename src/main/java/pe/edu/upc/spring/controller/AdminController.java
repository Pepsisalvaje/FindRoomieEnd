package pe.edu.upc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.spring.service.IPropietarioService;
import pe.edu.upc.spring.service.IRoomieService;
import pe.edu.upc.spring.service.IViviendaService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private IPropietarioService pService;
	private IRoomieService rService;
	private IViviendaService vService;
	
	
	
	

}
