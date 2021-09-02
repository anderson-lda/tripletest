# tripletest
Aplicação Web em construção, no qual é usado a framework Spring e o template Thymeleaf. Recebe informações através do browser e armazena no SQLite.

Configurações:
Necessário a instalação do JDK 11 e preferencialmente a IDE STS. Necessário também, em application.properties, no pacote resources, colocar o caminho do arquivo sqlite:
spring.datasource.url=jdbc:sqlite:C:\\your_path_here
Ao rodar a aplicação como java run application mesmo, acessar  no browser:
http://localhost:8080/agendamento
Será possível visualizar todas as consultas salvas no banco de dados SQLite.
Ao clicar em cadastrar consulta, será possível adicionar uma nova consulta.
