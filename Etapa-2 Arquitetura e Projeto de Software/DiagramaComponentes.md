# Diagrama de Componentes (UML)

```mermaid
componentDiagram
    [Frontend Web] --> [API Backend]
    [API Backend] --> [Módulo Quartos]
    [API Backend] --> [Módulo Hóspedes]
    [API Backend] --> [Módulo Reservas]
    [Módulo Quartos] --> [Banco de Dados]
    [Módulo Hóspedes] --> [Banco de Dados]
    [Módulo Reservas] --> [Banco de Dados]
```

- **Frontend Web:** Interface do usuário (SPA, responsiva)
- **API Backend:** Camada de serviços e regras de negócio
- **Módulo Quartos, Hóspedes, Reservas:** Domínios principais do sistema
- **Banco de Dados:** Persistência relacional dos dados
