package org.cibertec.edu.pe.repository;

import org.cibertec.edu.pe.model.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleCompraRepository extends JpaRepository<DetalleCompra, Long> {
    
}
