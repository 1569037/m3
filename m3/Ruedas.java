package m3;

import javax.swing.JOptionPane;

enum Posicion{
	DELANTE, DETRAS;
}
public class Ruedas {

	//atributos
	
	private String marca;
	private double diam;
	private Posicion pos;
	
	//construcctores
	
	public Ruedas()
	{
		this.marca = "";
		this.diam = 0;
		this.pos = Posicion.DELANTE;
	}
	
	public Ruedas(String marca,double diam)
	{
		this();
		this.marca=marca;
		diam(diam);
	}
	public Ruedas(String marca, double diam, int pos)
	{
		this(marca,diam);
		pos(pos);
	}

	//getters setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiam() {
		return diam;
	}

	public void setDiam(double diam) {
		diam(diam);
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(int pos) {
		pos(pos);
	}
	
	//metodo para comprobar si la posicion es correcta
	
	private void pos(int pos)
	{
		if (pos == 0)
			this.pos = Posicion.DELANTE;
		else
			if (pos == 1)
				this.pos = Posicion.DETRAS;
			else
			{
				JOptionPane.showMessageDialog(null, "Has introducido una posicion incorrecta se consideraran ruedas delanteras");
				this.pos = Posicion.DELANTE;
			}
	}
	
	//metodo para comprobar el diametro de la rueda
	
	private void diam(double diam)
	{
		if (diam>0.4 && diam<4)
			this.diam= diam;
		else
		{
			JOptionPane.showMessageDialog(null, "El diametro introducido no es correcto");
			this.diam=0;
		}
	}	
}
