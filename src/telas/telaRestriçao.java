package telas;

import java.util.List;

import Teclado.TecladoPlus;
import dominio.RestriD;

public class telaRestriçao extends Tela{
	private RestriD restrid;

	public telaRestriçao(RestriD r) {
	    restrid = r;	
	  }

	  public int leQuantidadeMaxProt() {
	    return TecladoPlus.leInteiro("Digite a quantidade máxima de proteina que você pode comer por dia: ");
	  }
	  public int leQuantidadeMinProt() {
		    return TecladoPlus.leInteiro("Digite a quantidade minima de proteina que você pode comer por dia: ");
		  }
	  public int leQuantidadeMaxCarb() {
		    return TecladoPlus.leInteiro("Digite a quantidade máxima de carboidrato que você pode comer por dia: ");
		  }
	  public int leQuantidadeMinCarb() {
		    return TecladoPlus.leInteiro("Digite a quantidade minima de carboidrato que você pode comer por dia: ");
		  }
	  public int leQuantidadeMaxGord() {
		    return TecladoPlus.leInteiro("Digite a quantidade máxima de gordura que você pode comer por dia: ");
		  }
	  public int leQuantidadeMinGord() {
		    return TecladoPlus.leInteiro("Digite a quantidade minima de gordura que você pode comer por dia: ");
		  }
	  public int leQuantidadeMaxSodio() {
		    return TecladoPlus.leInteiro("Digite a quantidade máxima de sodio que você pode comer por dia: ");
		  }
	  public int leQuantidadeMinSodio() {
		    return TecladoPlus.leInteiro("Digite a quantidade minima de sodio que você pode comer por dia: ");
		  }
	  public int leCalorias() {
		    return TecladoPlus.leInteiro("Digite o maximo de calorias que você pode comer por dia: ");
		  }



	  //public void imprimeCodNomePreco() {
	  //  System.out.printf("%s %d  ", condimento.getNome(),condimento.getCodigo());
	 // }//imprimeCodNomePreco()

	  public void imprimeRestriçao(){
	    System.out.printf("%d     %d            %d             %d              %d            %d            %d            %d            %d\n", restrid.getQuantidadeMaxProt(), restrid.getQuantidadeMinProt(),restrid.getQuantidadeMaxCarb(),restrid.getQuantidadeMinCarb(),restrid.getQuantidadeMaxGord(),restrid.getQuantidadeMinGord(),restrid.getQuantidadeMaxSodio(),restrid.getQuantidadeMinSodio(),restrid.getCalorias());
	  }//imprimeProduto() 

	  /*
	   *Nesta abordagem, a Tela precisaria modificar um objeto do domínio.
	  public void editaProduto() {
	    System.out.println("----- Editar Produto -----");
	    imprimeProduto();
	    String desc = TecladoPlus.leString("Digite o novo valor para descricao: ");
	    float preco = TecladoPlus.leFloat("Digite o novo valor para o preco: ");
	    produto.setNome(desc);
	    produto.setPreco(preco);
	  }
	*/
	  
	}//TelaProduto.


