# Desafio proposto pela DIO no bootcamp de Desenvolvimento Java com IA
Java RESTful API criada para o desafio, inspirado no aplicativo da UNIMED.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Plan plan
        -Feature[] features
        -News[] news
    }

    class Plan {
        -String name
        -String registerNumber
        -String segmentation
        -String coverage
        -String accommodation
        -String typeEmployment
        -LocalDate coverageStart
        -String temporaryPartialCoverage
        -String regulation
        -Card card
    }

    class Card {
        -String number
        -String name
        -Plan plan
        -String coverage
        -LocalDate validity
        -String serviceNetwork
        -String service
    }

    class Feature {
        -String icon
        -String description
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Plan
    User "1" *--> "1" Card
    User "1" *--> "1..N" Feature
    User "1" *--> "1..N" News
```


## Observações
O diagrama em questão é apenas para fins de estudo, considerando uma abstração simples. Podem existir planos de saúde que cubram mais de uma pessoa, ou um usuário pode ter mais de um plano. No entanto, esta modelagem considera uma relação 1 para 1.
