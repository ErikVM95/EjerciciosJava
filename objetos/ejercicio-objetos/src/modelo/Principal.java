package modelo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado();
		Cubo c2=new Cubo();
		
		int op=0;
		int res=-1, lado=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato (Lado)"));
		do{
			String menu="";
			menu+="1..........Calcular Area (cuadrado)\n";
			menu+="2..........Calcular Perimetro (cuadrado)\n";
			menu+="3..........Calcular Volumen (cubo)\n";
			menu+="4..........Calcular Perimetro (cubo)\n";
			menu+="5..........Cancelar\n";
			menu+="6..........Salir\n";
			menu+="Elige una opci�n";
			
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				c1.setLado(lado);
				res = c1.calcularArea();
				break;
			case 2:
				c1.setLado(lado);
				res = c1.calcularPerimetro();
				break;
			case 3:
				c2.setLado(lado);
				res = c2.calcularVolumen();
				break;
			case 4:
				c2.setLado(lado);
				res = c2.calcularPerimetro();
				break;
			case 5:
				lado=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato (Lado)"));
				break;
			}
			
			int des=0;
			if(op!=5 && op!=6){
				String menu2="";
				menu2+="RESULTADO: "+res+"\n";
				menu2+="1..........Regresar al menu (mismo dato)\n";
				menu2+="2..........Regresar al inicio (cambiar dato)\n";
				menu2+="�Qu� desea hacer?";
				des=Integer.parseInt(JOptionPane.showInputDialog(menu2));
				if(des==2){
					lado=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato (Lado)"));
				}
			}
		}while(op!=6);
		
	}

}
