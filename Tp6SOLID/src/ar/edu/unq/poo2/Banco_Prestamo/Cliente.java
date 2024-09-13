package ar.edu.unq.poo2.Banco_Prestamo;

public class Cliente {
	private String nombreApellido;
	private String direccion;
	private Integer edad;
	private Banco banco;
	private Integer cuotas;
	private Propiedad propiedadGarantia;
	private Double sueldoNetoMensual;
	
	public Cliente(String nombreApellido, String direccion, 
					Integer edad, Banco banco, Propiedad propiedadGarantia,
			Double sueldoNetoMensual) {
		this.setBanco(banco);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setNombreApellido(nombreApellido);
		this.setPropiedadGarantia(propiedadGarantia);
		this.setSueldoNetoMensual(sueldoNetoMensual);
	}
	public Cliente(String nombreApellido, String direccion, 
					Integer edad, Banco banco, Double sueldoNetoMensual) {
		this.setBanco(banco);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setNombreApellido(nombreApellido);
		this.setSueldoNetoMensual(sueldoNetoMensual);
	}
	
	
	
	
	
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public Propiedad getPropiedadGarantia() {
		return propiedadGarantia;
	}
	public void setPropiedadGarantia(Propiedad propiedadGarantia) {
		this.propiedadGarantia = propiedadGarantia;
	}
	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	
}
