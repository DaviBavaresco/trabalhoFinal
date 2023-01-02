package telas;

import java.util.List;
import Teclado.TecladoPlus;
import dominio.Condimento;
import dominio.RestriD;
import telas.telaCondimentos.OpcoesTelaCondimentos;

public class telaRestriçaos extends Tela {
	
	public static enum OpcoesTelaRestrid {VAZIO,ADICIONAR, EXCLUIR,LISTAR};
	
	private List<RestriD> restrid;
	
	public telaRestriçaos(List<RestriD> restrid) {
	    this.restrid = restrid;	
	  }
	public OpcoesTelaRestrid menuPrincipal() {
	    OpcoesTelaRestrid op = OpcoesTelaRestrid.VAZIO;
	    System.out.println("0 - Voltar");
	    System.out.println("1 - Adicionar Restrição diaria");
	    System.out.println("2 - Exlcuir Restrição diaria");
	    System.out.println("3 - Mostrar Restrições");
	    int i = TecladoPlus.leInteiro("Escolha uma opção: ");
	    op = OpcoesTelaRestrid.values()[i];
	    return op;
	  }
	 

	

	  public void imprimeRestriçao() {
	    System.out.println("------------------ Restrição diaria medidas em gramas ------------------");
	    System.out.printf("%2s %7s %12s %15s %14s %14s %14s %10s %14s \n", "Prot", "prot", "Carb", "carb", "Gord","gord","Sodio", "sodio","calorias");
	    for (RestriD r: restrid){
	      telaRestriçao telaRestriçao = new telaRestriçao(r);
	      telaRestriçao.imprimeRestriçao();
	    }
	  }//imprimeProdutos()
	  public RestriD menuEscolheRestri() {
		    RestriD r;
		    imprimeRestriçao();
		    int i = TecladoPlus.leInteiroPositivo("Digite o número da restrição (0 a " + (restrid.size()-1) + "): ");
		    if ( (i>=0) && (i < restrid.size()) ) {
		      r = restrid.get(i);
		    }
		    else {
		      System.out.println("Restriçao inválida.");
		      r = null;
		    }
		    return r;
		  }
}