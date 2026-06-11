package academia;

public class Pessoa {
	
	private String nome;
	private int Idade;
	
	public  String getNome() {
		return nome;
		
	}
	public void setNome(String Nome) {
		if(Nome!=null && !Nome.trim().isEmpty()) {
			this.nome = Nome;
	}else{
		System.out.println("Nome  não pode ser Vazio.");	
	  }
	}
	
	public int getIdade(){
		  return Idade;
	}
	public void setIdade(int Idade) {
		if(Idade >= 0 ) {
	}else {
		System.out.println("Idade vazia.");
	 }
  }
}


