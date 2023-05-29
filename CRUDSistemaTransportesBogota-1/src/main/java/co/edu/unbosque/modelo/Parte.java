package co.edu.unbosque.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parte")
public class Parte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date fecha;
	private String placa;
	private String ubicacion;
	private String dueno;
	private String codigo;
	private int valor;
	private String descripcion;
	
	public Parte() {
		// TODO Auto-generated constructor stub
	}
		
	public Parte(Integer id, Date fecha, String placa, String ubicacion, String dueno, String codigo, int valor,
			String descripcion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.placa = placa;
		this.ubicacion = ubicacion;
		this.dueno = dueno;
		this.codigo = codigo;
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setDueno(String dueno) throws Exception {
        if (this.dueno != null && !this.dueno.equals(dueno)) {
            throw new Exception("La placa ya tiene un dueño asociado");
        }
        
        this.dueno = dueno;
    }

    public String getDueno() {
        return dueno;
    }
}
