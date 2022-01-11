package nesne_tabanli_programlama;

public class Soyutlama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soyutlaman�n amac� s�n�flarda bir tan�m yerine, bir �ablon olu�turmakt�r.
		
		//�ablon - Nesne
		//
		//		1 yumurta
		//		2 bardak un
		//		1 bardak �eker...
		
		//Nesne: Kek
		
		//Soyutlama:
		//
		//		5 Yumurta
		//		3 Bardak un
		//		0 �eker
		//		0 kabartma tozu...
		//		1 bardak s�t
		
		//		krep
		
		//Alan Hesaplama:
		// �eklin ismi (getter, setter)  Tan�mlar�z
		
		// �eklin Alan�(); Tan�mlamadan, Sadece ad�n� aktarabiliriz.
		
		//Kare extends AlanHesaplama -> �eklin ismi, Karenin Alan�
		//��gen extends AlanHesaplama -> �eklime ismi, ��genin Alan�
		
		//Bir Formattan �ablon �retme.
		
		��gen A = new ��gen(5, 8);
		Dikd�rtgen ABCD = new Dikd�rtgen(6, 11);
		Yamuk y = new Yamuk(5, 8, 4);
		
		System.out.println(A.getAd() + " Alan� : " + A.SekilAlan�());
		System.out.println(ABCD.getAd() + " Alan� : " + ABCD.SekilAlan�());
		System.out.println(y.getAd() + " Alan� : " + y.SekilAlan�());
	}
}

abstract class Alan {
	public String sekilAd� = "";
	
	public String getAd() {
		return sekilAd�;
	}
	
	public void setAd(String ad) {
		this.sekilAd� = ad;
	}
	
	public abstract int SekilAlan�(); //��gen, Kare, Dikd�rtgen, Daire... 
	//Bu metod soyut olarak tan�mland��� i�in art�k kal�t�lan yerlerde tan�mlanacak
	
	public int alan(int a, int b) {
		return 0;
	}
}

class ��gen extends Alan {
	private int h;
	private int t;
	
	public ��gen(int h, int t) {
		this.h = h;
		this.t = t;
		
		super.setAd("��gen");
	}

	@Override
	public int SekilAlan�() {
		// TODO Auto-generated method stub
		return (h*t)/2;
	}
	//Buradaki metod �sts�n�f�n soyut bir metodu oldu�u i�in yeniden tan�mlanmas� gerekir. Yani Override edilmesi gerekir.
}

class Dikd�rtgen extends Alan{
	private int a;
	private int b;
	
	public Dikd�rtgen(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		
		super.setAd("Dikd�rtgen");
	}
	
	@Override
	public int SekilAlan�() {
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
	public int SekilAlan�() {
		// TODO Auto-generated method stub
		return ((a+b)/2)*h;
	}
}