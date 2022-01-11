package nesne_tabanli_programlama;

public class Depolama { //-> Sýnýflarýn pubkic olarak tanýmlanmasýnýn sebebi Derleyicilerin de bunlarý derlemek için eriþebilmeleridir. 
	
	//Eriþim Belirleyiciler: 
	//Sýnýflardaki Deðiþken, Metod vb. yapýlarýn nesneler ile eriþilip eriþilemeyeceðini gösterir. Yani oluþturduðumuz referans bu yapýlarý görüp görmemesini saðlar.
	
	//3 Tanedirler:
	//private -> Bu yapýlara hiçbiryerden eriþilemez. Bu yapýlarý sýnýf dýþýnda kullanamayýz
	//public -> Bu yapýlara heryerden eriþilebilir. heryerden bu yapýlarý kullanabiliriz.
	//protected -> Yapýlar sadece türetilmiþ sýnýflar tarafýndan kullanýlýr. //Kalýtýmdan sonra.
	
	//Varlýk 
	//Canlý -> D. Eukorya, D.Bacteria, D.Arkea //> Hücresel yapýdan oluþurlar
	//Cansýz //> hücresel yapýdan oluþmazlar.
	
	//NOT: Eriþim Niceleyicileri her zaman en baþta tanýmlanýrlar.
	
	private static int gizli = 6761; //-> Private tanýmlandýðý için Hiçbiryerden eriþemeyic
	public int degisken = 1234; //-> Public tanýmlandýðý için heryerden eriþebiliriz. 
	
	private String isim = "";
	private int yaþ = 0;
	private int numara = 0;
	
	public Depolama(String ad, int y) { //Bu deðiþkenleri ayarladýk.
		isim = ad;
		yaþ = y;
		System.out.println("Ýsim ve Yas deðerleri alýndý");
	}
	
	public Depolama(String isim, int yas, int numara) {
		this(isim, yas); //-> This anahtar kelimesi ayný sýnýfýn yapýlandýrýcýsý gibi davranabilir.
		this.numara = numara;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYaþ() {
		return yaþ;
	}

	public void setYaþ(int yaþ) {
		this.yaþ = yaþ;
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
	
	//Kapsülleme: Private deðiþkenlere metodlar aracýlýðýyla eriþme tekniðidir. Bunu Getter/Setter metodlarýyla yaparlar. Getter deðiþkenin deðerini döndürür, Setter ise
	//Deðiþkenin deðerini ayarlar.
	
	public static int getGizli() { //Getter
		return gizli;
	}
	
	public static void setGizli(int g) { //Setter
		gizli = g;
	}
	
	//This Anahtar Kelimesi:
	//Bir Sýnýf deðiþkenini vurgulamak için kullanýlýr.
	//O sýnýfýn Consructerý da this ile çaðýrýlýr.
	
	//Static Anahtar Kelimesi: 
	//Deðiþkenlerde Sýnýf deðiþkeni yapar.
	//Metod ve Deðiþkenlerin Nesneler olmadan sýnýf adýyla eriþilmesini saðlar.
	//Sýnýflardaki belli yapýlarý direk olarak koda dahil etmek için kullanýlýr. 
	
	//Ýmport: Bir sýnýfý baþka bir sýnýfta kullanmak istiyorsak onu kodumuza dahil ederiz. bunu ise import ile yaparýz. Ýmport sýnýfýn dýþýnda, kodun en üstünde tanýmlanýr.
	public static double cevre(double r) {
		return 2 * Math.PI * r;
	}
}

class Depolama2 {
	public void metod() {
		System.out.println("Bu baþka bir sýnýf");
	}
}