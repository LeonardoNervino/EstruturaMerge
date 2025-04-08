APS 1 - Estruturas Dinâmicas com Lista Encadeada em Java
Este projeto apresenta soluções para os exercícios da APS 1, utilizando exclusivamente listas encadeadas e respeitando as restrições da disciplina

Questão 1: Estrutura de Pilha com Lista Encadeada
  Foi criada a classe MinhaPilhaEncadeada, que representa uma pilha dinâmica. Os elementos são armazenados em nós ligados entre si, permitindo inserção e remoção pelo topo.
Métodos principais:
  push(int valor): insere um novo valor no topo da pilha.
  pop(): remove e retorna o elemento do topo.
  printStack(): imprime todos os elementos da pilha.
Cada operação informa ao usuário o valor inserido ou removido, conforme solicitado.

Questão 2: Estrutura de Fila com Lista Encadeada
  A classe MinhaFilaEncadeada representa uma fila dinâmica, onde os elementos são inseridos no final e removidos do início. A estrutura é totalmente baseada em ponteiros.
Métodos disponíveis:
  enqueue(int valor): insere um novo elemento no final da fila.
  dequeue(): remove e retorna o primeiro elemento.
  first(): retorna o valor do início sem remover.
  isEmpty(): verifica se a fila está vazia.
  printQueue(): imprime todos os valores da fila.
Cada inserção e remoção é informada ao usuário. Os métodos foram desenvolvidos de forma limpa e didática.

Questão 3: Operação de Merge com Filas Encadeadas
  Para esta questão, foi criada a classe MinhaMergeFilasEncadeadas. A proposta é combinar duas filas ordenadas (Fila A e Fila B) em uma terceira (Fila C), também ordenada. O procedimento respeita as operações básicas de fila, utilizando apenas enqueue() e dequeue().
Lógica aplicada:
  Compara os elementos no início de cada fila.
  Insere na fila C o menor elemento, mantendo a ordenação.
  Repete até que ambas as filas estejam vazias.
Foi considerado que as filas A e B estão sempre em ordem crescente. O usuário tem liberdade para adicionar novos valores manualmente no método main().

Observações Finais
  As estruturas foram separadas em arquivos distintos para melhor organização.
  O código está comentado e estruturado para facilitar a leitura e manutenção.
  As regras da disciplina foram rigorosamente seguidas, evitando recursos não permitidos.
  O arquivo CustomMain.java serve como ponto de execução e testes.

