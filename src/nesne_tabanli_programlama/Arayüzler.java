package nesne_tabanli_programlama;

public class Aray�zler implements D��.I� {
	
	// Aray�zler: Soyut s�n�flara benzerler, S�n�flar�n bir format�n� olu�turmam�z� sa�larlar.
	
	// K�t�phane y�netim sistemi:
	
	// Bilim-Kurgu, -> Kitap Ad�, Yazar�, Yay�nevi, Bas�m, Fiyat�, Yazd�r() -> Punto: 18, Ciltli: true
	// Macera -> Kitap Ad�, Yazar�, Yay�nevi, Bas�m, Fiyat�, Yazd�r() -> Punto: 18, Cilt: true
	// T�rk Edebiyat�
	// Frans�z Edebiyat�
	// D�nya Klasikleri
	
	//Soyut s�n�flardan ayr�l�rlar. Soyut S�n�flarda istedi�imiz metodlar� soyut yapabiliyorken, Aray�zlerde t�m metodlar soyuttur.
	//T�m de�i�kenler de "public static final" �eklindedir.
	
	//Tan�mlamalar� S�n�flara benzer:
	/*
	 * <Eri�im belirteci> interface <Aray�z ad�> {
	 * 		Metodlar...;
	 * 		Sabitler...;
	 * }
	 */
	
	//enumlar, Aray�zler vb. yap�lar S�n�flardan t�retilmi�lerdir. Bir nevi �zel s�n�flard�r. Dolay�s�yla S�n�flarda ge�erli kurallar GENELL�KLE bu yap�larda da ge�erlidir.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BilimKurgu CesurYeniD�nya = new BilimKurgu();
		Macera DaVincininS�rr� = new Macera();
		T�rkEdebiyat� SaatleriAyarlamaEnst�t�s� = new T�rkEdebiyat�();
		Frans�zEdebiyat� VadidekiZambak = new Frans�zEdebiyat�();
		D�nyaKlasikleri Su�VeCeza = new D�nyaKlasikleri();
		
		CesurYeniD�nya.setYazar("AldousHuxley");
		CesurYeniD�nya.setFiyat(25);
		CesurYeniD�nya.setYay�nevi("�taki Yay�nlar�");
		CesurYeniD�nya.setBas�m(10);
		
		CesurYeniD�nya.Yazd�r();
		
		SaatleriAyarlamaEnst�t�s�.setYazar("Ahmet Hamdi Tanp�nar");
		SaatleriAyarlamaEnst�t�s�.setBas�m(26);
		SaatleriAyarlamaEnst�t�s�.setYay�nevi("Dergah Yay�nlar�");
		SaatleriAyarlamaEnst�t�s�.setFiyat(40);
		
		SaatleriAyarlamaEnst�t�s�.Yazd�r();
		
		Aray�zler a = new Aray�zler();
		
		a.�zellikler();
	}
	
	public void �zellikler() {
		System.out.println("H�cresel yap� (BU YAZI ARAY�Z�N UYGULANDI�I SINIF TARAFINDAN YAZDIRILMAKTADIR)");
	}

	@Override
	public void yazd�r() {
		// TODO Auto-generated method stub
		
	}
}

interface A extends B {
	// A aray�z� B aray�z�nden t�retildi�i i�in asl�nda zaten nefesAl() override edildi. A s�n�f� subInterface oldu�u i�in Bu metod �al��acakt�r
	default void nefesAl() {
		System.out.println("Nefes Al (A ARAY�Z�NDEN YAZDIRILDI)");
	}
}

interface B {
	default void nefesAl() {
		System.out.println("Nefes Al (B ARAY�Z�NDEN YAZDIRILDI)");
	}
}

// Aray�zlerde Kal�t�m: Aray�zlerin birbirinden t�retilmesi i�in kullan�l�r. S�n�flarla mant��� ayn�d�r. Syntax de ayn�d�r

//Aray�zlerin i�inde aray�zler tan�mlanabilir. Bu tan�mlama bize �zelliklerimizi s�n�fland�rmam�z� sa�lar.

interface D�� {
	public int topla();
	
	interface I� {
		public void yazd�r();
	}
}

//Bu Aray�zlere eri�im dosyalardaki gibi yap�l�r. Yani i� aray�ze D�� Aray�zden Eri�ilir.
///////////////////////////////////////////////////////////////////////////////////

interface Kitap_Ciltli {
	
	//Aray�zlerde t�m De�i�kenler "public static final" olarak tan�mlan�rlar (Sabit olarak tan�mlan�rlar); 
	byte punto = 18;
	boolean ciltli = true;
	
	public void setYazar(String yazar); //-> Metod imzas�
	public String getYazar();
	
	public void setYay�nevi(String yay�nevi);
	public String getYay�nevi();
	
	public void setBas�m(int bas�m);
	public int getBas�m();
	
	public void setFiyat(double fiyat);
	public double getFiyat();
	
	public void Yazd�r();
}

//Kal�t�mda s�n�flar birbirinden t�retilir. yani birbirinden geni�ler. (Extends)

//Aray�zlerde aray�z bir s�n�fa uygulan�r. (implements)

interface Canl�lar {
	default void �zellikler() {
		System.out.println("Hareket kabiliyeti (Bu yaz� default metod taraf�ndan yazd�r�lm��t�r)");
	}
}

class BilimKurgu implements Kitap_Ciltli {
	private String yazar = "";
	private String yay�nevi = "";
	private int bas�m = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYay�nevi(String yay�nevi) { this.yay�nevi = yay�nevi; }

	@Override
	public String getYay�nevi() { return yay�nevi; }

	@Override
	public void setBas�m(int bas�m) { this.bas�m = bas�m; }

	@Override
	public int getBas�m() { return bas�m; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazd�r() {
		System.out.println("Kitap T�r� : Bilim-Kurgu");
		System.out.println("Kitap Yazar� : " + yazar);
		System.out.println("Kitap Yay�nevi : " + yay�nevi);
		System.out.println("Kitap Bas�m� : " + bas�m);
		System.out.println("Kitap Fiyat� : " + fiyat);
	}
}

class Macera implements Kitap_Ciltli {
	private String yazar = "";
	private String yay�nevi = "";
	private int bas�m = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYay�nevi(String yay�nevi) { this.yay�nevi = yay�nevi; }

	@Override
	public String getYay�nevi() { return yay�nevi; }

	@Override
	public void setBas�m(int bas�m) { this.bas�m = bas�m; }

	@Override
	public int getBas�m() { return bas�m; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazd�r() {
		System.out.println("Kitap T�r� : Bilim-Kurgu");
		System.out.println("Kitap Yazar� : " + yazar);
		System.out.println("Kitap Yay�nevi : " + yay�nevi);
		System.out.println("Kitap Bas�m� : " + bas�m);
		System.out.println("Kitap Fiyat� : " + fiyat);
	}
}


class T�rkEdebiyat� implements Kitap_Ciltli {
	private String yazar = "";
	private String yay�nevi = "";
	private int bas�m = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYay�nevi(String yay�nevi) { this.yay�nevi = yay�nevi; }

	@Override
	public String getYay�nevi() { return yay�nevi; }

	@Override
	public void setBas�m(int bas�m) { this.bas�m = bas�m; }

	@Override
	public int getBas�m() { return bas�m; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazd�r() {
		System.out.println("Kitap T�r� : T�rk Edebiyat�");
		System.out.println("Kitap Yazar� : " + yazar);
		System.out.println("Kitap Yay�nevi : " + yay�nevi);
		System.out.println("Kitap Bas�m� : " + bas�m);
		System.out.println("Kitap Fiyat� : " + fiyat);
	}
}

class Frans�zEdebiyat� implements Kitap_Ciltli {
	private String yazar = "";
	private String yay�nevi = "";
	private int bas�m = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYay�nevi(String yay�nevi) { this.yay�nevi = yay�nevi; }

	@Override
	public String getYay�nevi() { return yay�nevi; }

	@Override
	public void setBas�m(int bas�m) { this.bas�m = bas�m; }

	@Override
	public int getBas�m() { return bas�m; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazd�r() {
		System.out.println("Kitap T�r� : Bilim-Kurgu");
		System.out.println("Kitap Yazar� : " + yazar);
		System.out.println("Kitap Yay�nevi : " + yay�nevi);
		System.out.println("Kitap Bas�m� : " + bas�m);
		System.out.println("Kitap Fiyat� : " + fiyat);
	}
}

class D�nyaKlasikleri implements Kitap_Ciltli {
	private String yazar = "";
	private String yay�nevi = "";
	private int bas�m = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYay�nevi(String yay�nevi) { this.yay�nevi = yay�nevi; }

	@Override
	public String getYay�nevi() { return yay�nevi; }

	@Override
	public void setBas�m(int bas�m) { this.bas�m = bas�m; }

	@Override
	public int getBas�m() { return bas�m; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazd�r() {
		System.out.println("Kitap T�r� : Bilim-Kurgu");
		System.out.println("Kitap Yazar� : " + yazar);
		System.out.println("Kitap Yay�nevi : " + yay�nevi);
		System.out.println("Kitap Bas�m� : " + bas�m);
		System.out.println("Kitap Fiyat� : " + fiyat);
	}
}