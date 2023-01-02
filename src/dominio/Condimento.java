package dominio;

import java.util.List;

public class Condimento {
	private String nome;
	 private int peso;
	 private String medida;
	 private int proteina;
	 private int carbo;
	 private int gordura;
	 private int sodio;
	 private int codigo;
	 private int calorias;
	 public Condimento(String nome,String medida,int peso,int proteina,int carbo,int sodio,int gordura,int calorias,int codigo){
		 this.setNome(nome);
		 this.setPeso(peso);
		 this.setProteina(proteina);
		 this.setCarbo(carbo);
		 this.setGordura(gordura);
		 this.setSodio(sodio);
		 this.setCodigo(codigo);
		 this.setMedida(medida);
		 this.setCalorias(calorias);
	 }
	 
	 public int getCalorias() {
		 return this.calorias;
	 }
	 public String getNome() {
		 return this.nome;
	 }
	 public int getPeso(){
		 return this.peso;
	 }
	 
	 public int getProteina(){
		 return this.proteina;
	 }
	 
	 public int getCarbo(){
		 return this.carbo;
	 }
	 
	 public int getGordura(){
		 return this.gordura;
	 }
	 
	 public int getSodio(){
		 return this.sodio;
	 }
	 public  int getCodigo(){
		 return codigo;
	 }
	 public String getMedida(){
		 return this.medida;
	 }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	public void setCarbo(int carbo) {
		this.carbo = carbo;
	}
	public void setGordura(int gordura) {
		this.gordura = gordura;
	}
	public void setSodio(int sodio) {
		this.sodio = sodio;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	 public void imprime1() {
		 System.out.println("origem: "+this.nome);
		 System.out.println(this.peso+" gramas ");
		 System.out.println("gramas de proteina: "+this.proteina);
		 System.out.println("gramas de carboidrato: "+this.carbo);
		 System.out.println("gramas de gordura: "+this.gordura);
		 System.out.println("gramas de sodio: "+this.sodio);
		 System.out.println("calorias: "+this.calorias);
		 System.out.println("codigo do produto: "+this.codigo); 
		 
	 };
	
	 
}
