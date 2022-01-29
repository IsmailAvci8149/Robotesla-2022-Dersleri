package nesne_tabanli_programlama;

public class ÇokBiçimlilik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UstSýnýf u = new UstSýnýf();
		AltSýnýf a1 = new AltSýnýf();
		AltSýnýf2 a2 = new AltSýnýf2();
		
		// AltSýnýf bir UstSýnýftýr. Dolayýsýyla biz ustSýnýf nesnesinde AltSýnýf Referansý Tutabiliriz
		
		yaz(u);
		yaz(a1);
		yaz(a2);
		
		//bir nesnenin birden fazla referans alarak, Birden fazla þekilde davranmasýna
		//Çokbiçimlilik(Polimorfizm) denir. 
		
		//yani bir sýnýfýn nesnesinin türü deðil, referansýnýn türü çalýþýr.
		
		//Biz bu koda göre nesnelerin tuttuðu referanslarý tahmin edebiliriz (Erken Baðlama). ama bunun tersi, yani tahmin edemeyeðimiz durumlar da olabilir. Mesela kodun çalýþma zamanýnda
		//rastgele bir biçimde upcasting yaparsak bu referanslar çalýþma zamanýnda (RunTime) belli olur. buna geç baðlama denir.
		
		// instanceof operatörü : bir nesnenin sýnýfýný kontrol etmek için kullanýlýr. 
		
		Integer i = Integer.valueOf(50);
		Long l = Long.valueOf(86451546846548651l);
		
		System.out.println(i instanceof Integer);
		System.out.println(l instanceof Long);
		
		System.out.println(a1 instanceof AltSýnýf); //true
		System.out.println(a1 instanceof UstSýnýf); //true
		System.out.println(a2 instanceof AltSýnýf2); //true
		
		// Sýnýflar Arasýnda kurulan hiyerarþi, nesnelere de yansýr.
	}

	public static void yaz(UstSýnýf c) {
		c.yazdýr();
		
		//new AltSýnýf().yazdýr();
	}
}

class UstSýnýf {
	public void yazdýr() {
		System.out.println("BU SINIF CANLI SINIFI");
	}
}

class AltSýnýf extends UstSýnýf {
	public void yazdýr() {
		System.out.println("BU SINIF ÖKARYOT SINIFI");
	}
}

class AltSýnýf2 extends UstSýnýf{
	public void yazdýr() {
		System.out.println("BU SINIF BAKTERÝ SINIFI");
	}
}

class AltSýnýf3 extends UstSýnýf{
	public void yazdýr() {
		System.out.println("BU SINIF ARKE SINIFI");
	}
}