<h1>Calculadora de IMC</h1>
<p>
    Este projeto é um sistema simples para cálculo do Índice de Massa Corporal (IMC) de uma pessoa.
    O IMC é uma medida que relaciona o peso e a altura de uma pessoa para avaliar se ela está dentro de uma faixa de peso saudável.
</p>

<h2>🚀 Estrutura do Projeto</h2>
<p>
    O projeto está estruturado da seguinte forma:
</p>
<ul>
    <li><strong><code>br.com.alura.model</code></strong>: Contém as classes de modelo.
        <ul>
            <li><code>Pessoa.java</code>: Representa uma pessoa com atributos como nome, idade, altura e peso. Inclui métodos para definir e obter esses atributos, com validação de entrada.</li>
        </ul>
    </li>
    <li><strong><code>br.com.alura.service</code></strong>: Contém os serviços e lógicas de cálculo.
        <ul>
            <li><code>CalcularIMC.java</code>: Contém o método estático para calcular o IMC com base no peso e altura de uma pessoa.</li>
        </ul>
    </li>
    <li><strong><code>br.com.alura</code></strong>: Contém a classe principal e a interface de usuário.
        <ul>
            <li><code>Main.java</code>: Fornece a interface de linha de comando para o usuário interagir com o sistema. Permite ao usuário informar dados, calcular o IMC e exibir a classificação.</li>
        </ul>
    </li>
    <li><strong><code>test</code></strong>:
        <ul>
            <li><strong><code>br.com.alura.serviceTest</code></strong>: Contém os testes unitários para os serviços.
                <ul>
                    <li><code>CalcularIMCTest.java</code>: Testa a funcionalidade de cálculo do IMC para garantir que o resultado esteja correto.</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>

<h2>🛠️ Ferramentas Utilizadas</h2>
<p>
    O projeto utiliza as seguintes ferramentas e tecnologias:
</p>
<div>
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/>
    <p><strong>Java 11</strong>: Linguagem de programação utilizada para desenvolver o projeto.</p>
</div>
<div>
    <img align="center" alt="JUnit" src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>
    <p><strong>JUnit 5</strong>: Framework de testes unitários utilizado para garantir a qualidade e precisão do código.</p>
</div>
<div>
    <img align="center" alt="Maven" src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
    <p><strong>Maven</strong>: Ferramenta de gerenciamento de dependências e build utilizada para configurar e construir o projeto.</p>
</div>
<div>
    <img align="center" alt="Scanner" src="https://img.shields.io/badge/Scanner-000000?style=for-the-badge&logo=java&logoColor=white"/>
    <p><strong>Scanner</strong>: Utilizado para leitura de entradas do usuário a partir do console.</p>
</div>
<div>
    <img align="center" alt="IDE" src="https://img.shields.io/badge/IDE-000000?style=for-the-badge&logo=visualstudiocode&logoColor=white"/>
    <p><strong>IDE</strong>: Utilizou-se uma IDE Java (como IntelliJ IDEA) para desenvolvimento.</p>
</div>
