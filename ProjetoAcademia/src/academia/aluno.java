
package academia;


public class aluno extends Pessoa {

    private String plano;

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        if (plano != null && !plano.trim().isEmpty()) {
            this.plano = plano;
        } else {
            System.out.println("Plano inválido.");
        }
    }

    public void exibirAluno() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Plano: " + getPlano());
    }
}
 
	

