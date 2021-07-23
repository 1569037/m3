package m3;
public class Bike extends Vehiculos{

	//constructores
	public Bike()
	{
		super();
		this.nRuedas = 2;
		this.rueda = new Ruedas[this.nRuedas];
	}
	
	public Bike(String matricula, String marca, String color)
	{
		super(matricula,marca,color);
		this.nRuedas = 2;
		this.rueda = new Ruedas[this.nRuedas];
	}
	
	//metodo para añadir ruedas
	
	public void ruedaDelanteras(Ruedas r)
	{
		this.rueda[0] = r;
	}
	public void ruedaTraseras(Ruedas r)
	{
		this.rueda[1] = r;
	}
	
	
}
