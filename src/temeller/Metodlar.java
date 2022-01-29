package temeller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodlar {
	
	private static int sayi = 25;

	public static void main(String[] args) {
		
		// Metodlar: T�pk� de�i�kenler gibi metodlar da, belli kod k�melerine ad vermemizi sa�larlar. 
		
		// Fonksiyon
		
		// f(x) = y = 2x + 5
		
		// bir girdi alabilir, veya bir ��kt� verebilir.
		
		// i�lem: bir say�, 50 den b�y�k m� de�il mi onu bulsun
		// i�lem: kullan�c�n�n girdi�i say�y� 2 ile �arps�n, karesini als�n.
		
		//Bir metodun syntax'i:
		/*
		 * <Eri�im niceleyici*> <�zel anahtar kelimeler*> <d�n�� tipi> <Metod ad�>(<Parametreler*>) {
		 * 		KODLARIMIZ...;
		 * }
		 * 
		 * d�nd�rme: metodun bir ��kt� vermesidir.
		 */
		int dizi[] = {2, 4, 5, 7, 9};
		
		System.out.println(metod()); //-> "Bu De�er Bir Metod ile D�nd�r�lm��t�r"
		System.out.println(topla(9, 18)); // 9+18
		System.out.println(dizi_carp(dizi)); //2 * 4 * 5 * 7 * 9
		
		System.out.println(topla(3.14, 2.71));
		
		//Metodlarda Overloading (A��r� Y�kleme) -> Bir metodun varyasyonlar�n� tan�mlamak
		//Bunu yapabilmek i�in metodun ad� ayn� kalmak �art�yla d�n�� tipi veya parametrelerin
		//farkl� olarak yeniden tan�mlanmas� gerekir
		
		//Metodlarda �zyineleme(Recursion) -> bir metodun kendi i�inde kullan�lmas�d�r.
		//15! = 15 x 14 x 13 x ... x 3 x 2 x 1
		//15! = 15 x 14! = 15 x 14 x 13!
		
		//n! = n x (n-1)!
		
		//5! = 5 * 4! = 5 * 4 * 3! = ... = 5 * 4 * 3 * 2 * 1 * 0! = 5 * 4 * 3 * 2 * 1 * 0 * -1! = = 
		
		// 0 1 1 2 3 5 8 13 21 ...
		
		// 0 1 1 2 3 5 8 13 21 ...
		
		//�zyineleyen fonksiyonlarda de�erin kontrolden ��kmamas� i�in bir kontrol ifadesi eklemeliyiz
		//�zyineleyen fonksiyonlara "�teraitf Fonksiyonlar" denir
		
		System.out.println(faktoriyel(8));
		
		System.out.println("====================");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(fibonacci(i));
		}
		
		//Statik anahtar kelimesi: 
		
		/*
		 * static anahtar kelimesi s�n�flarda her nesne olu�turdu�umuzda bu anahtar kelimenin yer ald���
		 * de�i�kenler belle�e bir daha yazd�r�lmaz, b�ylece bellekten kazan� elde edilir
		 * Metodlarda ise hi� nesne olu�turmadan, direk s�n�f ad�yla o metoda eri�memizi sa�lar.
		 */
		
		
		///////////////////////////
		// Kullan�c�dan girdi alma.
		
		Scanner s = new Scanner(System.in);
		
		int numara = s.nextInt();
		System.out.println("Girilen De�er = " + numara);
		
		String metin = s.next();
		System.out.println("Girilen String de�eri = " + metin);
				
		//JOptionPane S�n�f�.
		
		String girdi = JOptionPane.showInputDialog("Bir Sayi Giriniz");
		
		if(Integer.parseInt(girdi) >= 50) {
			JOptionPane.showMessageDialog(null, "Girilen De�er 50'den B�y�k", "Sonu�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Girilen De�er 50'den K���k", "Sonu�", JOptionPane.ERROR_MESSAGE);
		}
		
		TahminOyunu(852, 5);
	}
	
	static void mesajAl(String s) {
		String mesaj = JOptionPane.showInputDialog(s); //s = "Bir sayi girin" ///// Bir sayi girin: <>
		System.out.println(mesaj);
	}
	
	static String metod() { //Parametresiz metodlar, Depolama
		return "Bu De�er Bir Metod ile D�nd�r�lm��t�r";
	}
	
	static int degisken() { 
		return sayi;
	}
	
	static int topla(int a, int b) { //Parametre alan metodlard�r. Her t�rl� i�lem i�in kullan�labilirler.
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
				JOptionPane.showMessageDialog(null, "Kazand�n�z", "Tahmin Oyunu", JOptionPane.DEFAULT_OPTION);
				break;
			} else
				JOptionPane.showMessageDialog(null, "Tekrar Deneyiniz", "Tahmin Oyunu", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	// a, b ; a ve b uzunluklar�na sahip bir dikd�rtgen olu�turacak.
	
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
