package controladores;
import BDcondimento.BD;
import dominio.Condimento;
import telas.telaCondimentos;
import telas.telaCondimento;
import Teclado.TecladoPlus;

public class CtCondimentos {	
private telaCondimentos TelaCondimentos;

public CtCondimentos() {
    TelaCondimentos = new telaCondimentos(BD.condimentos);
  }



public void menuPrincipal() {
    telaCondimentos.OpcoesTelaCondimentos op;
    do {
      op = TelaCondimentos.menuPrincipal();
      switch (op) {
      case LISTAR:
        listar();
        break;
      case ADICIONAR:
        adicionar();
        break;
      case EXCLUIR:
        excluir();
        break;
      default:
        break;
      }//switch
    } while  (op != telaCondimentos.OpcoesTelaCondimentos.VAZIO);
  }
private void listar() {
    TelaCondimentos.imprimeCondimentos();
  }
private void adicionar() {
    String nome;
	int    codigo;
    String medida;
    int peso;
    int proteina;
    int    carbo;
    int gordura;
    int sodio;
    int calorias;
    Condimento cond; 
    telaCondimento tela_condimento = new telaCondimento(null);
    nome       = tela_condimento.leNome();
    codigo     = tela_condimento.leCodigo();
    medida     = tela_condimento.leMedida();
    peso       = tela_condimento.lePeso();
    proteina   = tela_condimento.leProteina();
    carbo      = tela_condimento.leCarbo();
    sodio      = tela_condimento.leSodio();
    gordura    = tela_condimento.leGordura();
    calorias   = tela_condimento.leCalorias();
    cond = new Condimento (nome,medida,peso,proteina,carbo,sodio,gordura,calorias,codigo);
    BD.condimentos.add(cond);
  }

private void excluir() {
    //Mostra a lista de produtos e escolhe um produto:
    Condimento condimento_escolhido = TelaCondimentos.menuEscolherCondimento();
    if (condimento_escolhido != null) {
      BD.condimentos.remove(condimento_escolhido);
    }
    TelaCondimentos.imprime("Condimentos excluido.");
    TecladoPlus.pressioneEnter();
  }

}
