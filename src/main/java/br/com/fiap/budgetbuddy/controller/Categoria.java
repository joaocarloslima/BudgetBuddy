Logger log = LoggerFactory.getLogger(getClass());

@Autowired // CDI - Context Dependency Injection
CategoriaRepository repository;

@GetMapping
public List<Categoria> index() {
    return repository.findAll();
}

@PostMapping
@ResponseStatus(code = CREATED)
public Categoria create(@RequestBody Categoria categoria) { // binding
    log.info("cadastrando categoria " + categoria);
    repository.save(categoria);
    return categoria;
}

@GetMapping("{id}")
public ResponseEntity<Categoria> show(@PathVariable Long id) {
    log.info("buscar categoria por id {} ", id);

    return repository
            .findById(id)
            .map(ResponseEntity::ok) // converte para resposta http OK
            .orElse(ResponseEntity.notFound().build());

    // var categoriaEncontrada = repository.findById(id);

    // if (categoriaEncontrada.isEmpty())
    // return ResponseEntity.notFound().build();

    // return ResponseEntity.ok(categoriaEncontrada.get());
}

@DeleteMapping("{id}")
public ResponseEntity<Object> destroy(@PathVariable Long id) {
    log.info("Apagando categoria com id {} ", id);

    verifyIfExists(id);

    repository.deleteById(id);
    return ResponseEntity.noContent().build();
}

@PutMapping("{id}")
public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
    log.info("atualizando categoria com id {} para {}", id, categoria);

    verifyIfExists(id);

    categoria.setId(id);

    repository.save(categoria);
    return ResponseEntity.ok(categoria);

}

private void verifyIfExists(Long id) {
    repository
            .findById(id)
            .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Não existe categoria com o id informado"));
}