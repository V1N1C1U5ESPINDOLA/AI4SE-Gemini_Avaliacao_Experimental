# Padrões de Projeto Aplicáveis

## 1. Repository
- **Justificativa:** Abstrai o acesso ao banco de dados, separando a lógica de persistência da lógica de negócio. Facilita manutenção e testes.

## 2. Service
- **Justificativa:** Centraliza regras de negócio, promovendo reutilização e organização do código. Cada domínio (quarto, hóspede, reserva) pode ter um serviço dedicado.

## 3. DTO (Data Transfer Object)
- **Justificativa:** Facilita o transporte de dados entre camadas, evitando exposição direta de entidades e melhorando segurança.

## 4. Factory
- **Justificativa:** Simplifica a criação de objetos complexos, como instâncias de reservas ou quartos com múltiplas camas.

## 5. Singleton
- **Justificativa:** Pode ser usado para gerenciar recursos globais, como configurações do sistema ou conexões de banco de dados.

## 6. Observer
- **Justificativa:** Útil para atualizar automaticamente a interface quando o status de quartos ou reservas muda, melhorando experiência do usuário.

---

Esses padrões aumentam a modularidade, facilitam manutenção, testes e evolução do sistema. Se quiser exemplos de implementação, é só pedir!
