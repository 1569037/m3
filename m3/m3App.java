package m3;

import javax.swing.JOptionPane;

public class m3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce 0 si deseas crear un coche o 1 si deseas crear una moto"));
		String m = JOptionPane.showInputDialog("Introduce la matricula del coche");
		String marca = JOptionPane.showInputDialog("Introduce la marca del coche");
		String color = JOptionPane.showInputDialog("Introduce el color del coche");
		
		
		
		
		
		if ( n == 0)
		{
			Coche c = new Coche(m,marca,color);
		}
		else
			if (n==1) {
				Bike c = new Bike(m,marca,color);
			}
			else {
				JOptionPane.showMessageDialog(null, "No has introducido un vehiculo valido, crearemos un coche por defecto");
				Coche c = new Coche(m,marca,color);
			}
		
		String mTras = JOptionPane.showInputDialog("Introduce la marca de las ruedas traseras");
		double dTras = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas traseras"));
		String mDelante = JOptionPane.showInputDialog("Introduce la marca de las ruedas delanteras");
		double dDelante = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas delanteras"));
		
		Ruedas delanteras = new Ruedas(mDelante, dDelante, 0);
		Ruedas traseras = new Ruedas(mTras,dTras,1);
		
		//c.ruedaDelanteras(delanteras);
		//c.ruedaTraseras(traseras);
		
	}

	
}
