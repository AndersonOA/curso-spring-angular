package br.com.algamoney.api.service;

import br.com.algamoney.api.model.Pessoa;
import br.com.algamoney.api.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author anderson.aristides
 *
 */
@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa) {
        Pessoa pessoaSave = buscar(codigo);
        BeanUtils.copyProperties(pessoa, pessoaSave, "codigo");
        return pessoaRepository.save(pessoaSave);
    }

    public void atualizaPropriedadeAtivo(Long codigo, Boolean ativo) {
        Pessoa pessoaSave = buscar(codigo);
        pessoaSave.setAtivo(ativo);
        pessoaRepository.save(pessoaSave);
    }

    private Pessoa buscar(Long codigo) {
        Pessoa pessoaSave = pessoaRepository.findOne(codigo);

        if (pessoaSave == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return pessoaSave;
    }

}
