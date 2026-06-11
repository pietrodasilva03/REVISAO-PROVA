package Empresa;

public class App {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Paulo");
		gerente.setBonus(500);
		gerente.setSalario(5963);
		
		gerente.exibirDados();
		

	}

}
