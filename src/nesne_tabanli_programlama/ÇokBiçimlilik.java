package nesne_tabanli_programlama;

public class �okBi�imlilik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UstS�n�f u = new UstS�n�f();
		AltS�n�f a1 = new AltS�n�f();
		AltS�n�f2 a2 = new AltS�n�f2();
		
		// AltS�n�f bir UstS�n�ft�r. Dolay�s�yla biz ustS�n�f nesnesinde AltS�n�f Referans� Tutabiliriz
		
		yaz(u);
		yaz(a1);
		yaz(a2);
		
		//bir nesnenin birden fazla referans alarak, Birden fazla �ekilde davranmas�na
		//�okbi�imlilik(Polimorfizm) denir. 
		
		//yani bir s�n�f�n nesnesinin t�r� de�il, referans�n�n t�r� �al���r.
		
		//Biz bu koda g�re nesnelerin tuttu�u referanslar� tahmin edebiliriz (Erken Ba�lama). ama bunun tersi, yani tahmin edemeye�imiz durumlar da olabilir. Mesela kodun �al��ma zaman�nda
		//rastgele bir bi�imde upcasting yaparsak bu referanslar �al��ma zaman�nda (RunTime) belli olur. buna ge� ba�lama denir.
		
		// instanceof operat�r� : bir nesnenin s�n�f�n� kontrol etmek i�in kullan�l�r. 
		
		Integer i = Integer.valueOf(50);
		Long l = Long.valueOf(86451546846548651l);
		
		System.out.println(i instanceof Integer);
		System.out.println(l instanceof Long);
		
		System.out.println(a1 instanceof AltS�n�f); //true
		System.out.println(a1 instanceof UstS�n�f); //true
		System.out.println(a2 instanceof AltS�n�f2); //true
		
		// S�n�flar Aras�nda kurulan hiyerar�i, nesnelere de yans�r.
	}

	public static void yaz(UstS�n�f c) {
		c.yazd�r();
		
		//new AltS�n�f().yazd�r();
	}
}

class UstS�n�f {
	public void yazd�r() {
		System.out.println("BU SINIF CANLI SINIFI");
	}
}

class AltS�n�f extends UstS�n�f {
	public void yazd�r() {
		System.out.println("BU SINIF �KARYOT SINIFI");
	}
}

class AltS�n�f2 extends UstS�n�f{
	public void yazd�r() {
		System.out.println("BU SINIF BAKTER� SINIFI");
	}
}

class AltS�n�f3 extends UstS�n�f{
	public void yazd�r() {
		System.out.println("BU SINIF ARKE SINIFI");
	}
}