package aula3_poo2;

public class Cavalo extends Animal{
	
	public Cavalo(String tipo, String cor, String porte) {
		setTipo(tipo);;
		setCor(cor);
		setPorte(porte);

	}
	
	public Cavalo() {
		// TODO Auto-generated constructor stub
	}

	void corre(){
		
	}
	
	
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		String sup = super.comer();
		sup += "Muito";
		
		System.out.println(sup);
		
		return sup;
	}
	
	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		String sup = "Este animal não dorme";
		
		System.out.println(sup);
		
		return sup;
	}
	
	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		String sup = super.comer();
		sup += "relincha";
		
		System.out.println(sup);
		
		return sup;
	}
}
