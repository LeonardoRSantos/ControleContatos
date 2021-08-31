package com.algaworks.contatos.repository;

import com.algaworks.contatos.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {
}
