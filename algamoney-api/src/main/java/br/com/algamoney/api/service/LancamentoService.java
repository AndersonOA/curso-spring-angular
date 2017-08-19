package br.com.algamoney.api.service;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.model.Pessoa;
import br.com.algamoney.api.repository.LancamentoRepository;
import br.com.algamoney.api.repository.PessoaRepository;
import br.com.algamoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    private void validaPessoa(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (null == pessoa || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }
    }

}
