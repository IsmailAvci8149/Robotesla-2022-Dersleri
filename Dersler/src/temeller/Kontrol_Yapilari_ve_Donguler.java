package temeller;

public class Kontrol_Yapilari_ve_Donguler {

	public static void main(String[] args) {
		// �stedi�imiz taktirde belli kodlar� �al��t�rmam�z� sa�layan yap�lard�r. 
		int a, b;
		a = 60;
		b = 6;
		int [] dizi = {1, 2, 3, 4, 5};
		
		// a > b ise bir kodu, de�il ise ba�ka bir kodu �al��at�rmak i�in:
		//if-else
		
		/*
		 * if(<Durum>) { 
		 * 	<Durum> Do�ru ise �al��acak Komutlar...
		 * } else {
		 *  <Durum> Yanl�� ise �al��acak Komutlar...
		 * }
		 */
		
		if(a > b) {
			System.out.println("A b�y�kt�r B");
		} else if(a == b) {
			System.out.println("A e�ittir B");
		} else {
			System.out.println("A k���kt�r B");
		}
		
		//=================================================//
		
		int not = 150;
		
		if(not > 100 || not < 0) {
			System.out.println("Gecerli bir not giriniz");
		} else if(not < 50) {
			System.out.println("Zay�f ald�n�z");
		} else if(not < 85) {
			System.out.println("Orta D�zey Ald�n�z");
		} else {
			System.out.println("Ge�tiniz");
		}
		
		//Not: if-else yap�lar�nda kontrol yukar�dan a�a��ya do�ru yap�l�r. �fade Do�ru olsu olmas�n t�m durumlar 
		//kontrol edilir
		
		//if else yao�s�n�n �e�itleri:
		if(true) {
			System.out.println("Do�ru");
			System.out.println("�kinci bir metin");
		}
		//===================================================//
		
		if(a < 100){
			if(a < 75) {
				if(a < 50) {
					System.out.println("Say� 50'den k���k");
				}
				System.out.println("Say� 75'den k���k");
			}
			System.out.println("say� 100'den k���k");
		} else {
			if(a > 100) {
				System.out.println("Say� 100'den b�y�k");
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
				System.out.println("Ge�tiniz");
 		} else {
 			System.out.println("Kald�n�z");
 		}
		//========================================================//
		
		//switch-case yap�s�:
		//if-else den daha h�zl�d�r. bir de�i�kenin, belli bir de�erini kontrol etmeye yarar.
		
		/*
		 * switch(<Kontrol edilecek de�i�ken>){
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
		
		//Switch-case yap�s�na tum primitif de�erler ve String veri tipindeki de�erler verilebilir.
		switch(b) {
		case 4: //true ya da false d�nd�r�r. sw-case bir tamsay�y� bir boolean la kar��la�t�ramayaca��ndan dolay� derleyici
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
			System.out.println("Ba�ka bir sayi");
		}
		
		// 'H' != 'h' 
		// 'A' != 'a'
		
		String metin = "Ahmet";
		switch(metin) {
		case "�smail":
			System.out.println("�smail Burada");
			break;
			
		case "Melike":
			System.out.println("Melike Burada");
			break;
			
		case "Ahmet":
			System.out.println("Ahmet Burada");
			break;
				
		default:
			System.out.println("Kimse burada de�il");
		}
		
		//Break'in �nemi:
		//break javada bizim yap�lardan ��kmam�z� sa�lar. bir nevi o yap�y� "K�rar". dolay�s�ylar switch-case de break'in g�revi
		//sw-case i sonland�rmakt�r. 
		int gun = 2;
		
		switch(gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Haftai�i");
			break;
			
		case 6:
		case 7:
			System.out.println("Haftasonu");
			break;
			
		default:
			System.out.println("Ge�erli bir g�n giriniz");
		}
		
		///==============================================================================================================///
		
		for(int temp : dizi) {
			System.out.println(temp);
		}
		
		//D�ng�ler: 
		//Bir kodu Tekrarlamam�z� sa�layan yap�lard�r. 
		
		// 4 Adet vard�r. bunlar:
		//while,
		//do while,
		//for,
		//foreach
		
		
		//WHILE D�NG�S�:
		//
		
		/*
		 * while(<Ko�ul>){
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
		
		//Sonsuz d�ng�ler: Genellikle while ile yap�l�rlar. kodu istedi�imiz yerde k�rmam�z� sa�lar.
		while(true) {
			System.out.println("��kt� 1");
			System.out.println("��kt� 2");
			System.out.println("��kt� 3");
			break;
		}
		
		//DO-WHILE D�NG�S�:
		
		/*
		 * do {
		 * 		Komutlar...
		 * } while(<KO�UL>);
		 */
		
		int sayi = 1;
		
		do {
			System.out.println(sayi);
			sayi++;
		} while(sayi < 10);
		
		//While'da �nce ko�ul, sonra komut cal��t�r�l�rken, do-while'da once komut, sonra ko�ul �al��t�r�l�r.
		
		//FOR d�ng�s�:
		//while gibi ama daha kolay. bir de�er aral���nda tekrar yapmam�z� sa�lar.
		 /*
		  * for(<saya� de�i�keni tan�mlan�r>; <ko�ul>; <Art�� de�eri olacak>) {
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
		
		//D�ng�lerde kod tekrarlanmas�na iterasyon denir. 
		//Not: For d�ng�s�nde de�i�ken tan�mlamas� ve art�� de�eri d�ng�n�n farkl� yerlerinde de tan�mlanabilir. yeter ki
		//forun i�inde iki adet ';' olsun.
		
		//FOREACH(GEL��M�� FOR; �ZELLE�M�� FOR vs.) D�NG�S�:
		
		//Diziler: Birden fazla de�i�keni tek bir de�i�kenmi� gibi g�stermemizi sa�lar. 
		//Geli�mi� for d�ng�s� bize dizinin teker teker elemanlar� ile i�lem yapmam�z� sa�lar. 
		
		//for(<gecici degisken tan�mlamas�> : <dizi ad�>){
		//	Komutlar...;
		//}
		
		//Break: Kodu k�rar.
		
		//Continue ise: o iterasyonu durdurur.
	}
}
