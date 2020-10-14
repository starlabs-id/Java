public class HargaKamar
{
	public static void main (String[] args)
	{
		int lamaMenginap;
		String tipeKamar;
		lamaMenginap = 3;
		tipeKamar="Deluxe";

		if (tipeKamar=="Superior")
		{
			System.out.println("Kamar Superior");
			System.out.println("Lama Menginap " + lamaMenginap + " Hari");
			if (lamaMenginap<=2)
			{
				System.out.println("Harga per Malam = Rp. 100.000");
			}
			else if (lamaMenginap>2 && lamaMenginap<=4)
			{
				System.out.println("Harga per Malam = Rp. 90.000");
			}
			else if (lamaMenginap>4)
			{
				System.out.println("Harga per Malam = Rp. 80.000");
			}
		}

		else if (tipeKamar=="Deluxe")
		{
			System.out.println("Kamar Deluxe");
			System.out.println("Lama Menginap " + lamaMenginap + " Hari");
			if (lamaMenginap<=2)
			{
				System.out.println("Harga per Malam = Rp. 150.000");
			}
			else if (lamaMenginap>2 && lamaMenginap<=4)
			{
				System.out.println("Harga per Malam = Rp. 135.000");
			}
			else if (lamaMenginap>4)
			{
				System.out.println("Harga per Malam = Rp. 120.000");
			}
		}

		else if (tipeKamar=="Premium")
		{
			System.out.println("Kamar Premium");
			System.out.println("Lama Menginap " + lamaMenginap + " Hari");
			if (lamaMenginap<=2)
			{
				System.out.print("Harga per Malam = Rp 200.000");
			}
			else if (lamaMenginap>2 && lamaMenginap<=4)
			{
				System.out.println("Harga per Malam = Rp. 180.000");
			}
			else if (lamaMenginap>4)
			{
				System.out.println("Harga per Malam = Rp. 160.000");
			}
		}
	}
}