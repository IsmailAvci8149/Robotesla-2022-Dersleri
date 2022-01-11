package nesne_tabanli_programlama;

public class Soyutlama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soyutlamanýn amacý sýnýflarda bir taným yerine, bir þablon oluþturmaktýr.
		
		//Þablon - Nesne
		//
		//		1 yumurta
		//		2 bardak un
		//		1 bardak þeker...
		
		//Nesne: Kek
		
		//Soyutlama:
		//
		//		5 Yumurta
		//		3 Bardak un
		//		0 þeker
		//		0 kabartma tozu...
		//		1 bardak süt
		
		//		krep
		
		//Alan Hesaplama:
		// Þeklin ismi (getter, setter)  Tanýmlarýz
		
		// Þeklin Alaný(); Tanýmlamadan, Sadece adýný aktarabiliriz.
		
		//Kare extends AlanHesaplama -> Þeklin ismi, Karenin Alaný
		//Üçgen extends AlanHesaplama -> Þeklime ismi, Üçgenin Alaný
		
		//Bir Formattan þablon üretme.
		
		Üçgen A = new Üçgen(5, 8);
		Dikdörtgen ABCD = new Dikdörtgen(6, 11);
		Yamuk y = new Yamuk(5, 8, 4);
		
		System.out.println(A.getAd() + " Alaný : " + A.SekilAlaný());
		System.out.println(ABCD.getAd() + " Alaný : " + ABCD.SekilAlaný());
		System.out.println(y.getAd() + " Alaný : " + y.SekilAlaný());
	}
}

abstract class Alan {
	public String sekilAdý = "";
	
	public String getAd() {
		return sekilAdý;
	}
	
	public void setAd(String ad) {
		this.sekilAdý = ad;
	}
	
	public abstract int SekilAlaný(); //Üçgen, Kare, Dikdörtgen, Daire... 
	//Bu metod soyut olarak tanýmlandýðý için artýk kalýtýlan yerlerde tanýmlanacak
	
	public int alan(int a, int b) {
		return 0;
	}
}

class Üçgen extends Alan {
	private int h;
	private int t;
	
	public Üçgen(int h, int t) {
		this.h = h;
		this.t = t;
		
		super.setAd("Üçgen");
	}

	@Override
	public int SekilAlaný() {
		// TODO Auto-generated method stub
		return (h*t)/2;
	}
	//Buradaki metod üstsýnýfýn soyut bir metodu olduðu için yeniden tanýmlanmasý gerekir. Yani Override edilmesi gerekir.
}

class Dikdörtgen extends Alan{
	private int a;
	private int b;
	
	public Dikdörtgen(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		
		super.setAd("Dikdörtgen");
	}
	
	@Override
	public int SekilAlaný() {
		// TODO Auto-generated method stub
		return a * b;
	}
	
}

class Yamuk extends Alan {
	private int a;
	private int b;
	private int h;
	
	public Yamuk(int a, int b, int h) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.h = h;
		
		super.setAd("Yamuk");
	}

	@Override
	public int SekilAlaný() {
		// TODO Auto-generated method stub
		return ((a+b)/2)*h;
	}
}