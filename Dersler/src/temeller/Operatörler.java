package temeller;

public class Operat�rler {

	public static void main(String[] args) {
		//Operat�rler: 
		//Veriler �zerinde i�lemler yaparlar.
		
		//Aritmetik: + - * / %
		//Atama op: =, +=, -=, *=, /=, %=
		//Kar��la�t�rma: <, >, <=, >=, ==, !=
		//Mant�ksal op: VE -> &&(&), VEYA -> ||(|), YA DA(^), DE��L(!)
		//Di�er: ., instanceof, ?:
		
		int numara1 = 4;
		int numara2 = 5;
		
		System.out.println(4 + 5);
		System.out.println(4 - 5);
		System.out.println(4 * 5);
		System.out.println(4 / 5);
		System.out.println(4 % 5);
		 
		numara1 += 5; //numara1 = numara1 + 5
		System.out.println(numara1); //9
		
		numara1 -= 5; // numara1 = numara1 - 5
		System.out.println(numara1); //4? -1?
		
		numara1 *= 5; 
		System.out.println(numara1); //20
		
		numara1 /= 5;
		System.out.println(numara1); //4
		
		numara1 %= 5;
		System.out.println(numara1); //4
		
		//De�i�kenlerin yerlerini de�i�tirmek.
		
		System.out.println("num1 = " + numara1 + "; num2 = " + numara2);
		
		int gecici = numara1;
		numara1 = numara2;
		numara2 = gecici;
		
		System.out.println("num1 = " + numara1 + "; num2 = " + numara2);
		
		//Artt�rma ve Azaltma op: verilerin de�erlerini birer birer artt�rmam�z� sa�larlar ++ --
		
		int sayi = 8;
		
		sayi++;
		System.out.println(sayi); //9
		
		sayi--;
		System.out.println(sayi); //8
		
		int sayi2 = ++sayi; //Artt�rma op. �nde ise, �nce artt�r�r, sonra atar
		int sayi3 = sayi++; //Artt�rma op. sonda olursa, �nce atar, sonra artt�r�r
	
		//numara++ -> numara = numara+1
		
		System.out.println(sayi2); //9
		System.out.println(sayi3); //9
		System.out.println(sayi);  //10
		
		//=============================================================================//
		//�rnek:
		
		int deger = 20;
		int a, b, c, d, e, f;
		
		a = ++deger; //21
		b = deger--; //20
		c = --deger; //19
		d = ++deger; //20
		e = deger++; //21
		f = deger; //21
		
		System.out.println(a); //21
		System.out.println(b); //21
		System.out.println(c); //19
		System.out.println(d); //20
		System.out.println(e); //20
		System.out.println(f); //21
		//=============================================================================//
		
		int x = 10;
		int y = 20;
		int z = 10;
		
		System.out.println(x < y); //true
		System.out.println(x > y); //false
		System.out.println(z <= y); //true
		System.out.println(z >= x); //true
		System.out.println(z == x); //true
		System.out.println(y != x); //true
		System.out.println("==========");
		
		//================================================================================//
		
		boolean p = true;
		boolean q = false;
		
		System.out.println(p && q); //false
		System.out.println(p & q); //false
		System.out.println(p || q); //true
		System.out.println(p | q); //true
		System.out.println(p ^ q); //true
		System.out.println(!p); //false
		System.out.println(!q); //true
		
		//Not: && op. Ko�ullu Ve denir. her iki de�erle ve i�lemi yapar. & ve op. direk de�erlerle i�lem yapar
		// 5 & 7 : 101 & 111 = 101;
		// 19 | 20 = 10011 | 10100 = 10111 = 23
		
		//0000 0100 0001 & 1111 1111 1111 = 0000 0100 0001 -> e�er x & y == x ise x benim istedi�im say�d�r.
		
		/*
		 * Taban Aritmeti�i: 
		 * 14 = 1x10^1 + 4x10^0
		 * 
		 * 1256 = 1x10^3 + 2x10^2 + 5x10^1 + 6x10^0
		 * 
		 * 100 1110 1000
		 */
		
		//===================================================================================//
		
		//Ternary op:
		//int sayi = <ko�ul> ? <do�ru ise> : <yanl�� ise>;
		//ko�ullu atama
		
		int k = 8;
		int l = 2;
		
		int min = k < l ? k : l;
		int max = k > l ? k : l;
		
		System.out.println(min);
		System.out.println(max);
		
		//nokta (.) ;
		//yap�lar�n alt�ndaki de�erlere, metodlara eri�mek i�in kullan�l�r. dosyalar aras�nda ge�mek i�in de kullan�l�r.
		//S�n�f.metod
		
		//paket.s�n�f
		
		//instanceof:
		//bir veri tipini kontrol etmek i�in kullan�l�r. --> Referanslar i�in kullan�l�r
		
		System.out.println("abcde" instanceof String);
		
		//Not: i�lem �nceli�i op. de de vard�r. matematiktekiyle ayn�d�r. 
		
		System.out.println((7+(8*9)) | (5*4/(9+7-3))); //79 | (20/13)
		
		//Parantezler -> �arpma, B�lme -> Toplama ��karma -> kar��la�t�rma op. -> Mant�ksal op -> Atama op.
		
		//=========================================================================================================//
		
		//3 say�m�z olsun. Bu say�lar� en k���k, en b�y�k ve ortanca olmak �zere s�ralayal�m.
		
		int num1, num2, num3;
		
		num1 = 8;
		num2 = 9;
		num3 = 2;
		
		int temp;
		
		/*
		int max1 = num1 > num2 ? num1 : num2;
		int max2 = num2 > num3 ? num2 : num3;
		int en_buyuk = max1 > max2 ? max1 : max2;
		
		int min1 = num1 < num2 ? num1 : num2;
		int min2 = num2 < num3 ? num2 : num3;
		int en_kucuk = max1 < max2 ? max1 : max2;
		
		int avr1 = num1 > num2 ? num1 : num2;
		int avr2 = num2 < num3 ? num2 : num3;
		int ortalama = avr1 == avr2 ? avr1 : ;*/
		
		//�nce num1 ve num2 den b�y�k olan� num1'e atayaca��z
		//bubbleSort Algoritmas�
		
		//ilk ikiyi s�ralar
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		temp = 0;
		
		//sonraki ikiyi s�ralar
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		temp = 0;
		
		//S�ran�n sonuna gelindiyse ilk ikiyi yeniden s�ralar.
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println(num1 + "  " + num2 + "  " + num3);
	}

}
