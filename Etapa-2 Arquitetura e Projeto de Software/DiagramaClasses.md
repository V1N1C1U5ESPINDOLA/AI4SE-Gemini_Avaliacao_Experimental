# Diagrama de Classes Principal

```mermaid
classDiagram
    class Quarto {
        +int numero
        +int capacidade
        +string tipo
        +float precoDiaria
        +bool frigobar
        +bool cafeDaManha
        +bool arCondicionado
        +bool tv
        +list<Cama> camas
        +string disponibilidade
    }
    class Cama {
        +string tipo
    }
    class Hospede {
        +string nome
        +string sobrenome
        +string cpf
        +string email
    }
    class Reserva {
        +int id
        +date dataEntrada
        +date dataSaida
        +Quarto quarto
        +Hospede hospede
    }
    Quarto "1" o-- "*" Cama
    Reserva "*" o-- "1" Quarto
    Reserva "*" o-- "1" Hospede
```

- **Quarto:** Representa um quarto do hotel, com atributos e lista de camas
- **Cama:** Tipo de cama presente no quarto
- **Hóspede:** Dados do hóspede
- **Reserva:** Associação entre hóspede e quarto, com datas de entrada e saída
