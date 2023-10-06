package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(123, "Funcionario Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setContrato(456);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getEndereco().setNumero(2);

        assertEquals("Funcionario{contrato=123, nome='Funcionario Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", funcionario.toString());
        assertEquals("Funcionario{contrato=456, nome='Funcionario Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", funcionarioClone.toString());
    }
}