package eks�n�flar;

public class StringMetodlar� {
	//String: Stringler karakter dizileridir. dolay�s�yla bir karakter toplumunu tutabilirler. Bu �zelliklerinden dolay�
	//ise �o�unlukla metinleri ve liste gibi yaz� i�eren verileri tutmak i�in kullan�l�rlar.
	
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s = "Bug�n g�nlerden cumartesi";
		// B + u + g + � + n + ' ' + g + � + n + l + e + r ...
		
		//String tipi primitif bir tip de�ildir.
		String s1 = new String("Bu bir nesne"); // bu yap�c�ya, bir bit dizisi, bir karakter dizisi, ya da ba�ka bir string g�nderilebilir
		
		char[] ch = {'I', 's', 'm', 'a', 'i', 'l', ' ', 'A', 'v', 'c', 'i'};		char[] ch2 = {'M', 'e', 'l', 'i', 'k', 'e', ' ', 'D', 'o', '�', 'a', 'n'};
		char[] ch3 = {'A', 'h', 'm', 'e', 't', ' ', 'A', 'k', 'b', 'a', 'l'};
		
		String IA = new String(ch);
		String MD = new String(ch2);
		String AA = new String(ch3);
		
		System.out.println(IA);
		System.out.println(MD);
		System.out.println(AA);
		
		///////////////////////////////////////////
		//String Metodlar�//
		///////////////////////////////////////////
		
		//Uzunluk:
		System.out.println(IA.length()); //length -> Uzunlu�u verir.
		//////////////
		
		//Birle�tirme:
		
		//1)
		// + operat�r�: Veri tipi ne olursa olsun her �eyi birbirine ekler.
		
		System.out.println("Benim Ad�m " + IA + 15);
		
		//2)
		// concat() metodu: Sadece Stringleri birbirine ba�lamaya yarar. Zincir gibi �st �ste kullan�labilir
		
		System.out.println("Benim Ad�m ".concat(MD).concat(" AVGuhbk").concat("15485255"));
		///////////////
		
		//Kar��la�t�rma:
		
		// == operat�r�:
		// Nesnelerin ad�n� kontrol eder, ama i�indekileri kontrol etmez. tabiki ayn� nesenede farkl� de�er tutamay�z ama farkl� nesnelerde
		// ayn� de�erler tutabilece�imiz i�in bu �perat�r bize hatal� sonu�lar verebilir.
		
		//1)
		// equals(obj) metodu:
		// Nesnelerin ad� ne olursa olsun, i�indekileri kontrol eder.
		
		System.out.println(IA.equals("Ismail Avci"));
		System.out.println(IA == "Ismail Avci"); // HATALI SONU�
		
		//2)
		// equalsIgnoreCase(obj) metodu: 
		// equals metodu, ama harflerin b�y�kl�k, k���kl���ne dikkat edilmiyor. 
		
		// b�y�kl�k k���kl�k: case
		
		// Melike Do�an -> melike do�an
		// melike Do�an -> melike do�an
		// MeliKe Do�an -> melike do�an 
		
		// tttttttttttt -> t
		// fttttttttttt -> f
		
		// 65 == 93 false
		
		System.out.println(MD.equalsIgnoreCase("MeliKe Do�an"));
		
		//3) compareTo, compareToIgnoreCase
		// compareTo(str) -> e�er bu metod 0 d�nd�r�rse, o halde stringler e�ittir
		
		// Ahmet Akbal
		// Ahmet Akbal
		
		// 00000000000 hepsini toplar -> 0
		
		// Ahmet Akbal
		// ahmet Akbal
		
		// -26 0000000000 topla -> -26 => "Ahmet Akbal" < "ahmet Akbal"
		
		System.out.println(AA.compareTo("Ahmet Akbal"));
		System.out.println(AA.compareTo("ahmet Akbal"));
		
		//4)
		// compareToIgnoreCase(str) -> case i g�rmezden gelerek kar��l�t�rma i�lemine tabii tutar
		
		//5)
		// regionMatches(int, string, int, int) -> Belirli bir b�lgeyi kar��la�t�r�r.
		
		// ilk parametre hangi indisten aramay ba�lanaca��
		// ikinci parametre hangi Stringin aranaca��
		// ���nc� parametre aranacak Stringin ba�lang�� b�lgesi
		// d�rd�nc� parametre ka� karakter devam edece�i
		
		String mesaj = "Ankara T�rkiye'nin ba�kentidir.";
		String ara = "T�rkiye"; //0 0
		
		System.out.println(mesaj.regionMatches(true, 7, ara, 0, 7));
		
		// aranacak b�lgenin ba��ndan ba�lan�r. ortalar�ndaki kelimeler aranamaz
		
		//6)
		// StartsWith() -> girilen string kontrol edilen stringin ba��nda m�?
		
		System.out.println(mesaj.startsWith("kara"));
		
		//7)
		// endsWith() -> girilen string kontrol edilen stringin sonunda m�?
		
		System.out.println(mesaj.endsWith("idir."));
		
		// Karakter bazl� ilerlendi�i i�in kar��la�t�rma metodlar�nda dikkat edilmelidir.
		///////////////////////
		
		// karakter metodlar�: Stringler �zerindeki karakterleri alabiliyoruz
		
		//1)
		// getChars(int, int, char[], int) -> bir stringdeki belli bir b�lgeyi karakter dizisine atamam�z� sa�l�yor
		
		String karakterDizisi = "Bu bir Karakter Dizisidir";
		
		char[] Arr = new char[20];
		
		karakterDizisi.getChars(7, 15, Arr, 0);
		
		System.out.println(new String(Arr));
		
		//2)
		// charAt(int) -> girilen indis de�erine g�re Stringdeki karakteri al�r
		
		System.out.println(karakterDizisi.charAt(20));
		
		//3)
		// toCharArray() -> t�m stringi karakter dizisine atar�z
		
		char[] dizi = karakterDizisi.toCharArray();
		
		System.out.println(new String(dizi));
		
		//4)
		// indexOf(char) -> girilen karakterin bulundu�u ilk indisi verir
		
		System.out.println(karakterDizisi.indexOf('r'));
		System.out.println(karakterDizisi.lastIndexOf('r'));
	}

}
