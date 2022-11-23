package com.daemon.sistema.rpg.velho;

import com.daemon.sistema.rpg.velho.modelo.Atributo;
import com.daemon.sistema.rpg.velho.modelo.Guerreiro;
import com.daemon.sistema.rpg.velho.modelo.NivelDificuldade;
import com.daemon.sistema.rpg.velho.modelo.SiglaAtributo;
import com.daemon.sistema.rpg.velho.modelo.NomePericia;
import com.daemon.sistema.rpg.velho.modelo.NomePericiaCombate;
import com.daemon.sistema.rpg.velho.modelo.Pericia;
import com.daemon.sistema.rpg.velho.modelo.PericiaCombate;
import com.daemon.sistema.rpg.velho.modelo.PersonagemJogador;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Personagem Jogador Generioco	 	
		Atributo constituicaoPersonagem = new Atributo(SiglaAtributo.CON, "Constitui��o", 13, 0);
		Atributo forcaPersonagem = new Atributo(SiglaAtributo.FR, "For�a", 15, 0);
		Atributo destrezaPersonagem = new Atributo(SiglaAtributo.DEX, "Destreza", 14, 0);
		Atributo agilidadePersonagem = new Atributo(SiglaAtributo.AGI, "Agilidade", 15, 0);
		Atributo inteligenciaPersonagem = new Atributo(SiglaAtributo.INT, "Inteligencia", 11, 0);
		Atributo forca_vontadePersonagem = new Atributo(SiglaAtributo.WILL, "For�a de Vontade", 12, 0);
		Atributo percepcaoPersonagem = new Atributo(SiglaAtributo.PER, "Percep��o",  12, 0);
		Atributo carismaPersonagem = new Atributo(SiglaAtributo.CAR, "Carisma",  9, 0);
		
		Pericia furtividadePersonagem = new Pericia("Furtividade", agilidadePersonagem, 45); 
		Pericia rastreioPersonagem = new Pericia("Rastreio", percepcaoPersonagem, 30); 
		
		PericiaCombate brigaPersonagem = new PericiaCombate(NomePericiaCombate.BRIGA, destrezaPersonagem, 10, 10);
		
		PersonagemJogador personagemJogador = new PersonagemJogador(constituicaoPersonagem, forcaPersonagem, destrezaPersonagem, agilidadePersonagem, inteligenciaPersonagem, forca_vontadePersonagem, 
				percepcaoPersonagem, carismaPersonagem, furtividadePersonagem, rastreioPersonagem, brigaPersonagem);
		
		System.out.println(personagemJogador.toString());
		
		System.out.println("\n");
		
		System.out.println(personagemJogador.testarAgilidade(NivelDificuldade.NORMAL, 90));
		
		System.out.println("\n");
		
		System.out.println(personagemJogador.testarForca(NivelDificuldade.DIFICIL, 20));
		
		System.out.println("\n");
		
		System.out.println(personagemJogador.atacarBriga(10, 45));
		
		System.out.println("\n");
		System.out.println("\n");
		
		//Personagem Jogador Guerreiro
		Atributo constituicaoGuerreiro = new Atributo(SiglaAtributo.CON, 18, 0);
		Atributo forcaGuerreiro = new Atributo(SiglaAtributo.FR, 20, 0);
		Atributo destrezaGuerreiro = new Atributo(SiglaAtributo.DEX, 19, 0);
		Atributo agilidadeGuerreiro = new Atributo(SiglaAtributo.AGI, 20, 0);
		Atributo inteligenciaGuerreiro = new Atributo(SiglaAtributo.INT, 11, 0);
		Atributo forca_vontadeGuerreiro = new Atributo(SiglaAtributo.WILL, 17, 0);
		Atributo percepcaoGuerreiro = new Atributo(SiglaAtributo.PER, 17, 0);
		Atributo carismaGuerreiro = new Atributo(SiglaAtributo.CAR, 8, 0);
		
		Pericia furtividadeGuerreiro = new Pericia("Furtividade", agilidadeGuerreiro, 55); 
		Pericia rastreioGuerreiro = new Pericia("Rastreio", percepcaoGuerreiro, 60); 
		
		PericiaCombate brigaGuerreiro = new PericiaCombate(NomePericiaCombate.BRIGA, destrezaGuerreiro, 50, 50);
		PericiaCombate espadaLongaGuerreiro = new PericiaCombate(NomePericiaCombate.ESPADA_LONGA, destrezaGuerreiro, 79, 79);
		PericiaCombate arcoLongoGuerreiro = new PericiaCombate(NomePericiaCombate.ARCO_LONGO, destrezaGuerreiro, 49, 0);
		PericiaCombate adagaGuerreiro = new PericiaCombate(NomePericiaCombate.ADAGA, destrezaGuerreiro, 30, 30);
		
		Guerreiro guerreiro = new Guerreiro(constituicaoGuerreiro, forcaGuerreiro, destrezaGuerreiro, agilidadeGuerreiro, inteligenciaGuerreiro, forca_vontadeGuerreiro, percepcaoGuerreiro, carismaGuerreiro, 
				furtividadeGuerreiro, rastreioGuerreiro, brigaGuerreiro, espadaLongaGuerreiro, arcoLongoGuerreiro, adagaGuerreiro);
		
		System.out.println(guerreiro.toString());
		
		System.out.println("\n");
		
		System.out.println(guerreiro.testarAgilidade(NivelDificuldade.NORMAL, 90));
		
		System.out.println("\n");
		
		System.out.println(guerreiro.testarForca(NivelDificuldade.DIFICIL, 20));
		
		System.out.println("\n");
		
		System.out.println(guerreiro.atacarBriga(70, 58));
		
		System.out.println("\n");
		
		System.out.println(guerreiro.atacarArma(guerreiro.getEspadaLonga(), 100, 32));
		
	}
	
}
