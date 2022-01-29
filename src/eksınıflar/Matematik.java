package eks�n�flar;

import java.util.Random;

public class Matematik {

	public static void main(StringMetodlar�[] args) {
		//Math s�n�f�: Matematiksel i�lemleri i�erir. Statikdir, dolay�s�yla nesne tan�mlamas� gerektirmez
		
		//pow() -> �s metodu ()
		System.out.println(Math.pow(5 ,0.66666));	
		System.out.println(Math.pow(2, Math.pow((double)1/9, 5)));
		
		System.out.println((double)1/9); //0.1
		//  k�pk�k� ((5^2))
		//  (5^2)^(1/3), 5^(2/3)
		
		// 2^1/9^5
		
		//===============
		//sqrt() -> karek�k al�r ()
		System.out.println(Math.sqrt(Math.pow(5, 78)));
		
		// sqrt(5^78)
		
		//////////////////
		//abs() -> mutlak de�er al�r
		
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-78));
		System.out.println(Math.abs(-0.485));
		
		/////////////////////
		//floor() -> Girilen say�y� kendisinden k���k en b�y�k tamsay�ya yuvarlar
		
		System.out.println(Math.floor(3.14));
		System.out.println(Math.floor(0.558));
		System.out.println(Math.floor(8));
		
		/////////////////////
		//ceil() -> girilen say�y� kendisinden b�y�k en k���k say�ya yuvarlar
		
		System.out.println(Math.ceil(5.485));
		System.out.println(Math.ceil(8));
		System.out.println(Math.ceil(8.789));
		
		/////////////////////
		//max() -> girilen de�erlerin en b�y���n� al�r
		// iki parametre al�r
		
		System.out.println(Math.max(8.78, 8.45));
		
		/////////////////////
		//min() -> girilen de�erlerin en k�����n� al�r
		// iki parametre al�r
		
		System.out.println(Math.min(2.57, 3.88));
		
		/////////////////////
		//random() -> 0,1 aras�nda rastgele bir double �retir
		
		System.out.println(Math.random());
		
		//Nas�l rastgele say� �retebiliz?
		// �retlen say�y� 10'un kuvvetleriyle �arparak say�lar elde edebiliriz
		
		System.out.println((int)(Math.random()*500));
		
		//(int) Math.random() * 1000 niye yanl��?
		
		//(0, 1)*500 = (0, 500) + 500 = (500, 1000)
		/////////////////////
		
		//ASCII
		
		//newLine 17
		
		Random r = new Random();
		byte [] bit = new byte[500];
		
		r.nextBytes(bit);
		
		System.out.println();
		
		////////////////////
		//�RNEK:
		
		int x = 0;
		double ans = 0;
		if(x > 0) ans = (Math.pow(x, 4) + Math.pow(x, Math.sin(x)) + Math.pow(x, 1/3));
		else if (x < 0) ans = Math.abs(Math.log(x) + (1/Math.cos(x)));
		
		System.out.println(ans);
	}
}
