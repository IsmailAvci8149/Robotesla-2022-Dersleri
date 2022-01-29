package eksýnýflar;

public class StringMetodlarý {
	//String: Stringler karakter dizileridir. dolayýsýyla bir karakter toplumunu tutabilirler. Bu özelliklerinden dolayý
	//ise çoðunlukla metinleri ve liste gibi yazý içeren verileri tutmak için kullanýlýrlar.
	
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s = "Bugün günlerden cumartesi";
		// B + u + g + ü + n + ' ' + g + ü + n + l + e + r ...
		
		//String tipi primitif bir tip deðildir.
		String s1 = new String("Bu bir nesne"); // bu yapýcýya, bir bit dizisi, bir karakter dizisi, ya da baþka bir string gönderilebilir
		
		char[] ch = {'I', 's', 'm', 'a', 'i', 'l', ' ', 'A', 'v', 'c', 'i'};		char[] ch2 = {'M', 'e', 'l', 'i', 'k', 'e', ' ', 'D', 'o', 'ð', 'a', 'n'};
		char[] ch3 = {'A', 'h', 'm', 'e', 't', ' ', 'A', 'k', 'b', 'a', 'l'};
		
		String IA = new String(ch);
		String MD = new String(ch2);
		String AA = new String(ch3);
		
		System.out.println(IA);
		System.out.println(MD);
		System.out.println(AA);
		
		///////////////////////////////////////////
		//String Metodlarý//
		///////////////////////////////////////////
		
		//Uzunluk:
		System.out.println(IA.length()); //length -> Uzunluðu verir.
		//////////////
		
		//Birleþtirme:
		
		//1)
		// + operatörü: Veri tipi ne olursa olsun her þeyi birbirine ekler.
		
		System.out.println("Benim Adým " + IA + 15);
		
		//2)
		// concat() metodu: Sadece Stringleri birbirine baðlamaya yarar. Zincir gibi üst üste kullanýlabilir
		
		System.out.println("Benim Adým ".concat(MD).concat(" AVGuhbk").concat("15485255"));
		///////////////
		
		//Karþýlaþtýrma:
		
		// == operatörü:
		// Nesnelerin adýný kontrol eder, ama içindekileri kontrol etmez. tabiki ayný nesenede farklý deðer tutamayýz ama farklý nesnelerde
		// ayný deðerler tutabileceðimiz için bu öperatör bize hatalý sonuçlar verebilir.
		
		//1)
		// equals(obj) metodu:
		// Nesnelerin adý ne olursa olsun, içindekileri kontrol eder.
		
		System.out.println(IA.equals("Ismail Avci"));
		System.out.println(IA == "Ismail Avci"); // HATALI SONUÇ
		
		//2)
		// equalsIgnoreCase(obj) metodu: 
		// equals metodu, ama harflerin büyüklük, küçüklüðüne dikkat edilmiyor. 
		
		// büyüklük küçüklük: case
		
		// Melike Doðan -> melike doðan
		// melike Doðan -> melike doðan
		// MeliKe DoÐan -> melike doðan 
		
		// tttttttttttt -> t
		// fttttttttttt -> f
		
		// 65 == 93 false
		
		System.out.println(MD.equalsIgnoreCase("MeliKe DoÐan"));
		
		//3) compareTo, compareToIgnoreCase
		// compareTo(str) -> eðer bu metod 0 döndürürse, o halde stringler eþittir
		
		// Ahmet Akbal
		// Ahmet Akbal
		
		// 00000000000 hepsini toplar -> 0
		
		// Ahmet Akbal
		// ahmet Akbal
		
		// -26 0000000000 topla -> -26 => "Ahmet Akbal" < "ahmet Akbal"
		
		System.out.println(AA.compareTo("Ahmet Akbal"));
		System.out.println(AA.compareTo("ahmet Akbal"));
		
		//4)
		// compareToIgnoreCase(str) -> case i görmezden gelerek karþýlþtýrma iþlemine tabii tutar
		
		//5)
		// regionMatches(int, string, int, int) -> Belirli bir bölgeyi karþýlaþtýrýr.
		
		// ilk parametre hangi indisten aramay baþlanacaðý
		// ikinci parametre hangi Stringin aranacaðý
		// üçüncü parametre aranacak Stringin baþlangýç bölgesi
		// dördüncü parametre kaç karakter devam edeceði
		
		String mesaj = "Ankara Türkiye'nin baþkentidir.";
		String ara = "Türkiye"; //0 0
		
		System.out.println(mesaj.regionMatches(true, 7, ara, 0, 7));
		
		// aranacak bölgenin baþýndan baþlanýr. ortalarýndaki kelimeler aranamaz
		
		//6)
		// StartsWith() -> girilen string kontrol edilen stringin baþýnda mý?
		
		System.out.println(mesaj.startsWith("kara"));
		
		//7)
		// endsWith() -> girilen string kontrol edilen stringin sonunda mý?
		
		System.out.println(mesaj.endsWith("idir."));
		
		// Karakter bazlý ilerlendiði için karþýlaþtýrma metodlarýnda dikkat edilmelidir.
		///////////////////////
		
		// karakter metodlarý: Stringler üzerindeki karakterleri alabiliyoruz
		
		//1)
		// getChars(int, int, char[], int) -> bir stringdeki belli bir bölgeyi karakter dizisine atamamýzý saðlýyor
		
		String karakterDizisi = "Bu bir Karakter Dizisidir";
		
		char[] Arr = new char[20];
		
		karakterDizisi.getChars(7, 15, Arr, 0);
		
		System.out.println(new String(Arr));
		
		//2)
		// charAt(int) -> girilen indis deðerine göre Stringdeki karakteri alýr
		
		System.out.println(karakterDizisi.charAt(20));
		
		//3)
		// toCharArray() -> tüm stringi karakter dizisine atarýz
		
		char[] dizi = karakterDizisi.toCharArray();
		
		System.out.println(new String(dizi));
		
		//4)
		// indexOf(char) -> girilen karakterin bulunduðu ilk indisi verir
		
		System.out.println(karakterDizisi.indexOf('r'));
		System.out.println(karakterDizisi.lastIndexOf('r'));
	}

}
