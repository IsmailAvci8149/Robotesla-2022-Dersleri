package temeller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodlar {
	
	private static int sayi = 25;

	public static void main(String[] args) {
		
		// Metodlar: Týpký deðiþkenler gibi metodlar da, belli kod kümelerine ad vermemizi saðlarlar. 
		
		// Fonksiyon
		
		// f(x) = y = 2x + 5
		
		// bir girdi alabilir, veya bir çýktý verebilir.
		
		// iþlem: bir sayý, 50 den büyük mü deðil mi onu bulsun
		// iþlem: kullanýcýnýn girdiði sayýyý 2 ile çarpsýn, karesini alsýn.
		
		//Bir metodun syntax'i:
		/*
		 * <Eriþim niceleyici*> <Özel anahtar kelimeler*> <dönüþ tipi> <Metod adý>(<Parametreler*>) {
		 * 		KODLARIMIZ...;
		 * }
		 * 
		 * döndürme: metodun bir çýktý vermesidir.
		 */
		int dizi[] = {2, 4, 5, 7, 9};
		
		System.out.println(metod()); //-> "Bu Deðer Bir Metod ile Döndürülmüþtür"
		System.out.println(topla(9, 18)); // 9+18
		System.out.println(dizi_carp(dizi)); //2 * 4 * 5 * 7 * 9
		
		System.out.println(topla(3.14, 2.71));
		
		//Metodlarda Overloading (Aþýrý Yükleme) -> Bir metodun varyasyonlarýný tanýmlamak
		//Bunu yapabilmek için metodun adý ayný kalmak þartýyla dönüþ tipi veya parametrelerin
		//farklý olarak yeniden tanýmlanmasý gerekir
		
		//Metodlarda Özyineleme(Recursion) -> bir metodun kendi içinde kullanýlmasýdýr.
		//15! = 15 x 14 x 13 x ... x 3 x 2 x 1
		//15! = 15 x 14! = 15 x 14 x 13!
		
		//n! = n x (n-1)!
		
		//5! = 5 * 4! = 5 * 4 * 3! = ... = 5 * 4 * 3 * 2 * 1 * 0! = 5 * 4 * 3 * 2 * 1 * 0 * -1! = = 
		
		// 0 1 1 2 3 5 8 13 21 ...
		
		// 0 1 1 2 3 5 8 13 21 ...
		
		//Özyineleyen fonksiyonlarda deðerin kontrolden çýkmamasý için bir kontrol ifadesi eklemeliyiz
		//Özyineleyen fonksiyonlara "Ýteraitf Fonksiyonlar" denir
		
		System.out.println(faktoriyel(8));
		
		System.out.println("====================");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(fibonacci(i));
		}
		
		//Statik anahtar kelimesi: 
		
		/*
		 * static anahtar kelimesi sýnýflarda her nesne oluþturduðumuzda bu anahtar kelimenin yer aldýðý
		 * deðiþkenler belleðe bir daha yazdýrýlmaz, böylece bellekten kazanç elde edilir
		 * Metodlarda ise hiç nesne oluþturmadan, direk sýnýf adýyla o metoda eriþmemizi saðlar.
		 */
		
		
		///////////////////////////
		// Kullanýcýdan girdi alma.
		
		Scanner s = new Scanner(System.in);
		
		int numara = s.nextInt();
		System.out.println("Girilen Deðer = " + numara);
		
		String metin = s.next();
		System.out.println("Girilen String deðeri = " + metin);
				
		//JOptionPane Sýnýfý.
		
		String girdi = JOptionPane.showInputDialog("Bir Sayi Giriniz");
		
		if(Integer.parseInt(girdi) >= 50) {
			JOptionPane.showMessageDialog(null, "Girilen Deðer 50'den Büyük", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Girilen Deðer 50'den Küçük", "Sonuç", JOptionPane.ERROR_MESSAGE);
		}
		
		TahminOyunu(852, 5);
	}
	
	static void mesajAl(String s) {
		String mesaj = JOptionPane.showInputDialog(s); //s = "Bir sayi girin" ///// Bir sayi girin: <>
		System.out.println(mesaj);
	}
	
	static String metod() { //Parametresiz metodlar, Depolama
		return "Bu Deðer Bir Metod ile Döndürülmüþtür";
	}
	
	static int degisken() { 
		return sayi;
	}
	
	static int topla(int a, int b) { //Parametre alan metodlardýr. Her türlü iþlem için kullanýlabilirler.
		return a + b;
	}
	
	static double topla(double a, double b) {
		return a + b;
	}
	
	static int dizi_carp(int dizi[]) {
		int carp = 1;
		for(int temp : dizi) carp *= temp;
		
		System.out.println(dizi[dizi.length-1]);
		
		return carp;
	}
	
	static int faktoriyel(int n) {
		int sonuc = 1;
		
		if(n == 1 || n == 0) { //Kontrol ifadesi
			return 1;
		}
		
		sonuc = n * faktoriyel(n-1);
		
		//sonuc = 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2 * 1 = 120
		
		
		// 7! = 7 * 6 * 5 * 4* 3 * 2 * 1! 
		
		return sonuc;
	}
	
	//iteratif metodlar
	static int fibonacci(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		
		
		// f2 = f1 + f0 = 1 + 0 = 1
		// f3 = f2 + f1 = 1 + 1 = 2
	}
	
	//GUI
	static void TahminOyunu(int rastgele, int sans) {
		for(int i = 0; i < sans; i++) {
			String tahmin = JOptionPane.showInputDialog(null, "Bir sayi Giriniz", "Tahmin Oyunu", JOptionPane.INFORMATION_MESSAGE);
			if(Integer.parseInt(tahmin) == rastgele) {
				JOptionPane.showMessageDialog(null, "Kazandýnýz", "Tahmin Oyunu", JOptionPane.DEFAULT_OPTION);
				break;
			} else
				JOptionPane.showMessageDialog(null, "Tekrar Deneyiniz", "Tahmin Oyunu", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	// a, b ; a ve b uzunluklarýna sahip bir dikdörtgen oluþturacak.
	
	// 4, 5
	
	/*
	 * 
	 * 		xxxx
	 * 		xxxx
	 * 		xxxx
	 * 		xxxx
	 * 		xxxx
	 * 
	 * 
	 *      xxxx
	 *      x  x
	 *      x  x
	 *      x  x
	 *      xxxx
	 *      
	 *      
	 *      
	 * 8, 12
	 * 
	 * 
	 * 		xxxxxxxx
	 * 		xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  xxxxxxxx
		 *  
		 *  
		 *  xxxxxxxx
		 *  x	
		 *  x
		 *  x
		 *  x
		 *  x
		 *  x
		 *  x
		 *  x
		 *  x
		 *  x
		 *  xxxxxxxx
		 *  x
	 */
	
	
}
