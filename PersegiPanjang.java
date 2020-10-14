public class PersegiPanjang
{
	public PersegiPanjang()
	{}
	public static double luas(double panjang, double lebar)
	{
		double hasil;
		hasil = panjang * lebar;
		return hasil;
	}
	public static double keliling(double panjang, double lebar)
	{
		double hasil;
		hasil = 2 * (panjang + lebar);
		return hasil;
	}
}