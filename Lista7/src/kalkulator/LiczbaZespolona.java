package kalkulator;

public class LiczbaZespolona extends Kalkulator {
	double Re, Im;
	public LiczbaZespolona(double x, double y)
	{
		Re = x;
		Im = y;
	}
	public String toString()
	{
		return "(" + Re + " + " + Im + "i)";
	}
	public LiczbaZespolona dodaj(LiczbaZespolona z)
	{
		return new LiczbaZespolona(Re+z.Re, Im+z.Im);
	}
	public LiczbaZespolona odejmij(LiczbaZespolona z)
	{
		return new LiczbaZespolona(Re-z.Re, Im-z.Im);
	}
	public LiczbaZespolona pomnoz(LiczbaZespolona z)
	{
		return new LiczbaZespolona(Re*z.Re - Im*z.Im, Re*z.Im + Im*z.Re);
	}
	public LiczbaZespolona podziel(LiczbaZespolona z)
	{
		return new LiczbaZespolona((Re*z.Re + Im*z.Im)/(z.Re*z.Re + z.Im*z.Im), -(Re*z.Im - Im*z.Re)/(z.Re*z.Re + z.Im*z.Im));
	}
}
