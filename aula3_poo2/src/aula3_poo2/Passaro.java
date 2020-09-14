package aula3_poo2;

public class Passaro extends Animal {

	public boolean oviparo = false;

	
	
	public Passaro(String tipo, String cor, String porte) {
		setTipo(tipo);;
		setCor(cor);
		setPorte(porte);

	}
	
	@Override
	public void setPorte(String porte) {
		// TODO Auto-generated method stub
		super.setPorte("Pequeno");
	}
	
	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo("Passaro");
	}
	
	public Passaro() {
		// TODO Auto-generated constructor stub
	}

	public boolean isOviparo() {
		return oviparo;
	}

	public void setOviparo(boolean oviparo) {
		this.oviparo = oviparo;
	}

	public String voar(){
		
		
		return cor;
	}
	
	public Boolean botaOvo(){
		oviparo = true;
		
		return oviparo;
	}
	
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		String sup = super.comer();
		sup += "Pouco";
		
		System.out.println(sup);
		
		return sup;
	}
	
	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		String sup = super.comer();
		sup += "a Noite";
		
		System.out.println(sup);
		
		return sup;
	}
	
	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		String sup = super.comer();
		sup += "canta";
		
		System.out.println(sup);
		
		return sup;
	}
	
}
