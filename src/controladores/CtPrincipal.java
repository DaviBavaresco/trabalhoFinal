package controladores;
import telas.telaPrincipal;

public class CtPrincipal {
private telaPrincipal TelaPrincipal;

public CtPrincipal(){
	TelaPrincipal = new telaPrincipal();
}
public void menuPrincipal() {

    telaPrincipal.OpcoesTelaPrincipal op;
    do {
      op = TelaPrincipal.menuPrincipal();
      switch (op) {
      case Pessoa:
        ctPessoa();
        break;
      case Condimentos:
        ctCondimentos();
        break;
      case Restrição_diaria:
          ctRestrid();
          break;
      case Lanches:
          ctLanche();
          break;
      default:
        break;
      }//switch
    } while  (op != telaPrincipal.OpcoesTelaPrincipal.VAZIO);

}
private void ctPessoa() {
    CtPessoa ctPessoa = new CtPessoa();
    ctPessoa.menuPrincipal();
  }
private void ctCondimentos() {
    CtCondimentos ctCondimentos = new CtCondimentos();
    ctCondimentos.menuPrincipal();
  }
private void ctRestrid() {
    CtRestriD ctRestrid = new CtRestriD();
    ctRestrid.menuPrincipal();
  }
private void ctLanche() {
    CtLanches ctLanche = new CtLanches();
   ctLanche.menuPrincipal();
  }
}