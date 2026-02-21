# Decisões Arquiteturais Críticas

## 1. Estrutura Monolítica Modular
- **Decisão:** O sistema será implementado como um monolito modular, dividido em camadas (apresentação, negócios e persistência).
- **Justificativa:** Atende à demanda de um único hotel, reduz complexidade, facilita manutenção e permite futura migração para microserviços se necessário.

## 2. Separação em Camadas
- **Decisão:** O sistema será dividido em três camadas principais: apresentação (frontend), negócios (backend) e persistência (banco de dados).
- **Justificativa:** Facilita a organização do código, manutenção, testes e evolução do sistema.

## 3. API RESTful para Comunicação
- **Decisão:** A comunicação entre frontend e backend será feita via APIs RESTful.
- **Justificativa:** Garante desacoplamento, facilita integração futura e uso de diferentes tecnologias no frontend.

## 4. Banco de Dados Relacional
- **Decisão:** Utilização de um SGBD relacional (ex: PostgreSQL, MySQL ou SQL Server).
- **Justificativa:** Estrutura de dados tabular, integridade referencial e facilidade de consultas complexas.

## 5. Interface Web Responsiva
- **Decisão:** O frontend será responsivo, utilizando frameworks modernos e paleta de cores verde e azul.
- **Justificativa:** Melhora a experiência do usuário e garante compatibilidade com diferentes dispositivos e navegadores.

## 6. Modularização do Código
- **Decisão:** Cada domínio (quartos, hóspedes, reservas) será implementado como módulo independente dentro do monolito.
- **Justificativa:** Facilita manutenção, testes e futura extração para microserviços, se necessário.

## 7. Segurança dos Dados
- **Decisão:** Implementar validação e proteção de dados sensíveis (ex: CPF, e-mail) tanto no frontend quanto no backend.
- **Justificativa:** Atende requisitos legais e de privacidade, além de proteger os dados dos hóspedes.

Se desejar detalhar decisões adicionais ou registrar revisões futuras, basta solicitar!
