#  API Pedidos MS

Simula microserviço de pedidos, tem integração com
Eureka Sever do Spring Cloud Netflix.

### Ferramentas para Executar

- Java 17
- maven
- Lombok
- Docker

## Para rodar o projeto
Antes de tudo suba o banco, o arquivo está na raiz do projeto `docker-compose.yaml`,
suba a imagem com o comando a seguir:

    $ docker compose up

Quando a imagem do docker estiver rodando, é só fazer o build da aplicação que vai rodar corretamente.


_Essa aplicação foi desenvolvida para fins de estudo de load balancer, gateway e discovery service._