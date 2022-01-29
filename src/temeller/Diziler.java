package temeller;

import java.util.Arrays;

public class Diziler {

	public static void main(String[] args) {
		// Diziler: birden fazla de�i�keni s�rayla eri�memizi sa�layan yap�lard�r. 
		// {2, 3, 7, 12, 59, 35, 6}
		
		// bu s�ran�n ilk eleman�: 2
		// ikinci eleman�: 3
		// ���nc� eleman� ise: 7
		
		//0. indis: 2
		//4. indis: 59
		//7. indis: "ArrayIndexOutOfBoundsException"
		
		// s�ra numaras�na: indis.
		
		//�nemli Not: �ndis numaras� 1 den ba�lamaz, 0 dan ba�lar.
		
		//Dizi tan�mlamas�: 
		//   <Veri tipi> [] <dizi ad�>;
		
		//statik atama:
			//tan�mlama an�nda yap�l�r, {} i�erisinde istenildi�i kadar de�er atanabilir. Sonradan dei�tirilemez.
		
		int[] sayilar = {1, 2, 3, 4, 5, 'c'}; //Referans olu�tururuz. 
		
		// de�i�ken atama:
		// 		Tan�mlama an�nda bir s�n�r belirlenir, sonradan bu s�n�r kadar de�i�ken olu�turulur.
		// 		
		int[] sayilar2 = new int[8];// bize 8 adet de�i�ken tan�mlad�.
		//Nesne tan�mlar�z
		
		// statik de�i�ken atama:
		//		statik ataman�n bir farkl� �ekli
		
		int[] sayilar3 = new int[] {1, '2', 3, 4, 5, 6, '7', 8, 9, 0, 12, 15, 'a', '&'}; //Nesne tan�mlar, ilk atama yapar�z.
		
		//Diziler primitif bir veri tipi de�ildir. Referans bir yap� tipidir. 
		
		System.out.println(sayilar[2]);
		System.out.println(sayilar3[5]);
		
		//for
		int i;
		for(i = 0; i < sayilar3.length; i++) {
			System.out.println(sayilar3[i]);
		}
		
		System.out.println("============");
		
		//foreach(�zelle�mi� for)
		for(int temp : sayilar) {
			System.out.println(temp);
		}
		
		/////////
		
		Object[] joker = {16, "�smail", 'E'};
		
		System.out.println(joker[0]);
		System.out.println(joker[1]);
		System.out.println(joker[2]);
		
		/////////
		
		System.out.println(sayilar2.length);
		
		/////////
		System.out.println("========");
		//Elaman bazl� kopyalama:
		//Teker teker elemanlar kopyalan�r.
		int dizi[] = {8, 7, 4, 6, 9, 2};
		int kopyalananDizi[] = new int[dizi.length];
		
		for(i = 0; i < dizi.length; i++) {
			kopyalananDizi[i] = dizi[i];
		}
		
		for(int temp : dizi) System.out.println(temp);
		
		for(int temp : kopyalananDizi) System.out.println(temp);
		
		//////////
		System.out.println("=======");
		
		int kopyalananDizi2[] = new int[6];
		
		//System.arrayCopy(<kaynak dizi>, <kaynak dizinin ba�lang�� indisi>, <Hedef dizi>, <Hedef dizinin ba�lang�� indisi>, <kopyalanacak eleman>); 
		//-> Dizileri kopyalamak i�in kullan�l�r.
		
		System.arraycopy(dizi, 2, kopyalananDizi2, 0, 3);
		
		for(int temp : dizi) System.out.println(temp);
		
		for(int temp : kopyalananDizi2) System.out.println(temp);
		
		////////////
		System.out.println("==============");
		
		int karisik[] = {4, 7, 8, 5, 3, 6};
		
		//Dizilerin S�ralanmas�:
		//Bubble Sort
		
		int len = karisik.length;
	    int temp;

	    for(i = 0; i < len; i++){
	        for(int j = 0; j < len-1; j++){
	            if(karisik[j] > karisik[j+1]){
	                temp = karisik[j];
	                karisik[j] = karisik[j+1];
	                karisik[j+1] = temp;
	            }
	        }
	    }
	    
	    for(int gecici : karisik) System.out.println(gecici);
	    
	    //�nce ilk ikiliyi al ve s�rala
	    //dizinin sonuna kadar b�yle devam et
	    //ilk ikiliyi yeniden s�rala
	    //dizinin sonuna kadar devam et
	    // bunu dizi eleman� kadar tekrar et.
	    
	    //Array.sort(<Dizi>); -> Diziyi s�ralar
	    //Array.sort(<dizi>, <ba�lang�c>, <Biti�>);
	    
	    int shuffled[] = {12, 65, 45, 3, 89, 17, 38};
	    
	    Arrays.sort(shuffled);
	    
	    for(int gecici : shuffled) System.out.println(gecici);
	    
	    //Dizilerde arama:
	    //Lineer Arama:
	    
	    int sayi = 12;
	    
	    for(int gecici : shuffled) {
	    	if(sayi == gecici) {
	    		System.out.println("Sayi bulundu");
	    		break;
	    	} else System.out.println("Sayi Bulunamad�");
	    }
	    
	    //Binary Search:
	    //Not: Dizinin s�ral� olmas� gerek
	    
	    int dizi2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	    //�nce dizinin ortas�ndaki de�eri bul
	    //sayi dizinin sa� taraf�nda m�, sol taraf�nda m� onu bul.
	    //bu taraf�n orta noktas�n� bul.
	    //tekrarla.
	    
	    //Arrays.binarySearch(<Dizi ad�>, <Aranacak De�er>); -> Bir de�eri dizide arar, bulursa indisini d�nd�r�r.
	    //bulamazsa -1 d�nd�r�r. 
	    
	    int indis = Arrays.binarySearch(dizi2, 78);
	    
	    System.out.println(indis);
	    // [2, 3, 5, 8, 12, 19, 26, 58, 89] --> Say� var, kendisi 1. indiste
	    
	    //Dizilerin E�itli�i:
	    //E�it dizilerin eleman say�lar� ve eleman indisleri ayn�d�r
	    
	    //
	    
	    //[1, 8] == [1, 8] != [8, 1]
	    
	    boolean esitmi = Arrays.equals(dizi, dizi2);
	    
	    ////////////////////
	    
	    //�ok boyutlu diziler.
	    //Birden fazla indis de�eri ile eri�ilebilen dizilerdir. 
	    //Mesela: bir say� do�rusundaki her de�er bir indis ise, korrdinat d�zlemindeki her say� ikilisi iki boyutlu bir dizidir. 
	    
	    //int dizi[][] == {int dizi[2], int dizi[15], int dizi[5], ...};
	    
	    /*
	     * Rectangular array
	     * {a, b, c, d, e}
	     * {a, b, c, d, e}
	     * {a, b, c, d, e}
	     * {a, b, c, d ,e}
	     * {a, b, c, d, e}
	     * {a, b, c, d, e}
	     * {a, b, c, d, e}
	     * {a, b, c, d, e}
	     */
	    
	    int matris[][] = new int[8][5];
	    
	    matris[5][3] = 15;
	    matris[7][0] = 70;
	    matris[0][4] = 102;
	    
	    System.out.println(matris[5][3]);
	    System.out.println(matris[7][0]);
	    System.out.println(matris[0][4]);
	    
	    System.out.println("==================================");
	    for(int k = 0; k < matris.length; k++) {
	    	for(int l = 0; l < matris[0].length; l++) {
	    		System.out.println(matris[k][l]);
	    	}
	    }
	    
	    //Jagged Array
	    int birim[][] = {
	    		{1, 5, 7, 8},
	    		{2, 6, 4, 8, 7},
	    		{3, 6, 7, 5, 9, 1},
	    		{1, 2, 3, 4}
	    };
	    
	    ////////////////////
	    
	    //Arrays S�n�f� metodlar�. 
	    
	    //Arrays.asList(); -> Dizilerimizi Liste Veri Yap�s�na atar. 
	    
	    //Arrays.copyOf(<Dizi ad�>, <Eleman say�s�>); -> dizinin belirtilen say� kadar eleman�n�n kopylanmas�n� sa�lar, bir nevi dizinin uzunlu�unu yeniden atar.
	    
	    char Robotesla[] = {'R', 'o', 'b', 'o', 't', 'e', 's', 'l', 'a'};
	    char Kopya[];
	    
	    Kopya = Arrays.copyOf(Robotesla, 4);
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	    for(char gecici : Kopya) System.out.println(gecici);
	    System.out.println("===========================");
	    
	    //Arrays.copyOfRange(<Dizi ad�>, <Ba�lang��>, <Biti�>); -> Verdi�imiz indis de�erleri aras�nda diziyi kopyalar.
	    
	    char Kopya2[];
	    
	    Kopya2 = Arrays.copyOfRange(Robotesla, 4, 9); //2, 3, 4, 5, 6, 7
	    
	    for(char gecici : Kopya2) System.out.println(gecici);
	    
	    //Arrays.fill(dizi, karakter); -> Dizinin bo� elemanlar�n� belirtti�imiz karakter ile doldurur.
	    
	    Arrays.fill(Robotesla, '0');
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	    
	    //Arrays.fill(<Dizi>, <Ba�lang��>, <Biti�>, <Karakter>) -> Ba�lang�� ile biti� aras�ndaki t�m elemanlar� karakter ile de�i�tirir
	    System.out.println("====================");
	    Arrays.fill(Robotesla, 2, 7, '1');
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	}

}
