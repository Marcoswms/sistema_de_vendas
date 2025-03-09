package com.projeto.sistema.repositorios;

import com.projeto.sistema.modelos.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface - Denomina um Padrão para Classes
public interface EstadoRepositorio extends JpaRepository<Estado, Long> {
}