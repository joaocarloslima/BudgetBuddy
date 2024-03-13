# Locação

API Rest do projeto Locação - Controle de locação de carros

## Requisitos

- [x] CRUD de Locações
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

## Documentação

### Endpoints

- Listar Carros
- Cadastrar Carro
- Apagar Carro
- Detalhar Carro
- Atualizar Carro

### Listar Carros

`GET` /carro

Retorna um array com todos os carros cadastrados pelo usuário atual.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Fusca",
        "modelo": "1968",
        "placa": "ABC-1234",
        "preco": 50.00,
        "disponivel": true
    }
]
```

#### Códigos de Resposta

código | descrição
200 - Carros retornados com sucesso
401	- Não autorizado. Realize a autenticação em /login
---

### Cadastrar Carro

`POST` /carro

Cadastra um carro com os dados enviados no corpo da requisição.
#### Corpo da Requisição

campo |	tipo | obrigatório	| descrição
nome	string	✅	Nome do carro
modelo	string	✅	Modelo do carro
placa	string	✅	Placa do carro
preco	number	✅	Preço por dia de locação
disponivel	boolean	✅	Indica se o carro está disponível para locação


```js
{
    "nome": "Fusca",
    "modelo": "1968",
    "placa": "ABC-1234",
    "preco": 50.00,
    "disponivel": true
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Fusca",
    "modelo": "1968",
    "placa": "ABC-1234",
    "preco": 50.00,
    "disponivel": true
}
```


#### Código de Resposta

código | descrição
201	Carro cadastrado com sucesso
400	Validação falhou. Verifique os dados enviados no corpo da requisição
401	Não autorizado. Realize a autenticação em /login

---

### Apagar Carro

`DELETE` /carro/`{id}`

Apaga o carro com o `id` informado no parâmetro de path.

#### Código de Resposta


código | descrição
204 - Carro apagado com sucesso
401 - Não autorizado. Realize a autenticação em /login
404 - Não existe carro com o id informado

---

### Detalhar Carro

`GET` /carro/{id}

Retorna os dados do carro com o `id` informado no parâmetro de path.

#### Exemplo de Resposta

```js
// requisição /carro/1
// requisição /carro/1
{
    "id": 1,
    "nome": "Fusca",
    "modelo": "1968",
    "placa": "ABC-1234",
    "preco": 50.00,
    "disponivel": true
}
```

#### Código de Resposta

código | descrição
200	- Carro retornado com sucesso
401	- Não autorizado. Realize a autenticação em /login
404	- Não existe carro com o id informado

---

### Atualizar Carro

`PUT` /carro/{id}

Atualiza os dados do carro com o `id` informado no path


#### Corpo da Requisição

campo | tipo | obrigatório	descrição
nome	string	✅	Nome do carro
modelo	string	✅	Modelo do carro
placa	string	✅	Placa do carro
preco	number	✅	Preço por dia de locação
disponivel	boolean	✅	Indica se o carro está disponível para locação


```js
{
    "nome": "Fusca",
    "modelo": "1968",
    "placa": "ABC-1234",
    "preco": 50.00,
    "disponivel": true
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Fusca",
    "modelo": "1968",
    "placa": "ABC-1234",
    "preco": 50.00,
    "disponivel": true
}
```


#### Código de Resposta

código | descrição
200	- Carro atualizado com sucesso
400	- Validação falhou. Verifique os dados enviados no corpo da requisição
401	- Não autorizado. Realize a autenticação em /login
404	- Não existe carro com o id informado

---



