package nesne_tabanli_programlama;

public class Arayüzler implements Dış.Iç {
	
	// Arayüzler: Soyut sınıflara benzerler, Sınıfların bir formatını oluşturmamızı sağlarlar.
	
	// Kütüphane yönetim sistemi:
	
	// Bilim-Kurgu, -> Kitap Adı, Yazarı, Yayınevi, Basım, Fiyatı, Yazdır() -> Punto: 18, Ciltli: true
	// Macera -> Kitap Adı, Yazarı, Yayınevi, Basım, Fiyatı, Yazdır() -> Punto: 18, Cilt: true
	// Türk Edebiyatı
	// Fransız Edebiyatı
	// Dünya Klasikleri
	
	//Soyut sınıflardan ayrılırlar. Soyut Sınıflarda istediğimiz metodları soyut yapabiliyorken, Arayüzlerde tüm metodlar soyuttur.
	//Tüm değişkenler de "public static final" şeklindedir.
	
	//Tanımlamaları Sınıflara benzer:
	/*
	 * <Erişim belirteci> interface <Arayüz adı> {
	 * 		Metodlar...;
	 * 		Sabitler...;
	 * }
	 */
	
	//enumlar, Arayüzler vb. yapılar Sınıflardan türetilmişlerdir. Bir nevi özel sınıflardır. Dolayısıyla Sınıflarda geçerli kurallar GENELLİKLE bu yapılarda da geçerlidir.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BilimKurgu CesurYeniDünya = new BilimKurgu();
		Macera DaVincininSırrı = new Macera();
		TürkEdebiyatı SaatleriAyarlamaEnstütüsü = new TürkEdebiyatı();
		FransızEdebiyatı VadidekiZambak = new FransızEdebiyatı();
		DünyaKlasikleri SuçVeCeza = new DünyaKlasikleri();
		
		CesurYeniDünya.setYazar("AldousHuxley");
		CesurYeniDünya.setFiyat(25);
		CesurYeniDünya.setYayınevi("İtaki Yayınları");
		CesurYeniDünya.setBasım(10);
		
		CesurYeniDünya.Yazdır();
		
		SaatleriAyarlamaEnstütüsü.setYazar("Ahmet Hamdi Tanpınar");
		SaatleriAyarlamaEnstütüsü.setBasım(26);
		SaatleriAyarlamaEnstütüsü.setYayınevi("Dergah Yayınları");
		SaatleriAyarlamaEnstütüsü.setFiyat(40);
		
		SaatleriAyarlamaEnstütüsü.Yazdır();
		
		Arayüzler a = new Arayüzler();
		
		a.özellikler();
	}
	
	public void özellikler() {
		System.out.println("Hücresel yapı (BU YAZI ARAYÜZÜN UYGULANDIĞI SINIF TARAFINDAN YAZDIRILMAKTADIR)");
	}

	@Override
	public void yazdır() {
		// TODO Auto-generated method stub
		
	}
}

interface A extends B {
	// A arayüzü B arayüzünden türetildiği için aslında zaten nefesAl() override edildi. A sınıfı subInterface olduğu için Bu metod çalışacaktır
	default void nefesAl() {
		System.out.println("Nefes Al (A ARAYÜZÜNDEN YAZDIRILDI)");
	}
}

interface B {
	default void nefesAl() {
		System.out.println("Nefes Al (B ARAYÜZÜNDEN YAZDIRILDI)");
	}
}

// Arayüzlerde Kalıtım: Arayüzlerin birbirinden türetilmesi için kullanılır. Sınıflarla mantığı aynıdır. Syntax de aynıdır

//Arayüzlerin içinde arayüzler tanımlanabilir. Bu tanımlama bize özelliklerimizi sınıflandırmamızı sağlar.

interface Dış {
	public int topla();
	
	interface Iç {
		public void yazdır();
	}
}

//Bu Arayüzlere erişim dosyalardaki gibi yapılır. Yani iç arayüze Dış Arayüzden Erişilir.
///////////////////////////////////////////////////////////////////////////////////

interface Kitap_Ciltli {
	
	//Arayüzlerde tüm Değişkenler "public static final" olarak tanımlanırlar (Sabit olarak tanımlanırlar); 
	byte punto = 18;
	boolean ciltli = true;
	
	public void setYazar(String yazar); //-> Metod imzası
	public String getYazar();
	
	public void setYayınevi(String yayınevi);
	public String getYayınevi();
	
	public void setBasım(int basım);
	public int getBasım();
	
	public void setFiyat(double fiyat);
	public double getFiyat();
	
	public void Yazdır();
}

//Kalıtımda sınıflar birbirinden türetilir. yani birbirinden genişler. (Extends)

//Arayüzlerde arayüz bir sınıfa uygulanır. (implements)

interface Canlılar {
	default void özellikler() {
		System.out.println("Hareket kabiliyeti (Bu yazı default metod tarafından yazdırılmıştır)");
	}
}

class BilimKurgu implements Kitap_Ciltli {
	private String yazar = "";
	private String yayınevi = "";
	private int basım = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

	@Override
	public String getYayınevi() { return yayınevi; }

	@Override
	public void setBasım(int basım) { this.basım = basım; }

	@Override
	public int getBasım() { return basım; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazdır() {
		System.out.println("Kitap Türü : Bilim-Kurgu");
		System.out.println("Kitap Yazarı : " + yazar);
		System.out.println("Kitap Yayınevi : " + yayınevi);
		System.out.println("Kitap Basımı : " + basım);
		System.out.println("Kitap Fiyatı : " + fiyat);
	}
}

class Macera implements Kitap_Ciltli {
	private String yazar = "";
	private String yayınevi = "";
	private int basım = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

	@Override
	public String getYayınevi() { return yayınevi; }

	@Override
	public void setBasım(int basım) { this.basım = basım; }

	@Override
	public int getBasım() { return basım; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazdır() {
		System.out.println("Kitap Türü : Bilim-Kurgu");
		System.out.println("Kitap Yazarı : " + yazar);
		System.out.println("Kitap Yayınevi : " + yayınevi);
		System.out.println("Kitap Basımı : " + basım);
		System.out.println("Kitap Fiyatı : " + fiyat);
	}
}


class TürkEdebiyatı implements Kitap_Ciltli {
	private String yazar = "";
	private String yayınevi = "";
	private int basım = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

	@Override
	public String getYayınevi() { return yayınevi; }

	@Override
	public void setBasım(int basım) { this.basım = basım; }

	@Override
	public int getBasım() { return basım; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazdır() {
		System.out.println("Kitap Türü : Türk Edebiyatı");
		System.out.println("Kitap Yazarı : " + yazar);
		System.out.println("Kitap Yayınevi : " + yayınevi);
		System.out.println("Kitap Basımı : " + basım);
		System.out.println("Kitap Fiyatı : " + fiyat);
	}
}

class FransızEdebiyatı implements Kitap_Ciltli {
	private String yazar = "";
	private String yayınevi = "";
	private int basım = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

	@Override
	public String getYayınevi() { return yayınevi; }

	@Override
	public void setBasım(int basım) { this.basım = basım; }

	@Override
	public int getBasım() { return basım; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazdır() {
		System.out.println("Kitap Türü : Bilim-Kurgu");
		System.out.println("Kitap Yazarı : " + yazar);
		System.out.println("Kitap Yayınevi : " + yayınevi);
		System.out.println("Kitap Basımı : " + basım);
		System.out.println("Kitap Fiyatı : " + fiyat);
	}
}

class DünyaKlasikleri implements Kitap_Ciltli {
	private String yazar = "";
	private String yayınevi = "";
	private int basım = 0;
	private double fiyat = 0;

	@Override
	public void setYazar(String yazar) { this.yazar = yazar; }

	@Override
	public String getYazar() { return yazar; }

	@Override
	public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

	@Override
	public String getYayınevi() { return yayınevi; }

	@Override
	public void setBasım(int basım) { this.basım = basım; }

	@Override
	public int getBasım() { return basım; }

	@Override
	public void setFiyat(double fiyat) { this.fiyat = fiyat; }

	@Override
	public double getFiyat() { return fiyat; }

	@Override
	public void Yazdır() {
		System.out.println("Kitap Türü : Bilim-Kurgu");
		System.out.println("Kitap Yazarı : " + yazar);
		System.out.println("Kitap Yayınevi : " + yayınevi);
		System.out.println("Kitap Basımı : " + basım);
		System.out.println("Kitap Fiyatı : " + fiyat);
	}
}