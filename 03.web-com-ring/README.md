# Web com Ring

Este é um exemplo de um app que é um pequeno servidor web
implementado em Clojure, usando a biblioteca
[Ring](https://github.com/ring-clojure/ring).

A organização de diretórios e arquivos segue o mesmo estilo dos
exemplos anteriores. O arquivo `deps.edn` contém as dependências
do código que, neste caso, é a biblioteca Ring (olhe o arquivo).
E o diretório `src` contém os fontes do app. Observe que há dois
arquivos que definem dois namespaces: `backend` e `rotas`.

```
.
├── deps.edn
└── src
    ├── backend.clj
    └── rotas.clj

3 directories, 4 files
```

## backend

Para executar o servidor, parta do diretório base do aplicativo
e use o comando abaixo. Observe que pedimos a execução da função
`run` no namespace `backend`.

```
clj -X backend/run
```

Se tudo der certo, você deve ver uma saída semelhante a esta
abaixo. Observe que as 4 primeiras linhas da saída são linhas de
[log](https://en.wikipedia.org/wiki/Logging_(computing),
produzidas pelo servidor (são Ring e Jetty que produzem essas
linhas, não nosso código). A última linha deve ser a mensagem
`servidor iniciado` que nosso código produz ao concluir a
execução de `run` que inicia o servidor.

```
2023-04-26 09:02:52.651:INFO::main: Logging initialized @1209ms to org.eclipse.jetty.util.log.StdErrLog
2023-04-26 09:02:52.725:INFO:oejs.Server:main: jetty-9.4.51.v20230217; built: 2023-02-17T08:19:37.309Z; git: b45c405e4544384de066f814ed42ae3dceacdd49; jvm 19.0.2+7
2023-04-26 09:02:52.749:INFO:oejs.AbstractConnector:main: Started ServerConnector@38b8b6c0{HTTP/1.1, (http/1.1)}{0.0.0.0:5000}
2023-04-26 09:02:52.749:INFO:oejs.Server:main: Started @1308ms
servidor iniciado
```

A partir desse ponto, o servidor estará no ar, pronto para
atender requisições de clientes web (do browser ou do `curl`, por
exemplo). Para testar, use o seu browser no endereço
`http://localhost:5000` (esse 5000 é o número de porta em que
nosso servidor estará _escutando_ e esperando conexões).

Uma alternativa é testar por linha de comando com o comando
`curl`, como mostrado abaixo.

```
curl localhost:5000
```

## rotas

O segundo script neste exemplo é o `src/rotas.clj`. Execute-o da
mesma forma que fizemos com o `backend` acima. A diferença para
este exemplo é que neste implementamos uma versão absolutamente
minimalista de um _roteador_, que é o nome que usamos para a parte do
código que _roteia_ requisições feitas para diferentes URLs, para
as funções _handler_ apropriadas.

Para testar, inicie o servidor e conecte-se a ele pelo browser ou
pelo `curl`, usando as rotas `/a` e `/b`, como mostrado nos
comandos abaixo.

```
curl localhost:5000/a
curl localhost:5000/b
```

Tente também usar outra rota diferente dessas duas. Você verá que
o servidor (neste caso, o Ring e o Jetty) respondem mesmo que
nosso código não tenha previsão para essas rotas. Contudo, a
resposta será um `500` (código de status de erro do servidor),
com um conteúdo em HTML, indicando que ocorreu um erro no
servidor (o melhor é ver esse caso no browser, para ver o HTML
renderizado).
