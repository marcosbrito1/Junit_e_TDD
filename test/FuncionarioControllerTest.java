package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controller.FuncionarioController;
import model.Funcionario;

class FuncionarioControllerTest {

	@Test
	public void deveriaCalcularPorcentagemDe10PorCento(){
		Funcionario funcionario = new Funcionario();
		FuncionarioController funcionarioController = new FuncionarioController();
				
		funcionario.setId(1);
		funcionario.setMatricula("M765GFT4");
		funcionario.setSalario(25000.00);
		
		double valor = funcionarioController.calcularDezPorCento(funcionario);
		
		Assertions.assertEquals(2500, valor);
		
	}

}
