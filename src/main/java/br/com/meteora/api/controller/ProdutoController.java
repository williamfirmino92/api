package br.com.meteora.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.meteora.api.model.produto.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listar")
    public List<ProdutoModel> listar() {
        return repository.findAll();
    }

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto dados) {
        repository.save(new ProdutoModel(dados));
    }

}
