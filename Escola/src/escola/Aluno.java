package escola;

public class Aluno {

	   private String nome;
	    private double nota1;
	    private double nota2;

	    // Getter e Setter para nome
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (!nome.isEmpty()) {
	            this.nome = nome;
	        } else {
	            System.out.println("Nome não pode ser vazio!");
	        }
	    }

	    // Getter e Setter para nota1
	    public double getNota1() {
	        return nota1;
	    }

	    public void setNota1(double nota1) {
	        if (nota1 >= 0 && nota1 <= 10) {
	            this.nota1 = nota1;
	        } else {
	            System.out.println("Nota 1 inválida! Digite um valor entre 0 e 10.");
	        }
	    }

	    // Getter e Setter para nota2
	    public double getNota2() {
	        return nota2;
	    }

	    public void setNota2(double nota2) {
	        if (nota2 >= 0 && nota2 <= 10) {
	            this.nota2 = nota2;
	        } else {
	            System.out.println("Nota 2 inválida! Digite um valor entre 0 e 10.");
	        }
	    }

	    // Método para calcular média
	    public double calcularMedia() {
	        return (nota1 + nota2) / 2;
	    }

	    // Método para verificar situação
	    public String verificarSituacao() {
	        if (calcularMedia() >= 7) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }
	}