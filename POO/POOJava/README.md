# Pacotes e Classes Java

Esse projeto serve unicamente para entendermos o funcionamento de pacotes e classes java

## Pacotes

Em Java, é comum usarmos a convenção:

    1. com.nome: Projetos comerciais
    2. gov.nome: Projetos governamentais
    3. org.nome: Projetos de organizações não comerciais nem governamentais


## Classes

As classes são iniciadas com letras maiúsculas

## Estruturas dos métodos de uma classe

 1. Public -> Todos podem visualizar e usar
 2. Default (não preenche na assinatura do método) -> Só as classes do mesmo pacote podem visualizar e usar
 3. Private -> Só a classe pode visualizar e usar

## Getters e Setters

Métodos usados para ter acesso a atributos de uma classe

```bash
public class Cliente {
    private String nome;
    private int idade;

    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void setIdade(int novaIdade)
    {
        this.idade = novaIdade;
    }
    public int getIdade()
    {
        return this.idade;
    }
}
```

## Construtores

É um método tipo "public NomeDaClasse" que costuma ser usado para iniciar um objeto da classe, estanciando seus atributos. Veja abaixo a classe "Cliente" e a classe CadastroCliente. Uma classe pode ter mais de um construtor

```bash

package com.mastersoft.clinical.model;

public class Cliente {
    String nome;
    int idade;
    private String endereco;

    public void setEndereco(String novoEndereco)
    {
        this.endereco = novoEndereco;
    }
    public String getEndereco()
    {
        return this.endereco;
    }

    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }

    //Construtor 1
    public Cliente(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    //Construtor 2
    public Cliente()
    {
        super();
    }

}

package com.mastersoft.clinical.model;

public class CadastroCliente {
    public void cadastrarCliente(String nome, int idade, String endereco)
    {
        Cliente cliente = new Cliente(nome, idade);
        cliente.setEndereco(endereco);
    }
}

```

# Enum

Enum é uma lista de OBJETOS imutáveis

```bash
public enum EstadoBrasileiro {
    /**
     *
     */
    SAO_PAULO("SP", "SÃO PAULO"),
    MARANHAO("MA", "Maranhão");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla)
    {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla()
    {
        return this.sigla;
    }

    public String getNome()
    {
        return this.nome;
    }


}
```

# Encapsulamento

Ato de esconder o que não deve ser visível aos demais elementos.
Exemplo: Ao ligar o carro, este verifica o câmbio, combustível e bateria. Mas eu não preciso saber disso.

# Herança
Quando uma classe herda informações de outra. Exemplo das classes Moto e Carro que herdam informações da classe Veiculo

Se uma clase for abstrata e possuir um método abstrato...todas as classes filhas devem ter esse método implementdado; sendo iguais ou não

obs: Classes pai não precisam ser abstratas

# Polimorfismo

Quando há métodos, nomes iguais mas com implementações diferentes. Exemplo das classes abstratas

# Interface

Permite um mesmo objeto ter papeis diferentes na aplicação. Diferenemente das classes abstratas que tem o contrato definido, as interfaces também tem um contrato mas ele é indefinido.