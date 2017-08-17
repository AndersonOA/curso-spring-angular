package br.com.algamoney.api.repository;

import br.com.algamoney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anderson.aristides
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
