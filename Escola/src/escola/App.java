package escola;

public class App {

	public static void main(String[] args) {
	
	  

	        Aluno aluno = new Aluno();

	        aluno.setNome("João");
	        aluno.setNota1(8.5);
	        aluno.setNota2(7.0);

	        System.out.println("Nome: " + aluno.getNome());
	        System.out.println("Nota 1: " + aluno.getNota1());
	        System.out.println("Nota 2: " + aluno.getNota2());
	        System.out.println("Média: " + aluno.calcularMedia());
	        System.out.println("Situação: " + aluno.verificarSituacao());

	        System.out.println("\nTestando valores inválidos:");

	        aluno.setNota1(-3);
	        aluno.setNota2(15);
	        aluno.setNome("");
	    }
	}