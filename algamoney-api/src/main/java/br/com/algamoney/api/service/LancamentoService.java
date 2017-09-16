package br.com.algamoney.api.service;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.model.Pessoa;
import br.com.algamoney.api.repository.LancamentoRepository;
import br.com.algamoney.api.repository.PessoaRepository;
import br.com.algamoney.api.repository.filter.LancamentoFilter;
import br.com.algamoney.api.repository.projection.ResumoLancamento;
import br.com.algamoney.api.service.exception.PessoaInexistenteOuInativaException;
import br.com.algamoney.api.specification.LancamentoSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author anderson.aristides
 *
 */
@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        validaPessoa(lancamento);

        return lancamentoRepository.save(lancamento);
    }

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable) {
        return lancamentoRepository.findAll(LancamentoSpecification.filtroLancamento(lancamentoFilter), pageable);
    }

    private void validaPessoa(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (null == pessoa || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }
    }

}
