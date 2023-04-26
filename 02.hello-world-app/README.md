# Hello, World!

Este é o _Hello, World!_ de um app Clojure. É o exemplo achado
na página do [CLI
Tools](https://clojure.org/guides/deps_and_cli).

A estrutura de diretórios é simples e é a tipicamente usada pela
maior parte das ferramentasde usadas com Clojure. O diretório
base contém, tipicamente, meta-dados sobre o projeto ou
que sejam necessários para o processo de _build_ (ou outros
processos que manipulem o código) e o diretório `src` que contém
os arquivos de código fonte propriamente ditos da aplicação.

```
.
├── deps.edn
└── src
    └── hello.clj

2 directories, 2 files
```

Como estamos usando as ferramentas do [_Clojure
CLI_](https://clojure.org/guides/deps_and_cli), temos o arquivo
`deps.edn` para os meta-dados que, neste caso é apenas a
dependência no _namespace_ `time-lib` que está hospedado no GitHub.

No diretório `src` temos o arquivo `hello.clj` que contém o
código fonte do app. Observe que o código fonte apenas define o
_namespace_ `hello` e a função `run` através da qual
executaremos o app.

## Como executar

Para executar o app, você precisa ter, naturalmente, Clojure
instalado em sua máquina. Em seguida, faça um clone do
repositório e, no terminal, entre no diretório base do app (o
mesmo que contém o arquivo `deps.edn` e o diretório `src`. Nesse
diretório rode o comando abaixo no shell do SO.

```
clj -X hello/run
```

Relembre que o comando acima usa o argumento `-X` para pedir a
execução de uma função específica. O segundo argumento indica o
_namespace_ e a função a ser executada. Se tudo der certo, você
deve ver algo como a saída abaixo no seu terminal.

```
Oi! A hora é: 08:16 AM
```
