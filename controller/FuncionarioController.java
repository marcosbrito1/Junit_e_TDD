package controller;

import model.Funcionario;

public class FuncionarioController {

	public double calcularDezPorCento(Funcionario funcionario) {
		double valor = funcionario.getSalario()*(0.1);
		System.out.print(valor);
		return valor;
	}

}
