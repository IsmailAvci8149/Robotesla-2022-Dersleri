package nesne_tabanli_programlama;

public class S�n�flar_Ve_Nesneler {
	int degisken;
	String Tarih;
	String Yazar;
	
	static int variable;
	
	static int s�n�fDegiskeni = 254; //Bu art�k bir s�n�f degi�kenidir. yani t�m nesneler i�in ayn�d�r. birinden de�i�tirirsek, hepsi i�in de�i�ir. 
	
	//Yap�c� (Constructor) Metodlar:
	/*
	 * public <S�n�fad�>(<parametreler>){
	 * 		KODLAR...;
	 * }
	 */
	
	//S�n�f ve Nesne de�i�kenleri: S�n�f de�i�kenleri her nesne i�in e�it olan de�i�kenlerdir. Nesne De�i�kenleri ise her nesne i�in farkl� olan de�i�kenlerdir. 
	//Bir de�i�keni s�n�f de�i�keni yapabilmek i�in static anahtar kelimesini kullan�r�z
	
	public S�n�flar_Ve_Nesneler(int a, String trh, String yzr) { //Bu yap�c� metod, ald��� 3 adet de�i�keni s�n�f de�i�kenlerine atar. 
		degisken = a;
		Tarih = trh;
		Yazar = yzr;
	}
	
	public S�n�flar_Ve_Nesneler() {
		System.out.println("Nesne Olu�turuldu, Yap�land�r�c� metod �a��r�ld�.");
	}
	
	public void deger(int a) { //Biz metodlara bir de�i�ken de�eri atad���m�zda bu de�i�ken de�eri kopyalan�r ve bu kopyalanan de�er kullan�l�r. 
		a += 2;
		System.out.println(a);
	}
	
	public void ref(S�n�flar_Ve_Nesneler s) { //S�n�f�n kendisinde tan�ml� bir s�n�f de�i�keninin de�erini de�i�tirmek
		s.variable += 2;
		System.out.println(s.variable);
		
		System.out.println(S�n�flar_Ve_Nesneler.s�n�fDegiskeni);
	}
	
	public void dizi(int d[]) {
		for(int i = 0; i < d.length; i++) 
			d[i] = 255;
	} 
	
	
}
