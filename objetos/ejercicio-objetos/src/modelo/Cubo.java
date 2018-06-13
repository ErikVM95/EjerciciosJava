package modelo;

public class Cubo extends Cuadrado{
	
	public int calcularVolumen(){
		return getLado()*getLado()*getLado();
	}
	
	public int calcularPerimetro(){
		return 12*getLado();
	}
	
}
