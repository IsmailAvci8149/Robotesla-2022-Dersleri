package temeller;

public class Örnekler {

	public static void main(String[] args) {
		// Faktöriyel iþlemi:
		// 5! = 5 x 4 x 3 x 2 x 1
		// 20! = 20 x 19 x 18 x ... x 3 x 2 x 1
		int n = 5;
		long sonuc = 1;
		
		int i;
		for(i = n; i > 0; i--) {
			sonuc *= i;
		}
		
		System.out.println("Faktöriyel cevabý : " + sonuc);
		
		//Asal Sayýlar:
		// Asal Sayýlar: 1 ve kendisinden baþka haçbir sayýya bölünemeyen sayýlar.
		
		int num1 = 100000;
		int num2 = 10000;
		
		boolean flag = true;
		
		
		
		for(int k = num2; k < num1; k++) {
			flag = true;
			
			int j;
			for(j = 2; j < k/2; j++) { //
				if(k % j == 0) {
					flag = false;
					
					break;
				}
			}
			
			if(flag)
				System.out.println(k + " " + flag + "     Bolen:" + j);
		}
		
		//System.out.println("Asal mý? " + flag + " Bölen: " + j);
		
		//Diziler örnek:
		
		//Tek boyutlu bir tamsayý dizisi oluþturun. bu dizinin elemanlarýnýn toplamýný, çarpýmýný, tek sayýlarýn toplamýný
		// çift sayýlarýn toplamýný biaþka bir diziye atayým ve bunu yazdýrýn.
		
		int dizi[] = {2, 4, 5, 11};
		
		int toplam = 0;
		int carpim = 1;
		int tek_toplam = 0;
		int cift_toplam = 0;
		
		for(int temp : dizi) toplam += temp;
		
		for(int temp : dizi) carpim *= temp;
		
		for(int temp : dizi) {
			if(temp % 2 == 1) tek_toplam += temp;
		}
		
		for(int temp : dizi) {
			if(temp % 2 == 0) cift_toplam += temp;
		}
		
		int yeniDizi[] = {toplam, carpim, tek_toplam, cift_toplam};
		
		for(int temp : yeniDizi) System.out.println(temp);
	} 
}
