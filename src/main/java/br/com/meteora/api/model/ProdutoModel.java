package br.com.meteora.api.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoModel {
    
    private int id;
    private String nome;
    private String tamanho;
    private String modelo;
    private String descricao;
    private double preco;
    private String cor;
    private String fabricante;

}
