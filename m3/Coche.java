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
	
	//metodo para añadir ruedas
	
	public void rueda(Ruedas r)
	{
		if (r.getPos () == Posicion.DELANTE)
		{
			this.rueda[0] = r;
			this.rueda[1] = r;
		}
		else
		{
			this.rueda[2] = r;
			this.rueda[3] = r;
		}
	}
	
	
}
