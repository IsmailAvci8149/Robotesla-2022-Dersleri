package nesne_tabanli_programlama;

public class Depolama { //-> S�n�flar�n pubkic olarak tan�mlanmas�n�n sebebi Derleyicilerin de bunlar� derlemek i�in eri�ebilmeleridir. 
	
	//Eri�im Belirleyiciler: 
	//S�n�flardaki De�i�ken, Metod vb. yap�lar�n nesneler ile eri�ilip eri�ilemeyece�ini g�sterir. Yani olu�turdu�umuz referans bu yap�lar� g�r�p g�rmemesini sa�lar.
	
	//3 Tanedirler:
	//private -> Bu yap�lara hi�biryerden eri�ilemez. Bu yap�lar� s�n�f d���nda kullanamay�z
	//public -> Bu yap�lara heryerden eri�ilebilir. heryerden bu yap�lar� kullanabiliriz.
	//protected -> Yap�lar sadece t�retilmi� s�n�flar taraf�ndan kullan�l�r. //Kal�t�mdan sonra.
	
	//Varl�k 
	//Canl� -> D. Eukorya, D.Bacteria, D.Arkea //> H�cresel yap�dan olu�urlar
	//Cans�z //> h�cresel yap�dan olu�mazlar.
	
	//NOT: Eri�im Niceleyicileri her zaman en ba�ta tan�mlan�rlar.
	
	private static int gizli = 6761; //-> Private tan�mland��� i�in Hi�biryerden eri�emeyic
	public int degisken = 1234; //-> Public tan�mland��� i�in heryerden eri�ebiliriz. 
	
	private String isim = "";
	private int ya� = 0;
	private int numara = 0;
	
	public Depolama(String ad, int y) { //Bu de�i�kenleri ayarlad�k.
		isim = ad;
		ya� = y;
		System.out.println("�sim ve Yas de�erleri al�nd�");
	}
	
	public Depolama(String isim, int yas, int numara) {
		this(isim, yas); //-> This anahtar kelimesi ayn� s�n�f�n yap�land�r�c�s� gibi davranabilir.
		this.numara = numara;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYa�() {
		return ya�;
	}

	public void setYa�(int ya�) {
		this.ya� = ya�;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	Depolama2 d = new Depolama2();
	
	public void name() {
		d.metod();
	}
	
	//Kaps�lleme: Private de�i�kenlere metodlar arac�l���yla eri�me tekni�idir. Bunu Getter/Setter metodlar�yla yaparlar. Getter de�i�kenin de�erini d�nd�r�r, Setter ise
	//De�i�kenin de�erini ayarlar.
	
	public static int getGizli() { //Getter
		return gizli;
	}
	
	public static void setGizli(int g) { //Setter
		gizli = g;
	}
	
	//This Anahtar Kelimesi:
	//Bir S�n�f de�i�kenini vurgulamak i�in kullan�l�r.
	//O s�n�f�n Consructer� da this ile �a��r�l�r.
	
	//Static Anahtar Kelimesi: 
	//De�i�kenlerde S�n�f de�i�keni yapar.
	//Metod ve De�i�kenlerin Nesneler olmadan s�n�f ad�yla eri�ilmesini sa�lar.
	//S�n�flardaki belli yap�lar� direk olarak koda dahil etmek i�in kullan�l�r. 
	
	//�mport: Bir s�n�f� ba�ka bir s�n�fta kullanmak istiyorsak onu kodumuza dahil ederiz. bunu ise import ile yapar�z. �mport s�n�f�n d���nda, kodun en �st�nde tan�mlan�r.
	public static double cevre(double r) {
		return 2 * Math.PI * r;
	}
}

class Depolama2 {
	public void metod() {
		System.out.println("Bu ba�ka bir s�n�f");
	}
}