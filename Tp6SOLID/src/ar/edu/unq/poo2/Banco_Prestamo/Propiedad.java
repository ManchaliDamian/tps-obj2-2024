package ar.edu.unq.poo2.Banco_Prestamo;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Propiedad(String desc, String dir, Double value) {
		this.setDescripcion(desc);
		this.setDireccion(dir);
		this.setValorFiscal(value);
	}
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
}
