# Estrutura de dados Java

Aqui aprendemos sobre a estrutura de dados com Java

## No
No é uma lista de objetos de um tipo específico ou genérico que é linear e possui o ultimo Nó com valor Null.

Aqui também vimos o conceito generics (<T>) onde é possível criar classes com tipos não apenas dinâmicos mas também genéricos.

Arquivos utilizados para aprender:
    - atribuicaoReferencia
    - conceitoDeNo
    - refatorandoClasseNo

## Pilha

Estrutura de dados tipo LiFo (Last in First out).

Métodos:
    - Top: Permite visualizar quem está no topo da pilha
    - Pop: Permite visualizar retirando o objeto do topo da pilha
    - Push: Add um novo nó ao topo da pilha
    - isEmpty: Método para verificar se a pilha está vazia

## Fila

Estrutura de dados tipo FiFo (First in First out).

Métodos:
    - enqueue: Add um dado ao fim da fila
    - dequeue: Remove o dado da fila
    - isEmpty: Método para verificar se a pilha está vazia
    - first: Retorna o primeiro nó da fila. O primeiro nó que chegou na fila

## Lista Encadeada

Estrutura semelhante uma fila; porém com referências aos Nós.

Métodos
    - size: retorna o tamanho da lista
    - isEmpty: retorna o status da lista (vazia ou não)
    - add: Add um novo nó
    - getNo: Busca um nó específico sem retirar da lsita
    - get(): Busca o conteúdo de um nó específico
    - remove(): exclui um nó da lista

## Lista Duplamente Encadeada

Estrutura semelhante uma fila; porém com referências aos Nós tanto anteriores como posteriores. Além disso, há duas referências (uma no início e uma no final da lista)

Métodos
    - size: retorna o tamanho da lista
    - add: Add um novo nó
    - getNo: Busca um nó específico sem retirar da lsita
    - get(): Busca o conteúdo de um nó específico
    - remove(): exclui um nó da lista

## Listas Circulares

Estrutura que corresponde a uma fila onde o ultimo nó aponta para o primeiro. O primeiro nó é chamado de Cauda e o último nó é chamado de Cabeça.

Métodos
    - isEmpty: retorna o status da lista (vazia ou não)
    - add(nó): Add um novo nó
    - get(index): Busca o conteúdo de um nó específico
    - remove(): exclui um nó da lista