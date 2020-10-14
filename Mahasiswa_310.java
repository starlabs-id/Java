class Mahasiswa_310
{
	public static void main(String[] args)
	{
		int [][] angka;
		
		angka = new int[4][3];
		angka[0][0] = 0;
		angka[0][1] = 1;
		angka[0][2] = 2;
		angka[1][0] = 1;
		angka[1][1] = 3;
		angka[1][2] = 5;
		angka[2][0] = 2;
		angka[2][1] = 4;
		angka[2][2] = 6;
		angka[3][0] = 3;
		angka[3][1] = 6;
		angka[3][2] = 9;

		for(int i=0; i<4; i++)
		{
			System.out.println();
			for(int j=0; j<3; j++)
			{
				System.out.print(+ angka[i][j]);
				System.out.print("	");
			}
		}
				System.out.println();
	}
}