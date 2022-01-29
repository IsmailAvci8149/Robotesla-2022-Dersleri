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
		
		//joker metodlar tanýmlamamýzý saðlarlar
		
		Üçgen A = new Üçgen(5, 8);
		Dikdörtgen ABCD = new Dikdörtgen(6, 11);
		Yamuk y = new Yamuk(5, 8, 4);
		Daire d = new Daire(8);
		
		System.out.println(A.getAd() + " Alaný : " + A.SekilAlaný());
		System.out.println(ABCD.getAd() + " Alaný : " + ABCD.SekilAlaný());
		System.out.println(y.getAd() + " Alaný : " + y.SekilAlaný());
		System.out.println(d.getAd() + " Alaný : " + d.SekilAlaný());
	}
}

abstract class Alan { // eðer bir sýnýfta soyut bir metod varsa, diðer metodlar ne olursa olsun o sýnýf da soyut olarak tanýmlanmalýdýr.
	
	private String sekilAdý = "";
	
	public String getAd() {
		return sekilAdý;
	}
	
	public void setAd(String ad) {
		this.sekilAdý = ad;
	}
	
	public abstract double SekilAlaný(); //Üçgen, Kare, Dikdörtgen, Daire... 
	//Bu metod soyut olarak tanýmlandýðý için artýk kalýtýlan yerlerde tanýmlanacak
	
	public int alan(int a, int b) {
		return 0;
	}
}

// Soyutlamanýn temelinde kalýtým vardýr. Yani biz soyutlamayý kalýtým sayesinde yaparýz.

class Üçgen extends Alan {
	private int h;
	private int t;
	
	public Üçgen(int h, int t) {
		this.h = h;
		this.t = t;
		
		super.setAd("Üçgen");
	}

	@Override
	public double SekilAlaný() {
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
	
	@Override //Soyut sýnýflarýn metodlarý tanýmlanýrken override edilerek tanýmlanýrlar
	public double SekilAlaný() {
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
	public double SekilAlaný() {
		// TODO Auto-generated method stub
		return ((a+b)/2)*h;
	}
}

class Daire extends Alan {
	private int r;
	
	public Daire(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
		
		super.setAd("Daire");
	}

	@Override
	public double SekilAlaný() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
}