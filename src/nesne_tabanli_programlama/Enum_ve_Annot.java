package nesne_tabanli_programlama;

public class Enum_ve_Annot {
	//Anotasyonlar: Derleyiciye bilgi vermemizi sa�larlar. Derlenmezler, kod okundu�u an uygulan�rlar. sonlar�na ; gelmez.
	
	//@<Notasyon Ad�>()
	
	//En �ok kullan�lan ���:
	//@SuppressWarnings(<Uyar�lar>) -> Derleyicinin Uyar�lar�n� bast�r�r
	//@Override -> �okbi�imlilik -> Derleyicinin �zellikle bir metodu derlemesini sa�lar. Kodun �al��ma h�z�n� etkiler.
	//@Depracted -> Eskimi� k�t�phanelerin kullan�lmas�n� sa�lar, onlar� i�aretler
	
	//////////////////////////////
	//Enum: Kodda bir durumu belirtmek i�in tan�mlanan sabitlerdir. C# dilindeki Enable ve Disable a benzer.
	//Mesela bir ikonun ya da bir butonun g�z�kmesini sa�lamak i�in ona Enable de�eri verilir. Bu de�er bir de�i�ken de�ildir. Bir veri tipi de de�ildir. Adeta o yap�ya atanan
	//bir s�fatt�r. 
	
	//Biz her enum tan�mlad���m�zda sanki bir s�n�f�n nesnesini tan�mlar�z. 
	
	/*
	 * <�zel anahtar Kelimeler> enum <Ad> {
	 * 		Sabitler...;
	 * 		<Enumdaki de�i�ken ve di�er kodlar>
	 * }
	 */
	
	//Enum sabitleri tamsay� de�erleri alabilirler. Bu de�erler direk olarak kullan�lamazlar. Kullan�labilmeleri i�in bir k�pr�ye ihtiya� vard�r. 
	//Bu k�pr� �u �ekilde tan�mlan�r:
	
	/*
	 * �nce public olarak bir de�i�ken tan�mlan�r
	 * Sonra 1 parametreli bir yap�land�r�c� bir metod tan�mlan�r.
	 * Yap�land�r�c�da en ba�taki de�i�kene yap�land�r�c�n�n parametresi atan�r.
	 */
	
	//Nas�l?
	//Her bir sabit de�erine eri�ilince yap�land�r�c� �a��r�l�r. otomatik olarak parametresine sabit de�eri g�nderilir. bu de�ere sonradan tan�mlad���m�z de�i�ken ile eri�ilir.
	
	//Enumlarda sabit de�erlerini kendimiz de tan�mlayabiliriz. Bunun i�in yap�land�r�c� olu�turulmaz. Sadece de�i�ken olur
	
	enum Hayvanlar {
		KED�(5, "boncuk"), K�PEK(10, "��t�r"), MAYMUN(4, "lucy"), F�L(3, "fil"), YUNUS(2, "pi");
		
		public int deger; 
		public String ad;
		
		Hayvanlar(int deger, String ad) {
			this.deger = deger;
			this.ad = ad;
		}
	}
	
	enum ��renciler {
		�SMA�L, MEL�KE, AHMET, HARUN, �BRAH�M;
		public int deger;
		//Burada bu sabitleri tan�mlayarak adeta bir nesne olu�tururuz. bu nesnelerle sonradan enum i�indeki elemanlara eri�iriz. 
	}
	
	enum Sabitler {
		E(2.71), PI(3.14);
		
		public double de�er;
		
		Sabitler(double de�er){
			this.de�er = de�er;
		}
	}
	
	enum Sayilar {
		SIFIR, //-> 0
		B�R, //-> 1
		�K�,
		��,
		D�RT,
		BE�,
		ALTI,
		YED�,
		SEK�Z,
		DOKUZ;
	}
	
	enum Maaslar {
		M�HEND�SL�K (100000),
		DOKTORLUK (500000),
		AVUKATLIK (500000),
		M�MARLIK (100000),
		PS�KOLOJ� (300000);
		
		private int deger;
		
		Maaslar(int deger){
			this.deger = deger;
		}
		
		public int getMaas() {
			return deger;
		}
	}
	
	//Biz enumlerda her sabit ile bir nesne olu�turuyor gibiyiz. Nas�l bir nesnede her �zellik, yap� tekrardan olu�turuluyorsa, enumlarda da her sabit ile de�i�ken de�erleri
	//tekrardan olu�turuluyor. 
	
	//Enumlardaki sabitleri dizi tipinden almak i�in .values() metodu kullan�l�r.
	//Enumlardaki sabitlerin indisini almak i�inse .ordinal() metodu kullan�l�r.
	
	//Enumlar, S�n�f t�revi yap�lard�r. Yani derleyicide s�n�flar�n �zel bir t�r� olarak tan�mlanm��lard�r.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hayvanlar.KED�.deger); //5
		System.out.println(Hayvanlar.K�PEK); //K�PEK
		System.out.println(Hayvanlar.MAYMUN.deger); //4
		System.out.println(Hayvanlar.MAYMUN.ad); //lucy
		
		��renciler.�SMA�L.deger = 25;
		��renciler.MEL�KE.deger = 65;
		��renciler.AHMET.deger = 75;
		��renciler.HARUN.deger = 24;
		
		System.out.println(��renciler.�SMA�L.deger);
		System.out.println(��renciler.MEL�KE.deger);
		System.out.println(��renciler.AHMET.deger);
		System.out.println(��renciler.HARUN.deger);
		
		System.out.println(Sabitler.E.de�er); //2.71
		System.out.println(Sabitler.PI.de�er); //3.14
		
		System.out.println(Sayilar.values());
		
		for(Sayilar temp : Sayilar.values())
			System.out.println(temp.ordinal());
		
		System.out.println(Maaslar.AVUKATLIK.getMaas());
	}

}