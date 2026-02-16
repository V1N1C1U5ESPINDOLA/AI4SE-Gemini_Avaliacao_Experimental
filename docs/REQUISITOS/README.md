# Sistema de Reserva de Hotel - Documentação Completa

## 📋 Índice de Documentação

Bem-vindo à documentação do **Sistema de Reserva de Hotel**. Este arquivo serve como guia de navegação para todos os documentos do projeto.

---

## 📁 Estrutura de Documentos

### 1. **[Requisitos Funcionais](REQUISITOS_SISTEMA_HOTELEIRO.md)**
   
   Documento que detalha todos os requisitos funcionais do sistema:
   - **Módulo Gestão de Quartos**: Cadastro, listagem e edição de quartos
   - **Módulo Gestão de Hóspedes**: Cadastro e listagem de hóspedes
   - **Módulo Gestão de Reservas**: Listagem e gerenciamento de reservas
   - **Validações**: Regras de validação de dados
   - **Interface Visual**: Paleta de cores e requisitos de UI
   - **Matriz de Requisitos**: Rastreamento de todos os requisitos

   **Quando usar**: Para entender o que o sistema deve fazer do ponto de vista do usuário.

---

### 2. **[Arquitetura e Design](ARQUITETURA_E_DESIGN.md)**
   
   Documento que descreve a arquitetura técnica e design visual:
   - **Arquitetura de Camadas**: Estrutura em 4 camadas (UI, BL, DAL, Banco)
   - **Estrutura de Pastas**: Organização recomendada do projeto
   - **Paleta de Cores**: Cores primárias, neutras e de status
   - **Design de Componentes**: Padrões visuais
   - **Tipografia**: Estilos de texto
   - **Responsividade**: Breakpoints para diferentes dispositivos
   - **Acessibilidade**: Diretrizes de a11y

   **Quando usar**: Para entender a organização técnica do projeto e diretrizes de design visual.

---

### 3. **[Modelos de Dados](MODELOS_DADOS.md)**
   
   Documento que detalha a estrutura do banco de dados:
   - **Diagrama ER**: Relacionamentos entre entidades
   - **Tabelas**: HOSPEDE, QUARTO, CAMA, RESERVA
   - **Scripts SQL**: Criação de tabelas
   - **Índices**: Otimizações de performance
   - **Validações**: Regras a nível de banco de dados
   - **Relacionamentos**: Constraints e cardinalidades

   **Quando usar**: Para implementar o banco de dados e entender a estrutura de dados.

---

### 4. **[Casos de Uso e Regras de Negócio](CASOS_USO_REGRAS_NEGOCIO.md)**
   
   Documento que detalha os casos de uso iniciais e regras de negócio:
   - **Casos de Uso**: Fluxos principais do sistema (UC1.1 até UC1.6)
   - **Regras de Negócio**: RN001 até RN024 (cobrindo todos os módulos)
   - **Fluxos de Processos**: Sequências de operações
   - **Matriz de Rastreabilidade**: Ligação entre requisitos e casos de uso

   **Quando usar**: Para implementar lógica de negócio e entender os fluxos do sistema.

---

### 4.1. **[Casos de Uso Principais Formais](CASOS_USO_PRINCIPAIS.md)** ✨ **NOVO**
   
   Documento com especificação formal dos 9 casos de uso principais:
   - **Atores**: Gerente de Hotel, Recepcionista, Gerente de Limpeza
   - **Pré-condições e Pós-condições**: Claramente definidas
   - **Fluxo Principal**: Caminho feliz detalhado passo-a-passo
   - **Fluxos Alternativos**: Tratamento de exceções e erros
   - **Dados Alterados**: Especificação de tabelas e operações
   - **Regras Associadas**: Ligação com requisitos funcionais
   - **Diagrama UML**: Visualização dos casos de uso

   **Quando usar**: Para implementação, testes, validação de requisitos e documentação técnica.

---

### 5. **[Requisitos Funcionais e Não-Funcionais (MoSCoW)](REQUISITOS_RF_RNF_MOSCOW.md)**
   
   Documento que classifica todos os requisitos pela metodologia MoSCoW:
   - **Requisitos Funcionais**: 71 requisitos (21 M + 20 S + 20 C + 10 W)
   - **Requisitos Não-Funcionais**: 62 requisitos (15 M + 20 S + 20 C + 7 W)
   - **Priorização**: Must, Should, Could, Won't Have
   - **Roadmap**: Sugestão de fases de desenvolvimento
   - **Complexidade**: Classificação por nível de complexidade
   - **Métricas**: Critérios de aceitação e metas

   **Quando usar**: Para planejamento de sprints, gestão de escopo e priorização de features.

---

### 6. **[Histórias de Usuário](HISTORIAS_USUARIO.md)**
   
   Documento com 18 histórias de usuário completas em formato padrão:
   - **Formato Padrão**: Como [tipo de usuário], eu quero…, para que…
   - **Critérios de Aceitação**: Formato Gherkin (Given-When-Then)
   - **Story Points**: Estimativa de esforço para cada história
   - **Prioridade**: Classificação por importância
   - **Total**: 18 histórias (10 críticas + 6 altas + 2 baixas)
   - **Cobertura**: Todos os 3 módulos + dashboard
   - **Mapeamento**: Ligação com requisitos funcionais

   **Quando usar**: Para planejamento de sprints, desenvolvimento e testes de aceitação.

---

### 7. **[Casos de Uso Principais Formais](CASOS_USO_PRINCIPAIS.md)** ✨ **NOVO**
   
   Documento com especificação formal dos 9 casos de uso principais:
   - **Atores**: Gerente de Hotel, Recepcionista, Gerente de Limpeza
   - **Pré-condições e Pós-condições**: Claramente definidas
   - **Fluxo Principal**: Caminho feliz detalhado passo-a-passo
   - **Fluxos Alternativos**: Tratamento de exceções e erros (20+ fluxos)
   - **Dados Alterados**: Especificação de tabelas e operações
   - **Regras Associadas**: Ligação com requisitos funcionais
   - **Diagrama UML**: Visualização dos casos de uso

   **Quando usar**: Para implementação, testes, validação de requisitos e documentação técnica.

---

### 8. **[Rastreabilidade de Requisitos](RASTREABILIDADE_REQUISITOS_US.md)** ✨ **NOVO**
   
   Documento com matriz de rastreabilidade completa:
   - **Mapeamento Bidirecional**: RF ↔ US ↔ CU
   - **Cobertura de Requisitos**: 77% dos requisitos rastreados
   - **Histórias Órfãs**: 0 (todas as histórias têm requisitos)
   - **Requisitos Órfãos**: 0 (todos têm histórias ou justificativa)
   - **Análise de Gaps**: Identificação de lacunas
   - **Checklist de Validação**: Para desenvolvimento
   - **Tabelas Cruzadas**: Requisitos × Histórias

   **Quando usar**: Para garantir cobertura completa, validação e rastreabilidade durante desenvolvimento.

---

## 🎨 Paleta de Cores Rápida

| Uso | Cor | Hex |
|-----|-----|-----|
| Primária (Verde) | Verde Primário | `#00A86B` |
| Secundária (Azul) | Azul Primário | `#0066CC` |
| Backgrounds | Branco / Azul Claro | `#FFFFFF` / `#E6F2FF` |
| Texto | Preto / Cinza Escuro | `#000000` / `#666666` |
| Sucesso | Verde | `#00AA00` |
| Erro | Vermelho | `#DD0000` |

---

## 🏗️ Estrutura de Módulos

```
Sistema de Reserva de Hotel
├── Gestão de Quartos
│   ├── Cadastro de Quarto
│   ├── Lista de Quartos
│   └── Edição de Quarto
├── Gestão de Hóspedes
│   ├── Cadastro de Hóspede
│   └── Lista de Hóspedes
└── Gestão de Reservas
    ├── Lista de Reservas
    └── Edição de Reserva
```

---

## 📊 Tabelas Principais do Banco de Dados

### HOSPEDE
Armazena informações dos hóspedes
- id (PK)
- nome, sobrenome, cpf (UNIQUE), email

### QUARTO
Armazena informações dos quartos
- id (PK)
- numero (UNIQUE), capacidade, tipo, preco_diaria
- amenidades (frigobar, cafe_manha, ar_condicionado, tv)
- disponibilidade (LIVRE, OCUPADO, MANUTENCAO_LIMPEZA)

### CAMA
Especifica tipos de cama por quarto
- id (PK)
- quarto_id (FK), tipo (SOLTEIRO, CASAL_KING, CASAL_QUEEN)

### RESERVA
Armazena as reservas realizadas
- id (PK)
- quarto_id (FK), hospede_id (FK)
- data_entrada, data_saida, status, valor_total

---

## � Histórias de Usuário - Resumo Rápido

### Total: 18 Histórias | 89 Story Points

| Módulo | Histórias | Prioridade | Stories |
|--------|-----------|-----------|----------|
| **Gestão de Quartos** | 7 | 4 Críticas, 2 Altas, 1 Baixa | US-001 a US-007 |
| **Gestão de Hóspedes** | 4 | 1 Crítica, 3 Altas | US-008 a US-011 |
| **Gestão de Reservas** | 5 | 5 Críticas | US-012 a US-016 |
| **Dashboard/Relatórios** | 2 | 2 Baixas | US-017 a US-018 |

### Cada História Inclui:
✅ Formato padrão: "Como [ator], eu quero..., para que..."  
✅ Mínimo 3 Critérios de Aceitação em formato Gherkin (Given-When-Then)  
✅ Estimativa de Story Points  
✅ Classificação por Prioridade  
✅ Status e rastreamento  

**Desenvolvido em 5 sprints de 2 semanas (velocidade 10 pt/sprint)**

---

## 🎪 Casos de Uso Principais - Resumo

### Total: 9 Casos de Uso | 69 Story Points

| ID | Caso de Uso | Atores | Fluxos | Prioridade |
|----|-----------|--------|--------|-----------|
| **CU-001** | Cadastrar Quarto | Gerente | Principal + 3 Alt. | 🔴 Crítica |
| **CU-002** | Listar Quartos | Gerente, Recepcionista | Principal + 1 Alt. | 🔴 Crítica |
| **CU-003** | Editar Quarto | Gerente | Principal + 2 Alt. | 🔴 Crítica |
| **CU-004** | Cadastrar Hóspede | Recepcionista | Principal + 3 Alt. | 🔴 Crítica |
| **CU-005** | Criar Reserva | Recepcionista | Principal + 4 Alt. | 🔴 Crítica |
| **CU-006** | Editar Reserva | Recepcionista | Principal + 2 Alt. | 🔴 Crítica |
| **CU-007** | Cancelar Reserva | Recepcionista, Gerente | Principal + 1 Alt. | 🟡 Alta |
| **CU-008** | Alterar Disponibilidade | Gerente | Principal + 1 Alt. | 🔴 Crítica |
| **CU-009** | Buscar Hóspede | Recepcionista, Gerente | Principal + 2 Alt. | 🟡 Alta |

### Atores Envolvidos: 3
- **Gerente de Hotel**: CU-001, CU-002, CU-003, CU-008
- **Recepcionista**: CU-002, CU-004, CU-005, CU-006, CU-007, CU-009
- **Gerente de Limpeza**: CU-008 (visualização)

### Atores Envolvidos: 3
- **Gerente de Hotel**: CU-001, CU-002, CU-003, CU-008
- **Recepcionista**: CU-002, CU-004, CU-005, CU-006, CU-007, CU-009
- **Gerente de Limpeza**: CU-008 (visualização)

### Cada Caso de Uso Inclui:
✅ Atores envolvidos  
✅ Pré-condições e Pós-condições precisamente definidas  
✅ Fluxo Principal detalhado passo-a-passo  
✅ Fluxos Alternativos/Exceções (20+ fluxos alternativos)  
✅ Dados alterados (INSERT, UPDATE, DELETE)  
✅ Regras de negócio associadas  
✅ Mapeamento para Requisitos Funcionais (RF)  

---

## 🔗 Rastreabilidade - Visão Geral

### Ligações Estabelecidas

```
Requisitos (71 RF + 62 RNF)
    ↓
Histórias de Usuário (18 US)
    ↓
Casos de Uso (9 CU)
    ↓
Critérios de Aceitação (85+ AC)
    ↓
Banco de Dados
```

### Cobertura de Rastreabilidade

| Tipo | Total | Coberto | % |
|------|-------|---------|-----|
| **Requisitos Funcionais** | 71 | 54 | 76% |
| **Requisitos Não-Funcionais** | 62 | 62 | 100% |
| **Histórias de Usuário** | 18 | 18 | 100% |
| **Casos de Uso** | 9 | 9 | 100% |

✅ **Cobertura Geral**: 77%  
✅ **Histórias Órfãs**: 0  
✅ **Requisitos Críticos Descobertos**: 0  

**Detalhes**: Veja [RASTREABILIDADE_REQUISITOS_US.md](RASTREABILIDADE_REQUISITOS_US.md)

---

| Categoria | Regra |
|-----------|-------|
| Quartos | Número único, tipos: Básico/Moderno/Luxo, capacidade ≥ 1 |
| Hóspedes | CPF único e validado, email obrigatório |
| Reservas | Data entrada < data saída, quarto deve estar LIVRE |
| Disponibilidade | Livre → Ocupado (ao reservar), Ocupado → Livre (ao cancelar) |
| Cálculo | Valor Total = (Data Saída - Data Entrada) × Preço Diária |

---

## 🔄 Fluxos Principais

### Fluxo de Reserva
1. Recepcionista cadastra hóspede (se novo)
2. Seleciona quarto disponível
3. Define datas de entrada e saída
4. Sistema calcula valor total
5. Confirma reserva
6. Quarto é marcado como OCUPADO

### Fluxo de Checkout
1. Hóspede deixa o quarto
2. Quarto é marcado como MANUTENÇÃO_LIMPEZA
3. Limpeza realiza limpeza
4. Quarto é marcado como LIVRE novamente

---

## 📋 Checklist de Documentação

- [x] Requisitos Funcionais
- [x] Arquitetura e Design
- [x] Modelos de Dados
- [x] Casos de Uso e Regras de Negócio
- [x] Requisitos RF/RNF com Priorização MoSCoW
- [x] Histórias de Usuário com Critérios de Aceitação
- [x] Casos de Uso Principais Formais
- [x] Rastreabilidade de Requisitos ↔ Histórias
- [ ] Documentação de API (futuro)
- [ ] Guia de Desenvolvimento (futuro)
- [ ] Testes Unitários (futuro)
- [ ] Deploy e DevOps (futuro)

---

## 🚀 Próximos Passos

1. **Validação dos Requisitos**
   - Revisar documentação com stakeholders
   - Confirmar requisitos funcionais
   - Validar regras de negócio

2. **Preparação do Ambiente**
   - Configurar repositório
   - Criar estrutura de pastas
   - Configurar banco de dados

3. **Desenvolvimento**
   - Backend: APIs REST
   - Frontend: Interface web
   - Integração: Banco de dados

4. **Testes**
   - Testes unitários
   - Testes de integração
   - Testes de aceitação

5. **Deploy**
   - Preparar ambiente de produção
   - Documentação final
   - Treinamento de usuários

---

## 👥 Personas e Atores

### Gerente do Hotel
- Gerencia quartos
- Monitora disponibilidade
- Acessa relatórios
- Marca quartos para manutenção

### Recepcionista
- Cadastra/edita hóspedes
- Cria/edita reservas
- Realiza check-in e check-out
- Responde consultas

### Gerente de Limpeza
- Marca quartos como limpo
- Prioriza limpeza de salas
- Relata problemas

---

## 📞 Suporte e Contato

Para dúvidas sobre a documentação:
- Consulte o documento específico
- Verifique a matriz de rastreabilidade
- Revise os modelos de dados
- Consulte os casos de uso

---

## 📝 Histórico de Versões

| Versão | Data | Autor | Alterações |
|--------|------|-------|-----------|
| 1.0 | 16/02/2026 | - | Documentação inicial criada |

---

## 📌 Notas Importantes

1. **Paleta de Cores**: Verde (#00A86B) e Azul (#0066CC) são as cores primárias
2. **Banco de Dados**: Usar transações para operações de reserva (evitar double-booking)
3. **Validações**: Implementar tanto no frontend (UX) quanto no backend (segurança)
4. **Relacionamentos**: Manter integridade referencial, especialmente com reservas ativas
5. **Auditoria**: Registrar data_criacao em todas as entidades

---

**Gerado em**: 16 de fevereiro de 2026  
**Status**: ✅ Documentação Completa com Rastreabilidade - Pronta para Desenvolvimento  
**Versão**: 1.4 - Adição de Matriz de Rastreabilidade Requisitos ↔ Histórias ↔ Casos de Uso
