class CobaArray3
{
	public static void main(String[] args)
	{
		String[] kota;
		kota = new String[5];
		kota[0] = "Jakarta";
		kota[1] = "Denpasar";
		kota[2] = "Bandung";
		kota[3] = "Yogyakarta";
		kota[4] = "Surabaya";
		for(int i=0;i<kota.length;i++)
		{
			System.out.println("Index ke=" + i + " : " + kota[i]);
		}
	}
}