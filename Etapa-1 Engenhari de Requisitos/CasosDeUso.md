# Casos de Uso Principais

## Atores
- Recepcionista do hotel

---

## Caso de Uso 1: Cadastrar Quarto
**Ator:** Recepcionista

**Pré-condições:**
- O recepcionista está autenticado no sistema.

**Fluxo Principal:**
- O recepcionista acessa a tela de cadastro de quartos.
- Preenche todos os campos obrigatórios.
- Salva o cadastro.

**Pós-condições:**
- O quarto é adicionado ao sistema e fica disponível para reservas.

---

## Caso de Uso 2: Editar Quarto
**Ator:** Recepcionista

**Pré-condições:**
- O recepcionista está autenticado no sistema.
- Existe ao menos um quarto cadastrado.

**Fluxo Principal:**
- O recepcionista acessa a lista de quartos.
- Seleciona um quarto e clica no ícone de edição.
- Altera as informações desejadas e salva.

**Pós-condições:**
- As informações do quarto são atualizadas no sistema.

---

## Caso de Uso 3: Cadastrar Hóspede
**Ator:** Recepcionista

**Pré-condições:**
- O recepcionista está autenticado no sistema.

**Fluxo Principal:**
- O recepcionista acessa a tela de cadastro de hóspedes.
- Preenche os campos obrigatórios.
- Salva o cadastro.

**Pós-condições:**
- O hóspede é adicionado ao sistema e pode ser associado a reservas.

---

## Caso de Uso 4: Criar/Editar Reserva
**Ator:** Recepcionista

**Pré-condições:**
- O recepcionista está autenticado no sistema.
- Existem quartos e hóspedes cadastrados.

**Fluxo Principal:**
- O recepcionista acessa a tela de reservas.
- Seleciona um quarto e um hóspede.
- Salva a reserva.
- (Para edição) Seleciona uma reserva existente, altera dados e salva.

**Pós-condições:**
- A reserva é registrada e o status do quarto é atualizado para "Ocupado".
- Alterações em reservas são refletidas no sistema.

---

## Caso de Uso 5: Visualizar Disponibilidade de Quartos
**Ator:** Recepcionista

**Pré-condições:**
- O recepcionista está autenticado no sistema.

**Fluxo Principal:**
- O recepcionista acessa a lista de quartos ou reservas.
- Visualiza o status de disponibilidade de cada quarto.

**Pós-condições:**
- O recepcionista pode informar clientes sobre a situação dos quartos (Livre, Ocupado, Manutenção e Limpeza).
