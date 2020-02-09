package aula13.as11.exercicio03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import aula03.as3b.exercicio02.Contato;

public class Agenda {
	public Agenda() {
	}

	
	private List<Contato> ListaContatos = new ArrayList<Contato>();

	public void adicionaContato(Contato contato) {
		ListaContatos.add(contato);
	}

	public void adicionaContato(String string, int i, int j) {
		Contato novoc = new Contato(string, i, j);
		ListaContatos.add(novoc);

	}

	public String imprimeAgenda(Contato cont) {
		return cont.toString();
	}

	public void imprimeContato(int posicao) {
		Contato novoContato = new Contato();
		novoContato = null;
		for (Contato contato : ListaContatos) {
			if (contato.getPosicao() == posicao) {
				novoContato = contato;
			}
		}
		if (novoContato != null)
			System.out.println(novoContato);
		else
			System.out.println("\nEsse contato já foi excluido!");
	}

	public int buscaContato(String nome) {
		int novaPosicao = 0;
		for (Contato cont : ListaContatos) {
			if (cont.getNome().equals(nome)) {
				novaPosicao = cont.getPosicao();
			}
		}
		return novaPosicao;
	}

	public void removeContato(String nome) {
		Iterator<Contato> iterator = ListaContatos.iterator();
		int quantContatos = ListaContatos.size();
		while (iterator.hasNext()) {
			Contato contatoRemover = iterator.next();
			if (contatoRemover.getNome().equals(nome)) {
				iterator.remove();
			}
		}
		int novaquant = ListaContatos.size();
		if (novaquant < quantContatos) {
			System.out.println(nome + " foi removido com sucesso");
		} else
			System.out.println(" O contato " + nome + " n�o existe na lista");
	}

	public List<Contato> getListaContatos() {
		return ListaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		ListaContatos = listaContatos;
	}

}
