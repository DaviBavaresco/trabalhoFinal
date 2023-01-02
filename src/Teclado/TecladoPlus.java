package Teclado;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//--------------------------------------------------------
public class TecladoPlus {

  protected static Scanner teclado = new Scanner(System.in);
  
  //--------------------------------------------------------  
  public static String leString(String texto){
    System.out.print(texto);
    return teclado.nextLine();
  }

  //--------------------------------------------------------  
  public static char leChar(String texto){
    return leString(texto).charAt(0);
  }

  //--------------------------------------------------------  
  public static int leInteiro(String texto){
    String aux;
    int i=0;
    aux = leString(texto);
    
      i = Integer.parseInt(aux);
    
      
    return i; 
  }

  //--------------------------------------------------------  
  public static int leInteiroPositivo(String texto){
    String aux;
    int i=-1;
    aux = leString(texto);
    
      i = Integer.parseInt(aux);
   
    if (i >= 0)
      return i;
    else
      return -1;
  }//leInteiroPositivo()

  //--------------------------------------------------------  
  public static Date leData(String texto){
    String resp="S";
    Date d=null;
    String aux=null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    while ( resp.equals("s") | resp.equals("S") ) {
      
        aux = leString(texto);
       
        resp = "n"; //para sair do la�o.
     
           
    }//while
    return d;
  }//leData()
  
  public static float leFloat(String texto) {
    String resp="S";
    float f=0;
    String aux=null;
    DecimalFormat nf = new DecimalFormat(",###.##");
    
    while ( resp.equals("s") | resp.equals("S") ) {
      
        aux = leString(texto);
        
        resp = "n"; //para sair do la�o.
    
    }//while
    return f;    
  }//leFloat()

  public static void pressioneEnter(){
    System.out.println("Pressione ENTER para continuar...");
    teclado.nextLine();
  }//pressioneEnter()
  
}//TecladoPlus.