# Challenge-Conversor-De-Moedas
# Conversor de Moedas

Este repositório contém um programa simples em Java que converte moedas utilizando a API ExchangeRate-API. O programa permite converter entre várias moedas e exibe o valor convertido na tela.

## Estrutura do Projeto

O projeto consiste em dois arquivos principais:

1. **Conversor.java**: Contém a lógica principal do programa, incluindo a interface do usuário, chamadas à API e cálculo da conversão de moedas.
2. **Main.java**: Ponto de entrada do programa, que instancia a classe `Conversor` e inicia o processo de conversão de moedas.

## Pré-requisitos

Para executar este projeto, você precisará de:

- Java Development Kit (JDK) 11 ou superior.
- Uma chave de API válida da [ExchangeRate-API](https://www.exchangerate-api.com/).

## Configuração

1. Clone este repositório para o seu ambiente local.
2. Substitua a string `fe3e5674ed476e93a7c57d72` no arquivo `Conversor.java` pela sua chave de API da ExchangeRate-API.

## Executando o Programa

1. Compile o programa:
   ```bash
   javac Conversor.java Main.java
   ```

2. Execute o programa:
   ```bash
   java Main
   ```

## Funcionamento

Quando o programa é executado, ele exibe um menu com as opções de conversão disponíveis. O usuário pode escolher uma das opções, inserir o valor a ser convertido, e o programa exibirá o valor convertido.

### Opções Disponíveis

1. Dólar (USD) para Euro (EUR)
2. Euro (EUR) para Dólar (USD)
3. Dólar (USD) para Real Brasileiro (BRL)
4. Real Brasileiro (BRL) para Dólar (USD)
5. Dólar (USD) para Iene Japonês (JPY)
6. Peso Colombiano (COP) para Dólar (USD)
7. Sair

### Exemplo de Uso

1. Após iniciar o programa, escolha uma das opções do menu (por exemplo, 1 para converter de Dólar para Euro).
2. Insira o valor que deseja converter.
3. O programa exibirá o valor convertido com base na taxa de câmbio atual obtida da API.

### Tratamento de Erros

O programa inclui um bloco `try-catch` para capturar e exibir qualquer erro que ocorra durante o processo de conversão, como problemas de rede ou resposta inválida da API.

## Dependências

Este projeto utiliza a biblioteca [Gson](https://github.com/google/gson) para parsear as respostas JSON da API. Certifique-se de adicionar a biblioteca ao seu projeto.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Pull requests são bem-vindos!

Se tiver dúvidas, entre em contato.

---

### Contato

Maria Luise
[LinkedIn](https://www.linkedin.com/in/maria-luise/)
[GitHub](https://github.com/marialuise)

---

Divirta-se convertendo moedas! :)
