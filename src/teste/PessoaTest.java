package teste;

import BDcondimento.BD;
import controladores.CtPrincipal;
import telas.telaCondimentos;
import telas.telaLanches;
import telas.telaPessoa;
import telas.telaPessoas;
import telas.telaRestriçaos;




public class PessoaTest{
	
	
		public static void main(String args[]){
		    System.out.println("========== Programa  ==========");
		    BD.criaCondimento();
	        BD.criaRestrição(); 
	        BD.criaPessoa();
	        BD.criaLanche();
		    
	        CtPrincipal ctPrincipal = new CtPrincipal();
	        ctPrincipal.menuPrincipal();
	        
		
		 
		}
	
	
	    
	
	      
	    
	  
};