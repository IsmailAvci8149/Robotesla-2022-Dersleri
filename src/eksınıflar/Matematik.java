package eksýnýflar;

import java.util.Random;

public class Matematik {

	public static void main(StringMetodlarý[] args) {
		//Math sýnýfý: Matematiksel iþlemleri içerir. Statikdir, dolayýsýyla nesne tanýmlamasý gerektirmez
		
		//pow() -> üs metodu ()
		System.out.println(Math.pow(5 ,0.66666));	
		System.out.println(Math.pow(2, Math.pow((double)1/9, 5)));
		
		System.out.println((double)1/9); //0.1
		//  küpkökü ((5^2))
		//  (5^2)^(1/3), 5^(2/3)
		
		// 2^1/9^5
		
		//===============
		//sqrt() -> karekök alýr ()
		System.out.println(Math.sqrt(Math.pow(5, 78)));
		
		// sqrt(5^78)
		
		//////////////////
		//abs() -> mutlak deðer alýr
		
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-78));
		System.out.println(Math.abs(-0.485));
		
		/////////////////////
		//floor() -> Girilen sayýyý kendisinden küçük en büyük tamsayýya yuvarlar
		
		System.out.println(Math.floor(3.14));
		System.out.println(Math.floor(0.558));
		System.out.println(Math.floor(8));
		
		/////////////////////
		//ceil() -> girilen sayýyý kendisinden büyük en küçük sayýya yuvarlar
		
		System.out.println(Math.ceil(5.485));
		System.out.println(Math.ceil(8));
		System.out.println(Math.ceil(8.789));
		
		/////////////////////
		//max() -> girilen deðerlerin en büyüðünü alýr
		// iki parametre alýr
		
		System.out.println(Math.max(8.78, 8.45));
		
		/////////////////////
		//min() -> girilen deðerlerin en küçüðünü alýr
		// iki parametre alýr
		
		System.out.println(Math.min(2.57, 3.88));
		
		/////////////////////
		//random() -> 0,1 arasýnda rastgele bir double üretir
		
		System.out.println(Math.random());
		
		//Nasýl rastgele sayý üretebiliz?
		// üretlen sayýyý 10'un kuvvetleriyle çarparak sayýlar elde edebiliriz
		
		System.out.println((int)(Math.random()*500));
		
		//(int) Math.random() * 1000 niye yanlýþ?
		
		//(0, 1)*500 = (0, 500) + 500 = (500, 1000)
		/////////////////////
		
		//ASCII
		
		//newLine 17
		
		Random r = new Random();
		byte [] bit = new byte[500];
		
		r.nextBytes(bit);
		
		System.out.println();
		
		////////////////////
		//ÖRNEK:
		
		int x = 0;
		double ans = 0;
		if(x > 0) ans = (Math.pow(x, 4) + Math.pow(x, Math.sin(x)) + Math.pow(x, 1/3));
		else if (x < 0) ans = Math.abs(Math.log(x) + (1/Math.cos(x)));
		
		System.out.println(ans);
	}
}
