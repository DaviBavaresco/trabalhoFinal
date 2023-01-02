package telas;
import java.util.List;
import dominio.Pessoa;
import Teclado.TecladoPlus;



public class telaPessoas extends Tela{
	public static enum OpcoesTelaPessoas {VAZIO, ADICIONAR}
	
	private List<Pessoa> pessoas;

	  public telaPessoas(List<Pessoa> pessoas) {
	    this.pessoas = pessoas;	
	  }
	  
	  
	  public OpcoesTelaPessoas menuPrincipal () {
		    OpcoesTelaPessoas op = OpcoesTelaPessoas.VAZIO;
		    System.out.println("0 - Voltar");
		   	System.out.println("1 - Adicionar Pessoa");
		    int i = TecladoPlus.leInteiro("Escolha uma opção: ");
		    op = OpcoesTelaPessoas.values()[i];
		    return op;
		  }
	public void imprimePessoas() {
	    System.out.println("------------------ Pessoa ------------------");
	    System.out.printf("%s %s %s  %s \n", "Nome", "Altura", "Peso", "Idade");
	    for (Pessoa p: pessoas){
	      telaPessoa tela_pessoa = new telaPessoa(p);
	      tela_pessoa.imprimePessoa();
	    }
	  }
}
