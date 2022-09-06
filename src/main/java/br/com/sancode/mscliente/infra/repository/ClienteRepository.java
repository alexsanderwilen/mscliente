package br.com.sancode.mscliente.infra.repository;

import br.com.sancode.mscliente.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
