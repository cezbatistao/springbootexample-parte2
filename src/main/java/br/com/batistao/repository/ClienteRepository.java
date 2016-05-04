package br.com.batistao.repository;

import br.com.batistao.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ceb on 30/04/16.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByEmail(String email);

}
