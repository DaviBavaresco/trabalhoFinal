package telas;
import Teclado.TecladoPlus;

import dominio.Pessoa;

public class telaPessoa extends Tela{
	private Pessoa pessoa;
	
	public telaPessoa(Pessoa pessoas) {
	    pessoa = pessoas;	
	  };
	  
	  public String leNome() {
		    return TecladoPlus.leString("Digite seu nome: ");
		  };
		  
	  public int leAltura() {
			return TecladoPlus.leInteiro("Digite sua altura: ");
		   }
	  	  
	  public int lePeso() {
		    return TecladoPlus.leInteiro("Digite seu peso: ");
		  }
	  public int leIdade() {
		    return TecladoPlus.leInteiro("Digite sua idade: ");
		  }
	  
	public void imprimePessoa() {
	    System.out.printf("%s %d %d %d \n", pessoa.getNome(), pessoa.getAltura(), pessoa.getPeso(),pessoa.getIdade());
	  }
}
