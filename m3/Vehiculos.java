package m3;
public abstract class Vehiculos {

	//atributos
	
	protected String matricula;
	protected String marca;
	protected String color;
	protected int nRuedas;
	protected Ruedas rueda[];
	
	//constructores
	
	public Vehiculos()
	{
		this.matricula = "";
		this.marca = "";
		this.color = "";
	}
	public Vehiculos(String matricula, String marca, String color)
	{
		this();
		this.matricula  = matricula;
		this.marca = marca;
		this.color = color;
	}
	public abstract void rueda(Ruedas r);
}	
