package br.com.ifpe.oxefoodmarleide.util.entity;

import java.time.LocalDate;

import br.com.ifpe.oxefoodmarleide.util.exception.PreenchimentoException;

public class GenericService {

    public void preencherCamposAuditoria(EntidadeAuditavel entity) {

    entity.setDataUltimaModificacao(LocalDate.now());

    if (entity.getId() == null) {

        entity.setHabilitado(Boolean.TRUE);
        entity.setVersao(1L);
        entity.setDataCriacao(LocalDate.now());

    } else {
        entity.setVersao(entity.getVersao() + 1);
    }
    }

    public void validarRegistroVazio(String campo, String rotulo) {

    if (campo == null || campo.trim().equals("")) {
        throw new PreenchimentoException(PreenchimentoException.MSG_PREENCHIMENTO_OBRIGATORIO, rotulo);
    }
    }


}
