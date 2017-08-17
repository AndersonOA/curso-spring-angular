package br.com.algamoney.api.repository.lancamento;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.filter.LancamentoFilter;
import br.com.algamoney.api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author anderson.aristides
 *
 */
public interface LancamentoRepositoryQuery {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

    Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
