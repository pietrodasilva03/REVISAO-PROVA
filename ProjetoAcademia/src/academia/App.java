package academia;

public class App {
	public static void main(String[] args) {

	       aluno aluno1 = new aluno();

	        aluno1.setNome("Pedro");
	        aluno1.setIdade(18);
	        aluno1.setPlano("Mensal");

	        instrutor instrutor1 = new instrutor();

	        instrutor1.setNome("Vitor");
	        instrutor1.setIdade(35);
	        instrutor1.setEspecialidade("Musculação");

	        System.out.println("=== DADOS DO ALUNO ===");
	        aluno1.exibirAluno();

	        System.out.println();

	        System.out.println("=== DADOS DO INSTRUTOR ===");
	        instrutor1.exibirInstrutor();

	        System.out.println();

	        instrutor1.avaliarAluno(aluno1);
	    }
	}
