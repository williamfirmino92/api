package br.com.meteora.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.meteora.api.model.contato.ContatoModel;
import br.com.meteora.api.model.contato.ContatoRepository;

@Controller
@RequestMapping("/contato")
public class ContatoController {
    
    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public String exibirFormulario(Model model) {
        model.addAttribute("contato", new ContatoModel());
        return "contato";
    }

    @PostMapping
    public String cadastrarContato(ContatoModel contato) {
        repository.save(contato);
        return "redirect:/";
    }

}
