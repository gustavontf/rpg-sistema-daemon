package com.daemon.sistema.rpg.velho.modelo;

public class Guerreiro extends PersonagemJogador {

	private PericiaCombate espadaLonga;
	private PericiaCombate arcoLongo;
	private PericiaCombate adaga;
	
	//atributo das armas
	
	public Guerreiro(Atributo constituicao, Atributo forca, Atributo destreza, Atributo agilidade,
			Atributo inteligencia, Atributo forca_vontade, Atributo percepcao, Atributo carisma, Pericia furtividade,
			Pericia rastreio, PericiaCombate briga, PericiaCombate espadaLonga, PericiaCombate arcoLongo,
			PericiaCombate adaga) {
		super(constituicao, forca, destreza, agilidade, inteligencia, forca_vontade, percepcao, carisma, furtividade,
				rastreio, briga);		
		this.espadaLonga = espadaLonga;
		this.arcoLongo = arcoLongo;
		this.adaga = adaga;		
	}

	public PericiaCombate getEspadaLonga() {
		return espadaLonga;
	}

	public void setEspadaLonga(PericiaCombate espadaLonga) {
		this.espadaLonga = espadaLonga;
	}

	public PericiaCombate getArcoLongo() {
		return arcoLongo;
	}

	public void setArcoLongo(PericiaCombate arcoLongo) {
		this.arcoLongo = arcoLongo;
	}

	public PericiaCombate getAdaga() {
		return adaga;
	}

	public void setAdaga(PericiaCombate adaga) {
		this.adaga = adaga;
	}
	
	public String atacarArma(PericiaCombate arma, int ValorDefesaOponente, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de Ataque.\n".concat(arma.getNome().toString()).concat(arma.testarPericiaCombate(ValorDefesaOponente, rolagemDado));
		
		return mensagem;
	}

}
