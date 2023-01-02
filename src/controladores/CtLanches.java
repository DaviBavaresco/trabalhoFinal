package controladores;
import java.util.List;
import BDcondimento.BD;
import telas.telaLanches;
import telas.telaLanche;
import telas.telaMontaLanche;
import Teclado.TecladoPlus;
import dominio.Lanche;
import dominio.Pessoa;
import dominio.Condimento;


public class CtLanches {
private telaLanches TelaLanches;

public CtLanches() {
	TelaLanches= new telaLanches(BD.lanches);
}

public void menuPrincipal() {
    telaLanches.OpcoesTelaLanches op;
    do {
      op = TelaLanches.menuPrincipal();
      switch (op) {
      case LISTAR:
        listar();
        break;
      case ADICIONAR:
        montarLanche();
        break;
      case EXCLUIR:
        excluir();
        break;
      default:
        break;
      }//switch
    }while(op != telaLanches.OpcoesTelaLanches.VAZIO);
}
private void listar() {
    TelaLanches = new telaLanches(BD.lanches);
    TelaLanches.imprimeLanches(); 
  }
private void excluir() {
    TelaLanches.imprime("Função ainda não implementada.");
    TecladoPlus.pressioneEnter();
  }
public Lanche montarLanche() {
    telaMontaLanche tela_monta_lanche = new telaMontaLanche(BD.pessoas, BD.condimentos);

    //Escolher cliente.
    Pessoa p = tela_monta_lanche.menuEscolherPessoa();
    if (p == null) {
      tela_monta_lanche.imprime("Número de Pessoa invalida: ");
      TecladoPlus.pressioneEnter();
      return null;
    }

    //Escolher produtos.
    List<Condimento> conds = tela_monta_lanche.menuEscolherCondimento();
    if (conds.size() == 0) {
      tela_monta_lanche.imprime("Nenhum produto adicionado: ");
      TecladoPlus.pressioneEnter();
      return null;
    }

    
    Lanche lanche = new Lanche(p);

    //Adicionar produtos na nota fiscal.
    for (Condimento c: conds) {
      lanche.incluirCondimento(c);
    }

    //Gravar nota fiscal no banco de dados.
    BD.lanches.add(lanche);

    //Dar mensagem para usuário
    tela_monta_lanche.imprime("Lanche criado.");
    telaLanche tela_lanche = new telaLanche(lanche);
    tela_lanche.imprimeLanche();
    tela_lanche.imprime("----------------------------------");
    TecladoPlus.pressioneEnter();

    return lanche;
  }

}
