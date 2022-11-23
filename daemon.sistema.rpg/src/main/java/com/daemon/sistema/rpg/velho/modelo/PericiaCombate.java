package com.daemon.sistema.rpg.velho.modelo;

public class PericiaCombate {

	private NomePericiaCombate nome;
	private Atributo atributoBase;
	private int valorGastoAtaque;
	private int valorGastoDefesa;
	private int valorAtaque;
	private int valorDefesa;
	
	public PericiaCombate(NomePericiaCombate nome, Atributo atributoBase, int valorGastoAtaque, int valorGastoDefesa) {	
		this.nome = nome;
		this.atributoBase = atributoBase;
		this.valorGastoAtaque = valorGastoAtaque;
		this.valorGastoDefesa = valorGastoDefesa;
		valorAtaque = calcularValorAtaque(valorGastoAtaque, atributoBase);
		valorDefesa = calcularValorDefesa(valorGastoDefesa, atributoBase);
	}
	
	public NomePericiaCombate getNome() {
		return nome;
	}
	
	public void setNome(NomePericiaCombate nome) {
		this.nome = nome;
	}

	public Atributo getAtributoBase() {
		return atributoBase;
	}

	public void setAtributoBase(Atributo atributoBase) {
		this.atributoBase = atributoBase;
		valorAtaque = calcularValorAtaque(valorGastoAtaque, atributoBase);
		valorDefesa = calcularValorDefesa(valorGastoDefesa, atributoBase);
	}

	public int getValorGastoAtaque() {
		return valorGastoAtaque;
	}

	public void setValorGastoAtaque(int valorGastoAtaque) {
		this.valorGastoAtaque = valorGastoAtaque;
		valorAtaque = calcularValorAtaque(valorGastoAtaque, atributoBase);
	}

	public int getValorGastoDefesa() {
		return valorGastoDefesa;
	}

	public void setValorGastoDefesa(int valorGastoDefesa) {
		this.valorGastoDefesa = valorGastoDefesa;
		valorDefesa = calcularValorDefesa(valorGastoDefesa, atributoBase);
	}
	
	public int getValorAtaque() {
		return valorAtaque;
	}
	
	public int getValorDefesa() {
		return valorDefesa;
	}
	
	private int calcularValorAtaque(int valorGastoAtaque, Atributo atributoBase) {
		return valorGastoAtaque + atributoBase.getValor();
	}
	
	private int calcularValorDefesa(int valorGastoDefesa, Atributo atributoBase) {
		return valorGastoDefesa + atributoBase.getValor();
	}
	
	public String testarPericiaCombate(int ValorDefesaOponente, int rolagemDado) {
		String mensagem;
		int valorTeste;
		
		valorTeste = (this.valorAtaque + 50) - ValorDefesaOponente;
		
		mensagem = "\nValor de teste: " + Integer.toString(valorTeste)
				+ "\nResultado da rolagem de dados: " + rolagemDado;
		
		if(testar(rolagemDado, valorTeste)) {		
			mensagem = mensagem.concat("\nAcertou o ataque!");
		} else {			
			mensagem = mensagem.concat("\nFalhou o ataque!");			
		}
		
		return mensagem;	
	}
	
	private boolean testar(int rolagemDado, int valorTeste) {
		return rolagemDado <= valorTeste;
	}
	
}
