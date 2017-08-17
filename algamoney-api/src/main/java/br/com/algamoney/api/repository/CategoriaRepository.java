package br.com.algamoney.api.repository;

import br.com.algamoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anderson.aristides
 *
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
