# 📊 Matriz RACI, Templates e Dashboard de Tracking

## 1. Matriz RACI - Responsabilidades por Sprint

### Legenda
- **R** = Responsible (Faz o trabalho)
- **A** = Accountable (Responde pelo resultado)
- **C** = Consulted (Opinião antes de decisão)
- **I** = Informed (Notificado após decisão)

### Responsabilidades por Tema

| Atividade | Dev1 | Dev2 | Tech Lead | PO | Infra |
|-----------|------|------|-----------|----|----|
| **Backend** | A/R | R | C | I | — |
| **Database/Migrations** | A | R | C | I | C |
| **API REST** | A/R | C | C | I | — |
| **Autenticação/Segurança** | A/R | C | C | I | C |
| **Frontend** | C | A/R | C | C | — |
| **Testes (Unit/E2E)** | R | A/R | C | I | — |
| **CI/CD Pipeline** | A/R | C | C | I | R |
| **DevOps/Deploy** | A/R | C | C | I | C/R |
| **Documentação** | A/R | A/R | — | I | I |
| **Code Review** | R | R | A | — | — |
| **Performance** | C | R | A | I | R |
| **Monitoring/Logs** | R | C | A | I | C/R |

---

## 2. Templates de Reunião

### 🌅 Daily Standup (09:30 - 09:45, 15 min)

**Template:**
```markdown
## Daily Standup - [DATA]

**Participantes:** Dev1, Dev2, Tech Lead

### 1️⃣ Dev1 - [Nome]
- ✅ Ontem: [Tarefa concluída]
- 🎯 Hoje: [Tarefa prioritária]
- 🚧 Bloqueador: [Descrever ou "nenhum"]
- SP completado: X/sprint

### 2️⃣ Dev2 - [Nome]
- ✅ Ontem: [Tarefa concluída]
- 🎯 Hoje: [Tarefa prioritária]
- 🚧 Bloqueador: [Descrever ou "nenhum"]
- SP completado: X/sprint

### 3️⃣ Tech Lead
- 📊 Burn-down status
- ⚠️ Riscos identificados
- 🔔 Atualizações importantes

### Next Actions
- [ ] Ação 1 (responsável)
- [ ] Ação 2 (responsável)
```

**Regras:**
- ⏱️ Máximo 15 minutos
- 📍 Se bloqueador, agendar 15 min de problema-solving após standup
- 📝 PO/Infra convocados se necessário para desbloqueio

---

### 📅 Sprint Planning (Primeira segunda, 10h - 12h, 2h)

**Agenda:**
```
1. Review de Capacidade (10 min)
   - Disponibilidade de cada dev
   - Dias de folga/reuniões agendadas
   - Velocidade estimada: X SP/sprint

2. Product Backlog Refinement (30 min)
   - PO apresenta top 10 itens do backlog
   - Tech Lead estima complexity
   - Esclarecimento de requisitos

3. Sprint Backlog Definition (60 min)
   - Dev1 + Dev2 selecionam itens até 40 SP
   - Quebram user stories em tasks técnicas
   - Definem dependências
   - Assignam tarefas (ou selves)

4. Commitment (10 min)
   - "Vamos começar com estas 40 SP?"
   - Todos concordam?
   - Sprint goal revisado

5. Q&A (10 min)
```

**Outputs:**
- Sprint Backlog no Jira/Linear
- Sprint goal definido (ex: "Backend de reservas 100% funcional")
- Capacity chart atualizado

---

### 🎬 Sprint Review (Última sexta, 14h - 15:30, 1.5h)

**Agenda:**
```
1. Sprint Summary (5 min)
   - SP completado vs planeado
   - Bugs achados vs fixados
   - Impedimentos resolvidos

2. Demo de Features (45 min)
   - Dev1 demonstra: Controllers, API, testes
   - Dev2 demonstra: Frontend, componentes
   - PO / stakeholders observam
   - Feedback coletado

3. Metrics Review (15 min)
   - Velocity chart
   - Cobertura de testes
   - Burn-down chart
   - Qualidade (bugs por sprint)

4. Feedback & Closing (20 min)
   - O que foi bem?
   - O que entregamos vs planejado?
   - Ajustes para próximo sprint
```

**Saídas:**
- Features aprovadas pelo PO
- Feedback note no Confluence
- Backlog refinado para próximo Planning

---

### 🔄 Sprint Retrospectiva (Última sexta, 15:30 - 16:30, 1h)

**Dinâmica: Start / Stop / Continue**

```markdown
## Retrospectivas Sprint [X]

### ✅ Continue (O que faz bem?)
- [ ] Daily standups curtos e eficientes
- [ ] Code reviews rápidos
- [ ] Testes rodando antes de merge

**Consenso:** Manter?
Vote: ___/5

### 🚀 Start (O que devemos começar?)
- [ ] Usar pair programming em tasks complexas
- [ ] Documentar decisões arquiteturais
- [ ] Revisar performance antes de PR

**Consenso:** Tentamos?
Vote: ___/5

### ⏹️ Stop (O que prejudica?)
- [ ] Meetings muito longos
- [ ] Distrações no Slack
- [ ] Deploy manual sem teste

**Consenso:** Paramos?
Vote: ___/5

### 🛠️ Action Items
- [ ] Ação 1 — Responsável: Dev1 — Prazo: próxima semana
- [ ] Ação 2 — Responsável: Dev2 — Prazo: próxima semana
- [ ] Ação 3 — Responsável: Tech Lead — Prazo: próxima sprint
```

**Tempo estimado:** 15 min (Start) + 15 min (Stop) + 15 min (Continue) + 15 min (Actions) = 1h

---

### 🚀 Refinement Session (Mid-sprint, 1h opcional)

**Para:** Esclarecer user stories da próxima sprint antes do Planning

```markdown
## Product Backlog Refinement - Sprint [X]+1

**Itens a refinar:** Top 5 do backlog

### HU 1: [Título]
- **Descrição atual:** ...
- **Questões:**
  - Precisa de integração com X?
  - Qual é o escopo de validação?
  
- **AC revisado:**
  - [ ] AC1
  - [ ] AC2
  
- **Estimativa rough:** X SP

### [... próximos itens ...]

**Output:** User stories prontas para Planning
```

---

## 3. Dashboard de Tracking

### 📊 Burn-down Chart Template (Sprint)

```
Sprint 1 Burn-down (40 SP)

40 |     ╱╲
36 |   ╱   ╲       ╱╲
32 | ╱       ╲   ╱   ╲
28 |         ╲╱       ╲
24 |                   ╲
20 |                    ╲
16 |                     ╲
12 |                      ╲
8  |                       ╲
4  |                        ●  ← Goal
0  |________________________●__
   M  T  W  T  F  M  T  W  T  F

Legenda:
─── Ideal burn (2 SP/dia)
╱╲╱ Real burn (com flutuações)
● Pontos finais

Status: On track / At risk / Off track
```

### 📈 Velocity Chart (6 Sprints)

```
SP / Sprint

45 │
42 │  ● ●
40 │  │ │       ●
38 │  │ │ ●     │
35 │  │ │ │ ●   │
   │  │ │ │ │   │ ●
   │  │ │ │ │   │ │
30 │  │ │ │ │   │ │
   └──┴─┴─┴─┴───┴─┴─
      1 2 3 4  5  6

Average Velocity: 39.5 SP/sprint
Trend: Stable ✓
```

### 📋 Health Check Dashboard (Semanal)

```
┌─────────────────────────────────────────────────┐
│ PROJECT HEALTH - Semana de [DATA]              │
├─────────────────────────────────────────────────┤
│ Status Geral:               🟢 ON TRACK        │
│                                                 │
│ Metric                   Current    Target      │
│ ─────────────────────────────────────────────── │
│ Sprint Velocity:         37/40 SP   40 SP      │
│ Burn-down:              48% done   50% done    │
│ Test Coverage:           62%        70% 🟡     │
│ Build Success:           95%        100% 🟡    │
│ Critical Bugs:           0          0 ✓        │
│ Impediments:             1          0 ⚠️       │
│ Team Morale:             7/10       8+ SP      │
│ Code Quality:            A-         A SP       │
└─────────────────────────────────────────────────┘

🟢 Green: On target
🟡 Yellow: Monitor closely
🔴 Red: Action needed

Impedimentos:
- [ ] [Descrição] — Dev1 — ETA: [data]
```

### 🎯 Release Checklist (Antes de cada sprint)

```markdown
## Pre-Sprint Release Checklist

### Code Quality
- [ ] Lint passing 100%
- [ ] Testes locais verdes
- [ ] Cobertura ≥ 70%
- [ ] Code review aprovado
- [ ] No TODOs críticos no código
- [ ] Documentação atualizada

### Performance
- [ ] Sem console errors em localhost
- [ ] Build time < 5 min
- [ ] Bundle size < 500KB (gzip)
- [ ] API response < 200ms (p95)

### Security
- [ ] Sem hardcoded secrets
- [ ] Validações de entrada OK
- [ ] SQL injection protegido
- [ ] XSS protection ativo

### DevOps
- [ ] .env template atualizado
- [ ] Migrations testadas
- [ ] Docker builds OK
- [ ] Health check endpoint pronto

### Documentation
- [ ] README atualizado
- [ ] API Swagger válido
- [ ] Architecture decision recorded
- [ ] Runbook pronto

### Sign-off
- [ ] Dev1: ___________
- [ ] Dev2: ___________  
- [ ] Tech Lead: ___________
```

---

## 4. Dashboard Jira/Linear Config

### Board View (Kanban)

```
┌──────────────┬──────────────┬──────────────┬──────────────┐
│   BACKLOG    │    TO DO     │  IN PROGRESS │     DONE     │
├──────────────┼──────────────┼──────────────┼──────────────┤
│ HU 2.5 (8pt) │ HU 1.1 (13pt)│ HU 1.2 (8pt) │ HU 1.0 (5pt) │
│ HU 3.1 (13pt)│ HU 1.3 (8pt) │ HU 1.4 (8pt) │ HU 1.0 (8pt) │
│              │ HU 1.5 (5pt) │              │              │
│              │              │  Dev1 ⟷ Dev2│              │
│              │              │              │              │
│ WIP Limit: — │ WIP Limit: 5 │ WIP Limit: 4 │ WIP Limit: — │
└──────────────┴──────────────┴──────────────┴──────────────┘
```

### Filtros Úteis

```
"assignee = Dev1 AND sprint = Sprint1" → Tarefas de Dev1
"type = Test AND status = In Progress" → Testes em andamento
"priority = Critical AND status != Done" → Bloqueadores
"created >= -1w" → Issues criadas esta semana
```

### Reports Automáticos

- **Sprint Report:** Velocity, completed vs planned, burn-down
- **Velocity Trend:** 6 sprints últimos
- **Cycle Time:** Tempo médio issue está em IN PROGRESS
- **Defect Density:** Bugs por sprint

---

## 5. Monitoramento de Riscos

### Risk Register

| # | Risco | Prob | Impact | Mitigation | Owner | Status |
|---|-------|------|--------|-----------|-------|--------|
| **R001** | BD performance ruim | 30% | Alto | Index strategy + load test Sprint 3 | Dev1 | 🟢 |
| **R002** | Req muda Sprint 3+ | 40% | Médio | Feature freeze após Sprint 2 | PO | 🟡 |
| **R003** | Falta designer | 20% | Médio | Template Tailwind + hiring | PO | 🟡 |
| **R004** | Deploy fail | 60% | Médio | Rollback automation + testing | Dev1 | 🟢 |
| **R005** | Sair dev em meio | 10% | Crítico | Documentação contínua + backup dev | Tech Lead | 🟢 |

---

## 6. Comunicação Escalada

### When Things Go Wrong

**Bloqueador Técnico:**
```
1. Identificado em daily standup
2. Tech Lead + Dev1 + Dev2 → 30 min problem-solving
3. Se não resolvido → PO informado + prioridade escalada
4. Impacto no sprint? → Retrospectiva dedicada
```

**Atraso de Sprint ≥ 20%:**
```
1. Detectado em day 5 burn-down
2. Tech Lead avalia: continuar ou ajustar scope?
3. Se ajuste: qual tarefa vira backlog?
4. PO aprova decisão
5. Comunicado no daily standup
```

**Bug Crítico em Staging:**
```
1. Prioridade P1 → Tira dev do sprint task
2. Hotfix branch criada
3. Code review expedito
4. Deploy para staging imediato
5. If regressão: rollback automático
```

**Mudança de Requisito Mid-Sprint:**
```
1. PO submete como Change Request
2. Tech Lead estima esforço + impacto
3. Se < 5 SP: absorve no sprint
4. Se ≥ 5 SP: entra no backlog (próxima sprint)
5. PO aprova priorização
```

---

## 7. Post-Mortem Template (Incidentes Produção)

```markdown
## Post-Mortem - [Incidente XYZ] - [Data/Hora]

### Timeline
- **14:32** — Alerta: API 500 errors 10%
- **14:35** — Detectado: database connection leak
- **14:40** — Hotfix aplicado: query optimization
- **14:45** — Deploy em staging ✓
- **14:50** — Deploy em produção ✓
- **14:55** — Erro normalizado, monitoring OK

### Root Cause
- Connection pool default (10) era insuficiente para load
- Lack of load test before release

### Impact
- 12 minutos downtime
- ~150 usuários afetados
- ~30 reservas não salvas (retried ok)

### Action Items
- [ ] Aumentar connection pool para 50 — Dev1 — Sprint 6
- [ ] Load test em staging pré-deploy — Dev1 — Sprint 5

### Prevention
- ✅ Adicionar alertas de connection pool
- ✅ Runbook de rollback documentado
- ✅ On-call rotation iniciado
```

---

## 8. Success Criteria Realtime

### Macro Metrics (Project Level)
```
ON TRACK quando:
✅ Velocity = 37-42 SP/sprint (within 5% variance)
✅ Burn-down semanal 90%-100% of ideal
✅ Test coverage ≥ 70%
✅ Zero P1 bugs em produção
✅ Build time < 5 minutos
✅ API latency p95 < 200ms
```

### Micro Metrics (Per Task)
```
HU completa quando:
✅ Código reviewed e merged
✅ Testes 100% passando (local + CI)
✅ Documentação atualizada
✅ QA signed off
✅ PM/PO aceitou em sprint review
```

---

## 9. Lessons Learned Log

```markdown
## Lessons Learned - Sprint X

**What went well:**
- Daily standups short e focused
- Pair programming resolveu 2 blockers

**What could improve:**
- Estimativas pessimistas (real: 35h vs 40h)
- PRs levaram 1-2 dias de review
- Faltou teste de DB migration rollback

**Actions for next sprint:**
- [ ] Implementar PR template + auto-lint
- [ ] Documentar estratégia de rollback
- [ ] Melhorar estimativa com retrospectiva histórica

**Metrics delta:**
- Velocity: 37 → 42 SP (+13%)
- Bugs: 5 → 2 (-60%)
- Coverage: 58% → 62% (+7%)
```

---

**Versão:** 1.0 | **Última atualização:** 19 fev 2026
