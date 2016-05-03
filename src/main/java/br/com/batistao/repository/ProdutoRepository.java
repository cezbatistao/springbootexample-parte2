package br.com.batistao.repository;

import br.com.batistao.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ceb on 30/04/16.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
