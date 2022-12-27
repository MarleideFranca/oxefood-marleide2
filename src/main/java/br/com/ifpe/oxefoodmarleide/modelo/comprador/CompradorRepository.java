package br.com.ifpe.oxefoodmarleide.modelo.comprador;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CompradorRepository extends JpaRepository<Comprador, Long>, JpaSpecificationExecutor<Comprador> {

	List<Comprador> findByIdOrderByNomeAsc(Long id);

	@Query(value = "SELECT e FROM Comprador e")
	List<Comprador> findByCompradores();

}


