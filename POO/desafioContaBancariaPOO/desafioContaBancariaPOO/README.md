# Desafio Banco com POO

O projeto foi elaborado de forma a resolver o desafio de criação do projeto de um banco usando os conceitos aprendidos sobre POO no curso de Java da DIO.

## Estrutura

O projeto consta com os pacotes "br.com.filipeMesel.banco", "br.com.filipeMesel.cliente", "br.com.filipeMesel.conta", "br.com.filipeMesel.tests"

"br.com.filipeMesel.conta" apresenta as classes:
    - Conta: Classe abstrata que concentra os métodos "sacar", "depositar" e "transferir" além do método abstrato "addToHistorico"
    - ContaCorrente: Classe filha de Conta que apresenta sua implementação de "addToHistorico"
    - ContaPoupanca: Classe filha de Conta que apresenta sua implementação de "addToHistorico"

"br.com.filipeMesel.cliente" apresenta a classe "Cliente" que contem como atributo uma lista de contas. O cliente também pode sacar, depositar e transferir informações de uma conta a outra. Desde que a conta de origem pertença a ele.

"br.com.filipeMesel.banco" apresenta a classe Banco que apresenta as regras de negócio para tratar com uma lsita de clientes. 

"br.com.filipeMesel.tests" apresenta os testes de cada classe individualmente.