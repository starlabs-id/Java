public class Segitiga
{
	public Segitiga()
	{}
	public static double luas(double alas, double tinggi)
	{
		double hasil;
		hasil = (alas * tinggi) / 2;
		return hasil;
	}
	public static double keliling(double alas, double tinggi, double miring)
	{
		double hasil;
		hasil = alas + tinggi + miring;
		return hasil;
	}
}