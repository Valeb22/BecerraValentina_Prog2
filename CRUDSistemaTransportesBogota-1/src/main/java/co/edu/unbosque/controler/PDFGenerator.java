package co.edu.unbosque.controler;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import co.edu.unbosque.modelo.Parte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class PDFGenerator {

	public void generarPDF(List<Parte> partes, double sumaValores) {
		Document document = new Document();

		try {
			// Especifica la ruta y el nombre del archivo PDF generado
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/suma.pdf"));

			document.open();

			// Agrega el contenido al documento
			document.add(new Paragraph("Lista de Partes"));
			document.add(new Paragraph("------------------------------------"));

			for (Parte parte : partes) {
				// Agrega la información de cada parte al documento
				document.add(new Paragraph("ID: " + parte.getId()));
				document.add(new Paragraph("Fecha: " + parte.getFecha()));
				document.add(new Paragraph("Placa: " + parte.getPlaca()));
				document.add(new Paragraph("Ubicación: " + parte.getUbicacion()));
				document.add(new Paragraph("Dueño: " + parte.getDueno()));
				document.add(new Paragraph("Código: " + parte.getCodigo()));
				document.add(new Paragraph("Valor: " + parte.getValor()));
				document.add(new Paragraph("Descripción: " + parte.getDescripcion()));
				document.add(new Paragraph("------------------------------------"));
			}

			// Agrega la suma de los valores al documento
			document.add(new Paragraph("Suma de Valores: " + sumaValores));

			document.close();

			System.out.println("PDF generado correctamente.");

		} catch (DocumentException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void generarPDFPartesPorNombre(List<Parte> partes) {
		Document document = new Document();

		try {
			// Especifica la ruta y el nombre del archivo PDF generado
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/partes_por_nombre.pdf"));

			document.open();

			// Agrega el contenido al documento
			document.add(new Paragraph("Partes por Nombre"));
			document.add(new Paragraph("------------------------------------"));

			Map<String, List<Parte>> partesPorNombre = new HashMap<>();
			for (Parte parte : partes) {
				String nombre = parte.getDueno();
				if (partesPorNombre.containsKey(nombre)) {
					partesPorNombre.get(nombre).add(parte);
				} else {
					List<Parte> partesList = new ArrayList<>();
					partesList.add(parte);
					partesPorNombre.put(nombre, partesList);
				}
			}

			for (Map.Entry<String, List<Parte>> entry : partesPorNombre.entrySet()) {
				String nombre = entry.getKey();
				List<Parte> partesList = entry.getValue();

				document.add(new Paragraph("Nombre: " + nombre));

				for (Parte parte : partesList) {
					document.add(new Paragraph("Parte Código: " + parte.getCodigo()));
					document.add(new Paragraph("Valor: " + parte.getValor()));
					document.add(new Paragraph("Descripción: " + parte.getDescripcion()));
					document.add(new Paragraph("------------------------------------"));
				}
			}

			document.close();

			System.out.println("PDF generado correctamente.");

		} catch (DocumentException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void generarPDFVehiculosConPartes(List<Parte> partes) {
		Document document = new Document();

		try {
			// Especifica la ruta y el nombre del archivo PDF generado
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/pdf/vehiculos_con_partes.pdf"));

			document.open();

			// Agrega el contenido al documento
			document.add(new Paragraph("Vehículos con Partes por Persona"));
			document.add(new Paragraph("------------------------------------"));

			Map<String, List<String>> vehiculosPorPersona = new HashMap<>();
			for (Parte parte : partes) {
				String nombre = parte.getDueno();
				String vehiculo = parte.getPlaca();

				if (vehiculosPorPersona.containsKey(nombre)) {
					vehiculosPorPersona.get(nombre).add(vehiculo);
				} else {
					List<String> vehiculosList = new ArrayList<>();
					vehiculosList.add(vehiculo);
					vehiculosPorPersona.put(nombre, vehiculosList);
				}
			}

			for (Map.Entry<String, List<String>> entry : vehiculosPorPersona.entrySet()) {
				String nombre = entry.getKey();
				List<String> vehiculosList = entry.getValue();

				document.add(new Paragraph("Nombre: " + nombre));

				for (String vehiculo : vehiculosList) {
					document.add(new Paragraph("Vehículo: " + vehiculo));
					document.add(new Paragraph("------------------------------------"));

				}
			}

			document.close();

			System.out.println("PDF generado correctamente.");

		} catch (DocumentException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}