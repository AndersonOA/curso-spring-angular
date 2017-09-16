package br.com.algamoney.api.repository;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;
import br.com.algamoney.api.repository.projection.ResumoLancamento;
import br.com.algamoney.api.specification.LancamentoSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author anderson.aristides
 *
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, JpaSpecificationExecutor<Lancamento>, LancamentoRepositoryQuery {

}
