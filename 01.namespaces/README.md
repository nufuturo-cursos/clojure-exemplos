# Namespaces

Este exemplo demonstra como funcionam o básico de _namespaces_
em Clojure.

```
.
├── ex1.clj
├── ex2.clj
├── ex3.clj
├── README.md
└── src
    └── meu_namespace.clj

2 directories, 5 files
```

Comece lendo o arquivo `src/meu_namespace.clj` que contém a
definição de um _namespace_ chamado `meu-namespace`, contendo
duas funções: `soma` e `dobro`.  Observe que o script está no
subdiretório `src` para garantir que Clojure possa localizar o
código fonte.

O segundo arquivo a ler é `ex1.clj` que está no diretório base
do exemplo. Ele contém o código _cliente_ mínimo para usar o
namespace que definimos. Para isso, usamos `require` para
indicar a Clojure que usaremos o namespace `meu-namespace`. Na
tereira linha, você vê como se pode usar as funções do
namespace. Atente para o uso do _quote_ (`'`)! Para executar
esse script, use o comando abaixo.

```
clj -M ex1.clj
```

O terceiro arquivo é `ex2.clj`. Nele usamos o `require` para
_importar_ o namespace e ao mesmo tempo renomeá-lo localmente
para algo mais apropriado (`meu` neste exemplo).

Por fim, no quarto arquivo, você vê o uso de `ns` com a keyword
`:require` para combinar a definição de um namespace próprio
para o script cliente e a importação do namespace
`meu-namespace`. Atente para o fato de que aqui não precisamos
usar o _quote_ `'`.
