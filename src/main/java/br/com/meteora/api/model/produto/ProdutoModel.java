package br.com.meteora.api.model.produto;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produtos")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tamanho;
    private String modelo;
    private String descricao;
    private double preco;
    private String cor;

    @Enumerated(EnumType.STRING)
    private Fabricante fabricante;

    public ProdutoModel(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.tamanho = dados.tamanho();
        this.modelo = dados.modelo();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.cor = dados.cor();
        this.fabricante = dados.fabricante();
    }

}
