# 📋 Plano de Projeto - Sistema Hoteleiro

**Data de início:** 19 de fevereiro de 2026  
**Data de conclusão prevista:** 18 de maio de 2026  
**Duração total:** 13 semanas (6 sprints + 1 semana buffer)  
**Equipe:** 2 desenvolvedores Full-Stack  

---

## 1. Visão do Projeto

Desenvolver um **sistema completo de gerenciamento hoteleiro** com arquitetura limpa (DDD), API REST, banco de dados e interface web responsiva. Sistema deve ser escalável, testável e pronto para produção.

### Objetivos principais
- ✅ Backend com arquitetura DDD (Domain-Driven Design)
- ✅ API REST com documentação OpenAPI
- ✅ Banco de dados PostgreSQL
- ✅ Frontend web responsivo
- ✅ Autenticação e autorização
- ✅ Testes automatizados (unit, integração, E2E)
- ✅ CI/CD pipeline completo
- ✅ Documentação técnica e de usuário

---

## 2. Roadmap em Sprints

### **Sprint 1: Consolidação do Backend (19 fev - 4 mar)**
**Objetivo:** Finalizar arquitetura do backend, repositórios em BD e testes unit.  
**Capacidade:** 40 story points | ~160 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 1.1 | Implementar repositórios PostgreSQL (Quarto, Hospede, Reserva) | 13 | 40 | Dev1 | 🟡 |
| 1.2 | Criar migrations e seeders de dados | 8 | 25 | Dev2 | 🟡 |
| 1.3 | Testes unitários: Entidades (Quarto, Hospede, Reserva) | 8 | 30 | Dev2 | 🟡 |
| 1.4 | Testes de serviços (QuartoService, HospedeService, ReservaService) | 8 | 30 | Dev1 | 🟡 |
| 1.5 | Implementar logging estruturado (Winston/Pino) | 5 | 15 | Dev1 | 🟡 |
| 1.6 | Validações em nível de DTO | 3 | 10 | Dev2 | 🟡 |
| 1.7 | Documentação de arquitetura backend | 2 | 10 | Dev1 | 🟡 |

**Dependências:** Nenhuma (pode iniciar imediatamente)  
**Riscos:** Complexidade de migrations com dados relacionados → Mitigar com script SQL robusto  
**Entrega:** Repositórios + batch tests + logging funcional

---

### **Sprint 2: API REST + Autenticação (5 mar - 18 mar)**
**Objetivo:** Criar API REST com Express/NestJS, autenticação JWT, validação.  
**Capacidade:** 42 story points | ~168 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 2.1 | Configurar servidor Express/NestJS | 5 | 15 | Dev1 | 🟡 |
| 2.2 | Criar controllers e rotas para Quarto | 8 | 30 | Dev1 | 🟡 |
| 2.3 | Criar controllers e rotas para Hospede | 8 | 30 | Dev2 | 🟡 |
| 2.4 | Criar controllers e rotas para Reserva | 8 | 30 | Dev2 | 🟡 |
| 2.5 | Implementar autenticação JWT | 8 | 30 | Dev1 | 🟡 |
| 2.6 | Testes de integração de controllers | 5 | 15 | Dev2 | 🟡 |
| 2.7 | Documentação OpenAPI/Swagger | 3 | 12 | Dev1 | 🟡 |
| 2.8 | Tratamento de erros e respostas padronizadas | 2 | 8 | Dev1 | 🟡 |

**Dependências:** Sprint 1 (repositórios + serviços)  
**Riscos:** Validação inconsistente entre DTOs e controllers → Criar decorator reutilizável  
**Entrega:** API funcional com autenticação e Swagger

---

### **Sprint 3: Testes de Integração + Qualidade (19 mar - 1 abr)**
**Objetivo:** Aumentar cobertura de testes, integração E2E, CI pipeline.  
**Capacidade:** 38 story points | ~152 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 3.1 | Testes E2E de fluxos críticos (criar quarto, criar hospede, criar reserva) | 13 | 50 | Dev1 | 🟡 |
| 3.2 | Testes de disponibilidade de quartos (overlap de datas) | 8 | 30 | Dev2 | 🟡 |
| 3.3 | Configurar CI/GitHub Actions (build + test + lint) | 8 | 30 | Dev1 | 🟡 |
| 3.4 | ESLint + Prettier + pre-commit hooks | 5 | 12 | Dev2 | 🟡 |
| 3.5 | Cobertura de testes mínimo 70% | 3 | 15 | Dev2 | 🟡 |
| 3.6 | Documentação de testes | 2 | 8 | Dev1 | 🟡 |

**Dependências:** Sprint 2 (API completa)  
**Riscos:** Testes flaky com BD → Usar testcontainers ou banco isolado  
**Entrega:** 70%+ cobertura, CI pipeline ativo

---

### **Sprint 4: Frontend - Estrutura Base (2 abr - 15 abr)**
**Objetivo:** Criar interface web com React/Vue, componentes reutilizáveis, integração com API.  
**Capacidade:** 40 story points | ~160 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 4.1 | Setup projeto React com Vite (ou Next.js) | 5 | 15 | Dev2 | 🟡 |
| 4.2 | Criar layout base (navbar, sidebar, footer) | 8 | 30 | Dev2 | 🟡 |
| 4.3 | Criar serviço HTTP (axios/fetch wrapper) com interceptadores | 8 | 25 | Dev1 | 🟡 |
| 4.4 | Implementar autenticação (login, logout, token storage) | 8 | 35 | Dev1 | 🟡 |
| 4.5 | Criar componentes reutilizáveis (Form, Table, Modal, Card) | 8 | 40 | Dev2 | 🟡 |
| 4.6 | Testes de componentes (vitest/Jest) | 3 | 15 | Dev1 | 🟡 |

**Dependências:** Sprint 2 (API com autenticação)  
**Riscos:** Conflitos de estado → Usar Zustand/Redux conforme crescimento  
**Entrega:** Layout funcional + autenticação no frontend

---

### **Sprint 5: Frontend - Funcionalidades Principais (16 abr - 29 abr)**
**Objetivo:** Telas de gerenciamento de quartos, hóspedes e reservas.  
**Capacidade:** 42 story points | ~168 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 5.1 | Tela de listagem de quartos com filtros/busca | 8 | 30 | Dev2 | 🟡 |
| 5.2 | Tela de criar/editar quarto | 8 | 32 | Dev2 | 🟡 |
| 5.3 | Tela de listagem e gerenciamento de hóspedes | 8 | 30 | Dev1 | 🟡 |
| 5.4 | Tela de criar/editar reserva (date picker, validação) | 10 | 40 | Dev1 | 🟡 |
| 5.5 | Tela de visualizar disponibilidade de quartos | 5 | 20 | Dev2 | 🟡 |
| 5.6 | Testes E2E do frontend (Cypress/Playwright) | 8 | 30 | Dev1 | 🟡 |

**Dependências:** Sprint 4 (estrutura base + serviço HTTP)  
**Riscos:** UI/UX inconsistente → Usar design system (Tailwind/Material UI)  
**Entrega:** Todas as telas de CRUD funcionais

---

### **Sprint 6: Deploy, Monitoramento + Polish (30 abr - 13 mai)**
**Objetivo:** Containerização, deploy, monitoramento e ajustes finais.  
**Capacidade:** 35 story points | ~140 horas

| # | Tarefa | SP | Horas | Responsável | Status |
|---|--------|----|----|---|--------|
| 6.1 | Dockerizar backend (Dockerfile + docker-compose) | 8 | 30 | Dev1 | 🟡 |
| 6.2 | Dockerizar frontend | 5 | 15 | Dev2 | 🟡 |
| 6.3 | Deploy em staging (EC2/Heroku/Railway) | 8 | 30 | Dev1 | 🟡 |
| 6.4 | Configurar logging e monitoramento (DataDog/New Relic) | 8 | 25 | Dev1 | 🟡 |
| 6.5 | Testes de carga e performance | 5 | 20 | Dev2 | 🟡 |
| 6.6 | Documentação final (README, setup, API docs) | 3 | 12 | Dev1 | 🟡 |
| 6.7 | Bug fixes e polish final | 5 | 20 | Dev2 | 🟡 |

**Dependências:** Sprint 5 (frontend completo)  
**Riscos:** Problema de performance em produção → Load tests antecipados  
**Entrega:** Sistema em staging pronto para produção

---

## 3. Estimativas de Esforço Resumidas

### Por Sprint
| Sprint | Descrição | Story Points | Horas | Duração |
|--------|-----------|--------------|-------|---------|
| **1** | Consolidação Backend | 40 | 160 | 2 sem |
| **2** | API REST + Auth | 42 | 168 | 2 sem |
| **3** | Testes + CI | 38 | 152 | 2 sem |
| **4** | Frontend Base | 40 | 160 | 2 sem |
| **5** | Frontend Features | 42 | 168 | 2 sem |
| **6** | Deploy + Monitoramento | 35 | 140 | 2 sem |
| **TOTAL** | | **237 SP** | **988 h** | **13 sem** |

### Burn-down Estimado
```
Semana 1-2 (Sprint 1):   200/988 h (~20%)  - Backend
Semana 3-4 (Sprint 2):   368/988 h (~37%)  - API
Semana 5-6 (Sprint 3):   520/988 h (~53%)  - Testes
Semana 7-8 (Sprint 4):   680/988 h (~69%)  - Frontend Base
Semana 9-10 (Sprint 5):  848/988 h (~86%)  - Frontend Features
Semana 11-13 (Sprint 6): 988/988 h (100%)  - Deploy
```

---

## 4. Alocação de Recursos

### Equipe
- **Dev1:** Full-Stack (Backend + DevOps/Deploy) — 160h/sprint  
- **Dev2:** Full-Stack (Backend + Frontend) — 160h/sprint  
- **Total:** 320h/sprint | ~40h/semana por pessoa

### Overhead
- Daily standup: 15 min/dia × 5 dias = ~1.25h/sem
- Retrospectiva + Planning: ~3h/sem
- Documentação + Code Review: ~2h/sem
- **Total overhead:** ~6.25h/sem (~10% do tempo)

**Tempo efetivo de desenvolvimento:** 320 - 6.25 ≈ **314h/sprint efetivo**

---

## 5. Dependências e Causas de Bloqueio

### Dependências Críticas
1. **Sprint 1 → 2:** Repositórios + Serviços devem estar testados e validados
2. **Sprint 2 → 3:** API deve estar funcional para testes E2E
3. **Sprint 2 → 4:** Endpoints da API devem estar documentados (Swagger)
4. **Sprint 4 → 5:** Componentes base devem ser reutilizáveis
5. **Sprint 5 → 6:** Features devem estar completas antes de deploy

### Riscos Potenciais e Mitigação

| Risco | Probabilidade | Impacto | Mitigação |
|-------|---------------|--------|-----------|
| Problemas com BD (migrations, performance) | **Alta** | Alto | Testar migrations em ambiente similar; índices desde início |
| Timeline insuficiente para testes | **Média** | Alto | Iniciar testes paralelos desde Sprint 1 |
| Mudanças de requirement | **Média** | Médio | Freezing de features após Sprint 2 |
| Performance em produção | **Baixa** | Alto | Load tests em Sprint 3; otimização contínua |
| Rotatividade de equipe | **Baixa** | Crítico | Documentação contínua; pair programming |

---

## 6. Métricas de Sucesso

### Técnicas
- ✅ **Cobertura de testes:** ≥ 70% (backend) + 50% (frontend)
- ✅ **Tempo de resposta API:** < 200ms (p95)
- ✅ **Disponibilidade:** 99.5% em staging
- ✅ **Build time:** < 5min
- ✅ **Zero production bugs** por 1 semana pós-launch

### Funcionais
- ✅ **Fluxos core:** CRUD de quartos, hóspedes, reservas testados E2E
- ✅ **Validações:** Não permitir sobreposição de reservas
- ✅ **Autenticação:** JWT com refresh token funcional
- ✅ **Documentação:** 100% APIs, arquitetura, setup

### Negócio
- ✅ **Entrega no prazo:** 13 de maio de 2026
- ✅ **Escalabilidade:** Suportar 1000+ usuários simultâneos
- ✅ **Usabilidade:** Feedback positivo de testes com usuário (se aplicável)

---

## 7. Milestones e Datas-Chave

| Data | Milestone | Critério de Aceitação |
|------|-----------|----------------------|
| **4 mar** | **M1: Backend Sólido** | Testes unit + repositórios BD funcionando |
| **18 mar** | **M2: API REST** | 100% dos endpoints funcionando com Swagger |
| **1 abr** | **M3: Qualidade** | CI pipeline ativo, 70%+ cobertura |
| **15 abr** | **M4: Frontend Base** | Login funcional, layout responsivo |
| **29 abr** | **M5: MVP Completo** | Todas as telas CRUD funcionando |
| **13 mai** | **M6: Produção** | Sistema em staging, pronto para handoff |

---

## 8. Comunicação e Governance

### Reuniões
- **Daily standup:** Segunda-sexta, 09:30 (15 min)
- **Sprint Planning:** Primeira segunda de cada sprint (2h)
- **Sprint Review:** Última sexta de cada sprint (1.5h)
- **Retrospectiva:** Última sexta de cada sprint (1h)

### Artefatos
- **Product Backlog:** Jira/Linear (priorizado by PO)
- **Sprint Backlog:** Atualizado diariamente
- **Burn-down chart:** Visível no dashboard
- **Documentação:** Confluence/Wiki para decisões arquiteturais

### Escalonamento
- **Issues técnicas:** Discussão na retrospectiva + spike task se necessário
- **Delays:** Comunicação imediata; ajuste do roadmap se > 1 sprint
- **Go/No-Go para produção:** Decision point em M6; se não passar, rollback para staging

---

## 9. Pós-Projeto (Roadmap 2)

Funcionalidades para futuro (não incluídas neste plano):
- Sistema de pagamento (Stripe/PagSeguro)
- Notificações por email/SMS
- App mobile (React Native)
- Relatórios e BI (Power BI/Tableau)
- Multi-tenant (diferentes hotéis)
- Integração com OTAs (Booking.com, Airbnb)

---

## 10. Assinaturas

| Papel | Nome | Data | Assinatura |
|-------|------|------|-----------|
| Tech Lead | ___________ | 19 fev 2026 | ____________ |
| Product Owner | ___________ | 19 fev 2026 | ____________ |
| Dev1 | ___________ | 19 fev 2026 | ____________ |
| Dev2 | ___________ | 19 fev 2026 | ____________ |

---

## Anexo A: Convenções de Estimativa

**Story Points (Fibonacci):** 1, 2, 3, 5, 8, 13, 21  
**Conversão para horas:** 1 SP ≈ 4h; 8 SP ≈ 30h; 13 SP ≈ 50h (varia por complexidade)

**Categorias de complexidade:**
- **Simples (1-3 SP, < 10h):** Tarefa com pouca incógnita, reutiliza padrões existentes
- **Médio (5-8 SP, 20-35h):** Requer integração, novos padrões ou learning curve moderado
- **Complexo (13+ SP, 40h+):** Inovação, múltiplas dependências, high-risk

---

**Versão:** 1.0  
**Última atualização:** 19 de fevereiro de 2026
