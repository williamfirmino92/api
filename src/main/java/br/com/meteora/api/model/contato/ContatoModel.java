package br.com.meteora.api.model.contato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "contatos")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContatoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    private String email;
    private String nome;
    private String cidade;
    // private String estado;
    private String comentario;
    private Boolean concorda;
    
    public ContatoModel(String email, String nome, String cidade, String comentario, Boolean concorda) {
        this.email = email;
        this.nome = nome;
        this.cidade = cidade;
        this.comentario = comentario;
        this.concorda = concorda;
    }


    

}
