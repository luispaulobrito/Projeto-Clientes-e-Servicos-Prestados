package io.github.luispaulobrito.clientes.model.repository;

import io.github.luispaulobrito.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
