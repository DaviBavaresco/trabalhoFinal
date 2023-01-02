package telas;
import java.util.List;
import dominio.Lanche;
import Teclado.TecladoPlus;




public class telaLanches extends Tela {
	
	public static enum OpcoesTelaLanches {VAZIO, LISTAR, ADICIONAR, EXCLUIR};
	private List<Lanche> lanches;
	
	public telaLanches(List<Lanche> lanches) {
	    this.lanches = lanches;
	  } 
	
	public OpcoesTelaLanches menuPrincipal () {
	    OpcoesTelaLanches op = OpcoesTelaLanches.VAZIO;
	    System.out.println("0 - Voltar");
	    System.out.println("1 - Listar todos os Lanches");
	    System.out.println("2 - Criar um novo lanche");
	    System.out.println("3 - Exlcuir um novo Lanche");
	    int i = TecladoPlus.leInteiro("Escolha uma opção: ");
	    op = OpcoesTelaLanches.values()[i];
	    return op;
	  }

	public void imprimeLanches() {
	    telaLanche tela;
	    for (Lanche lanche: lanches){
	      tela = new telaLanche(lanche);
	      tela.imprimeLanche();
	    }//for
	  }
}
