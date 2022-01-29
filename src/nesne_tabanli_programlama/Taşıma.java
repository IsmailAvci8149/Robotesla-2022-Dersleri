package nesne_tabanli_programlama;

public class Taþýma {
	
	//Kalýtým: Sýnýflardan Sýnýf türetmedir. Yani bir sýnýfýn özelliklerini baþka bir sýnýfa aktarmaktýr. 
	
	//class <Türetilecek sýnýf(SubClass)> extends <Türetilen sýnýf(SuperClass)>
	
	//Taþýma: taþýnacak madde, Taþýma süresi, Baþlangýç, bitiþ.
	
	//Karayolu : Araç, yol (taþýnacak madde, Taþýma süresi, Baþlangýç, bitiþ.)
	//Denizyolu : Rota, yol
	//Havayolu : güzergah, yol
	//Demiryolu : uzunluk, yol
	
	// Varlýklar -> Atomik yapýda olma
	// Canlýlar -> hücresel yapýdan oluþma (Atomik yapýda olma) / Cansýzlar -> Kimyasal baðlarla birbirine baðlanma (Atomik yapýda olma)
	// Ökaryotlar -> zarlý organellere sahip olma (hücresel yapýda olma, Atomik Yapýda olma)/ Bakteriler -> zarlý organellere sahip deðillerdir / Arkeler -> Ekstrem koþullara dayanabilme
	// Hayvanlar -> sistemli yapýya sahip olma (zarlý organellere sahip olma, vs.) / Bitkiler / Mantarlar / Protistalar
	
	//Ökayotlar: Atomik yapýda olma, Hücresel yapýda olma, Zarlý organellere sahip olma
	
	// A = {1, 2, 5, 6, iyi, kötü};
	// B; B > A
	// B = {1, 2, 5, 6, iyi, kötü, B_Özelliði, 254, 356}
	
	// TimedRobot
	// Robot
	
	// public class Robot extends TimedRobot { Metodlar... } -> Robot sýnýfýnda artýk TimedRobotun özelliklerini kullanabiliriz.
	
	// CammandSystem
	// HazneKontrol
	
	// public class HazneKontrol extends CommandSystem { Komutlar... } -> HazneKontroö sýnýfý artýk CommandSystemýn özelliklerini taþýr.
	 
	public String taþýnacak_Madde = "";
	public int taþýmaSüresi = 0;
	public String Baþlangýç = "";
	public String Bitiþ = "";
	
	public Taþýma(String taþýnacakMadde, int taþýmaSüresi, String Baþlangýç, String Bitiþ) {
		this.taþýnacak_Madde = taþýnacakMadde;
		this.taþýmaSüresi = taþýmaSüresi;
		this.Baþlangýç = Baþlangýç;
		this.Bitiþ = Bitiþ;
		
		System.out.println("Taþýma sýnýfýnýn nesnesi oluþturuldu. Yapýlandýrýcýsý çaðrýldý.");
	}
	
	public void ilerle() {
		System.out.println("Kargo ilerliyor");
	}
	
	public void Yükle() {
		System.out.println("Kargo Yüklendi");
	}
	
	public void Teslim() {
		System.out.println("Kargo Teslim Edildi");
	}
	
	protected void Yazdýr() { //Bu metod artýk sabittir. Overriding ile yeniden tanýmlanamaz.
		System.out.println("Bu metod Taþýma Sýnýfýndan Yazdýrýldý");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karayolu k = new Karayolu("Oyuncak", 5, "Ýstanbul", "Afyon", "34 AC 124", "E235");
		System.out.println(k.yol);
		System.out.println(k.Araç);
		System.out.println(k.Baþlangýç);
		System.out.println(k.Bitiþ);
		System.out.println(k.taþýnacak_Madde);
		System.out.println(k.taþýmaSüresi);
		k.ilerle();
		k.Yükle();
		k.Teslim();
		//Bu metod Karayolu Sýnýfýndan Yazdýrýldý
		k.Yazdýr();
		k.yolAl();
	}
}

class Karayolu extends Taþýma { 
	
	// Karayolu sýnýfý Taþýmadan türetilmiþtir. Dolayýsýyla Taþýma daki tüm deðiþken ve metodlar Karayolu sýnýfýnda da vardýr. Bunun yanýsýra Karayoluna
	//Biz fazladan metod ve deðiþken de ekleyebiliriz.
	
	public String yol;
	public String Araç; 
	
	public final double pi = 3.1415926;
	
	public Karayolu(String taþýnacakMadde, int taþýmaSüresi, String Baþlangýç, String Bitiþ, String arac, String yol) {
		super(taþýnacakMadde, taþýmaSüresi, Baþlangýç, Bitiþ); //üst sýnýfýn yapýlandýrýcýsý çaðýrýldý
		
		this.Araç = arac;
		this.yol = yol;
	}
	
	//this -> Bulunduðu sýnýfý iþaret ediyor, Bulunduðu sýnýfýn yapýlandýrýcýsýný iþaret eder
	// super -> Superclass'ý iþaret eder, Üstsýnýfýn yapýlandýrýcýsýný çaðýrýr. 
	
	public String yolAl() {
		super.ilerle();
		return yol;
	}
	
	//Taþýmadaki tüm metod ve deðiþkenler Karayolunda da gözükmektedir. Çünkü karayollarý sýnýfýna bu özellikler "Kalýtýlmýþtýr".
	
	public void Yazdýr() { //Her yere açýk
		System.out.println("Bu metod Karayollarý Sýnýfýndan Yazdýrýldý ");
	}
	
	/*
	 * public void Yazdýr() {
	 * 		System.out.println("ghjkl");
	 * }
	 */
	
	//Eðer AltSýnýfta da, üstsýnýfta da ayný adla bir metod tanýmlanmýþsa Derleyici altsýnýftaki metodu çalýþtýrýr. Buna Overriding denir. Overloading != Overriding
	//Overriding: Derleyicinin alt sýnýftaki metoda öncelik vermesi, onu görmesi, yeniden tanýmlamasý...
	
	//Her zaman en yeni metod kullanýlýr.
	
	//Overloading bir metodun varyasyonlarýný oluþturmaktý. overriding ise o metodu yeniden tanýmlamaktýr. Aralarýndaki fark budur. 
	
	//Overriding koþullarý:
	//Metod imzasý ayný olmalýdýr. -> Overloading: metod imzasý farklý olmalýydý
	//Eriþim belirticisi daha üst düzey olmalýdýr. (public > protected > private)
	
	////////////////////////////////
	
	//Final Anahtar Kelimesi:
	//deðiþkenlere getirilirse -> O deðiþkeni sabit yapýyor
	//Metodlara getirilirse -> O metodun Override edilmesini engeller.
	//Sýnýflara getirilirse -> O sýnýfýn kalýtýlmasýný engeller. yani o sýnýftan baþka bir sýnýf türetilmesini engeller
	
	//static Anahtar Kelimesi:
	//deðiþkenlerde -> O deðiþkeni sýnýf deðiþkeni yapar, ve Sýnýf adýyla eriþilebilmesini saðlar
	//metodlarda -> O metoda sýnýf adýyla eriþilmesini saðlar. Bulunduðu sýnýfta direk olarak kullanýlabilmesini saðlar.
	//Sýnýflara gelemez.
	
	////////////////////////////////////
	
	/*
	 * Psödokod: Kaðýt üzerine kod yazmak için kullanýlýrlar. 
	 * 
	 * Belirli bir sözdizimi yoktur.
	 * 
	 * if x < 5
	 * 
	 * eðer x < 5
	 * 
	 * x < 5 ise
	 * 
	 * 
	 * 
	 * for i = 0, i < 5, i+
	 * 
	 * i = 0
	 * i < 5 olduðu sürece i++
	 */
}
