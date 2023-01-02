package dominio;


public class Pessoa {
	  private String Nome;
	  private int Altura;
	  private int Peso;
	  private int Idade;
	  

	  public Pessoa(String Nome, int Altura,int Peso,int Idade ){
	    this.setNome(Nome);
	    this.setAltura(Altura);
	    this.setPeso(Peso);
	    this.setIdade(Idade);
	  }

	  public String getNome() {
	    return Nome;
	  } 

	  public int getAltura() {
	    return Altura;
	  }

	  public int getPeso() {
	    return Peso;
	  }
	  
	  public int getIdade() {
		 return Idade;
	  }
	  public void setNome(String Nome) {
	    this.Nome = Nome;
	  }

	  public void setAltura(int Altura) {
	    
	    this.Altura = Altura;
	  }

	  public void setPeso(int Peso) {
	    
	    this.Peso = Peso;
	  }
	  public void setIdade(int Idade) {
		
		this.Idade = Idade;
	  }

	  public Pessoa getCopia() {
		    Pessoa p = new Pessoa (this.Nome, this.Altura, this.Peso,this.Idade);
		    return p;
		  }
	  
	 

	}//Pessoa.