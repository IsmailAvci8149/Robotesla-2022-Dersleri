package temeller; // Sýnýfýmýz hangi dosyanýn altýnda onu soyler.

import java.util.Scanner;

public class Veri_Tipleri_ve_Degiskenler {
	
	static String tarih = "24/11/2021"; //global deðiþkendir

	public static void main(String[] args) {
		// <Özel Anahtar kelimeler> <Veri Tipini> <Deðiþken Adý> = <Deðeri>;
		// Veri tipleri Java da ikiye ayrýlýr: Primitif(ilkel) tipler, Referanslar 
		
		//Primitif tipler
		// bir deðere iþaret ederler
		
		// Sayý tutan tiplerimiz: byte (0, 255), short(-64000, 64000), int(2^32), long(2^64)
		// Kesir tutan tiplerimiz: float(2^32), double(2^64)
		// Karakterlerimiz: char 
		// Mantýksal Deðer: boolean
		final byte bit = 25;
		short sh = 1589;
		int tamsayi = 20256559;
		long daha_uzun_tamsayi = 123456789101l; //Not: long tipindeki tanýmlamalarda sona L eklenir
		
		float pi = 3.14159f; //Not: Float tipindeki tanýmlamalarda sona F eklenir
		double e = 2.71812181249;
		
		char karakter = 'A';
		char karakter2 = 102;
		
		boolean p = true;
		boolean q = false;
		
		int pi_tamsayýi = (int) pi;
		
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
		// bir yapýya iþeret ederler
		
		// Metinleri saklayan: String (Karakter Dizisi, sýrasý)
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
		
		String isimler = "Ismail Avcý, Ahmet Akbal, Melike Doðan";
		
		Integer deger = 89; //Boxing
		
		System.out.println(isimler);
		System.out.println(deger); //Unboxing
		
		//Boxing, Unboxing
		//Boxing: bir deðeri referansa atamak
		//Unboxing: bu deðeri primitif bir tipte kullanmak
		
		//Deðiþkenlerin tanýmlandýklarý yerlere göre ikiye ayrýlýrlar
		//Lokal Deðiþkenler:
		//	bir yapýnýn içinde tanýmlanan deðiþkenlerdir. o yapýdan baþka yerde kullanýlamazlar.
		//Global Deðiþkenler:
		//	hee yerde kullanýlabilen deðiþkenlerdir. genelde sýnýflarda tanýmlanýrlar. 
		
		//Sýnýf -> metod -> yapý -> yapý
		
		System.out.println(tarih);
		
		// var anahtar kelimesi:
		// joker veri tipidir. tek dezavantajý tanýmlama anýnda deðer atanmalýdýr.
		int a;
		a = 55;
		
		//Sabitler: "final"	
		
		//Tip dönüþümleri: veri tiplerini birbirine çevirmemizi saðlar
		//Metodla: 
		//Casting: 
		
		System.out.println(Integer.parseInt("2548"));
	}
}
