package temeller; // S�n�f�m�z hangi dosyan�n alt�nda onu soyler.

import java.util.Scanner;

public class Veri_Tipleri_ve_Degiskenler {
	
	static String tarih = "24/11/2021"; //global de�i�kendir

	public static void main(String[] args) {
		// <�zel Anahtar kelimeler> <Veri Tipini> <De�i�ken Ad�> = <De�eri>;
		// Veri tipleri Java da ikiye ayr�l�r: Primitif(ilkel) tipler, Referanslar 
		
		//Primitif tipler
		// bir de�ere i�aret ederler
		
		// Say� tutan tiplerimiz: byte (0, 255), short(-64000, 64000), int(2^32), long(2^64)
		// Kesir tutan tiplerimiz: float(2^32), double(2^64)
		// Karakterlerimiz: char 
		// Mant�ksal De�er: boolean
		final byte bit = 25;
		short sh = 1589;
		int tamsayi = 20256559;
		long daha_uzun_tamsayi = 123456789101l; //Not: long tipindeki tan�mlamalarda sona L eklenir
		
		float pi = 3.14159f; //Not: Float tipindeki tan�mlamalarda sona F eklenir
		double e = 2.71812181249;
		
		char karakter = 'A';
		char karakter2 = 102;
		
		boolean p = true;
		boolean q = false;
		
		int pi_tamsay�i = (int) pi;
		
		float short_float = (float) sh;
		
		System.out.println(bit);
		System.out.println(sh);
		System.out.println(tamsayi);
		System.out.println(daha_uzun_tamsayi);
		
		System.out.println(pi);
		System.out.println(e);
		
		System.out.println(karakter);
		System.out.println(karakter2);
		
		System.out.println(p);
		System.out.println(q);
		
		// Referans tipler:
		// bir yap�ya i�eret ederler
		
		// Metinleri saklayan: String (Karakter Dizisi, s�ras�)
		/*
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * 
		 * float -> Float
		 * double -> Double
		 * 
		 * char -> Char
		 * 
		 * boolean -> Boolean
		 */
		
		String isimler = "Ismail Avc�, Ahmet Akbal, Melike Do�an";
		
		Integer deger = 89; //Boxing
		
		System.out.println(isimler);
		System.out.println(deger); //Unboxing
		
		//Boxing, Unboxing
		//Boxing: bir de�eri referansa atamak
		//Unboxing: bu de�eri primitif bir tipte kullanmak
		
		//De�i�kenlerin tan�mland�klar� yerlere g�re ikiye ayr�l�rlar
		//Lokal De�i�kenler:
		//	bir yap�n�n i�inde tan�mlanan de�i�kenlerdir. o yap�dan ba�ka yerde kullan�lamazlar.
		//Global De�i�kenler:
		//	hee yerde kullan�labilen de�i�kenlerdir. genelde s�n�flarda tan�mlan�rlar. 
		
		//S�n�f -> metod -> yap� -> yap�
		
		System.out.println(tarih);
		
		// var anahtar kelimesi:
		// joker veri tipidir. tek dezavantaj� tan�mlama an�nda de�er atanmal�d�r.
		int a;
		a = 55;
		
		//Sabitler: "final"	
		
		//Tip d�n���mleri: veri tiplerini birbirine �evirmemizi sa�lar
		//Metodla: 
		//Casting: 
		
		System.out.println(Integer.parseInt("2548"));
	}
}
