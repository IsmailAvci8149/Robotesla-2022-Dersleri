package nesne_tabanli_programlama;

import java.util.*;
public class Örnekler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test("Deneme");
	}
}

class Test {
	
	private static Random r = new Random(); // Sayýyý sallayan sýnýf
	private static int num = r.nextInt(); //rastgele bir sayi al
	
	public Test(String metin) {
		this(metin, Math.abs(num%2000));
	}
	
	public Test(String metin, int tamsayi) {
		System.out.println(metin + " " + tamsayi);
	}
}
