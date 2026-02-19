# 📅 Cronograma Visual e Backlog Detalhado

## Gantt Chart - Visão Geral do Projeto

```
Atividade                    Fev  |  Mar  |  Abr  |  Mai
                             W1W2 | W1W2W3W4 | W1W2W3W4 | W1W2W3
─────────────────────────────────────────────────────────────────────
Sprint 1: Backend            [████████] 
Sprint 2: API + Auth                 [████████]
Sprint 3: Testes + CI                      [████████]
Sprint 4: Frontend Base                         [████████]
Sprint 5: Frontend Features                          [████████]
Sprint 6: Deploy + Prod                                   [██████]

Milestones:
M1: Backend Sólido           [✓ 4 mar]
M2: API REST                       [✓ 18 mar]
M3: Qualidade                           [✓ 1 abr]
M4: Frontend Base                          [✓ 15 abr]
M5: MVP Completo                              [✓ 29 abr]
M6: Produção                                       [✓ 13 mai]
```

---

## Product Backlog Executivo

### Epics
1. **Epic 1: Backend Robusto** (237 SP total)
   - Arquitetura DDD, repositórios, testes, logging

2. **Epic 2: API REST Segura** (42 SP)
   - Endpoints, autenticação JWT, validação, Swagger

3. **Epic 3: Testes Completos** (38 SP)
   - Unit, integração, E2E, CI/CD pipeline

4. **Epic 4: Frontend Intuitivo** (82 SP)
   - Interface, autenticação, CRUD, componentes

5. **Epic 5: Operações em Produção** (35 SP)
   - Docker, deploy, monitoramento, documentação

---

## Sprint 1: Consolidação do Backend (19 fev - 4 mar) — **40 SP | 160h**

### Histórias de Usuário

#### **HU 1.1.1** — Implementar RepositórioQuarto com PostgreSQL
**Como** desenvolvedor  
**Quero** um repositório que persista quartos em PostgreSQL  
**Para que** os dados de quartos sejam durável e consultáveis  

**Critério de Aceitação:**
- [ ] Classe `PostgresQuartoRepository` implementa `IQuartoRepository`
- [ ] Métodos `save()`, `findById()`, `findByNumero()`, `findAll()`, `update()`, `delete()` funcionam
- [ ] Tratamento de erros com `NotFoundException`
- [ ] Testes unitários com banco isolado (testcontainers)

**Tarefas Técnicas:**
```
1. Criar migration para tabela `quartos`
2. Mapear entidade Quarto ↔ schema SQL
3. Implementar CRUD no repositório
4. Testes unitários (fixtures, mocks)
5. Validação de índices e constraints
```

**Story Points:** 13 | **Horas:** 40 | **Responsável:** Dev1 | **Prioridade:** 🔴 Critical

---

#### **HU 1.1.2** — Implementar RepositórioHospede com PostgreSQL
**Como** desenvolvedor  
**Quero** um repositório de hóspedes persistente  
**Para que** hóspedes sejam registrados e consultáveis  

**Critério de Aceitação:**
- [ ] Classe `PostgresHospedeRepository` implementa `IHospedeRepository`
- [ ] Validação de CPF/email únicos no banco
- [ ] Métodos `findByCpf()`, `findByEmail()` funcionam
- [ ] Testes com conflitos de unicidade

**Story Points:** 8 | **Horas:** 25 | **Responsável:** Dev1 | **Prioridade:** 🔴 Critical

---

#### **HU 1.1.3** — Implementar RepositórioReserva com PostgreSQL
**Como** desenvolvedor  
**Quero** um repositório de reservas em BD  
**Para que** reservas sejam persistidas com relacionamento Quarto-Hospede  

**Critério de Aceitação:**
- [ ] Classe `PostgresReservaRepository` implementa `IReservaRepository`
- [ ] Relacionamentos de FK (quarto_id, hospede_id)
- [ ] Métodos `findByQuartoId()`, `findByHospedeId()` funcionam
- [ ] Testes de integridade referencial

**Story Points:** 8 | **Horas:** 25 | **Responsável:** Dev2 | **Prioridade:** 🔴 Critical

---

#### **HU 1.2.1** — Criar Migrations e Seeders de Dados
**Como** desenvolvedor  
**Quero** migrar schema do zero e popular dados de teste  
**Para que** tenha base de dados consistente em todos os ambientes  

**Tarefas:**
```
- Migration 001: Tabela quartos
- Migration 002: Tabela hospedes
- Migration 003: Tabela reservas
- Seeder: 10 quartos, 5 hóspedes, 3 reservas de exemplo
- Script de rollback testado
```

**Story Points:** 8 | **Horas:** 25 | **Responsável:** Dev2 | **Prioridade:** 🔴 Critical

---

#### **HU 1.3.1** — Testes Unitários de Entidades
**Como** QA  
**Quero** garantir que entidades validam regras de negócio  
**Para que** bugs sejam detectados cedo  

**Spec de testes:**
```
Quarto:
  ✓ validarDados() rejeita preço ≤ 0
  ✓ adicionarCama() respeita capacidade
  ✓ alterarStatus() bloqueia OCUPADO → LIVRE

Hospede:
  ✓ validarCPF() rejeita < 11 dígitos
  ✓ validarEmail() rejeita formato inválido
  ✓ validarNomes() rejeita nomes vazios

Reserva:
  ✓ validarDatas() rejeita entrada ≥ saída
  ✓ calcularValor() usa estratégia correta
```

**Story Points:** 8 | **Horas:** 30 | **Responsável:** Dev2 | **Prioridade:** 🟡 High

---

#### **HU 1.3.2** — Testes de Serviços
**Como** QA  
**Quero** validar que serviços orquestram corretamente repositórios e entidades  
**Para que** fluxos de negócio funcionem  

**Scenarios:**
```
QuartoService.cadastrar():
  ✓ Rejeita quarto duplicado
  ✓ Cria quarto com camas
  ✓ Retorna DTO correto

HospedeService.cadastrar():
  ✓ Rejeita CPF duplicado
  ✓ Valida dados de entrada
  ✓ Persiste e retorna DTO

ReservaService.criar():
  ✓ Verifica disponibilidade do quarto
  ✓ Calcula valor com pricing strategy
  ✓ Atualiza status do quarto
```

**Story Points:** 8 | **Horas:** 30 | **Responsável:** Dev1 | **Prioridade:** 🟡 High

---

#### **HU 1.5.1** — Implementar Logging Estruturado
**Como** DevOps  
**Quero** logs estruturados em JSON com níveis (debug, info, warn, error)  
**Para que** diagnóstico de problemas em produção seja rápido  

**Stack sugerido:**
```typescript
// Winston ou Pino
logger.info('Quarto criado', { quartoId, numero });
logger.error('Erro ao criar quarto', { error, numero });
```

**Story Points:** 5 | **Horas:** 15 | **Responsável:** Dev1 | **Prioridade:** 🟡 High

---

#### **HU 1.6.1** — Validações em Nível de DTO
**Como** desenvolvedor  
**Quero** validar entrada em DTOs antes de chegar à entidade  
**Para que** evite erros de tipo e entrada inválida  

**Implementação:**
```typescript
// Usar class-validator (decoradores)
class CreateQuartoRequest {
  @IsNumber() numero: number;
  @Min(1) capacidade: number;
  @IsEnum(TipoQuarto) tipo: TipoQuarto;
  // ...
}
```

**Story Points:** 3 | **Horas:** 10 | **Responsável:** Dev2 | **Prioridade:** 🟡 Medium

---

**Sprint 1 Summary:**
- ✅ 3 repositórios em BD (Postgres) funcionando
- ✅ Migrations + seeders
- ✅ 60+ testes unitários e serviços
- ✅ Logging estruturado
- ✅ DTOs com validação
- **Entrega:** Code pronto para API em Sprint 2

---

## Sprint 2: API REST + Autenticação (5 mar - 18 mar) — **42 SP | 168h**

### Histórias Selecionadas

#### **HU 2.2.1** — Controllers e Rotas para Quarto
- CRUD endpoints: `POST /quartos`, `GET /quartos/:id`, `PATCH /quartos/:id`, `DELETE /quartos/:id`
- Validação e tratamento de erros
- **SP:** 8 | **Horas:** 30 | **Responsável:** Dev1

#### **HU 2.5.1** — Autenticação JWT
- Endpoint `POST /auth/login`
- Geração de access token + refresh token
- Middleware de autenticação
- **SP:** 8 | **Horas:** 30 | **Responsável:** Dev1

#### **HU 2.7.1** — Swagger/OpenAPI
- Documentação automática de endpoints
- Schemas de request/response
- **SP:** 3 | **Horas:** 12 | **Responsável:** Dev1

---

## Sprint 3: Testes + CI/CD (19 mar - 1 abr) — **38 SP | 152h**

#### **HU 3.1.1** — Testes E2E Fluxos Críticos
```
Cenário 1: Criar quarto → Criar hóspede → Criar reserva
  Given: BD limpo
  When: Executo criar quarto, hospede, reserva
  Then: Reserva criada com valor calculado correto
  And: Status de quarto é OCUPADO

Cenário 2: Tentar reservar quarto já reservado
  Given: Quarto com reserva ativa
  When: Tenta criar outra reserva no mesmo período
  Then: Erro ConflictException "Quarto já reservado"
```

**SP:** 13 | **Horas:** 50 | **Responsável:** Dev1

#### **HU 3.3.1** — CI Pipeline
- GitHub Actions workflow
- Stages: lint → build → test → coverage report
- Falha se cobertura < 70%
- **SP:** 8 | **Horas:** 30 | **Responsável:** Dev1

---

## Sprint 4: Frontend Base (2 abr - 15 abr) — **40 SP | 160h**

#### **HU 4.1.1** — Setup Projeto React/Vite
- Vite config (fast refresh, build otimizado)
- Tailwind CSS + componentes base
- **SP:** 5 | **Horas:** 15 | **Responsável:** Dev2

#### **HU 4.4.1** — Autenticação Frontend
- Tela de login
- Token storage (localStorage seguro)
- Redirect não-autenticado
- **SP:** 8 | **Horas:** 35 | **Responsável:** Dev1

---

## Sprint 5: Frontend Features (16 abr - 29 abr) — **42 SP | 168h**

#### **HU 5.1.1** — Tela de Quartos (Listagem + CRUD)
- Tabela com filtros (tipo, status, preço)
- Botões criar/editar/deletar
- Confirmação de ações críticas
- **SP:** 8 | **Horas:** 32 | **Responsável:** Dev2

#### **HU 5.4.1** — Tela de Reservas (Criar + Validar)
- Date picker integrado
- Verificar disponibilidade em tempo real
- Cálculo de valor ao lado
- **SP:** 10 | **Horas:** 40 | **Responsável:** Dev1

---

## Sprint 6: Deploy + Prod (30 abr - 13 mai) — **35 SP | 140h**

#### **HU 6.1.1** — Dockerizar Backend
```dockerfile
FROM node:20-alpine
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build
CMD ["npm", "start"]
```

**SP:** 8 | **Horas:** 30 | **Responsável:** Dev1

#### **HU 6.3.1** — Deploy em Staging
- EC2/Railway/Render setup
- Environment variables (.env)
- Database migrations em staging
- **SP:** 8 | **Horas:** 30 | **Responsável:** Dev1

#### **HU 6.4.1** — Monitoramento
- DataDog/New Relic integration
- Alertas para errors e performance
- Dashboard custom
- **SP:** 8 | **Horas:** 25 | **Responsável:** Dev1

---

## 📊 Resumo por Tipo de Tarefa

| Tipo | Sprint 1 | Sprint 2 | Sprint 3 | Sprint 4 | Sprint 5 | Sprint 6 | **Total** |
|------|----------|----------|----------|----------|----------|----------|----------|
| **Backend/API** | 40 | 34 | 8 | — | — | — | 82 SP |
| **Testes** | 16 | 5 | 30 | 3 | 8 | — | 62 SP |
| **Frontend** | — | — | — | 40 | 34 | — | 74 SP |
| **DevOps** | — | 3 | — | — | — | 35 | 38 SP |
| **Documentação** | 2 | 3 | — | — | — | 3 | 8 SP |
| **TOTAL** | **40** | **42** | **38** | **40** | **42** | **35** | **237 SP** |

---

## ⚠️ Roadblocks Esperados e Mitigação

| Roadblock | Chance | Impacto | Plano B |
|-----------|--------|--------|---------|
| Banco de dados com performance ruim | 30% | Alto | Usar índices desde dia 1; load tests em Sprint 3 |
| Requisito mudança no meio | 40% | Médio | Congelar features após Sprint 2; usar change request |
| Falta de designer para UI | 20% | Médio | Usar template Tailwind existente; hire contratado |
| Bug em produção pós-deploy | 60% (esperado) | Médio | Rollback strategy + hotfix procedure pronto |

---

## 📋 Checklist de Gate para Cada Sprint

### Gate Sprint 1 → 2
- [ ] Todos os repositórios implementados e testados
- [ ] 70%+ cobertura de testes no backend
- [ ] Migrations testadas em ambiente limpo
- [ ] Documentação de arquitectura atualizada
- [ ] Zero bloqueadores conhecidos

### Gate Sprint 2 → 3
- [ ] 100% endpoints funcionando
- [ ] Autenticação testada (happy path + error cases)
- [ ] Swagger atualizado e valido
- [ ] API testável com Postman/Insomnia
- [ ] Zero security issues conhecidas

### Gate Sprint 3 → 4
- [ ] Cobertura ≥ 70%
- [ ] CI pipeline verde em todas as branches
- [ ] E2E testes críticos passando
- [ ] Lint/format configurado e automático
- [ ] Backend pronto para freeze de features

### Gate Sprint 4 → 5
- [ ] Frontend compila sem warning críticos
- [ ] Autenticação funciona end-to-end
- [ ] Layout responsivo testado (mobile/tablet/desktop)
- [ ] Componentes reutilizáveis e documentados
- [ ] API integration testada

### Gate Sprint 5 → 6
- [ ] Todas as telas CRUD funcionando
- [ ] E2E testes do frontend passando
- [ ] Zero console errors/warnings em prod build
- [ ] Performance (Lighthouse ≥ 80)
- [ ] Feature freeze: apenas bugs de Sprint 6

### Gate Produção (Sprint 6)
- [ ] Staging 100% funcional, 24h estável
- [ ] Load test ≥ 500 concurrent users OK
- [ ] Security audit passado
- [ ] Runbook de incidentes pronto
- [ ] Backup/rollback strategy testada
- [ ] Team treinado no runbook

---

## 🎯 Success Metrics (Heatmap)

```
Sprint Saúde:     1    2    3    4    5    6
Velocity         40   42   38   40   42   35  ← consistente
Bugs Found        2    5   15    8    3    2
Bugs Fixed       100%  80% 100%  90%  100% 100%
Cobertura Tests  45%  55%  72%  75%  78%  80%
Performance OK   ✓    ✓    ✓    ✓    ✓    ✓
```

---

**Versão:** 1.1 | **Última atualização:** 19 fev 2026
