package nesne_tabanli_programlama;

import static java.lang.Math.PI;
import static java.lang.Math.*;
import java.util.*;

//Not: Y�ld�z i�areti (*) o dosyadaki t�m kodu s�n�fa ekler.

public class S�n�flar_ve_Nesneler_Main {
	//S�n�flar nesnelerin �ablonlar�, Kullan�m K�lavuzalar�d�r. Biz nesnelerin �zellikleri, yetileri gibi bilgileri S�n�flar �zerinden belirtiriz. 
	
	//Nesne S�zdizimi:
	// <Eri�im Belirleyiciler*> <�zel Anahtar Kelimeler*> <S�n�f Ad�> <Nesne Ad�> = new <S�n�fAd�(Costurctor)>(<Varsa Yap�c� Parametreler>);
	
	@SuppressWarnings({"static-access", "unused"})
	public static void main(String[] args) {
		S�n�flar_Ve_Nesneler ilkNesne = new S�n�flar_Ve_Nesneler(5, "15/12/2021", "�smail Avc�");
		S�n�flar_Ve_Nesneler ikinciNesne = new S�n�flar_Ve_Nesneler(10, "8/01/2022", "Melike Do�an");
		S�n�flar_Ve_Nesneler ucuncuNesne = new S�n�flar_Ve_Nesneler(15, "16/01/2022", "Harun Abdullah Yakan");
		S�n�flar_Ve_Nesneler dorduncuNesne = new S�n�flar_Ve_Nesneler();
		
		System.out.println(ilkNesne.degisken);
		System.out.println(ilkNesne.Tarih);
		System.out.println(ilkNesne.Yazar);
		System.out.println(ilkNesne.s�n�fDegiskeni);
		
		ilkNesne.s�n�fDegiskeni = 125;
		
		int fcgvhbjn;
		
		System.out.println(ikinciNesne.degisken);
		System.out.println(ikinciNesne.Tarih);
		System.out.println(ikinciNesne.Yazar);
		System.out.println(ikinciNesne.s�n�fDegiskeni);
		
		System.out.println(ucuncuNesne.degisken);
		System.out.println(ucuncuNesne.Tarih);
		System.out.println(ucuncuNesne.Yazar);
		System.out.println(ucuncuNesne.s�n�fDegiskeni);
		
		System.out.println(dorduncuNesne.degisken);
		System.out.println(dorduncuNesne.Tarih);
		System.out.println(dorduncuNesne.Yazar);
		System.out.println(dorduncuNesne.s�n�fDegiskeni);
		
		//new Operat�r�: new Op. bize referasn tipinden bir de�i�ken i�in bellekten alan ay�r�lmas�n� sa�lar. Primitif tiplerin aksine Referans tiplerinin belle�e atanmas�
		//Olduk�a karmas�ikt�r. ��nk� atad���m�z veri tipi sadece 1 ve 0 lardan olu�maz, bunun yan�s�ra bellek adresleri gibi daha geli�mi� alanlar tutar. Bu y�zden primitif
		//tiplerde new op. ihtiya� duyulmazken, Referans tiplerinde duyulur. 
		
		//Costructor Metodlar: S�n�flara ba�lang�� de�erleri atamak i�in kullan�lan, ya da o s�n�f�n i�indeki kodlar� haz�rlamak i�in kullan�lan bir metoddur. Her s�n�fta 
		//tan�ml�d�r. biz tan�mlamasak dahi derleyici onu tan�mlar. Nesneler derleyici taraf�ndan okundu�u an �al��t�r�l�rlar. 
		
		//Her nesne olu�turuldu�unda bellekte o s�n�fa, o �ablona, g�re bir referans tipinde bellek ayr�l�r. Bu y�zden bu alanlar birbirinden ba��ms�z �al���rlar. 
		
		int a = 5; //0000 0000 0000 ... 0101
		Integer b = 25;
		int dizi[] = {25, 54, 48, 44, 78, 55, 22};
		//Pass by Value = De�er ile atama. -> Atanan de�erin kopyas� �zerinde i�lem yap�l�r
		ilkNesne.deger(a); //a -> metodDegiskeni; metodDegiskeni +2; metodDegiskeni yazd�r. 
		System.out.println(a); 
		
		//Pass by Referance = Referans ile de�er atama. -> Atanan de�erin kendisi �zerinde i�lem yap�l�r.
		ilkNesne.variable = 10;
		ilkNesne.ref(ilkNesne);
		System.out.println(ilkNesne.variable);
		
		/*
		 * C/C++: Arduinoda kullan�l�rlar. Javaya k�yasla �ok daha dinamik yani programlarla bilgisayar�n kontrol� daha rahat. Bunun i�in piyasadaki g�zde programlama
		 * dillerindendir. 
		 * 
		 * C/c++ da bellek y�netimini yapmama�z� sa�layan yap�lar vard�r. Bu yap�lara ��aret�i(Pointer) ad� verilir. Tamamen Referans �zerine kuruludur.
		 *  
		 * C/C++ da pointer, yani bir referans, olu�turmak i�in bunlar� tan�mlamam�z laz�md�r. Bir pointer tan�mlamak i�in ise de�i�ken ad�ndan hemen �nce * i�areti konulur.
		 * 
		 * int a; -> Bir de�er
		 * 
		 * int *ref; -> bir pointer, referans. 
		 * 
		 * bu referanslar bellekteki bir alan� g�stermeleri gerekti�inden dolay� bir alan ad�, belle�in bir adresini tutarlar.
		 * 
		 * ref = &a; -> Bu i�aret�iye a n�n bellek adresini ata. 
		 * 
		 * a
		 */
		
		ilkNesne.dizi(dizi);
		//Dizilerin kendisi de bir referans tipidir. Metodlara indisleri olmadan atan�rlarsa direk �zerlerinde i�lem yap�l�r.
		for(int temp : dizi) 
			System.out.println(temp);
		
		System.out.println(ilkNesne);
		
		//Primitif olmayan, Referans olan veri tipleri parametre olarak atan�rsa Referans olarak kabul edilirler. Yani bir kopyas� olu�turulmaz, direk parametredeki de�erler
		//�zerinde i�lem yap�l�r. 
		
		////////////////////////////////////
		System.out.println("=================================");
		
		Depolama d = new Depolama("�smail", 16);
		
		System.out.println(d.degisken); // private olan "gizli" de�i�kenine eri�imi sa�lad�k.
		System.out.println(Depolama.getGizli());
		Depolama.setGizli(9005);
		System.out.println(Depolama.getGizli());
		
		System.out.println(d.getIsim());
		System.out.println(d.getYa�());
		System.out.println(d.getNumara());
		
		Depolama d2 = new Depolama("Melike", 16, 1234);
		
		System.out.println(d2.getIsim());
		System.out.println(d2.getYa�());
		System.out.println(d2.getNumara());
		
		System.out.println();
		System.out.println(Depolama.cevre(13.25856));
		//System.out.println(pow(13.2454, 0.2));
		
		System.out.println(pow(16, 0.256)); //1/2 = 0.5 = 0 = 5^0 = 1
		
		System.out.println(metod(5, 125));
		System.out.println(metod2(25, 125));
		
		///////////////////////////////////////
		//Numaraland�rma: Enumeration, Enum.
		//
		//Numaraland�rma daha �nce kullan�lmak �zere sabit tan�mlamad�r. Bir durumu tan�mlamak i�in kullan�l�r. 
	}

	@Deprecated
	public static int metod(int a, int b) { //-> Art�k derleyici bu metodu eski olarak yorumlar. Bu metodu kullananlar i�in bir i�aret gibi davran�r.
		System.out.println("Bu metodun art�k s�r�m� ge�ti. Kullan�lmas� Sak�ncal�d�r.");
		
		// 5 x 4 = 5 + 5 + 5 + 5
		int sonuc = 0;
		for(int i = 0; i < b; i++)
			sonuc += a;
		
		return sonuc;
	}
	
	public static int metod2(int a, int b) {
		System.out.println("Bu metod eskisine g�re �ok daha iyi ve yeni.");
		
		return a*b;
	}
}
