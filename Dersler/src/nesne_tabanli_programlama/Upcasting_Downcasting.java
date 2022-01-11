package nesne_tabanli_programlama;

import java.util.*;

@SuppressWarnings("unused")
class Upcasting_Downcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varlýk nesne1 = new Varlýk();
		Canlý nesne2 = new Canlý();
		Hayvan nesne3 = new Hayvan();
		Omurgalý nesne4 = new Omurgalý();
		
		nesne1.adSöyle();
		nesne2.adSöyle();
		nesne3.adSöyle();
		nesne4.adSöyle();
		
		Varlýk v = new Varlýk(); // Her varlýk bir varlýktýr
		Varlýk c = new Canlý(); // Her Canlý bir varlýktýr -> Canlý Sýnýfýnýn deðerini Varlýða atayabiliriz. Çünkü her canlý bir varlýktýr.
		Varlýk h = new Hayvan(); // Her Hayvan bir varlýktýr -> Hayvan Sýnýfýnýn deðerini Varlýða atayabiliriz Çünkü her Hayvan bir Varlýktýr.
		Varlýk o = new Omurgalý(); // Her omurgalý bir varlýktýr
		
		Hayvan o2 = new Omurgalý(); // Her omurgalý bir Hayvandýr
		
		v.adSöyle();
		c.adSöyle();
		h.adSöyle();
		o.adSöyle();
		o2.adSöyle(); //Her Omurgalý bir Hayvandýr
		
		List<String> liste = new ArrayList<String>(); //upcasting
		//Her ArrayList bir List dir. -> ArrayList<> extends List<>
		
		//upcasting
		Canlý köpek = new Canlý(); //Bir köpek nesnesi oluþturduk. Bu köpek nesnesi Canlý sýnýfýnýn referansýna sahip
		Varlýk var = köpek; // köpek nesnesini (Canlý sýnýfýnýn referansý) Varlýk nesnesine atadýk. //köpek bir varlýktýr.
		
		//downcasting
		Canlý A = (Canlý) var; //var nesnesini (Varlýk Sýnýfýnýn referansý) bir canlý sýnýfýna atamaya çalýþtýk. ama olmaz çünkü "Her Canlý bir canlýdýr". typecasting kullandýk.
		A.adSöyle();
		
		//Tip dönüþümü ile downcasting yaptýk. bunun sebebi ise upcastingden dolayý elimizde bir üstsýnýfýn referansýnýn olmasýydý.
	}
	
	//UpCasting : Üst Sýnýf nesnelerinde Alt sýnýftan veri tanýmlamak. Sonuç: Üstsýnýflarýn nesnelerinde, Alt sýnýflarýn referanslarýný tutuabiliriz.
	//DownCasting : ÜstSýnýflardaki deðerleri altsýnýflarýn cinsinden almak. Bunu yapabilmek için typecasting kullanacaðýz.
}
/*
 * Varlýk
 * 
 * Canlý
 * 
 * Hayvan
 * 
 * Omurgalý
 */

class Varlýk {
	public void adSöyle() {
		System.out.println("Bu Sýnýf Varýk Sýnýfýdýr");
	}
}

class Canlý extends Varlýk {
	public void adSöyle() {
		System.out.println("Bu Sýnýf Canlý Sýnýfýdýr");
	}
}

class Hayvan extends Canlý {
	public void adSöyle() {
		System.out.println("Bu sýnýf Hayvan Sýnýfýdýr");
	}
}

class Omurgalý extends Hayvan {
	public void adSöyle() {
		System.out.println("Bu sýnýf Omurgalý Sýnýfýdýr");
	}
}