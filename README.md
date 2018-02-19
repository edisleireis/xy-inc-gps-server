# XY Inc.

Empresa especializada na produção de excelentes receptores GPS (Global Positioning System).

# Aplicação

Plataforma baseada em serviços que, de forma a flexibilizar a integração, disponibiliza os recursos necessários ao bom funcionamento do dispositivo criado para auxiliar as pessoas na localização de Pontos de Interesse (POIs).

# Ambiente

A plataforma foi disponibizada na nuvem do Heroku como forma de viabilizar os testes de integração. Para persistir os dados foi utilizado o banco de dados mySQL, hospedado em provedor web de forma a permitir os testes.

http://heroku.com

# Funcionalidades

## Cadastro de Pontos de Interesse

Serviço para cadastrar pontos de interesse com 3 atributos: Nome do POI, Coordenada X (inteiro não negativo) Coordenada Y (inteiro não negativo).

https://xy-inc-gps-server.herokuapp.com/swagger-ui.html#!/Localizacoes/registerLocationUsingPOST

### Atributos do Ponto de Interesse

Nome do Ponto de Interesse, texto, não nulo, 100 caracteres;

Coordenada X, inteiro positivo, não nulo;

Coordenada Y, inteiro positivo, não nulo;

## Serviço para listar todos os POIs cadastrados

Serviço que retornará uma lista com todos os Pontos de Interesse cadastrados.

https://xy-inc-gps-server.herokuapp.com/swagger-ui.html#!/Localizacoes/findLocationsUsingGET

## Serviço para listar POIs por proximidade.

Serviço que retornará uma lista com todos os Pontos de Interesse que estejam a uma distância menor ou igual a determinado ponto.

https://xy-inc-gps-server.herokuapp.com/swagger-ui.html#!/Localizacoes/findLocationsByDistanceUsingGET

### Atributos para a consulta

Coordenada X, inteiro positivo, não nulo;

Coordenada Y, inteiro positivo, não nulo;

Distância, inteiro positivo, não nulo;
