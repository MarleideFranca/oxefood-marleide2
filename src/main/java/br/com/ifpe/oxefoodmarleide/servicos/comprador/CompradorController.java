package br.com.ifpe.oxefoodmarleide.servicos.comprador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodmarleide.modelo.comprador.Comprador;
import br.com.ifpe.oxefoodmarleide.modelo.comprador.CompradorService;
import br.com.ifpe.oxefoodmarleide.util.entity.GenericController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/comprador")
public class CompradorController extends GenericController {

	@Autowired
    private CompradorService compradorService;

	@ApiOperation(value = "Serviço responsável por cadastrar um novo comprador no sistema.")
    @PostMapping
    public ResponseEntity<Comprador> save(@RequestBody @Valid CompradorRequest request) {

    Comprador compradorSalvo = compradorService.save(request.buildComprador());
	return new ResponseEntity<Comprador>(compradorSalvo, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Serviço responsável por obter um comprador referente ao Id passado na URL.")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Retorna o comprador."),
			@ApiResponse(code = 401, message = "Acesso não autorizado."),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
			@ApiResponse(code = 404, message = "Não foi encontrado um registro para o Id informado."),
			@ApiResponse(code = 500, message = "Foi gerado um erro no servidor."), })

	@GetMapping("/{id}")
	public Comprador obterCompradorPorID(@PathVariable Long id) {

		return compradorService.obterCompradorPorID(id);
	}

	@ApiOperation(value = "Serviço responsável por obter uma lista de compradores da empresa passado na URL.")
	@GetMapping("/porId/{id}")
	public List<Comprador> consultarPorId(@PathVariable Long id) {

		return compradorService.consultarPorId(id);
	}

	@ApiOperation(value = "Serviço responsável por obter uma lista de todos os entregadores cadastrados.")
	@GetMapping("/compradores")
	public List<Comprador> consultarCompradores() {

		return compradorService.consultarCompradores();
	}

    @PutMapping("/{id}")
    @ApiOperation(value = "Serviço responsável por atualizar as informações do comprador no sistema.")
    public ResponseEntity<Comprador> update(@PathVariable("id") Long id, @RequestBody CompradorRequest request) {

    	compradorService.update(id, request.buildComprador());
		return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Rota responsável por remover (exclusão lógica) um comprador do sistema.")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

    	 compradorService.delete(id);
		 return ResponseEntity.noContent().build();
    }

}
