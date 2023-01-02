package telas;


import Teclado.TecladoPlus;
import dominio.Condimento;


public class telaCondimento extends Tela {
	private Condimento condimento;

	  public telaCondimento(Condimento c) { 
	    condimento = c;	
	  }

	  public int leCodigo() {
	    return TecladoPlus.leInteiro("Digite o codigo: ");
	  }
	  public String leNome() {
	    return TecladoPlus.leString("Digite o nome: ");
	  }
	  public int leProteina() {
	    return TecladoPlus.leInteiro("Digite a quantidade de proteina: ");
	  }
	  public int leCarbo() {
	    return TecladoPlus.leInteiro("Digite a quantidade de carboidrato: ");
	  }
	  public int leGordura() {
		return TecladoPlus.leInteiro("Digite a quantidade de gordura: ");
	  }
	  public int leSodio() {
		return TecladoPlus.leInteiro("Digite a quantidade de sodio: ");
	  }
	  public int leCalorias() {
		return TecladoPlus.leInteiro("Digite a quantidade de calorias: ");
	  }
	  public String leMedida() {
		return TecladoPlus.leString("Digite a unidade de medida(KG/GRAMAS): ");
	  }
	  public int lePeso() {
		    return TecladoPlus.leInteiro("Digite o pes0: ");
	  }
	  
	  
	 

	  public void imprimeCondimento() {
	    System.out.printf("%s     %d            %d             %d              %d            %d            %d   \n", condimento.getNome(), condimento.getCodigo(),condimento.getProteina(),condimento.getCarbo(),condimento.getGordura(),condimento.getSodio(),condimento.getCalorias());
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
