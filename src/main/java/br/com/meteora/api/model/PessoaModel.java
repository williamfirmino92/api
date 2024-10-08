package br.com.meteora.api.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaModel {

    private int id;
    private String nome;
    private String cpf;
    private char genero;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String senha;

}
