# Air-France

# Sistema de Controle de Aviões da Air France

O Sistema de Controle de Aviões da Air France é um sistema de gerenciamento de informações sobre os aviões da companhia aérea. Ele inclui uma base de dados em SQL para armazenar os dados dos aviões, uma interface HTML para visualização dos dados e um programa em Java para adicionar e exibir os aviões.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **database.sql**: arquivo contendo o script SQL para criar a tabela e inserir os dados iniciais dos aviões.
- **index.html**: página HTML com a interface do sistema, incluindo a exibição dos aviões em forma de tabela.
- **script.js**: arquivo JavaScript que contém a lógica para filtrar os dados da tabela de acordo com o termo de pesquisa inserido.
- **Main.java**: arquivo Java que implementa o programa para adicionar e exibir os aviões.

## Requisitos

- Servidor web para executar o arquivo HTML e JavaScript.
- Java Development Kit (JDK) instalado para compilar e executar o programa Java.

## Instruções de Uso

1. Execute o script SQL fornecido no arquivo **database.sql** para criar a tabela e inserir os dados iniciais dos aviões.
2. Coloque os arquivos **index.html** e **script.js** em um diretório acessível pelo servidor web.
3. Abra o arquivo **index.html** em um navegador para visualizar a interface do sistema e interagir com os dados dos aviões.
4. Compile o arquivo **Main.java** utilizando o comando `javac Main.java`.
5. Execute o programa Java com o comando `java Main` para adicionar e exibir os aviões.

## Funcionalidades

- Adicionar um avião ao sistema fornecendo as informações correspondentes.
- Exibir a lista de aviões cadastrados no sistema.
- Filtrar os aviões com base em um termo de pesquisa, utilizando a funcionalidade de busca.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema, tiver sugestões de melhorias ou quiser adicionar novas funcionalidades, fique à vontade para abrir uma issue neste repositório.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
