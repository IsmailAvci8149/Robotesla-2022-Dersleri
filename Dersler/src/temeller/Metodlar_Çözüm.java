package temeller;

public class Metodlar_��z�m {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�rnek1(4, 5, 'x');
	}
	
	// 4, 5
	
	/*
	 * xxxx
	 * xxxx
	 * xxxx
	 * xxxx
	 * xxxx
	 */
	
	// 6, 4
	
	/*
	 * xxxxxx
	 * xxxxxx
	 * xxxxxx
	 * xxxxxx
	 */
	
	// 1,5
	
	/*
	 * x
	 * x
	 * x
	 * x
	 * x
	 */
	
	// 5, 6
	
	/*
	 * xxxxx
	 * xxxxx
	 * xxxxx
	 * xxxxx
	 * xxxxx
	 * xxxxx
	 */
	
	public static void �rnek1(int en, int boy, char ch) {
		int i = 0;
		int j = 0;
		
		while (i < boy) {
			j = 0;
			while (j < en) {
				if(i == 0 || i == boy-1) // sadece ilk ve son sat�r�n karakterlerini yazd�r
					System.out.print(ch);
				else if(j == 0 || j == en-1) // o sat�daki karakterlerden sadece ilkini ve sonuncusunu yazd�r
					System.out.print(ch);
				else // geri kalan heryeri bo�luk ile doldur
					System.out.print(' ');
				
				j++;
			} // bir kere �al��t�ktan sonra j de�eri en e e�it olaca��ndan dolay� bu d�ng� bir daha �al��maz
			System.out.println();
			i++;
		}
		
		/*
		 * xxxxx
		 * xxxxx
		 * xxxxx
		 * xxxxx
		 * xxxxx
		 * xxxxx
		 */
	}
}
