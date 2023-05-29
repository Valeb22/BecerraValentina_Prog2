package co.edu.unbosque.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import co.edu.unbosque.modelo.Parte;
import co.edu.unbosque.serviceInterface.IParteService;

@Controller
public class PDFController {

	@Autowired
	private IParteService service;

	@GetMapping("/generar-pdf")
	public String generarPDF(Model model) {
		List<Parte> partes = service.listar();
		double sumaValores = calcularSumaValores(partes);

		PDFGenerator pdfGenerator = new PDFGenerator();
		pdfGenerator.generarPDF(partes, sumaValores);

		return "pdf-generado";
	}

	public double calcularSumaValores(List<Parte> partes) {
		double suma = 0;
		for (Parte parte : partes) {
			suma += parte.getValor();
		}
		return suma;
	}

	@GetMapping("/generar-pdf-partes-por-nombre")
	public String generarPDFPartesPorNombre(Model model) {
		List<Parte> partes = service.listar();

		PDFGenerator pdfGenerator = new PDFGenerator();
		pdfGenerator.generarPDFPartesPorNombre(partes);

		return "pdf-generado";
	}

	@GetMapping("/generar-pdf-vehiculos-con-partes")
	public String generarPDFVehiculosConPartes(Model model) {
		List<Parte> partes = service.listar();

		PDFGenerator pdfGenerator = new PDFGenerator();
		pdfGenerator.generarPDFVehiculosConPartes(partes);

		return "pdf-generado";
	}
	
	
}
