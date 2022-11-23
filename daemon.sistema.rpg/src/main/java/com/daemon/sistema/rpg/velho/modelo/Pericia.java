package com.daemon.sistema.rpg.velho.modelo;

public class 	Pericia {

	private String nome;
	private Atributo atributoBase;
	private int valorGasto;
	private int valorTotal;
	
	public Pericia(String nome, Atributo atributoBase, int valorGasto) {	
		this.nome = nome;
		this.atributoBase = atributoBase;
		this.valorGasto = valorGasto;
		valorTotal = calcularValorTotal(valorGasto, atributoBase);
	}

	public String getNome() {
		return nome;
	}

	public int getValorTotal() {
		return valorTotal;
	}
	
	private int calcularValorTotal(int valorGasto, Atributo atributoBase) {
		return valorGasto + atributoBase.getValor();
	}
	
	public boolean testarPericia(NivelDificuldade dificuldade, int rolagemDado) {
		boolean retorno;
		
		switch (dificuldade) {
		case FACIL:
			retorno = rolagemDado <= valorTotal * 2;
			break;
		case NORMAL:
			retorno = rolagemDado <= valorTotal;
			break;
		case DIFICIL:
			retorno = rolagemDado <= valorTotal / 2;
			break;
		default:
			retorno = false;
		}
		
		return retorno;
	}
	
}
