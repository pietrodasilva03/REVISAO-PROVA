package Empresa;

public class Funcionario {
	private String nome;
	private  double Salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String Nome) {
		if(Nome !=null && !Nome.trim().isEmpty()) {
			this.nome = Nome;
		}else {
			System.out.println("Nome inválido.");
		}
    }

	public double getSalario() {
		return Salario;
		}
	public void setSalario(double Salario) {
			if(Salario >= 0) {
				this.Salario = Salario;	
		}else {
				System.out.println("Salario invalido.");
	 }
		
	

		
	  }
	
	}


