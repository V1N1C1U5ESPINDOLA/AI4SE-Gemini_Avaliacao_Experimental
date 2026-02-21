import { Quarto, Cama } from './Quarto';

/**
 * Classe responsável pela gestão de quartos.
 * Princípios aplicados:
 * - Single Responsibility: Cada método tem uma responsabilidade clara.
 * - Open/Closed: Permite extensão sem modificar código existente.
 * - Liskov Substitution: Métodos retornam tipos esperados.
 * - Interface Segregation: Métodos específicos para cada operação.
 * - Dependency Inversion: Depende de abstrações (Quarto, Cama).
 * Clean Code: Nomes claros, métodos curtos, sem duplicidade.
 */

export class GestaoQuartos {
  /**
   * Lista de quartos cadastrados.
   * Mantém encapsulamento, evitando acesso direto.
   */
  private quartos: Quarto[] = [];

  /**
   * Cadastra um novo quarto.
   * @param quarto Instância de Quarto a ser adicionada.
   */
  cadastrarQuarto(quarto: Quarto): void {
    this.quartos.push(quarto);
  }

  /**
   * Edita um quarto existente pelo número.
   * @param numero Número do quarto a editar.
   * @param dadosAtualizados Dados parciais para atualização.
   * @returns true se editado, false se não encontrado.
   */
  editarQuarto(numero: number, dadosAtualizados: Partial<Quarto>): boolean {
    const quarto = this.quartos.find(q => q.numero === numero);
    if (!quarto) return false;
    Object.assign(quarto, dadosAtualizados);
    return true;
  }

  /**
   * Lista todos os quartos com informações principais.
   * @returns Array de quartos resumidos.
   */
  listarQuartos(): Array<{
    numero: number;
    tipo: string;
    precoDiaria: number;
    disponibilidade: string;
    camas: Cama[];
  }> {
    return this.quartos.map(q => ({
      numero: q.numero,
      tipo: q.tipo,
      precoDiaria: q.precoDiaria,
      disponibilidade: q.disponibilidade,
      camas: q.camas
    }));
  }

  /**
   * Adiciona uma cama a um quarto específico.
   * @param numero Número do quarto.
   * @param cama Instância de Cama a ser adicionada.
   * @returns true se adicionado, false se quarto não encontrado.
   */
  adicionarCamaAoQuarto(numero: number, cama: Cama): boolean {
    const quarto = this.quartos.find(q => q.numero === numero);
    if (!quarto) return false;
    quarto.camas.push(cama);
    return true;
  }
}
