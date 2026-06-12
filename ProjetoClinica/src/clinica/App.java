package clinica;

public class App {

	public static void main(String[] args) {
		 Paciente paciente = new Paciente();

	        paciente.setNome("João Silva");
	        paciente.setIdade(30);
	        paciente.setPeso(75.5);

	        System.out.println("=== DADOS DO PACIENTE ===");
	        System.out.println("Nome: " + paciente.getNome());
	        System.out.println("Idade: " + paciente.getIdade());
	        System.out.println("Peso: " + paciente.getPeso());

	        System.out.println("\nTestando valores inválidos:");
	        paciente.setIdade(-5);
	        paciente.setPeso(0);

	        Medico medico = new Medico();

	        medico.setNome("Dra. Ana Souza");
	        medico.setEspecialidade("Cardiologia");
	        medico.setValorConsulta(250.0);

	        System.out.println("\n=== DADOS DO MÉDICO ===");
	        System.out.println("Nome: " + medico.getNome());
	        System.out.println("Especialidade: " + medico.getEspecialidade());
	        System.out.println("Valor da Consulta: R$ " + medico.getValorConsulta());

	        System.out.println("\nTestando valores inválidos:");
	        medico.setEspecialidade("");
	        medico.setValorConsulta(-100);
	    }
	}