package aula3_poo2;

import javax.swing.JOptionPane;

public class Animal {
	
	String tipo;

	String cor;
	
	String porte;
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public String comer(){	
		
	String retorno = "Este animal come ";
		
	return retorno;	
	}
	
	
	public String dormir(){
		
		String retorno = "Este animal dorme ";
		
		return retorno;	
	}
	
	
	public String fazerBarulho(){
	
		String retorno = "Este animal ";
	
		return retorno;	
	}

	public static void main(String[] args) {
		
		
		String tipoAnimal = JOptionPane.showInputDialog(null, "O animal e um Passaro ou um Cavalo");
		
		Animal animal;
		
		if(tipoAnimal.toLowerCase().contains("passaro")) {
			
			 animal = new Passaro();
			
		} else {
			
			 animal = new Cavalo();
		}
		
	
	}
}
