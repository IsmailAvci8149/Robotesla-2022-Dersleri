package nesne_tabanli_programlama;

public class Sýnýflar_Ve_Nesneler {
	int degisken;
	String Tarih;
	String Yazar;
	
	static int variable;
	
	static int sýnýfDegiskeni = 254; //Bu artýk bir sýnýf degiþkenidir. yani tüm nesneler için aynýdýr. birinden deðiþtirirsek, hepsi için deðiþir. 
	
	//Yapýcý (Constructor) Metodlar:
	/*
	 * public <Sýnýfadý>(<parametreler>){
	 * 		KODLAR...;
	 * }
	 */
	
	//Sýnýf ve Nesne deðiþkenleri: Sýnýf deðiþkenleri her nesne iþin eþit olan deðiþkenlerdir. Nesne Deðiþkenleri ise her nesne için farklý olan deðiþkenlerdir. 
	//Bir deðiþkeni sýnýf deðiþkeni yapabilmek için static anahtar kelimesini kullanýrýz
	
	public Sýnýflar_Ve_Nesneler(int a, String trh, String yzr) { //Bu yapýcý metod, aldýðý 3 adet deðiþkeni sýnýf deðiþkenlerine atar. 
		degisken = a;
		Tarih = trh;
		Yazar = yzr;
	}
	
	public Sýnýflar_Ve_Nesneler() {
		System.out.println("Nesne Oluþturuldu, Yapýlandýrýcý metod çaðýrýldý.");
	}
	
	public void deger(int a) { //Biz metodlara bir deðiþken deðeri atadýðýmýzda bu deðiþken deðeri kopyalanýr ve bu kopyalanan deðer kullanýlýr. 
		a += 2;
		System.out.println(a);
	}
	
	public void ref(Sýnýflar_Ve_Nesneler s) { //Sýnýfýn kendisinde tanýmlý bir sýnýf deðiþkeninin deðerini deðiþtirmek
		s.variable += 2;
		System.out.println(s.variable);
		
		System.out.println(Sýnýflar_Ve_Nesneler.sýnýfDegiskeni);
	}
	
	public void dizi(int d[]) {
		for(int i = 0; i < d.length; i++) 
			d[i] = 255;
	} 
	
	
}
