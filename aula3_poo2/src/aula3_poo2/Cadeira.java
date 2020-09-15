package aula3_poo2;

import javax.swing.JOptionPane;

public class Cadeira {
	
	String tamanho;
	
	Double peso;
	
	String cor;
	
	Cadeira(){
		
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public boolean massagear() {
		return false;
		
	}
	
	public double inclinar(double graus) {
		graus = 0;
		return graus;
	}
	
	public static void main(String[] args) {

		
		String tipoAssento = JOptionPane.showInputDialog(null, "O assento e um Banco ou uma Poltrona");
		
		Cadeira assento;
		
		if(tipoAssento.toLowerCase().contains("banco")) {
			
			assento = new Banco();
			
		} else {
			
			assento = new Poltrona();

		}
		
		
		assento.setCor(JOptionPane.showInputDialog(null, "Qual e a cor"));
		assento.setPeso(Double.valueOf(JOptionPane.showInputDialog(null, "Qual e o peso")));
		assento.setTamanho(JOptionPane.showInputDialog(null, "Qual e o tamanho"));

		
		JOptionPane.showMessageDialog(null, "O assento tem a " + assento.getCor() + " e o peso e " + assento.getPeso() + " com o tamanha de " + assento.getTamanho() + "cm" );
		JOptionPane.showMessageDialog(null, assento.inclinar(0) );
		JOptionPane.showMessageDialog(null, "Tem a funçao massageadora? " + assento.massagear() );

		
	}
}
