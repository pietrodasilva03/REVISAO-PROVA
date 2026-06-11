package academia;

public class instrutor extends Pessoa {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade != null && !especialidade.trim().isEmpty()) {
            this.especialidade = especialidade;
        } else {
            System.out.println("Especialidade inválida.");
        }
    }

    public void exibirInstrutor() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Especialidade: " + getEspecialidade());
    }

    public void avaliarAluno(aluno aluno) {
        System.out.println(
            "Instrutor " + getNome() +
            " está avaliando o aluno " +
            aluno.getNome()
        );
    }
}