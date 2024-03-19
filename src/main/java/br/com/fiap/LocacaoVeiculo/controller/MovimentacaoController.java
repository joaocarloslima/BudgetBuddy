package br.com.fiap.budgetbuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.budgetbuddy.model.Movimentacao;
import br.com.fiap.budgetbuddy.repository.MovimentacaoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("movimentacao")
public class MovimentacaoController {

    @Autowiredpackage br.com.fiap.budgetbuddy.controller;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    
    import br.com.fiap.budgetbuddy.model.Movimentacao;
    import br.com.fiap.budgetbuddy.repository.MovimentacaoRepository;
    import jakarta.validation.Valid;
    
    @RestController
    @RequestMapping("movimentacao")
    public class MovimentacaoController {
    
        @Autowired
        MovimentacaoRepository repository;
    
        @PostMapping
        public ResponseEntity<Movimentacao> create(@RequestBody @Valid Movimentacao movimentacao){
            movimentacao = repository.save(movimentacao);
            return ResponseEntity.status(201).body(movimentacao);
        }
        
        @GetMapping("{id}")
        public ResponseEntity<Movimentacao> getById(@PathVariable Long id){
            Movimentacao movimentacao = repository.findById(id).orElse(null);
            if(movimentacao == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(movimentacao);
        }
        
        @PutMapping("{id}")
        public ResponseEntity<Movimentacao> update(@PathVariable Long id, @RequestBody @Valid Movimentacao movimentacao){
            if(!repository.existsById(id)){
                return ResponseEntity.notFound().build();
            }
            movimentacao.setId(id);
            repository.save(movimentacao);
            return ResponseEntity.ok(movimentacao);
        }
        
        @DeleteMapping("{id}")
        public ResponseEntity<Object> delete(@PathVariable Long id){
            if(!repository.existsById(id)){
                return ResponseEntity.notFound().build();
            }
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }
    MovimentacaoRepository repository;

    @PostMapping
    public ResponseEntity<Movimentacao> create(@RequestBody @Valid Movimentacao movimentacao){
        repository.save(movimentacao);
        return ResponseEntity.status(201).body(movimentacao);
    }
    
}
