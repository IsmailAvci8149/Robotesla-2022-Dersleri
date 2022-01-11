package temeller;

public class Metodlar_Çözüm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		örnek1(4, 5, 'x');
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
	
	public static void örnek1(int en, int boy, char ch) {
		int i = 0;
		int j = 0;
		
		while (i < boy) {
			j = 0;
			while (j < en) {
				if(i == 0 || i == boy-1) // sadece ilk ve son satýrýn karakterlerini yazdýr
					System.out.print(ch);
				else if(j == 0 || j == en-1) // o satýdaki karakterlerden sadece ilkini ve sonuncusunu yazdýr
					System.out.print(ch);
				else // geri kalan heryeri boþluk ile doldur
					System.out.print(' ');
				
				j++;
			} // bir kere çalýþtýktan sonra j deðeri en e eþit olacaðýndan dolayý bu döngü bir daha çalýþmaz
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
