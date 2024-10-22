package br.com.meteora.api.model.usuario;

import br.com.meteora.api.model.endereco.EnderecoModel;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private char genero;

    private String dataDeNascimento;

    private String email;

    @Embedded
    private EnderecoModel endereco;

    private String senha;

    public void atualizarInformacoes(DadosAtualizarUsuario dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.dataDeNascimento() != null) {
            this.dataDeNascimento = dados.dataDeNascimento();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarEndereco = dados.endereco();
        }
    }

    public UsuarioModel(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.genero = dados.genero();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.email = dados.email();
        this.endereco = new EnderecoModel(dados.endereco());
        this.senha = dados.senha();
    }
}
