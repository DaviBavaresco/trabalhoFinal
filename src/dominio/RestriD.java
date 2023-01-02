package dominio;

public class RestriD {
		private Pessoa pessoa;
		private int QuantidadeMaxProt;
		private int QuantidadeMinProt;
		private int QuantidadeMaxCarb;
		private int QuantidadeMinCarb;
		private int QuantidadeMaxGord;
		private int QuantidadeMinGord;
		private int QuantidadeMaxSodio;
		private int QuantidadeMinSodio;
		private int Calorias;
		
		public RestriD(int QuantidadeMaxProt,int QuantidadeMinProt,int QuantidadeMaxCarb,int QuantidadeMinCarb,int QuantidadeMaxGord,int QuantidadeMinGord,int QuantidadeMaxSodio,int QuantidadeMinSodio,int Calorias) {
			this.setQuantidadeMaxProt(QuantidadeMaxProt);
			this.setQuantidadeMinProt(QuantidadeMinProt);
			this.setQuantidadeMaxCarb(QuantidadeMaxCarb);
			this.setQuantidadeMinCarb(QuantidadeMinCarb);
			this.setQuantidadeMaxGord(QuantidadeMaxGord);
			this.setQuantidadeMinGord(QuantidadeMinGord);
			this.setQuantidadeMaxSodio(QuantidadeMaxSodio);
			this.setQuantidadeMinSodio(QuantidadeMinSodio);
			this.setCalorias(Calorias);
			}
		public String getPessoa() {
		    return pessoa.getNome();
		};
		
		public int getQuantidadeMaxProt() {
			return QuantidadeMaxProt;
		}

		public void setQuantidadeMaxProt(int quantidadeMaxProt) {
			QuantidadeMaxProt = quantidadeMaxProt;
		}

		public int getQuantidadeMinProt() {
			return QuantidadeMinProt;
		}

		public void setQuantidadeMinProt(int quantidadeMinProt) {
			QuantidadeMinProt = quantidadeMinProt;
		}

		public int getQuantidadeMaxCarb() {
			return QuantidadeMaxCarb;
		}

		public void setQuantidadeMaxCarb(int quantidadeMaxCarb) {
			QuantidadeMaxCarb = quantidadeMaxCarb;
		}

		public int getQuantidadeMinCarb() {
			return QuantidadeMinCarb;
		}

		public void setQuantidadeMinCarb(int quantidadeMinCarb) {
			QuantidadeMinCarb = quantidadeMinCarb;
		}

		public int getQuantidadeMaxGord() {
			return QuantidadeMaxGord;
		}

		public void setQuantidadeMaxGord(int quantidadeMaxGord) {
			QuantidadeMaxGord = quantidadeMaxGord;
		}

		public int getQuantidadeMinGord() {
			return QuantidadeMinGord;
		}

		public void setQuantidadeMinGord(int quantidadeMinGord) {
			QuantidadeMinGord = quantidadeMinGord;
		}

		public int getQuantidadeMaxSodio() {
			return QuantidadeMaxSodio;
		}

		public void setQuantidadeMaxSodio(int quantidadeMaxSodio) {
			QuantidadeMaxSodio = quantidadeMaxSodio;
		}

		public int getQuantidadeMinSodio() {
			return QuantidadeMinSodio;
		}

		public void setQuantidadeMinSodio(int quantidadeMinSodio) {
			QuantidadeMinSodio = quantidadeMinSodio;
		}

		public int getCalorias() {
			return Calorias;
		}

		public void setCalorias(int calorias) {
			Calorias = calorias;
		};

		
		
		
		
			

		
	
}
