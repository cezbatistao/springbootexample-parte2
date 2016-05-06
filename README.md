# Exemplo _Spring Boot_ interagindo com Banco de Dados

Começando com o _Spring Boot_ parte 2 abordando _Spring Data_ e _JPA/Hibernate_ com Banco de Dados __H2__.

Para iniciar basta executar o comando:
```bash
mvn spring-boot:run
```

Depois acessar:
- [http://localhost:8080/supermercado](http://localhost:8080/supermercado) para incluir toda a massa de teste;
- [http://localhost:8080/supermercado/comprar/comprar/{idCliente}/{idProduto}/{quantidade}](http://localhost:8080/supermercado/comprar/comprar/{idCliente}/{idProduto}/{quantidade}) informando os parametros para criar um registro de Pedido;
- [http://localhost:8080/supermercado/compras/{email}/](http://localhost:8080/supermercado/compras/{email}/) informando o email do cliente obtém o registro dele com todos os pedidos efetuados.

Para mais detalhes verificar artigo: [Começando com o Spring Boot – Parte 2](https://cezbatistao.wordpress.com/2016/05/05/comecando-com-o-spring-boot-parte-2/)
