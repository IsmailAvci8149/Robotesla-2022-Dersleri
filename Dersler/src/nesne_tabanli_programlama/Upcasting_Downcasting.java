package nesne_tabanli_programlama;

import java.util.*;

@SuppressWarnings("unused")
class Upcasting_Downcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varl�k nesne1 = new Varl�k();
		Canl� nesne2 = new Canl�();
		Hayvan nesne3 = new Hayvan();
		Omurgal� nesne4 = new Omurgal�();
		
		nesne1.adS�yle();
		nesne2.adS�yle();
		nesne3.adS�yle();
		nesne4.adS�yle();
		
		Varl�k v = new Varl�k(); // Her varl�k bir varl�kt�r
		Varl�k c = new Canl�(); // Her Canl� bir varl�kt�r -> Canl� S�n�f�n�n de�erini Varl��a atayabiliriz. ��nk� her canl� bir varl�kt�r.
		Varl�k h = new Hayvan(); // Her Hayvan bir varl�kt�r -> Hayvan S�n�f�n�n de�erini Varl��a atayabiliriz ��nk� her Hayvan bir Varl�kt�r.
		Varl�k o = new Omurgal�(); // Her omurgal� bir varl�kt�r
		
		Hayvan o2 = new Omurgal�(); // Her omurgal� bir Hayvand�r
		
		v.adS�yle();
		c.adS�yle();
		h.adS�yle();
		o.adS�yle();
		o2.adS�yle(); //Her Omurgal� bir Hayvand�r
		
		List<String> liste = new ArrayList<String>(); //upcasting
		//Her ArrayList bir List dir. -> ArrayList<> extends List<>
		
		//upcasting
		Canl� k�pek = new Canl�(); //Bir k�pek nesnesi olu�turduk. Bu k�pek nesnesi Canl� s�n�f�n�n referans�na sahip
		Varl�k var = k�pek; // k�pek nesnesini (Canl� s�n�f�n�n referans�) Varl�k nesnesine atad�k. //k�pek bir varl�kt�r.
		
		//downcasting
		Canl� A = (Canl�) var; //var nesnesini (Varl�k S�n�f�n�n referans�) bir canl� s�n�f�na atamaya �al��t�k. ama olmaz ��nk� "Her Canl� bir canl�d�r". typecasting kulland�k.
		A.adS�yle();
		
		//Tip d�n���m� ile downcasting yapt�k. bunun sebebi ise upcastingden dolay� elimizde bir �sts�n�f�n referans�n�n olmas�yd�.
	}
	
	//UpCasting : �st S�n�f nesnelerinde Alt s�n�ftan veri tan�mlamak. Sonu�: �sts�n�flar�n nesnelerinde, Alt s�n�flar�n referanslar�n� tutuabiliriz.
	//DownCasting : �stS�n�flardaki de�erleri alts�n�flar�n cinsinden almak. Bunu yapabilmek i�in typecasting kullanaca��z.
}
/*
 * Varl�k
 * 
 * Canl�
 * 
 * Hayvan
 * 
 * Omurgal�
 */

class Varl�k {
	public void adS�yle() {
		System.out.println("Bu S�n�f Var�k S�n�f�d�r");
	}
}

class Canl� extends Varl�k {
	public void adS�yle() {
		System.out.println("Bu S�n�f Canl� S�n�f�d�r");
	}
}

class Hayvan extends Canl� {
	public void adS�yle() {
		System.out.println("Bu s�n�f Hayvan S�n�f�d�r");
	}
}

class Omurgal� extends Hayvan {
	public void adS�yle() {
		System.out.println("Bu s�n�f Omurgal� S�n�f�d�r");
	}
}