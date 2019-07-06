package com.br.zup.sistema.passagens.Models;
import java.util.Map;
public class OnibusModel {

	private String empresa;
	private String destino;
	private double tempoDeViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private Map<Integer, ClienteModel> cliente = null;

	public OnibusModel() {
	}

	public OnibusModel(String empresa, String destino, double tempoDeViagem, int lugares, int lugaresDisponiveis,
			Map<Integer, ClienteModel> cliente) {
		this.empresa = empresa;
		this.destino = destino;
		this.tempoDeViagem = tempoDeViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
		this.cliente = cliente;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getTempoDeViagem() {
		return tempoDeViagem;
	}

	public void setTempoDeViagem(double tempoDeViagem) {
		this.tempoDeViagem = tempoDeViagem;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}

	public void setLugaresDisponiveis(int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public Map<Integer, ClienteModel> getCliente() {
		return cliente;
	}

	public void setCliente(Map<Integer, ClienteModel> cliente) {
		this.cliente = cliente;
	}
	public String toString () {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Empresa :" + this.empresa);
		modelo.append("\nPostou :" + this.destino);
		modelo.append("\nTempo de viagem : " + this.tempoDeViagem);
		modelo.append("\nLugares : " + this.lugares);
		modelo.append("\nLugares disponíveis : " + this.lugaresDisponiveis);
		modelo.append("\n");
		return modelo.toString();

	}
}