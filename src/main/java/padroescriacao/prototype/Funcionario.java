package padroescriacao.prototype;

public class Funcionario implements Cloneable {
    private int contrato;
    private String nome;
    private Endereco endereco;
    private String localNascimento;

    public Funcionario(int contrato, String nome, Endereco endereco, String localNascimento) {
        this.contrato = contrato;
        this.nome = nome;
        this.endereco = endereco;
        this.localNascimento = localNascimento;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.endereco = (Endereco) funcionarioClone.endereco.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "contrato=" + contrato +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}