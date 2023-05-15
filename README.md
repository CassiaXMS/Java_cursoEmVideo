<h1 align="center">
    <a>🔗 Conceitos de Java Orientado a objeto  </a>
</h1> 

<h4 align="center"> 
	🚧 Concluído 🚀 🚧
</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-meu-aprendizado">Meu aprendizado</a> • 
 <a href="#-pilares-da-poo">Pilares da POO</a> •
 <a href="#-lembrete">Lembrete</a> • 
 <a href="#-tecnologias">Tecnologias</a> •
 <a href="#-autor">Autor</a> 
</p>


## 💻 Sobre o projeto

<p align="center"> :octocat: O repositório tem por intuito compartilhar os conhecimentos adquiridos durante a aprendizagem 
de programação orientada a objetos na linguagem Java pelo canal curso em vídeo do professor Guanabara.</p>


---


## 📓 Meu aprendizado

###  ✏️ Objeto

Na prática o objeto é uma instância de uma classe, mas também podemos definir como algo "material ou abstrato" a qual 
pode ser percebido por meio de suas características, comportamentos e estado atual. A partir disso, é definido da
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
		
💡Todo objeto vem de uma classe (considerado um molde).

#

### Classe

Define os atributos e métodos comuns que serão compartilhados por um objeto além do mais é ela que faz gerar o objeto.

#

### 👀 Visibilidade do objeto 

Indica o nível de acesso aos componentes internos (atributos) de uma classe.

	 + Público - a classe atual e todas as outras classes podem ser acessadas.
	 - Privado - somente a classe atual tem acesso.
	 # Protegido - a classe atual e todas as suas sub-classes podem ser acessadas.

#

### :stars: Métodos especiais

- Métodos acessores: getter

- Métodos modificadores: setter

- Método Construtor: executa tarefas assim que objeto é instanciado.

---

## 📌 Pilares da POO

### 🔋 Encapsulamento
Permite ocultar as partes independentes da implementação
protegendo o usuário do código.

### 🎲 Vantagens
- Torna as mudanças invisíveis;
- Facilita a reutilização do código;
- Reduz os efeitos colaterais.

---

### :family_man_girl_girl: Herança
Permite basear uma nova classe na definição de outra classe previamente existente.

---
 
## :busts_in_silhouette: Polimorfismo
Permite que um mesmo nome represente vários comportamentos difirentes.

### Tipos de Polimorfismo

   1 - Sobreposição 
   
   	Sobrepõe os métodos da classe abstrata usando a mesma assinatura (overriding).
   
   2 - Sobrecarga 
   	
	Mesmo nome porém  assinaturas diferentes (overloading).
   
### ✍️ Assinatura do método
 São considerados os métodos com o mesmo nome e a mesma quantidade e tipo de parâmetros.
	
 	public calMedia (float n1, float n2): float
	public calcMedia (float v1, float v2): int
	
	possuem a mesma assinatura, pois a quantidade e o tipo de parâmetros são iguais. 
 
 ---
 
## ✨ Lembrete 

| Tipo | Função |
| --- | --- |
| Classe abstrata | Não pode ser instanciada só pode servir como progenitorora.  |	
| Método abstrato | Declarado, porém não implementado na progenitora (Interface). |
| Classe Final 	  | Não pode ser herdada por outra classe.		         |
| Método Final 	  | Não pode ser sobrescrito pelas suas sub-classes, obrigatoriamente herdado. |  

---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

-   Editor:  **Apache NetBeans IDE 17** 

---


## 📝 Autor

Este projeto esta sobe a licença [MIT](./LICENSE).

> Caso queira fazer o curso entre aqui no site [curso de Java POO](https://www.cursoemvideo.com/curso/java-poo/)


Feito com ❤️ por Cassia Xavier 👋🏽 Entre em contato!

<a href="linkedin.com/in/cássia-xavier-mendes-dos-santos" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=flat-square&logo=linkedin&logoColor=white" target="_blank"></a>  



---
