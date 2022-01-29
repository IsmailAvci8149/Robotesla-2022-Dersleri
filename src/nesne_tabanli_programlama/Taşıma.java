package nesne_tabanli_programlama;

public class Ta��ma {
	
	//Kal�t�m: S�n�flardan S�n�f t�retmedir. Yani bir s�n�f�n �zelliklerini ba�ka bir s�n�fa aktarmakt�r. 
	
	//class <T�retilecek s�n�f(SubClass)> extends <T�retilen s�n�f(SuperClass)>
	
	//Ta��ma: ta��nacak madde, Ta��ma s�resi, Ba�lang��, biti�.
	
	//Karayolu : Ara�, yol (ta��nacak madde, Ta��ma s�resi, Ba�lang��, biti�.)
	//Denizyolu : Rota, yol
	//Havayolu : g�zergah, yol
	//Demiryolu : uzunluk, yol
	
	// Varl�klar -> Atomik yap�da olma
	// Canl�lar -> h�cresel yap�dan olu�ma (Atomik yap�da olma) / Cans�zlar -> Kimyasal ba�larla birbirine ba�lanma (Atomik yap�da olma)
	// �karyotlar -> zarl� organellere sahip olma (h�cresel yap�da olma, Atomik Yap�da olma)/ Bakteriler -> zarl� organellere sahip de�illerdir / Arkeler -> Ekstrem ko�ullara dayanabilme
	// Hayvanlar -> sistemli yap�ya sahip olma (zarl� organellere sahip olma, vs.) / Bitkiler / Mantarlar / Protistalar
	
	//�kayotlar: Atomik yap�da olma, H�cresel yap�da olma, Zarl� organellere sahip olma
	
	// A = {1, 2, 5, 6, iyi, k�t�};
	// B; B > A
	// B = {1, 2, 5, 6, iyi, k�t�, B_�zelli�i, 254, 356}
	
	// TimedRobot
	// Robot
	
	// public class Robot extends TimedRobot { Metodlar... } -> Robot s�n�f�nda art�k TimedRobotun �zelliklerini kullanabiliriz.
	
	// CammandSystem
	// HazneKontrol
	
	// public class HazneKontrol extends CommandSystem { Komutlar... } -> HazneKontro� s�n�f� art�k CommandSystem�n �zelliklerini ta��r.
	 
	public String ta��nacak_Madde = "";
	public int ta��maS�resi = 0;
	public String Ba�lang�� = "";
	public String Biti� = "";
	
	public Ta��ma(String ta��nacakMadde, int ta��maS�resi, String Ba�lang��, String Biti�) {
		this.ta��nacak_Madde = ta��nacakMadde;
		this.ta��maS�resi = ta��maS�resi;
		this.Ba�lang�� = Ba�lang��;
		this.Biti� = Biti�;
		
		System.out.println("Ta��ma s�n�f�n�n nesnesi olu�turuldu. Yap�land�r�c�s� �a�r�ld�.");
	}
	
	public void ilerle() {
		System.out.println("Kargo ilerliyor");
	}
	
	public void Y�kle() {
		System.out.println("Kargo Y�klendi");
	}
	
	public void Teslim() {
		System.out.println("Kargo Teslim Edildi");
	}
	
	protected void Yazd�r() { //Bu metod art�k sabittir. Overriding ile yeniden tan�mlanamaz.
		System.out.println("Bu metod Ta��ma S�n�f�ndan Yazd�r�ld�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karayolu k = new Karayolu("Oyuncak", 5, "�stanbul", "Afyon", "34 AC 124", "E235");
		System.out.println(k.yol);
		System.out.println(k.Ara�);
		System.out.println(k.Ba�lang��);
		System.out.println(k.Biti�);
		System.out.println(k.ta��nacak_Madde);
		System.out.println(k.ta��maS�resi);
		k.ilerle();
		k.Y�kle();
		k.Teslim();
		//Bu metod Karayolu S�n�f�ndan Yazd�r�ld�
		k.Yazd�r();
		k.yolAl();
	}
}

class Karayolu extends Ta��ma { 
	
	// Karayolu s�n�f� Ta��madan t�retilmi�tir. Dolay�s�yla Ta��ma daki t�m de�i�ken ve metodlar Karayolu s�n�f�nda da vard�r. Bunun yan�s�ra Karayoluna
	//Biz fazladan metod ve de�i�ken de ekleyebiliriz.
	
	public String yol;
	public String Ara�; 
	
	public final double pi = 3.1415926;
	
	public Karayolu(String ta��nacakMadde, int ta��maS�resi, String Ba�lang��, String Biti�, String arac, String yol) {
		super(ta��nacakMadde, ta��maS�resi, Ba�lang��, Biti�); //�st s�n�f�n yap�land�r�c�s� �a��r�ld�
		
		this.Ara� = arac;
		this.yol = yol;
	}
	
	//this -> Bulundu�u s�n�f� i�aret ediyor, Bulundu�u s�n�f�n yap�land�r�c�s�n� i�aret eder
	// super -> Superclass'� i�aret eder, �sts�n�f�n yap�land�r�c�s�n� �a��r�r. 
	
	public String yolAl() {
		super.ilerle();
		return yol;
	}
	
	//Ta��madaki t�m metod ve de�i�kenler Karayolunda da g�z�kmektedir. ��nk� karayollar� s�n�f�na bu �zellikler "Kal�t�lm��t�r".
	
	public void Yazd�r() { //Her yere a��k
		System.out.println("Bu metod Karayollar� S�n�f�ndan Yazd�r�ld� ");
	}
	
	/*
	 * public void Yazd�r() {
	 * 		System.out.println("ghjkl");
	 * }
	 */
	
	//E�er AltS�n�fta da, �sts�n�fta da ayn� adla bir metod tan�mlanm��sa Derleyici alts�n�ftaki metodu �al��t�r�r. Buna Overriding denir. Overloading != Overriding
	//Overriding: Derleyicinin alt s�n�ftaki metoda �ncelik vermesi, onu g�rmesi, yeniden tan�mlamas�...
	
	//Her zaman en yeni metod kullan�l�r.
	
	//Overloading bir metodun varyasyonlar�n� olu�turmakt�. overriding ise o metodu yeniden tan�mlamakt�r. Aralar�ndaki fark budur. 
	
	//Overriding ko�ullar�:
	//Metod imzas� ayn� olmal�d�r. -> Overloading: metod imzas� farkl� olmal�yd�
	//Eri�im belirticisi daha �st d�zey olmal�d�r. (public > protected > private)
	
	////////////////////////////////
	
	//Final Anahtar Kelimesi:
	//de�i�kenlere getirilirse -> O de�i�keni sabit yap�yor
	//Metodlara getirilirse -> O metodun Override edilmesini engeller.
	//S�n�flara getirilirse -> O s�n�f�n kal�t�lmas�n� engeller. yani o s�n�ftan ba�ka bir s�n�f t�retilmesini engeller
	
	//static Anahtar Kelimesi:
	//de�i�kenlerde -> O de�i�keni s�n�f de�i�keni yapar, ve S�n�f ad�yla eri�ilebilmesini sa�lar
	//metodlarda -> O metoda s�n�f ad�yla eri�ilmesini sa�lar. Bulundu�u s�n�fta direk olarak kullan�labilmesini sa�lar.
	//S�n�flara gelemez.
	
	////////////////////////////////////
	
	/*
	 * Ps�dokod: Ka��t �zerine kod yazmak i�in kullan�l�rlar. 
	 * 
	 * Belirli bir s�zdizimi yoktur.
	 * 
	 * if x < 5
	 * 
	 * e�er x < 5
	 * 
	 * x < 5 ise
	 * 
	 * 
	 * 
	 * for i = 0, i < 5, i+
	 * 
	 * i = 0
	 * i < 5 oldu�u s�rece i++
	 */
}
