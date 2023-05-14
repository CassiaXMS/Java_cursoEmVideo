<h1 align="center">
    <a>🔗 Conceitos de Java Orientado a objeto</a>
</h1> 

<h4 align="center"> 
	🚧 Concluído 🚀 🚧
</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-aprendizagem">Aprendizagem</a> • 
 <a href="#-pilares-de-poo">Pilares da POO</a> • 
 <a href="#-tecnologias">Tecnologias</a> •
 <a href="#-autor">Autor</a> • 
 <a href="#user-content--licença">Licença</a>
</p>


## 💻 Sobre o projeto

<p align="center"> :octocat: O repositório tem por intuito compartilhar os conhecimentos adquiridos durante a aprendizagem 
de programação orientada a objetos na linguagem Java.</p>


---


## ⚙️ aprendizagem

### Objeto

Na prática o objeto é uma insância de uma classe, mas também podemos definir como algo 'material / abstrato' que pode
ser percebida por meio das suas características, comportamentos e estado atual. A partir disso definimos da
seguinte forma:

- Atributos - características
- Métodos - comportamentos
- Estados - características atuais

### 🎲 Exemplo
	
	classe Caneta
		modelo: caractere;
		cor: caractere;
		ponta: real;
		carga: inteiro;
		tampada: lógico;
		
		metodo escrever();
		metodo tampar();
		
💡Todo objeto vem de uma classe (considerado um molde)

#

### Classe

Define os atributos e métodos comuns que serão compartilhados por um objeto além do mais é ela que faz gerar o objeto.

#

### Visibilidade do objeto 

Indica o nível de acesso aos componentes internos (atributos) de uma classe.

	 + Público - a classe atual e todas as outras classes podem ser acessadas.
	 - Privado - somente a classe atual tem acesso.
	 # Protegido - a classe atual e todas as suas sub-classes podem ser acessadas.

#

### Métodos especiais

- Métodos acessores: getter

- Métodos modificadores: setter

- Método Construtor: executa tarefas assim que objeto é instanciado.

---

## 🛠 Pilares da POO

### Encapsulamento
Permite ocultar as partes independentes da implementação
protegendo o usuário do código.

### 🎲 Vantagens
- Torna as mudanças invisíveis;
- Facilita a reutilização do código;
- Reduz os efeitos colaterais.

---

### Herança
Permite basear uma nova classe na definição de outra classe previamente existente.

---
 
## Polimorfismo
Permite que um mesmo nome represente vários comportamentos difirentes.

### Tipos de Polimorfismo

   1 - Sobreposição 
   
   	Sobrepõe os métodos da classe abstrata usando a mesma assinatura (overriding).
   
   2 - Sobrecarga 
   	
	Mesmo nome porém  assinaturas diferentes (overloading).
   
### 🎲 Assinatura do método
 São considerados os métodos com o mesmo nome e a mesma quantidade e tipo de parâmetros.
	
	
	
 	public calMedia (float n1, float n2): float
	public calcMedia (float v1, float v2): int
	
	possuem a mesma assinatura, pois a quantidade e o tipo de parâmetros são iguais. 
 
 ---
 
## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

-   Editor:  **Apache NetBeans IDE 17** 

---

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito com ❤️ por Cassia Xavier 👋🏽 [Entre em contato!](linkedin.com/in/cássia-xavier-mendes-dos-santos)


---
