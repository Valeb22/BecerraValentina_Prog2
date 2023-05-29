package co.edu.unbosque.controler;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.unbosque.modelo.Parte;
import co.edu.unbosque.serviceInterface.IParteService;

@Controller
@RequestMapping
public class ParteControler {
	
	@Autowired
	private IParteService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("parte", service.listar());
        return "listar";
    }
	
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("parte", service.listarId(id));
		return "form";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("parte", new Parte());
		return "form";
	}
	
	@PostMapping("/save")
    public String save(@ModelAttribute("parte") @Valid Parte parte, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }

        try {
            // Verificar si la placa ya tiene dueños diferentes
            List<Parte> partes = service.buscarPorPlaca(parte.getPlaca());
            for (Parte existente : partes) {
                if (!existente.getDueno().equals(parte.getDueno())) {
                    throw new Exception("La placa ya tiene dueños diferentes");
                }
            }

            // Resto de la lógica para guardar la parte
            int id = service.save(parte);
            if (id == 0) {
                return "lista";
            }
            return "redirect:/";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "form";
        }
    }

	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	@GetMapping("/buscar")
	public String buscarPorPlaca() {
	    return "buscar";
	}

	@GetMapping("/buscar/placa")
	public String buscar(@RequestParam("placa") String placa, Model model) {
	    model.addAttribute("partes", service.buscarPorPlaca(placa));
	    return "resultado";
	}

}
