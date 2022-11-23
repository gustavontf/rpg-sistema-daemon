package com.daemon.sistema.rpg.velho.modelo;

public class PersonagemJogador {

	private Atributo constituicao;
	private Atributo forca;
	private Atributo destreza;
	private Atributo agilidade;
	private Atributo inteligencia;
	private Atributo forca_vontade;
	private Atributo percepcao;
	private Atributo carisma;
	
	private Pericia furtividade;
	private Pericia rastreio;
	
	private PericiaCombate briga;
	
	public PersonagemJogador(Atributo constituicao, Atributo forca, Atributo destreza, Atributo agilidade,
			Atributo inteligencia, Atributo forca_vontade, Atributo percepcao, Atributo carisma, Pericia furtividade,
			Pericia rastreio, PericiaCombate briga) {		
		this.constituicao = constituicao;
		this.forca = forca;
		this.destreza = destreza;
		this.agilidade = agilidade;
		this.inteligencia = inteligencia;
		this.forca_vontade = forca_vontade;
		this.percepcao = percepcao;
		this.carisma = carisma;
		this.furtividade = furtividade;
		this.rastreio = rastreio;
		this.briga = briga;
	}
	
	public Atributo getConstituicao() {
		return this.constituicao;
	}
	
	public void setConstituicao(Atributo constituicao) {
		this.constituicao = constituicao;
	}
	
	public Atributo getForca() {
		return this.forca;
	}
	
	public void setForca(Atributo forca) {
		this.forca = forca;
	}
	
	public Atributo getDestreza() {
		return destreza;
	}

	public void setDestreza(Atributo destreza) {
		this.destreza = destreza;
	}

	public Atributo getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(Atributo agilidade) {
		this.agilidade = agilidade;
	}

	public Atributo getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Atributo inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Atributo getForca_vontade() {
		return forca_vontade;
	}

	public void setForca_vontade(Atributo forca_vontade) {
		this.forca_vontade = forca_vontade;
	}

	public Atributo getPercepcao() {
		return percepcao;
	}

	public void setPercepcao(Atributo percepcao) {
		this.percepcao = percepcao;
	}

	public Atributo getCarisma() {
		return carisma;
	}

	public void setCarisma(Atributo carisma) {
		this.carisma = carisma;
	}

	public Pericia getFurtividade() {
		return this.furtividade;
	}
	
	public void setFurtividade(Pericia furtividade) {
		this.furtividade = furtividade;
	}
	
	public Pericia getRastreio() {
		return this.rastreio;
	}
	
	public void setRastreio(Pericia rastreio) {
		this.rastreio = rastreio;
	}
	
	public PericiaCombate getBriga() {
		return this.briga;
	}
	
	public void setBriga(PericiaCombate briga) {
		this.briga = briga;
	}
		
	public String testarConstituicao(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de Constitui��o.".concat(this.constituicao.testarAtributo(dificuldade, rolagemDado).concat("Constitui��o!"));		
			
		return mensagem;
	}

	public String testarForca(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de For�a.".concat(this.forca.testarAtributo(dificuldade, rolagemDado).concat("For�a!"));		
			
		return mensagem;
	}
	
	public String testarDestreza(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de Destreza.".concat(this.destreza.testarAtributo(dificuldade, rolagemDado).concat("Destreza!"));		
			
		return mensagem;
	}
	
	public String testarAgilidade(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
				
		mensagem = "Teste de Agilidade.".concat(this.agilidade.testarAtributo(dificuldade, rolagemDado).concat("Agilidade!"));		
			
		return mensagem;				
	}
	
	public String testarInteligencia(NivelDificuldade dificuldade, int rolagemDado) {		
		String mensagem;
		
		mensagem = "Teste de Intelig�ncia.".concat(this.inteligencia.testarAtributo(dificuldade, rolagemDado).concat("Intelig�ncia!"));		
			
		return mensagem;
	}
	
	public String testarForcaVontade(NivelDificuldade dificuldade, int rolagemDado) {		
		String mensagem;
		
		mensagem = "Teste de For�a de Vontade.".concat(this.forca_vontade.testarAtributo(dificuldade, rolagemDado).concat("For�a de Vontade!"));		
			
		return mensagem;
	}
	
	public String testarPercepcao(NivelDificuldade dificuldade, int rolagemDado) {		
		String mensagem;
		
		mensagem = "Teste de Percep��o.".concat(this.percepcao.testarAtributo(dificuldade, rolagemDado).concat("Percep��o!"));		
			
		return mensagem;
	}
	
	public String testarCarisma(NivelDificuldade dificuldade, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de Carisma.".concat(carisma.testarAtributo(dificuldade, rolagemDado).concat("Carisma!"));		
			
		return mensagem;
		
	}
	
	//Mudar para igual ao teste de atributo
	public boolean testarFurtividade(NivelDificuldade dificuldade, int rolagemDado) {
		return this.furtividade.testarPericia(dificuldade, rolagemDado);
	}
	
	public boolean testarRastreio(NivelDificuldade dificuldade, int rolagemDado) {
		return this.rastreio.testarPericia(dificuldade, rolagemDado);
	}
	
	public String atacarBriga(int ValorDefesaOponente, int rolagemDado) {
		String mensagem;
		
		mensagem = "Teste de Ataque.\n".concat(briga.getNome().toString()).concat(briga.testarPericiaCombate(ValorDefesaOponente, rolagemDado));
		
		return mensagem;
	}
	
	//Incluir os outros atributos
	@Override
	public String toString() {
		String texto;
		
		texto = "PERSONAGEM JOGADOR\n\n" +
				"Atributos\n" +
				constituicao.getNome() + ": " + constituicao.getValor() + "\n" +
				forca.getNome() + ": " + forca.getValor() + "\n" +
				destreza.getNome() + ": " + destreza.getValor() + "\n" +
				agilidade.getNome() + ": " + agilidade.getValor() + "\n" +
				inteligencia.getNome() + ": " + inteligencia.getValor() + "\n" +
				forca_vontade.getNome() + ": " + forca_vontade.getValor() + "\n" +
				percepcao.getNome() + ": " + percepcao.getValor() + "\n" +
				carisma.getNome() + ": " + carisma.getValor() + "\n\n" +				
				"Per�cias\n" +
				furtividade.getNome() + ": " + furtividade.getValorTotal() + "\n" +
				rastreio.getNome() + ": " + rastreio.getValorTotal(); 
		
		return texto;
	}
	
	
}
