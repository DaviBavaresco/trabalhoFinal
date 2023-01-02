package controladores;

import BDcondimento.BD;
import dominio.Pessoa;
import telas.telaPessoa;
import telas.telaPessoas;
import Teclado.TecladoPlus;

public class CtPessoa {
	private telaPessoas TelaPessoas;
	
	public CtPessoa() {
		TelaPessoas = new telaPessoas(BD.pessoas);
	};
	
	public void menuPrincipal() {
	    telaPessoas.OpcoesTelaPessoas op;
	    do {
	      op = TelaPessoas.menuPrincipal();
	      switch (op) {
	      case ADICIONAR:
	        adicionar();
	        break;
	      default:
	        break;
	      }//switch
	    } while  (op != telaPessoas.OpcoesTelaPessoas.VAZIO);
	  }
	private void adicionar() {
	    String nome;
	    int altura;
	    int peso;
	    int idade;
	    Pessoa pessoa; 
	    telaPessoa tela_pessoa = new telaPessoa(null);
	    nome = tela_pessoa.leNome();
	    altura = tela_pessoa.leAltura();
	    peso  = tela_pessoa.lePeso();
	    idade = tela_pessoa.leIdade();

	    pessoa = new Pessoa(nome, altura, peso,idade);
	    BD.pessoas.add(pessoa);
	  }
}
