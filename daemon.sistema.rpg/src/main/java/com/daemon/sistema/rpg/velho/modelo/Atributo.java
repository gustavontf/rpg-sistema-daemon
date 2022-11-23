package com.daemon.sistema.rpg.velho.modelo;

public class Atributo {

	private SiglaAtributo sigla;
	private String nome;
	private int valor;
	private int modificador;
	private int percTeste;
	
	public Atributo(SiglaAtributo sigla, String nome, int valor, int modificador) {		
		this.sigla = sigla;
		this.nome = nome;
		this.valor = valor;
		this.modificador = modificador;
		percTeste = calcularPercTeste(valor, modificador);
		
	}
	
	public Atributo(SiglaAtributo sigla, int valor, int modificador) {
		this.sigla = sigla;
		switch (sigla) {
		case CON:
			this.nome = "Constitui��o";
			break;
		case FR:
			this.nome = "For�a";
			break;
		case DEX:
			this.nome = "Destreza";
			break;
		case AGI:
			this.nome = "Agilidade";
			break;
		case INT:
			this.nome = "Intelig�ncia";
			break;
		case WILL:
			this.nome = "For�a de Vontade";
			break;
		case PER:
			this.nome = "Percep��o";
			break;
		case CAR:
			this.nome = "Carisma";
			break;
		}
		this.valor = valor;
		this.modificador = modificador;
		percTeste = calcularPercTeste(valor, modificador);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getValor() {
		return valor;
	}
	
	private int calcularPercTeste(int valor, int modificador) {
		return (valor - modificador) * 4;
	}
	
	public String testarAtributo(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
		int valorTeste = 0;
		
		switch (dificuldade) {
		case FACIL:
			valorTeste = percTeste * 2;											
			break;
		case NORMAL:
			valorTeste = percTeste;
			break;
		case DIFICIL:
			valorTeste = percTeste / 2;
			break;
		}
		
		mensagem = "\nValor de teste: " + Integer.toString(valorTeste)
				+ "\nResultado da rolagem de dados: " + rolagemDado;
		
		if(testar(rolagemDado, valorTeste)) {		
			mensagem = mensagem.concat("\nPassou no teste de ");
		} else {			
			mensagem = mensagem.concat("\nFalhou no teste de ");			
		}
		
		return mensagem;	
	}
	
	private boolean testar(int rolagemDado, int valorTeste) {
		return rolagemDado <= valorTeste;
	}
	
	
}
