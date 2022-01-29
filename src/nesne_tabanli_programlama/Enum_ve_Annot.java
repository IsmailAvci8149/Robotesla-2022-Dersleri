package nesne_tabanli_programlama;

public class Enum_ve_Annot {
	//Anotasyonlar: Derleyiciye bilgi vermemizi saðlarlar. Derlenmezler, kod okunduðu an uygulanýrlar. sonlarýna ; gelmez.
	
	//@<Notasyon Adý>()
	
	//En çok kullanýlan üçü:
	//@SuppressWarnings(<Uyarýlar>) -> Derleyicinin Uyarýlarýný bastýrýr
	//@Override -> Çokbiçimlilik -> Derleyicinin özellikle bir metodu derlemesini saðlar. Kodun çalýþma hýzýný etkiler.
	//@Depracted -> Eskimiþ kütüphanelerin kullanýlmasýný saðlar, onlarý iþaretler
	
	//////////////////////////////
	//Enum: Kodda bir durumu belirtmek için tanýmlanan sabitlerdir. C# dilindeki Enable ve Disable a benzer.
	//Mesela bir ikonun ya da bir butonun gözükmesini saðlamak için ona Enable deðeri verilir. Bu deðer bir deðiþken deðildir. Bir veri tipi de deðildir. Adeta o yapýya atanan
	//bir sýfattýr. 
	
	//Biz her enum tanýmladýðýmýzda sanki bir sýnýfýn nesnesini tanýmlarýz. 
	
	/*
	 * <Özel anahtar Kelimeler> enum <Ad> {
	 * 		Sabitler...;
	 * 		<Enumdaki deðiþken ve diðer kodlar>
	 * }
	 */
	
	//Enum sabitleri tamsayý deðerleri alabilirler. Bu deðerler direk olarak kullanýlamazlar. Kullanýlabilmeleri için bir köprüye ihtiyaç vardýr. 
	//Bu köprü þu þekilde tanýmlanýr:
	
	/*
	 * önce public olarak bir deðiþken tanýmlanýr
	 * Sonra 1 parametreli bir yapýlandýrýcý bir metod tanýmlanýr.
	 * Yapýlandýrýcýda en baþtaki deðiþkene yapýlandýrýcýnýn parametresi atanýr.
	 */
	
	//Nasýl?
	//Her bir sabit deðerine eriþilince yapýlandýrýcý çaðýrýlýr. otomatik olarak parametresine sabit deðeri gönderilir. bu deðere sonradan tanýmladýðýmýz deðiþken ile eriþilir.
	
	//Enumlarda sabit deðerlerini kendimiz de tanýmlayabiliriz. Bunun için yapýlandýrýcý oluþturulmaz. Sadece deðiþken olur
	
	enum Hayvanlar {
		KEDÝ(5, "boncuk"), KÖPEK(10, "çýtýr"), MAYMUN(4, "lucy"), FÝL(3, "fil"), YUNUS(2, "pi");
		
		public int deger; 
		public String ad;
		
		Hayvanlar(int deger, String ad) {
			this.deger = deger;
			this.ad = ad;
		}
	}
	
	enum Öðrenciler {
		ÝSMAÝL, MELÝKE, AHMET, HARUN, ÝBRAHÝM;
		public int deger;
		//Burada bu sabitleri tanýmlayarak adeta bir nesne oluþtururuz. bu nesnelerle sonradan enum içindeki elemanlara eriþiriz. 
	}
	
	enum Sabitler {
		E(2.71), PI(3.14);
		
		public double deðer;
		
		Sabitler(double deðer){
			this.deðer = deðer;
		}
	}
	
	enum Sayilar {
		SIFIR, //-> 0
		BÝR, //-> 1
		ÝKÝ,
		ÜÇ,
		DÖRT,
		BEÞ,
		ALTI,
		YEDÝ,
		SEKÝZ,
		DOKUZ;
	}
	
	enum Maaslar {
		MÜHENDÝSLÝK (100000),
		DOKTORLUK (500000),
		AVUKATLIK (500000),
		MÝMARLIK (100000),
		PSÝKOLOJÝ (300000);
		
		private int deger;
		
		Maaslar(int deger){
			this.deger = deger;
		}
		
		public int getMaas() {
			return deger;
		}
	}
	
	//Biz enumlerda her sabit ile bir nesne oluþturuyor gibiyiz. Nasýl bir nesnede her özellik, yapý tekrardan oluþturuluyorsa, enumlarda da her sabit ile deðiþken deðerleri
	//tekrardan oluþturuluyor. 
	
	//Enumlardaki sabitleri dizi tipinden almak için .values() metodu kullanýlýr.
	//Enumlardaki sabitlerin indisini almak içinse .ordinal() metodu kullanýlýr.
	
	//Enumlar, Sýnýf türevi yapýlardýr. Yani derleyicide sýnýflarýn özel bir türü olarak tanýmlanmýþlardýr.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hayvanlar.KEDÝ.deger); //5
		System.out.println(Hayvanlar.KÖPEK); //KÖPEK
		System.out.println(Hayvanlar.MAYMUN.deger); //4
		System.out.println(Hayvanlar.MAYMUN.ad); //lucy
		
		Öðrenciler.ÝSMAÝL.deger = 25;
		Öðrenciler.MELÝKE.deger = 65;
		Öðrenciler.AHMET.deger = 75;
		Öðrenciler.HARUN.deger = 24;
		
		System.out.println(Öðrenciler.ÝSMAÝL.deger);
		System.out.println(Öðrenciler.MELÝKE.deger);
		System.out.println(Öðrenciler.AHMET.deger);
		System.out.println(Öðrenciler.HARUN.deger);
		
		System.out.println(Sabitler.E.deðer); //2.71
		System.out.println(Sabitler.PI.deðer); //3.14
		
		System.out.println(Sayilar.values());
		
		for(Sayilar temp : Sayilar.values())
			System.out.println(temp.ordinal());
		
		System.out.println(Maaslar.AVUKATLIK.getMaas());
	}

}