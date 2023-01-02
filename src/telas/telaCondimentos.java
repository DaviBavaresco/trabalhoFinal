package telas;
import java.util.List;
import dominio.Condimento;
import Teclado.TecladoPlus;
	
public class telaCondimentos extends Tela { 
	

	public static enum OpcoesTelaCondimentos {VAZIO,LISTAR ,ADICIONAR, EXCLUIR};
	  

	  private List<Condimento> condimentos;

	  public telaCondimentos(List<Condimento> condimentos) {
	    this.condimentos = condimentos;	
	  }
	  public OpcoesTelaCondimentos menuPrincipal() {
		    OpcoesTelaCondimentos op = OpcoesTelaCondimentos.VAZIO;
		    System.out.println("0 - Voltar");
		    System.out.println("1 - Listar todos condimentos");
		    System.out.println("2 - Adicionar Condimento");
		    System.out.println("3 - Exlcuir Condimento");
		    int i = TecladoPlus.leInteiro("Escolha uma opção: ");
		    op = OpcoesTelaCondimentos.values()[i];
		    return op;
		  }
	

	  public void imprimeCondimentos() {
	    System.out.println("------------------ Condimentos medidos em gramas ------------------");
	    System.out.printf("%2s %12s %16s %16s %12s %10s %s \n", "Nome", "Cod", "Proteina", "Carboidrato", "Gordura","Sodio", "Calorias");
	    for (Condimento c: condimentos){
	      telaCondimento telaCondimento = new telaCondimento(c);
	      telaCondimento.imprimeCondimento();
	    }
	  }//imprimeProdutos()
	  
	  public Condimento menuEscolherCondimento() {
		    Condimento c;
		    imprimeCondimentos();
		    int i = TecladoPlus.leInteiroPositivo("Digite o número do condimento (0 a " + (condimentos.size()-1) + "): ");
		    if ( (i>=0) && (i < condimentos.size()) ) {
		      c = condimentos.get(i);
		    }
		    else {
		      System.out.println("Condimento inválido.");
		      c = null;
		    }
		    return c;
		    }
	  
	  
}
	  /*
	  //Não está muito bom pois quebra o encapsulamento (o indice foi passado por parâmetro).
	  private void imprimeProdutoIndice(Produto p, int indice) {
	    System.out.printf("%d %-20s %10.2f\n", indice, p.getNome(), p.getPreco());
	  }//imprimeProdutoIndice()

	  private void imprimeProdutosIndice() {
	    System.out.println("---------- Produtos ----------");
	    int i = 0;
	    for (Produto p: produtos){
	      //Nao ficou muito bom, pois teve que passar o indice i como parametro.
	      imprimeProdutoIndice(p, i);
	      i++;
	    }
	  }//imprimeProdutosIndice()
	*/

	//TelaProdutos.

