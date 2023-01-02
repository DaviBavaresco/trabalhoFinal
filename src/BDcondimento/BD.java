package BDcondimento;
import java.util.ArrayList;
import java.util.List;
import dominio.Condimento;
import dominio.Lanche;
import dominio.Pessoa;
import dominio.RestriD;




public class BD {
	public static List<Condimento> condimentos = new ArrayList<Condimento>();
	public static List<RestriD> restrid = new ArrayList<RestriD>();
	public static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	public static List<Lanche> lanches = new ArrayList<Lanche>();
	 
	public static void criaCondimento() {
		Condimento c;	
	   c = new Condimento("Frango     ","Gramas ",50,8, 2, 1, 1,50, 1);
	   condimentos.add(c);
	   c  = new Condimento("Frango     ","Gramas ",100,16,4,2,2,100,2);
	    condimentos.add(c);	    
	    c = new Condimento("Carne-V    ","Gramas ", 50 , 8, 2, 1, 1,50,3);
	    condimentos.add(c);
	   c  = new Condimento("Carne-V    ","Gramas ", 100 , 16, 4, 2, 2,100,4);
	    condimentos.add(c);	    
	    c  = new Condimento("Arroz      ","Gramas ",50 , 2, 8, 1, 3,50,5);
	    condimentos.add(c);
	   c  = new Condimento("Arroz      ","Gramas ", 100 , 16, 4, 2, 2,100,6);
	    condimentos.add(c);	    
	     c = new Condimento("Massa      ","Gramas ",50 , 16, 4, 2, 2,50,7);
	    condimentos.add(c);
	    c  = new Condimento("Massa      ","Gramas ",100 , 16, 4, 2, 2,100,8);
	    condimentos.add(c);	    
	   c  = new Condimento("Feijão     ","Gramas ",50 , 16, 4, 2, 2,50,9);
	    condimentos.add(c);
	   c  = new Condimento("Feijão     ","Gramas ",100 , 16, 4, 2, 2,100,10);
	    condimentos.add(c);	    
	 c  = new Condimento("Lentilha   ","Gramas ", 100 , 16, 4, 2, 2,50,11);
	    condimentos.add(c);
	 c = new Condimento("Lentilha   ","Gramas ",100 , 16, 4, 2, 2,100,12);
	    condimentos.add(c);	    
	   c = new Condimento("Tomate     ","Gramas ",50 , 16, 4, 2, 2,50,13);
	    condimentos.add(c);
	   c = new Condimento("Tomate     ","Gramas ",100 , 16, 4, 2, 2,100,14);
	    condimentos.add(c);	    
	  c  = new Condimento("Alface     ","Gramas ",50 , 16, 4, 2, 2,50,15);
	    condimentos.add(c);
	   c = new Condimento("Alface     ","Gramas ",100 , 16, 4, 2, 2,100,16);
	    condimentos.add(c);	    
	  c = new Condimento("Batata-Doce","Gramas ", 50 , 16, 4, 2, 2,50,17);
	    condimentos.add(c);
	  c = new Condimento("Batata-Doce","Gramas ",100 , 16, 4, 2, 2,100,18);
	    condimentos.add(c);    
	};
	public static void criaRestrição() {
		RestriD r;
		r = new RestriD(200, 50, 150, 20, 20, 5, 5, 1, 1000);
		restrid.add(r);
		
	};
	public static void criaPessoa() {
		Pessoa p;
		p = new Pessoa("joao", 14,5255,50);
		pessoas.add(p);
		p = new Pessoa("amaral",1821,6205,53);
		pessoas.add(p);
		p = new Pessoa("jorge",1921,7205,59);
		pessoas.add(p);
		p = new Pessoa("kleber",1321,8285,102);
		pessoas.add(p);
		};
		
		
		
		
		
		
	public static void criaLanche() {
		Lanche lan;
		Pessoa pe;
		pe = pessoas.get(2);
		lan = new Lanche(pe);
		lan.incluirCondimento(condimentos.get(0));
		lan.incluirCondimento(condimentos.get(5));
		lanches.add(lan);
	};
}