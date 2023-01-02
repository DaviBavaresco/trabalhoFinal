package controladores;
import BDcondimento.BD;
import dominio.RestriD;
import telas.telaRestriçao;
import telas.telaRestriçaos;
import telas.telaRestriçaos.OpcoesTelaRestrid;
import Teclado.TecladoPlus;
public class CtRestriD {
	private telaRestriçaos TelaRestrid;
	public CtRestriD() {
		TelaRestrid = new telaRestriçaos(BD.restrid);
	}
	public void menuPrincipal() {
		telaRestriçaos.OpcoesTelaRestrid op;
	    do {
	      op = TelaRestrid.menuPrincipal();
	      switch (op) {	      
	      case ADICIONAR:
	        adicionar();
	        break;	      
	      case EXCLUIR:
	        excluir();
	        break;
	      case LISTAR:
		        listar();
		        break;
	      default:
	        break;
	      }//switch
	    } while  (op != telaRestriçaos.OpcoesTelaRestrid.VAZIO);
	  }//menuPrincipal()
	 private void adicionar() {
		    int    mxP;
		    int mnP;
		    int  mxC;
		    int    mnC;
		    int   mxG;
		    int  mnG;
		    int  mxS;
		    int mnS;
		    int calorias;
		    
		    RestriD restri; 
		    telaRestriçao tela_res = new telaRestriçao(null);
		    mxP     = tela_res.leQuantidadeMaxProt();
		    mnP    = tela_res.leQuantidadeMinProt();
		    mxC   = tela_res.leQuantidadeMaxCarb();
		    mnC = tela_res.leQuantidadeMinCarb();
		    mxG     = tela_res.leQuantidadeMaxGord();
		    mnG    = tela_res.leQuantidadeMinGord();
		    mxS   = tela_res.leQuantidadeMaxSodio();
		    mnS = tela_res.leQuantidadeMinSodio();
		    calorias = tela_res.leCalorias();
		    restri = new RestriD (mxP,mnP ,mxC ,mnC ,mxG ,mnG ,mxS ,mnS ,calorias);
		    BD.restrid.add(restri);
		  }
	 
	 private void excluir() {
		    //Mostra a lista de produtos e escolhe um produto:
		    RestriD restri_escolhido = TelaRestrid.menuEscolheRestri();
		    if (restri_escolhido != null) {
		      BD.restrid.remove(restri_escolhido);
		    }
		    TelaRestrid.imprime("Restrição excluido.");
		    TecladoPlus.pressioneEnter();
		  }
	 private void listar() {
		    TelaRestrid.imprimeRestriçao();
		  }
	}
	

