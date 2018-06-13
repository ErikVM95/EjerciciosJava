package modelo;

public class Cuadrado {
	
	private int lado;
	
	//public Cuadrado(){}
	
	public void setLado(int lado){
		this.lado=lado;
	}
	public int getLado(){
		return this.lado;
	}
	
	
	public int calcularArea(){
		return lado*lado;
	}
	
	public int calcularPerimetro(){
		return 4*lado;
	}
	
}
