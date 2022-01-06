package entities;

public class FuncionarioSubcontratado extends Funcionario {
	
	private double pagamentoAdicional;
	
	public FuncionarioSubcontratado() {
		
	}

	public FuncionarioSubcontratado(String nome, Integer hora, Double valorPorHora, double pagamentoAdicional) {
		super(nome, hora, valorPorHora);
		this.pagamentoAdicional = pagamentoAdicional;
	}

	public double getPagamentoAdicional() {
		return pagamentoAdicional;
	}

	public void setPagamentoAdicional(double pagamentoAdicional) {
		this.pagamentoAdicional = pagamentoAdicional;
	}
	
	@Override
	public double pagamento() {
		double percentagem= pagamentoAdicional*1.1;
		return super.pagamento()+percentagem;
	
	}

}
