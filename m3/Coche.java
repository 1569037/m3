package m3;

public class Coche extends Vehiculos {

	//constructores
	
	public Coche()
	{
		super();
		this.nRuedas = 4;
		this.rueda = new Ruedas[this.nRuedas];
	}
	
	public Coche(String matricula, String marca, String color)
	{
		super(matricula,marca,color);
		this.nRuedas = 4;
		this.rueda = new Ruedas[this.nRuedas];
	}
	
	//metodo para a�adir ruedas
	
	public void ruedaDelanteras(Ruedas r)
	{
		this.rueda[0] = r;
		this.rueda[1] = r;
	}
	public void ruedaTraseras(Ruedas r)
	{
		this.rueda[2] = r;
		this.rueda[3] = r;
	}
	
	
}
