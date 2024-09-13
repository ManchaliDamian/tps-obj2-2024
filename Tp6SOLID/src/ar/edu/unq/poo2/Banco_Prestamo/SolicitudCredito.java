package ar.edu.unq.poo2.Banco_Prestamo;

public class SolicitudCredito {
	private Cliente cliente;
	private Double monto;
	private Integer cantidadDeCuotas;
	
	
	
	
	
	
	public SolicitudCredito(Cliente cliente, Double monto, Integer cantidadDeCuotas) {
		
		this.setCliente(cliente);
		this.setCantidadDeCuotas(cantidadDeCuotas);
		this.setMonto(monto);
		
	}
	
	public Double montoCuota() {
		return this.getMonto() / this.getCantidadDeCuotas();
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Integer getCantidadDeCuotas() {
		return cantidadDeCuotas;
	}
	public void setCantidadDeCuotas(Integer cantidadDeCuotas) {
		this.cantidadDeCuotas = cantidadDeCuotas;
	}
	
	
	
}
