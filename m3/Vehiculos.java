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
		compMat(matricula);
		this.marca = marca;
		this.color = color;
	}
	
	private void compMat(String matricula)
	{
		int i=0;
		boolean cor= true;
		while(i<4 && cor)
		{
			char c = matricula.charAt(i);
			if (c >=0 && c<=9)
				i++;
			else
				cor = false;	
		}
		while(i<matricula.length() && cor)
		{
			char c = matricula.charAt(i);
			if ((c>= 'a' && c<= 'z') || (c>='A' && c<='Z'))
				i++;
			else
				cor = false;
		}
		
		if (cor)
			this.matricula=matricula;
		else
			this.matricula="ABCD123";
	}
	public abstract void rueda(Ruedas r);
}	
