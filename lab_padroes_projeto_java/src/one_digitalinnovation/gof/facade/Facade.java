package one_digitalinnovation.gof.facade;

import subsistema1_crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	public void migrarCLiente(String nome,String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
				
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}

}
