# Exercício Prático:<br> Sistema de Gerenciamento de Biblioteca (POO em Java)

**Disciplina:** Algoritmos e Programação  <br>
**Professor:** Daniel Henrique Matos de Paiva <br>
**Objetivo:** Consolidar os conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, aplicando pilares como Encapsulamento, Herança, Polimorfismo e Associações entre classes.

---

## 📚 Contextualização do Problema

Você foi contratado para desenvolver o protótipo de um sistema de gerenciamento para uma biblioteca universitária. <br>
O sistema precisa controlar o acervo de livros, o cadastro de usuários (alunos e professores), o processo de empréstimos e a aplicação de multas por atraso na devolução.

Para que o sistema seja modular e mantenha uma boa arquitetura orientada a objetos, você deverá projetar e implementar **no mínimo 07 (sete) classes**, além de uma classe principal para demonstração e testes (`Programa.java`).

---

## 🛠️ Requisitos de Implementação

Você deve criar o projeto em Java contendo as seguintes classes e estruturas:

### 1. Classes de Domínio e Lógica (Mínimo de 07 classes)

Escolha e implemente pelo menos 7 classes que façam sentido no contexto de uma biblioteca. <br>Sugestões de classes obrigatórias e opcionais para compor o seu conjunto:

1. **`Livro`**: Representa um livro físico ou digital do acervo (atributos: título, autor, ISBN, ano de publicação, quantidade disponível).
2. **`Usuario`** (Classe Abstrata ou Base): Representa uma pessoa cadastrada (atributos: nome, CPF, e-mail).
3. **`Aluno`** (Herda de `Usuario`): Especifica um aluno (atributos adicionais: matrícula, curso).
4. **`Professor`** (Herda de `Usuario`): Especifica um professor (atributos adicionais: departamento, Siape).
5. **`Emprestimo`**: Controla a transação de retirada de um livro (atributos: livro, usuário, data de empréstimo, data de devolução prevista, status).
6. **`Multa`**: Controla eventuais valores cobrados por atraso na devolução (atributos: valor, paga, empréstimo associado).
7. **`Biblioteca`** ou **`Acervo`**: Classe gerenciadora que armazena listas de livros e usuários, permitindo cadastrar novos itens e realizar buscas.

*(Nota: Caso prefira outra classe para fechar o total de 7, você pode incluir, por exemplo, `Funcionario`, `Editora` ou `Categoria`).*

### 2. A Classe Principal (`Programa.java`)

A classe `Programa.java` deve conter o método `public static void main(String[] args)`. Nela, você deve demonstrar o funcionamento prático do seu sistema através de interações simuladas:

1. Instanciar um objeto da classe gerenciadora (`Biblioteca` ou equivalente).
2. Cadastrar pelo menos **2 livros** diferentes no acervo.
3. Cadastrar pelo menos **2 usuários** diferentes (ex: um Aluno e um Professor).
4. Realizar um **empréstimo** de um livro para um usuário.
5. Simular o cálculo ou registro de uma **multa** (se aplicável).
6. Exibir no console (`System.out.println`) os dados consolidados dos cadastros, livros disponíveis e empréstimos ativos.

---

## 📋 Critérios de Avaliação

* **Encapsulamento:** Atributos privados (`private`) com o uso correto de métodos getters e setters.
* **Construtores:** Sobrecarga de construtores onde necessário para facilitar a instanciação.
* **Herança e Polimorfismo:** Aproveitamento de hierarquia de classes (ex: `Usuario` $\rightarrow$ `Aluno` / `Professor`) e sobrescrita de métodos (como `toString()`).
* **Organização e Boas Práticas:** Nomes de classes em *PascalCase*, atributos/métodos em *camelCase*, código indentado e limpo.
* **Funcionamento:** A classe `Programa.java` deve compilar e executar sem erros, demonstrando claramente a interação entre as 7 classes exigidas.

---

## 🚀 Como Entregar

1. Crie um projeto Java na sua IDE favorita (Eclipse, IntelliJ, NetBeans ou VS Code).
2. Organize suas classes nos pacotes adequados (sugestão: `model` e `main`).
3. Certifique-se de que todas as 7 classes foram criadas e estão sendo devidamente manipuladas a partir do `Programa.java`.
4. Envie o repositório contendo os códigos-fonte (`.java`).

Bom trabalho e bons códigos! 💻📚
