package telas;
import Teclado.TecladoPlus;

public class telaPrincipal extends Tela {
	public static enum OpcoesTelaPrincipal {VAZIO, Pessoa, Condimentos, Restrição_diaria, Lanches };
	
	public OpcoesTelaPrincipal menuPrincipal () {
	    OpcoesTelaPrincipal op = OpcoesTelaPrincipal.VAZIO;
	    System.out.println("0 - Sair");
	    System.out.println("1 - Pessoa");
	    System.out.println("2 - Condimentos");
	    System.out.println("3 - Restrição diaria");
	    System.out.println("4 - Lanches prontos");
	    int i = TecladoPlus.leInteiro("Escolha uma opção: ");
	    op = OpcoesTelaPrincipal.values()[i];
	    return op;
	  }

}
