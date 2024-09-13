package ar.edu.unq.poo2.Banco_Prestamo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();
	private List<SolicitudCredito> solicitudesAprobadas = new ArrayList<SolicitudCredito>();
	
	public void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void agregarSolicitud(SolicitudCredito s) {
		this.solicitudes.add(s);
	}
	public void agregarSolicitudAprobada(SolicitudCredito s) {
		this.solicitudesAprobadas.add(s);
	}
	public Double montoTotalPrestamosADesembolsar() {
		Double total = 0.0;
		for (SolicitudCredito s : solicitudesAprobadas) {
			total += s.getMonto();
		}
		return  total;
	}
	
}
