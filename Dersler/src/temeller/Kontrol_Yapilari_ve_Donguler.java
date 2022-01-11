package temeller;

public class Kontrol_Yapilari_ve_Donguler {

	public static void main(String[] args) {
		// Ýstediðimiz taktirde belli kodlarý çalýþtýrmamýzý saðlayan yapýlardýr. 
		int a, b;
		a = 60;
		b = 6;
		int [] dizi = {1, 2, 3, 4, 5};
		
		// a > b ise bir kodu, deðil ise baþka bir kodu çalýþatýrmak için:
		//if-else
		
		/*
		 * if(<Durum>) { 
		 * 	<Durum> Doðru ise çalýþacak Komutlar...
		 * } else {
		 *  <Durum> Yanlýþ ise çalýþacak Komutlar...
		 * }
		 */
		
		if(a > b) {
			System.out.println("A büyüktür B");
		} else if(a == b) {
			System.out.println("A eþittir B");
		} else {
			System.out.println("A küçüktür B");
		}
		
		//=================================================//
		
		int not = 150;
		
		if(not > 100 || not < 0) {
			System.out.println("Gecerli bir not giriniz");
		} else if(not < 50) {
			System.out.println("Zayýf aldýnýz");
		} else if(not < 85) {
			System.out.println("Orta Düzey Aldýnýz");
		} else {
			System.out.println("Geçtiniz");
		}
		
		//Not: if-else yapýlarýnda kontrol yukarýdan aþaðýya doðru yapýlýr. Ýfade Doðru olsu olmasýn tüm durumlar 
		//kontrol edilir
		
		//if else yaoýsýnýn çeþitleri:
		if(true) {
			System.out.println("Doðru");
			System.out.println("Ýkinci bir metin");
		}
		//===================================================//
		
		if(a < 100){
			if(a < 75) {
				if(a < 50) {
					System.out.println("Sayý 50'den küçük");
				}
				System.out.println("Sayý 75'den küçük");
			}
			System.out.println("sayý 100'den küçük");
		} else {
			if(a > 100) {
				System.out.println("Sayý 100'den büyük");
			}
		}
		
		//========================================================//
		int dogru = 90, yanlis = 10;
		
		float net = dogru - (float)yanlis/4;
		
		System.out.println(net);
		if(net >= 50){ //68.75
			if(net < 75) 
				System.out.println("Ortalama");
			else if(net >= 75)
				System.out.println("Geçtiniz");
 		} else {
 			System.out.println("Kaldýnýz");
 		}
		//========================================================//
		
		//switch-case yapýsý:
		//if-else den daha hýzlýdýr. bir deðiþkenin, belli bir deðerini kontrol etmeye yarar.
		
		/*
		 * switch(<Kontrol edilecek deðiþken>){
			 * case durum1:
			 * 		komutlar...
			 * 		break;
			 * 
			 * case durum2:
			 * 		komutlar...
			 * 		break;
			 * 
			 * case durum3:
			 * 		komutlar...
			 * 		break;
			 * 
			 * case durum4:
			 * 		komutlar...
			 * 		break;
			 * 
			 * case durum5:
			 * 		komutlar...
			 * 		break;
			 * 
			 * default:
			 * 		komutlar...
		 * }
		 */
		
		//Switch-case yapýsýna tum primitif deðerler ve String veri tipindeki deðerler verilebilir.
		switch(b) {
		case 4: //true ya da false döndürür. sw-case bir tamsayýyý bir boolean la karþýlaþtýramayacaðýndan dolayý derleyici
			//hata verir
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		case 6:
			System.out.println(6);
			break;
		default:
			System.out.println("Baþka bir sayi");
		}
		
		// 'H' != 'h' 
		// 'A' != 'a'
		
		String metin = "Ahmet";
		switch(metin) {
		case "Ýsmail":
			System.out.println("Ýsmail Burada");
			break;
			
		case "Melike":
			System.out.println("Melike Burada");
			break;
			
		case "Ahmet":
			System.out.println("Ahmet Burada");
			break;
				
		default:
			System.out.println("Kimse burada deðil");
		}
		
		//Break'in önemi:
		//break javada bizim yapýlardan çýkmamýzý saðlar. bir nevi o yapýyý "Kýrar". dolayýsýylar switch-case de break'in görevi
		//sw-case i sonlandýrmaktýr. 
		int gun = 2;
		
		switch(gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Haftaiçi");
			break;
			
		case 6:
		case 7:
			System.out.println("Haftasonu");
			break;
			
		default:
			System.out.println("Geçerli bir gün giriniz");
		}
		
		///==============================================================================================================///
		
		for(int temp : dizi) {
			System.out.println(temp);
		}
		
		//Döngüler: 
		//Bir kodu Tekrarlamamýzý saðlayan yapýlardýr. 
		
		// 4 Adet vardýr. bunlar:
		//while,
		//do while,
		//for,
		//foreach
		
		
		//WHILE DÖNGÜSÜ:
		//
		
		/*
		 * while(<Koþul>){
		 * 		Komutlar...
		 * }
		 * 
		 * */
		
		int sayac = 0;
		while (sayac <= 10) {
			sayac+=2;
			
			if(sayac % 2 == 1) continue;
			
			System.out.println(sayac);
		}
		
		//Sonsuz döngüler: Genellikle while ile yapýlýrlar. kodu istediðimiz yerde kýrmamýzý saðlar.
		while(true) {
			System.out.println("Çýktý 1");
			System.out.println("Çýktý 2");
			System.out.println("Çýktý 3");
			break;
		}
		
		//DO-WHILE DÖNGÜSÜ:
		
		/*
		 * do {
		 * 		Komutlar...
		 * } while(<KOÞUL>);
		 */
		
		int sayi = 1;
		
		do {
			System.out.println(sayi);
			sayi++;
		} while(sayi < 10);
		
		//While'da önce koþul, sonra komut calýþtýrýlýrken, do-while'da once komut, sonra koþul çalýþtýrýlýr.
		
		//FOR döngüsü:
		//while gibi ama daha kolay. bir deðer aralýðýnda tekrar yapmamýzý saðlar.
		 /*
		  * for(<sayaç deðiþkeni tanýmlanýr>; <koþul>; <Artýþ deðeri olacak>) {
		  * 		Komutlar...;
		  * }
		  */
		
		int i;
		for(i = 0; i < 10; i++) {
			System.out.println("");
		}
		
		int j;
		for(j = 12; j > 11; j--) {
			
		}
		
		//Döngülerde kod tekrarlanmasýna iterasyon denir. 
		//Not: For döngüsünde deðiþken tanýmlamasý ve artýþ deðeri döngünün farklý yerlerinde de tanýmlanabilir. yeter ki
		//forun içinde iki adet ';' olsun.
		
		//FOREACH(GELÝÞMÝÞ FOR; ÖZELLEÞMÝÞ FOR vs.) DÖNGÜSÜ:
		
		//Diziler: Birden fazla deðiþkeni tek bir deðiþkenmiþ gibi göstermemizi saðlar. 
		//Geliþmiþ for döngüsü bize dizinin teker teker elemanlarý ile iþlem yapmamýzý saðlar. 
		
		//for(<gecici degisken tanýmlamasý> : <dizi adý>){
		//	Komutlar...;
		//}
		
		//Break: Kodu kýrar.
		
		//Continue ise: o iterasyonu durdurur.
	}
}
