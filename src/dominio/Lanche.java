package dominio;

import java.util.ArrayList;
import java.util.List;

 public class Lanche {
	
	  private Pessoa pessoa;
	  private List<Condimento> condimentos; 
		  
	  public Lanche(Pessoa pes) {
		  this.setPessoa(pes);
		  
		  condimentos = new ArrayList<Condimento>();
	  };
	  
	  
	  	public List<Condimento> getCopiaCondimento(){
	    List<Condimento> copia = new ArrayList<Condimento>();
	    for (Condimento c: condimentos) {
	      copia.add(c);
	    }
	    return copia;
	  };
	  private void setPessoa(Pessoa pessoa) {
		    
		      this.pessoa= pessoa;
		    
		  }
	  	public void removerCondimento(Condimento c) {
	  	    condimentos.remove(c);
	  	  };
	  
	  	public void incluirCondimento(Condimento c){
	  		condimentos.add(c); 
	  	};
	  	
	  	public int valorProteinas(){
	  	    int val = 0;
	  	    for (Condimento aux : condimentos){
	  	      val = val + aux.getProteina();
	  	    }
	  	    return val;
	  	  }
	  	public int valorCarbo(){
	  	    int val = 0;
	  	    for (Condimento aux : condimentos){
	  	      val = val + aux.getCarbo();
	  	    }
	  	    return val;
	  	  }
	  	public int valorGordura(){
	  	    int val = 0;
	  	    for (Condimento aux : condimentos){
	  	      val = val + aux.getGordura();
	  	    }
	  	    return val;
	  	  }
	  	public int valorSodio(){
	  	    int val = 0;
	  	    for (Condimento aux : condimentos){
	  	      val = val + aux.getSodio();
	  	    }
	  	    return val;
	  	  }
	  	public int valorCalorias(){
	  	    int val = 0;
	  	    for (Condimento aux : condimentos){
	  	      val = val + aux.getCalorias();
	  	    }
	  	    return val;
	  	  }
	  	protected Pessoa getPessoa() {
	  	    return pessoa;
	  	  }
	  	public Pessoa getCopiaPessoa() {
	  	    return pessoa.getCopia();
	  	  }
	  	
	  	
	  	
}
