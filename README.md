# BudgetBuddy

API Rest do projeto Budget Buddy - Controle de gastos pessoais

## Requisitos

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

## Documentação

### Endpoints

- [Listar Categorias](#listar-categorias)
- [Cadastrar Categoria](#cadastra-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Detalhar Categoria](#detalhar-categoria)
- [Atualizar Categoria](#atualizar-categoria)


### Listar Categorias

`GET` /categoria

Retorna um array com todas as categorias cadastradas pelo usuário atual.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Alimentação",
        "icone": "fast-food"
    }
]
```

#### Códigos de Resposta

| código | descrição |
|--------|-----------|
|200| Categorias retornadas com sucesso
|401| Não autorizado. Realize a autenticação em /login

---

### Cadastrar Categoria

`POST` /categoria

Cadastra uma categoria com os dados enviados no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|--------
|nome|string|✅| Um nome curto para identificar a categoria
|icone|string|❌| O nome do ícone conforme biblioteca Material Icons

```js
{
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```


#### Código de Resposta

| código | descrição |
|--------|-----------|
|201| Categoria cadastrada com sucesso
|400| Validação falhou. Verifique os dados enviados no corpo da requisição
|401| Não autorizado. Realize a autenticação em /login

---

### Apagar Categoria

`DELETE` /categoria/`{id}`

Apaga a categoria com o `id` informado no parâmetro de path.

#### Código de Resposta

| código | descrição |
|--------|-----------|
|204| Categoria apagada com sucesso
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe categoria com o `id` informado


---

### Detalhar Categoria

`GET` /categoria/`{id}`

Retorna os dados da categoria com o `id` informado no parâmetro de path.


#### Exemplo de Resposta

```js
// requisição /categoria/1
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

#### Código de Resposta

| código | descrição |
|--------|-----------|
|200| Categoria retornada com sucesso
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe categoria com o `id` informado

---

### Atualizar Categoria

`PUT` /categoria/`{id}`

Atualiza os dados da categoria com o `id` informado no path


#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|--------
|nome|string|✅| Um nome curto para identificar a categoria
|icone|string|✅| O nome do ícone conforme biblioteca Material Icons

```js
{
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```


#### Código de Resposta

| código | descrição |
|--------|-----------|
|200| Categoria cadastrada com sucesso
|400| Validação falhou. Verifique os dados enviados no corpo da requisição
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe categoria com o `id` informado

---



