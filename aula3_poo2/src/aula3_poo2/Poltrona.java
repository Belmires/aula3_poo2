package aula3_poo2;

public class Poltrona extends Cadeira{
	
	
	public Poltrona(String tamanho, Double peso, String cor) {
		setTamanho(tamanho);
		setCor(cor);
		setPeso(peso);
	}

	public Poltrona() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double inclinar(double graus) {
		graus = 180;
		
		return graus;
	}
	
	@Override
	public boolean massagear() {
		
		return true;
	}

}
