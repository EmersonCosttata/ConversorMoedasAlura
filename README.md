
# Conversor de Moedas Desafio Alura
Este é um projeto simples de **Conversor de Moedas** desenvolvido em **Java**, utilizando a API da [ExchangeRate-API](https://www.exchangerate-api.com) para realizar conversões em tempo real entre diversas moedas.

## 🚀 Funcionalidades

- Conversão de:
  - **Dólar (USD) para Real (BRL)**
  - **Real (BRL) para Dólar (USD)**
  - **Dólar (USD) para Peso Argentino (ARS)**
  - **Peso Argentino (ARS) para Dólar (USD)**
  - **Dólar (USD) para Peso Colombiano (COP)**
  - **Peso Colombiano (COP) para Dólar (USD)**
- Exibição do valor convertido com precisão de 2 casas decimais.
- Tratamento de erros para problemas de conexão ou API offline.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11** ou superior.
- **Gson** para manipulação de JSON.
- **HttpClient** para comunicação com a API.

---

## 📦 Pré-requisitos

1. **Java JDK 11+** instalado no seu sistema.
2. Biblioteca **Gson** adicionada ao projeto:
   - Caso utilize um gerenciador de dependências como **Maven**:
     ```xml
     <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.9</version>
     </dependency>
     ```
   - Caso prefira adicionar manualmente, baixe o arquivo JAR do Gson [aqui](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.9/) e inclua no classpath do seu projeto.

## 📖 Como Usar

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   cd conversor-moedas
   ```
   
2. **Compile o Código**:
   ```bash
   javac -cp gson-2.8.9.jar *.java
   ```
   
3. **Execute o Programa**:
   ```bash
   java -cp .;gson-2.8.9.jar Main
   ```
   
4. **Interaja com o Menu**:
   - Escolha uma das opções de conversão.
   - Digite o valor a ser convertido.
   - Receba o resultado exibido no console.

---

## 📋 Estrutura do Projeto

```
/conversor-moedas
│
├── ConversorMoedas.java   # Classe responsável pelas chamadas à API e conversão.
├── Main.java              # Classe principal com o menu interativo.
├── gson-2.8.9.jar         # Biblioteca Gson (se adicionada manualmente).
└── README.md              # Documentação do projeto.
```

---

## 🌐 API Utilizada
O projeto utiliza a API **ExchangeRate-API** para obter as taxas de câmbio em tempo real.
- Documentação: [ExchangeRate-API Docs](https://www.exchangerate-api.com/docs/standard-requests)
- Exemplo de Endpoint:
  ```
  https://v6.exchangerate-api.com/v6/SUA-API-KEY/latest/USD
  ```
- Substitua **`SUA-API-KEY`** por uma chave válida de API, obtida ao se registrar no site.
---


## 📚 Referências e Créditos

- [ExchangeRate-API](https://www.exchangerate-api.com)
- [Gson - Biblioteca para JSON](https://github.com/google/gson)

---
