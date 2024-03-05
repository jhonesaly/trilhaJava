# Trilha Java

## Manipulações

Atribuições:

- "=" (recebe valor)
- "+=" (aumenta valor)
- "-=" (diminui valor)

Operações:

- "+" (adição)
- "-" (subtração)
- "*" (multiplicação)
- "/" (divisão)
- "%" (resto da divisão)

Comparações:

- "==" (igual a)
- "!=" (diferente de)
- ">" (maior que)
- ">=" (maior ou igual a)
- "<" (menor que)
- "<=" (menor ou igual a)

Operadores:

- "&&" (AND)
- "||" (OR)
- "!" (NOT)
- 
Incremento: "++" | ex: int num = 1; int resultado = ++num

## Convenções

- Nome de classe: MinhaClasse
- Nome de método: meuMetodo()
- Nome de constante: MINHA_CONSTANTE
- Nome de variável: minhaVariavel
- Linhas de código devem ter menos de 80 char
- Espaços para separar operadores, palavras-chave e elementos de controle de fluxo | ex: if (condição)
- Use comentários para documentar seu código (//linha)

## Tipos primitivos

- boolean (true ou false)
- char (caracteres unicode individuais ex:'a')
- byte (inteiros de 8 bits [-128 a 127])
- short (inteiros de 16 bits [-32.768 a 32.767])
- int (inteiros de 32 bits [-2.147.483.648 a 2.147.483.647])
- long (inteiros de 64 bits [-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 {+-9.2*10^18}])
- float (reais de 32 bits)
- double (reais de 64 bits)

**Casting**: mudar tipo de uma variável especificando o tipo desejado na frente da mesma (ex: int varInt = (int) varFloat;)

## Strings

Em Java, String são classes

- String nome = "Alyson";
- String message= """
                  Text Block
                  """;
métodos:
- .equals(): compara conteúdo de strings (ex: senha.equals("12345"))
- .equalsIgnoreCase(): compara conteúdo de strings desconsiderando case (ex: senha.equalsIgnoreCase("AjSa"))
- .format(%s, %d, %.xf): insere dentro da string variáveis do tipo string (%s), inteiro (%d) e real com x casas decimais (%.xf)
    (ex: String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor))

## Decisão

Em Java, as principais estruturas de decisão são `if`, `else if` e `else`.

1. **if:** Utilizado para executar um bloco de código se uma condição for verdadeira.

   ```java
   int idade = 18;
   if (idade >= 18) {
       System.out.println("Maior de idade");
   }
   ```

2. **else if:** Permite verificar condições adicionais se a condição do `if` não for atendida.

   ```java
   int nota = 75;
   if (nota >= 90) {
       System.out.println("A");
   } else if (nota >= 80) {
       System.out.println("B");
   } else {
       System.out.println("C");
   }
   ```

3. **switch:** Útil para avaliar várias condições sobre uma variável.

   ```java
   int diaDaSemana = 3;
   switch (diaDaSemana) {
       case 1:
           System.out.println("Domingo");
           break;
       case 2:
           System.out.println("Segunda-feira");
           break;
       // ... outros casos
       default:
           System.out.println("Dia inválido");
   }
   ```

Estas estruturas fornecem flexibilidade para tomar decisões com base em diferentes condições em seus programas Java.

## Entrada de dados

Certamente! Em Java, a leitura de dados pode ser realizada de várias maneiras.

### Scanner

Em Java, a classe `Scanner` é muito útil para ler dados do usuário a partir do teclado. Vamos abordar alguns pontos-chave:

1. **Importação da classe Scanner:**
   No início do seu programa Java, você precisa importar a classe `Scanner`. Isso é feito com a seguinte linha de código:

   ```java
   import java.util.Scanner;
   ```

   Essa instrução diz ao Java para usar a classe `Scanner` do pacote `java.util`.

2. **Criação de uma instância de Scanner:**
   Antes de usar o `Scanner`, você precisa criar uma instância dele. Isso é feito da seguinte maneira:

   ```java
   Scanner scanner = new Scanner(System.in);
   ```

   Aqui, `System.in` representa a entrada padrão, que é o teclado.

3. **Leitura de diferentes tipos de dados:**
   O `Scanner` oferece métodos para ler diferentes tipos de dados. Alguns dos mais comuns incluem:

   - `nextInt()`: Lê um número inteiro.
   - `nextDouble()`: Lê um número decimal.
   - `next()` ou `nextLine()`: Lê uma string.
   - a classe Scanner em Java não possui um método específico como 'nextBoolean()' para ler valores booleanos diretamente. No entanto, você pode ler uma string e, em seguida, converter para booleano.

   Exemplo de leitura de um número inteiro:

   ```java
   int numero = scanner.nextInt();
   ```

4. **Exibição de mensagens ao usuário:**
   Você pode usar `System.out.print` ou `System.out.println` para exibir mensagens indicando ao usuário o que deve ser inserido. Por exemplo:

   ```java
   System.out.print("Digite sua idade: ");
   ```

5. **Fechamento do Scanner:**
   Quando você terminar de usar o `Scanner`, é uma boa prática fechá-lo para liberar recursos. Isso é feito assim:

   ```java
   scanner.close();
   ```

   Fechar o `Scanner` é importante para evitar vazamento de recursos e possíveis problemas no programa.

Juntando tudo, aqui está um exemplo completo de como usar o `Scanner` para ler a idade do usuário:

```java
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        // Criação de uma instância de Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibição da mensagem
        System.out.print("Digite sua idade: ");

        // Leitura de um número inteiro
        int idade = scanner.nextInt();

        // Exibição do resultado
        System.out.println("Sua idade é: " + idade);

        // Fechamento do Scanner
        scanner.close();
    }
}
```

### BufferedReader e Linha de comando

1. **BufferedReader para entrada do teclado:**
   Utilizando a classe `BufferedReader` para ler dados do teclado.

   ```java
   import java.io.BufferedReader;
   import java.io.IOException;
   import java.io.InputStreamReader;

   public class LeituraDados {
       public static void main(String[] args) throws IOException {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           System.out.print("Digite uma frase: ");
           String frase = reader.readLine();

           System.out.println("Você digitou: " + frase);

           reader.close();
       }
   }
   ```

2. **Ler argumentos da linha de comando:**
   Para ler argumentos passados na linha de comando ao executar o programa.

   ```java
   public class LeituraDados {
       public static void main(String[] args) {
           if (args.length > 0) {
               System.out.println("Argumento passado: " + args[0]);
           } else {
               System.out.println("Nenhum argumento passado.");
           }
       }
   }
   ```

## Loops

Vamos abordar os loops mais comuns em Java, como `while` e `for`. Essas estruturas são utilizadas para repetir a execução de um bloco de código enquanto uma condição específica for atendida.

1. **Loop `while`:**
   O loop `while` executa um bloco de código enquanto uma condição for verdadeira. O seja, o que estiver dentro do parênteses, deve ser uma expressão booleana verdadeira. Aqui está um exemplo simples:

   ```java
   int contador = 0;
   while (contador < 5) {
       System.out.println("Contagem: " + contador);
       contador++;
   }
   ```

   Neste exemplo, o bloco de código dentro do `while` é repetido enquanto a variável `contador` for menor que 5.

2. **Loop `do-while`:**
   Similar ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa inicialmente.

   ```java
   int contador = 0;
   do {
       System.out.println("Contagem: " + contador);
       contador++;
   } while (contador < 5);
   ```

3. **Loop `for`:**
   O loop `for` é frequentemente usado quando você sabe exatamente quantas vezes deseja repetir o código. Possui uma inicialização, uma condição e uma expressão de atualização, todos no cabeçalho do loop.

   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println("Iteração: " + i);
   }
   ```

   Neste exemplo, o loop `for` é usado para iterar 5 vezes, de 0 a 4, de 1 em 1 (i++).

4. **Loop `for-each`:**
   Esse tipo de loop é específico para iterar sobre elementos de uma coleção, como arrays ou listas.

   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   for (int numero : numeros) {
       System.out.println("Número: " + numero);
   }
   ```

   Aqui, o loop `for-each` percorre cada elemento do array `numeros`.

5. **Break e Continue:**
   - A palavra-chave `break` é usada para sair imediatamente de um loop.
   - A palavra-chave `continue` é usada para pular a iteração atual e continuar com a próxima.

   ```java
   for (int i = 0; i < 10; i++) {
       if (i == 5) {
           break; // Sai do loop quando i é igual a 5
       }
       if (i % 2 == 0) {
           continue; // Pula a iteração se i for par
       }
       System.out.println("Número ímpar: " + i);
   }
   ```

## Criação de Classes e Objetos em Java

### Public e Private

Em Java, as palavras-chave `public` e `private` são utilizadas para controlar o acesso aos membros de uma classe. Quando um atributo ou método é declarado como `public`, ele pode ser acessado por qualquer classe. Por outro lado, ao declarar como `private`, restringimos o acesso apenas à própria classe.

Exemplo:

```java
public class ExemploClasse {
    public int atributoPublico;
    private String atributoPrivado;

    // Métodos e construtores aqui...
}
```

### Getters e Setters

Para garantir um encapsulamento adequado, é comum utilizar métodos conhecidos como "getters" e "setters" para acessar e modificar os atributos privados de uma classe, impedindo que o usuário possa manipular diretamente os atributos.

Exemplo:

```java
public class ExemploClasse {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
```

Não, construtores, getters e setters são conceitos distintos, mas todos estão relacionados com a criação e manipulação de objetos em Java.

### Construtores

Os construtores são métodos especiais em uma classe que são chamados automaticamente quando um objeto dessa classe é instanciado. Eles são usados para inicializar os atributos do objeto ou realizar outras operações necessárias durante a criação. Um construtor em Java tem o mesmo nome da classe e não possui tipo de retorno.

Exemplo:

```java
public class ExemploClasse {
    private String nome;

    // Construtor
    public ExemploClasse(String nome) {
        this.nome = nome;
    }
}
```

No exemplo acima, o construtor `ExemploClasse` recebe um parâmetro `nome` e inicializa o atributo `nome` da classe.

### Herança

Herança em Java permite a criação de uma nova classe que herda características de uma classe existente. A palavra-chave `extends` é usada para estabelecer essa relação. A classe filha herda atributos e métodos da classe mãe (superclasse).

Exemplo:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    // Métodos específicos para a classe Cachorro...
}
```

### Annotations

Annotations são metadados que fornecem informações sobre o código-fonte. Elas são precedidas pelo símbolo `@` e podem ser aplicadas a classes, métodos, variáveis, etc. No contexto de Java, elas são usadas para fornecer informações adicionais ao compilador, ambiente de execução ou ferramentas. São uteis para gerar "hints" em caso de refatoração, indicando relações que precisam ser refatoradas também.

Exemplo:

```java
public class ExemploAnnotation {

    @Override
    // Indica que o método está substituindo um método na classe pai
    public void metodoOverride() {
        // Implementação aqui...
    }

    @Deprecated
    // Indica que o método está obsoleto e deve ser evitado
    public void metodoAntigo() {
        // Implementação aqui...
    }
}
```
