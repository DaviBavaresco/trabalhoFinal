package telas;

import java.util.ArrayList;
import java.util.List;
import BDcondimento.BD;
import dominio.Condimento;
import dominio.Lanche;
import dominio.Pessoa;
import Teclado.TecladoPlus;



public class telaMontaLanche {
	 private List<Pessoa> pessoas;
	  private List<Condimento> condimentos;
	public telaMontaLanche(List<Pessoa> pessoas, List<Condimento> condimentos) {
		this.pessoas = pessoas;
		this.condimentos = condimentos;
	}

	public Lanche MontaLanche() {
	    telaMontaLanche tela_monta_lanche = new telaMontaLanche(BD.pessoas, BD.condimentos);

	    Pessoa pessoas = null;
	    
	   List<Condimento> cond = null;
	     

	    Lanche lanche = new Lanche(pessoas);

	    
	    for (Condimento c: cond) {
	      lanche.incluirCondimento(c);
	    }

	    
	    BD.lanches.add(lanche);

	    

	    return lanche;
	  }//efetuarVenda()
	public Pessoa menuEscolherPessoa() {
	    Pessoa p;
	    int i = TecladoPlus.leInteiroPositivo("Digite o número da pessoa (0 a " + (pessoas.size()-1) + "): ");
	    if ( (i>=0) && (i < pessoas.size()) ) {
	      p = pessoas.get(i);
	    }
	    else {
	      System.out.println("Clientes inválido.");
	      p = null;
	    }
	    return p;
	  }
	
	public List<Condimento> menuEscolherCondimento() {
	    List<Condimento> Condimentos_escolhidos = new ArrayList<Condimento>();
	    //Escolher produtos.
	    System.out.println("Escolha os Condimentos");
	    char resp='s';
	    while (resp=='s') {
	      telaCondimentos TelaCondimentos = new telaCondimentos(this.condimentos);
	      Condimento c = TelaCondimentos.menuEscolherCondimento();
	      if ( c != null) {
	        Condimentos_escolhidos.add(c);
	      }
	      else {
	        break;
	      }
	      resp = TecladoPlus.leChar("Deseja adicionar outro condimento (s/n)?");
	    }//while		
	    return Condimentos_escolhidos;
	  }

	public void imprime(String string) {
		// TODO Auto-generated method stub
		
	}
}
