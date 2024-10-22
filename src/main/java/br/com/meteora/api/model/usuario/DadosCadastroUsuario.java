package br.com.meteora.api.model.usuario;

import br.com.meteora.api.model.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record DadosCadastroUsuario(

                @NotBlank String nome,
                @NotBlank String cpf,
                @NotNull char genero,
                @NotBlank String dataDeNascimento,
                @NotBlank @Email String email,
                @NotNull @Valid DadosEndereco endereco,
                @NotBlank String senha) {

}
