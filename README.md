# monstro-api
Em desenvolvimento.

<b>USER</b>: Ainda não criada nem iniciada.<br>
https://github.com/FabioNazario/monstro-api <br>
https://github.com/FabioNazario/seguranca <br>
https://github.com/FabioNazario/eurekaServer <br>
https://github.com/FabioNazario/configServer <br>

**Repositório de configuração** (usado pelo configServer):<br>
https://github.com/FabioNazario/config-repo


Obs: Todas as aplicações então incompletas e sujeitas a modificações

localhost:8080/api/monstro/random

retorno:

```json
{
	"id": 1,
	"nome": "Morto-Vivo",
	"pontosDeVida": 25,
	"forca": 4,
	"defesa": 0,
	"agilidade": 1,
	"qtdDadosDano": 2,
  	"tamanhoDadosDano": 4
}
```
################################################################################################################################

Instituto InfNet - PGPJAV01C1-3N-P1 - Serviços em Nuvem - 2021/2
Prova Professor Leonardo Silva da Gloria
Grupo: Bruno, Eliton, Fábio e Rogéria

Projeto de Bloco - Jogo RPG com Arquitetura em Microserviços

O objetivo é projetar e implementar os serviços REST de um jogo de RPG baseado em turnos.

Serviços a Serem Implementados pelo Grupo

    /user
    /monstro
    /seguranca

Repositórios:
<b>USER</b>: Ainda não criada nem iniciada.<br>
https://github.com/FabioNazario/monstro-api <br>
https://github.com/FabioNazario/seguranca <br>
https://github.com/FabioNazario/eurekaServer <br>
https://github.com/FabioNazario/configServer <br>

**Repositório de configuração** (usado pelo configServer):<br>
https://github.com/FabioNazario/config-repo


Swagger desta API:
**********************************

Microserviço /monstro
localhost:8080/api/monstro/random

Lista todos os monstros cadastrados ou retorna um monstro específico e as suas características. É chamado via GET e retorna um JSON com os dados. Exemplo:

{
	"id": 1,
	"nome": "Morto-Vivo",
	"pontosDeVida": 25,
	"forca": 4,
	"defesa": 0,
	"agilidade": 1,
	"qtdDadosDano": 2,
  	"tamanhoDadosDano": 4
}

Herois

Atualmente estão implementados os seguintes monstros:

Monstro 	Pontos de Vida (PdV)	Força		Defesa		Agilidade	Qtde Dados Dano		Tamanho Daddos Dano
Morto-Vivo 	25 			4 		0 		1		2			4			
Orc 		20		 	6		2 		2 		1			9					
ChuckNorris 	99999999 		9999999 	9999999 	9999999 	999			999
Rato		5			1		0		3		1			4
Barata		2			1		0		2		1			2
Dragão		50			6		4		1		3			8


Critérios de Avalição (pontuação aproximada atiginda até o momento: 3.5)

    1. Implementar os serviços seguindo os padrões restfull: 2 pontos

    2. Receber configurações do servidor de configuração: 0.5 ponto

    3. Decodificar o Token JWT enviado para saber qual usuário está jogando: 0.5 ponto (Pedro)
    Obs.: Se o seu MS não precisar saber qual o usuário está jogando o tópico 2 passa a valer 1 ponto

    4. Se registrar no Eureka: 1 ponto (Paulo)

    5. Utilizar ClientSide Loadbalancer (Ribbon ou Feign): 1 ponto

    6. Ser resiliente a falhas: 1 a 2 pontos
    Obs.: 1 ponto = Implementar apenas um método visto, 2 pontos = implementar mais de 1

    7. Criar uma conta no Papertrail e utilizar agregação de Logs: 0.5 ponto (William)

    8. Utilizar Zipkin: 0.5 ponto

    9. Utilizar algum tipo de Cache: 0.5 ponto
    Obs.: Se o serviço implementado não possuir a necessidade de cache o Zipkin passa a valer 1 ponto. O aluno deverá explicar por que o cache não se faz necessário

    10. Colocar os códigos em repositório público e com README: 0.5 ponto

    11. Utilizar swagger para documentar o serviço: 1 ponto
