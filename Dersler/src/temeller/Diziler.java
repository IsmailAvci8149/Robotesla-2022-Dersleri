package temeller;

import java.util.Arrays;

public class Diziler {

	public static void main(String[] args) {
		// Diziler: birden fazla deðiþkeni sýrayla eriþmemizi saðlayan yapýlardýr. 
		// {2, 3, 7, 12, 59, 35, 6}
		
		// bu sýranýn ilk elemaný: 2
		// ikinci elemaný: 3
		// üçüncü elemaný ise: 7
		
		//0. indis: 2
		//4. indis: 59
		//7. indis: "ArrayIndexOutOfBoundsException"
		
		// sýra numarasýna: indis.
		
		//Önemli Not: Ýndis numarasý 1 den baþlamaz, 0 dan baþlar.
		
		//Dizi tanýmlamasý: 
		//   <Veri tipi> [] <dizi adý>;
		
		//statik atama:
			//tanýmlama anýnda yapýlýr, {} içerisinde istenildiði kadar deðer atanabilir. Sonradan deiþtirilemez.
		
		int[] sayilar = {1, 2, 3, 4, 5, 'c'}; //Referans oluþtururuz. 
		
		// deðiþken atama:
		// 		Tanýmlama anýnda bir sýnýr belirlenir, sonradan bu sýnýr kadar deðiþken oluþturulur.
		// 		
		int[] sayilar2 = new int[8];// bize 8 adet deðiþken tanýmladý.
		//Nesne tanýmlarýz
		
		// statik deðiþken atama:
		//		statik atamanýn bir farklý þekli
		
		int[] sayilar3 = new int[] {1, '2', 3, 4, 5, 6, '7', 8, 9, 0, 12, 15, 'a', '&'}; //Nesne tanýmlar, ilk atama yaparýz.
		
		//Diziler primitif bir veri tipi deðildir. Referans bir yapý tipidir. 
		
		System.out.println(sayilar[2]);
		System.out.println(sayilar3[5]);
		
		//for
		int i;
		for(i = 0; i < sayilar3.length; i++) {
			System.out.println(sayilar3[i]);
		}
		
		System.out.println("============");
		
		//foreach(özelleþmiþ for)
		for(int temp : sayilar) {
			System.out.println(temp);
		}
		
		/////////
		
		Object[] joker = {16, "Ýsmail", 'E'};
		
		System.out.println(joker[0]);
		System.out.println(joker[1]);
		System.out.println(joker[2]);
		
		/////////
		
		System.out.println(sayilar2.length);
		
		/////////
		System.out.println("========");
		//Elaman bazlý kopyalama:
		//Teker teker elemanlar kopyalanýr.
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
		
		//System.arrayCopy(<kaynak dizi>, <kaynak dizinin baþlangýç indisi>, <Hedef dizi>, <Hedef dizinin baþlangýç indisi>, <kopyalanacak eleman>); 
		//-> Dizileri kopyalamak için kullanýlýr.
		
		System.arraycopy(dizi, 2, kopyalananDizi2, 0, 3);
		
		for(int temp : dizi) System.out.println(temp);
		
		for(int temp : kopyalananDizi2) System.out.println(temp);
		
		////////////
		System.out.println("==============");
		
		int karisik[] = {4, 7, 8, 5, 3, 6};
		
		//Dizilerin Sýralanmasý:
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
	    
	    //önce ilk ikiliyi al ve sýrala
	    //dizinin sonuna kadar böyle devam et
	    //ilk ikiliyi yeniden sýrala
	    //dizinin sonuna kadar devam et
	    // bunu dizi elemaný kadar tekrar et.
	    
	    //Array.sort(<Dizi>); -> Diziyi sýralar
	    //Array.sort(<dizi>, <baþlangýc>, <Bitiþ>);
	    
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
	    	} else System.out.println("Sayi Bulunamadý");
	    }
	    
	    //Binary Search:
	    //Not: Dizinin sýralý olmasý gerek
	    
	    int dizi2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	    //Önce dizinin ortasýndaki deðeri bul
	    //sayi dizinin sað tarafýnda mý, sol tarafýnda mý onu bul.
	    //bu tarafýn orta noktasýný bul.
	    //tekrarla.
	    
	    //Arrays.binarySearch(<Dizi adý>, <Aranacak Deðer>); -> Bir deðeri dizide arar, bulursa indisini döndürür.
	    //bulamazsa -1 döndürür. 
	    
	    int indis = Arrays.binarySearch(dizi2, 78);
	    
	    System.out.println(indis);
	    // [2, 3, 5, 8, 12, 19, 26, 58, 89] --> Sayý var, kendisi 1. indiste
	    
	    //Dizilerin Eþitliði:
	    //Eþit dizilerin eleman sayýlarý ve eleman indisleri aynýdýr
	    
	    //
	    
	    //[1, 8] == [1, 8] != [8, 1]
	    
	    boolean esitmi = Arrays.equals(dizi, dizi2);
	    
	    ////////////////////
	    
	    //Çok boyutlu diziler.
	    //Birden fazla indis deðeri ile eriþilebilen dizilerdir. 
	    //Mesela: bir sayý doðrusundaki her deðer bir indis ise, korrdinat düzlemindeki her sayý ikilisi iki boyutlu bir dizidir. 
	    
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
	    
	    //Arrays Sýnýfý metodlarý. 
	    
	    //Arrays.asList(); -> Dizilerimizi Liste Veri Yapýsýna atar. 
	    
	    //Arrays.copyOf(<Dizi adý>, <Eleman sayýsý>); -> dizinin belirtilen sayý kadar elemanýnýn kopylanmasýný saðlar, bir nevi dizinin uzunluðunu yeniden atar.
	    
	    char Robotesla[] = {'R', 'o', 'b', 'o', 't', 'e', 's', 'l', 'a'};
	    char Kopya[];
	    
	    Kopya = Arrays.copyOf(Robotesla, 4);
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	    for(char gecici : Kopya) System.out.println(gecici);
	    System.out.println("===========================");
	    
	    //Arrays.copyOfRange(<Dizi adý>, <Baþlangýç>, <Bitiþ>); -> Verdiðimiz indis deðerleri arasýnda diziyi kopyalar.
	    
	    char Kopya2[];
	    
	    Kopya2 = Arrays.copyOfRange(Robotesla, 4, 9); //2, 3, 4, 5, 6, 7
	    
	    for(char gecici : Kopya2) System.out.println(gecici);
	    
	    //Arrays.fill(dizi, karakter); -> Dizinin boþ elemanlarýný belirttiðimiz karakter ile doldurur.
	    
	    Arrays.fill(Robotesla, '0');
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	    
	    //Arrays.fill(<Dizi>, <Baþlangýç>, <Bitiþ>, <Karakter>) -> Baþlangýç ile bitiþ arasýndaki tüm elemanlarý karakter ile deðiþtirir
	    System.out.println("====================");
	    Arrays.fill(Robotesla, 2, 7, '1');
	    
	    for(char gecici : Robotesla) System.out.println(gecici);
	}

}
