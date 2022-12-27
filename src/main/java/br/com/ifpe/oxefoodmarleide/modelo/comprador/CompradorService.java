package br.com.ifpe.oxefoodmarleide.modelo.comprador;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodmarleide.util.entity.GenericService;

@Service
public class CompradorService extends GenericService {

	@Autowired
    private CompradorRepository repository;

    @Transactional
    public Comprador save(Comprador comprador) {

    	super.preencherCamposAuditoria(comprador);
    	return repository.save(comprador);
    }

    @Transactional
    public Comprador obterCompradorPorID(Long id) {

    return repository.findById(id).get();
    }

    @Transactional
    public List<Comprador> consultarPorId(Long id) {

	return repository.findByIdOrderByNomeAsc(id);
    }

    @Transactional
    public List<Comprador> consultarCompradores() {

    return repository.findByCompradores();
    }

    @Transactional
    public void update(Long id, Comprador compradorAlterado) {

     Comprador comprador = this.obterCompradorPorID(id);
     comprador.updateFrom(compradorAlterado);
	 super.preencherCamposAuditoria(comprador);

	 repository.save(comprador);
    }

    @Transactional
    public void delete(Long id) {

    Comprador comprador = this.obterCompradorPorID(id);
    comprador.setHabilitado(Boolean.FALSE);
	super.preencherCamposAuditoria(comprador);

	repository.save(comprador);
    }

}

