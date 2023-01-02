package telas;
import Teclado.TecladoPlus;
import dominio.Lanche;
import dominio.Pessoa;


public class telaLanche extends Tela{
	
	
	private Lanche lanche;
	public telaLanche(Lanche lanche) {
		this.lanche=lanche;
	};
	 
	public void imprimeLanche() {
	    System.out.println("---------- Lanche  ----------");
	    Pessoa pessoa = lanche.getCopiaPessoa();
	    System.out.println("Pessoa: "+pessoa.getNome() + ", Idade:"+pessoa.getIdade() + ", Peso: "+pessoa.getPeso()+ " Altura: "+pessoa.getAltura());
	    System.out.println("Lanches");
	    telaCondimentos tela_lanches = new telaCondimentos(lanche.getCopiaCondimento());
	    tela_lanches.imprimeCondimentos();
	    System.out.printf("Valor Proteinas     = %d\n", lanche.valorProteinas());
	    System.out.printf("Valor Carboidrato        = %d\n", lanche.valorCarbo());
	    System.out.printf("Valor Gordura        = %d\n", lanche.valorGordura());
	    System.out.printf("Valor Sodio        = %d\n", lanche.valorSodio());
	    System.out.printf("Valor de Calorias   = %d\n", lanche.valorCalorias());
	   	   	    System.out.println("--------------------");
	  }
	
	
}
