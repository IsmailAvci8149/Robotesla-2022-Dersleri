package nesne_tabanli_programlama;

import static java.lang.Math.PI;
import static java.lang.Math.*;
import java.util.*;

//Not: Yýldýz iþareti (*) o dosyadaki tüm kodu sýnýfa ekler.

public class Sýnýflar_ve_Nesneler_Main {
	//Sýnýflar nesnelerin þablonlarý, Kullaným Kýlavuzalarýdýr. Biz nesnelerin özellikleri, yetileri gibi bilgileri Sýnýflar Üzerinden belirtiriz. 
	
	//Nesne Sözdizimi:
	// <Eriþim Belirleyiciler*> <Özel Anahtar Kelimeler*> <Sýnýf Adý> <Nesne Adý> = new <SýnýfAdý(Costurctor)>(<Varsa Yapýcý Parametreler>);
	
	@SuppressWarnings({"static-access", "unused"})
	public static void main(String[] args) {
		Sýnýflar_Ve_Nesneler ilkNesne = new Sýnýflar_Ve_Nesneler(5, "15/12/2021", "Ýsmail Avcý");
		Sýnýflar_Ve_Nesneler ikinciNesne = new Sýnýflar_Ve_Nesneler(10, "8/01/2022", "Melike Doðan");
		Sýnýflar_Ve_Nesneler ucuncuNesne = new Sýnýflar_Ve_Nesneler(15, "16/01/2022", "Harun Abdullah Yakan");
		Sýnýflar_Ve_Nesneler dorduncuNesne = new Sýnýflar_Ve_Nesneler();
		
		System.out.println(ilkNesne.degisken);
		System.out.println(ilkNesne.Tarih);
		System.out.println(ilkNesne.Yazar);
		System.out.println(ilkNesne.sýnýfDegiskeni);
		
		ilkNesne.sýnýfDegiskeni = 125;
		
		int fcgvhbjn;
		
		System.out.println(ikinciNesne.degisken);
		System.out.println(ikinciNesne.Tarih);
		System.out.println(ikinciNesne.Yazar);
		System.out.println(ikinciNesne.sýnýfDegiskeni);
		
		System.out.println(ucuncuNesne.degisken);
		System.out.println(ucuncuNesne.Tarih);
		System.out.println(ucuncuNesne.Yazar);
		System.out.println(ucuncuNesne.sýnýfDegiskeni);
		
		System.out.println(dorduncuNesne.degisken);
		System.out.println(dorduncuNesne.Tarih);
		System.out.println(dorduncuNesne.Yazar);
		System.out.println(dorduncuNesne.sýnýfDegiskeni);
		
		//new Operatörü: new Op. bize referasn tipinden bir deðiþken için bellekten alan ayýrýlmasýný saðlar. Primitif tiplerin aksine Referans tiplerinin belleðe atanmasý
		//Oldukça karmasþiktýr. Çünkü atadýðýmýz veri tipi sadece 1 ve 0 lardan oluþmaz, bunun yanýsýra bellek adresleri gibi daha geliþmiþ alanlar tutar. Bu yüzden primitif
		//tiplerde new op. ihtiyaç duyulmazken, Referans tiplerinde duyulur. 
		
		//Costructor Metodlar: Sýnýflara baþlangýç deðerleri atamak için kullanýlan, ya da o sýnýfýn içindeki kodlarý hazýrlamak için kullanýlan bir metoddur. Her sýnýfta 
		//tanýmlýdýr. biz tanýmlamasak dahi derleyici onu tanýmlar. Nesneler derleyici tarafýndan okunduðu an çalýþtýrýlýrlar. 
		
		//Her nesne oluþturulduðunda bellekte o sýnýfa, o þablona, göre bir referans tipinde bellek ayrýlýr. Bu yüzden bu alanlar birbirinden baðýmsýz çalýþýrlar. 
		
		int a = 5; //0000 0000 0000 ... 0101
		Integer b = 25;
		int dizi[] = {25, 54, 48, 44, 78, 55, 22};
		//Pass by Value = Deðer ile atama. -> Atanan deðerin kopyasý üzerinde iþlem yapýlýr
		ilkNesne.deger(a); //a -> metodDegiskeni; metodDegiskeni +2; metodDegiskeni yazdýr. 
		System.out.println(a); 
		
		//Pass by Referance = Referans ile deðer atama. -> Atanan deðerin kendisi üzerinde iþlem yapýlýr.
		ilkNesne.variable = 10;
		ilkNesne.ref(ilkNesne);
		System.out.println(ilkNesne.variable);
		
		/*
		 * C/C++: Arduinoda kullanýlýrlar. Javaya kýyasla çok daha dinamik yani programlarla bilgisayarýn kontrolü daha rahat. Bunun için piyasadaki gözde programlama
		 * dillerindendir. 
		 * 
		 * C/c++ da bellek yönetimini yapmamaýzý saðlayan yapýlar vardýr. Bu yapýlara Ýþaretçi(Pointer) adý verilir. Tamamen Referans üzerine kuruludur.
		 *  
		 * C/C++ da pointer, yani bir referans, oluþturmak için bunlarý tanýmlamamýz lazýmdýr. Bir pointer tanýmlamak için ise deðiþken adýndan hemen önce * iþareti konulur.
		 * 
		 * int a; -> Bir deðer
		 * 
		 * int *ref; -> bir pointer, referans. 
		 * 
		 * bu referanslar bellekteki bir alaný göstermeleri gerektiðinden dolayý bir alan adý, belleðin bir adresini tutarlar.
		 * 
		 * ref = &a; -> Bu iþaretçiye a nýn bellek adresini ata. 
		 * 
		 * a
		 */
		
		ilkNesne.dizi(dizi);
		//Dizilerin kendisi de bir referans tipidir. Metodlara indisleri olmadan atanýrlarsa direk üzerlerinde iþlem yapýlýr.
		for(int temp : dizi) 
			System.out.println(temp);
		
		System.out.println(ilkNesne);
		
		//Primitif olmayan, Referans olan veri tipleri parametre olarak atanýrsa Referans olarak kabul edilirler. Yani bir kopyasý oluþturulmaz, direk parametredeki deðerler
		//Üzerinde iþlem yapýlýr. 
		
		////////////////////////////////////
		System.out.println("=================================");
		
		Depolama d = new Depolama("Ýsmail", 16);
		
		System.out.println(d.degisken); // private olan "gizli" deðiþkenine eriþimi saðladýk.
		System.out.println(Depolama.getGizli());
		Depolama.setGizli(9005);
		System.out.println(Depolama.getGizli());
		
		System.out.println(d.getIsim());
		System.out.println(d.getYaþ());
		System.out.println(d.getNumara());
		
		Depolama d2 = new Depolama("Melike", 16, 1234);
		
		System.out.println(d2.getIsim());
		System.out.println(d2.getYaþ());
		System.out.println(d2.getNumara());
		
		System.out.println();
		System.out.println(Depolama.cevre(13.25856));
		//System.out.println(pow(13.2454, 0.2));
		
		System.out.println(pow(16, 0.256)); //1/2 = 0.5 = 0 = 5^0 = 1
		
		System.out.println(metod(5, 125));
		System.out.println(metod2(25, 125));
		
		///////////////////////////////////////
		//Numaralandýrma: Enumeration, Enum.
		//
		//Numaralandýrma daha önce kullanýlmak üzere sabit tanýmlamadýr. Bir durumu tanýmlamak için kullanýlýr. 
	}

	@Deprecated
	public static int metod(int a, int b) { //-> Artýk derleyici bu metodu eski olarak yorumlar. Bu metodu kullananlar için bir iþaret gibi davranýr.
		System.out.println("Bu metodun artýk sürümü geçti. Kullanýlmasý Sakýncalýdýr.");
		
		// 5 x 4 = 5 + 5 + 5 + 5
		int sonuc = 0;
		for(int i = 0; i < b; i++)
			sonuc += a;
		
		return sonuc;
	}
	
	public static int metod2(int a, int b) {
		System.out.println("Bu metod eskisine göre çok daha iyi ve yeni.");
		
		return a*b;
	}
}
