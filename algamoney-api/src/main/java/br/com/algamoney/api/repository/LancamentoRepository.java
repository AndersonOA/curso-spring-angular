package br.com.algamoney.api.repository;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anderson.aristides
 *
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
