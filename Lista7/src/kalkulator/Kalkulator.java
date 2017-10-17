package kalkulator;

public class Kalkulator {
	
	public double dodaj(double x, double y)
	{
		return x+y;
	}
	public double odejmij(double x, double y)
	{
		return x - y;
	}
	public double pomnoz(double x, double y)
	{
		return x*y;
	}
	public double podziel(double x, double y)
	{
		return x/y;
	}
	
	public static void main(String [] args)
	{
		double a = 10, b = 5, w;
		Kalkulator kalk = new Kalkulator();
		w=kalk.dodaj(a, b);
		System.out.println(w);
		w=kalk.odejmij(a,b);
		System.out.println(w);
		w=kalk.pomnoz(a,b);
		System.out.println(w);
		w=kalk.podziel(a,b);
		System.out.println(w);
		System.out.print("Zespolone: \n");
		
		LiczbaZespolona x = new LiczbaZespolona(1,2);
		LiczbaZespolona y = new LiczbaZespolona(2,4);
		
		System.out.println(x + " + " + y + " = " + x.dodaj(y));
		System.out.println(x + " - " + y + " = " + x.odejmij(y));
		System.out.println(x + " * " + y + " = " + x.pomnoz(y));
		System.out.println(x + " / " + y + " = " + x.podziel(y));
	}
}
