package nesne_tabanli_programlama;

public class DahiliSınıflar {
	
	//Sınıf içerisinde Tanımlanmış Sınıflar
	
	// Dahili üye sınıflar -> Direk sınıfın içinde tanımlanırlar
	// Yerel Sınıflar -> Metodlar içinde tanımlanırlar
	// Anonim Sınıflar -> Arayüz nesneleri vasıtasıyla tanımlanırlar
	
	//Dahili üye sınıflar: 
	
	private static class İçSınıf {
		public class iç2 {
			public class iç3 {
				
			}
		}
		
		public static int a = 2;
		public void yazdır() {
			System.out.println("Bu yazı bir iç sınıf tarafından yazdırılmıştır");
		}
	} 
	
	public class Inner {
		public double turn = 5;
		
		public static final double pi = 3.14; //->Sabitler non-static iç sınıflarda tanımlanabilir
		public static final double e = 2.17;
		
	}
	
	public class Canlı {
		public class Hayvanlar {
			
		}
	}
	
	// Bir Dahili Sınıf Dış Sınıfa Erişebilir
	
	// Erişim belirteci ne olursa olsun bir Dış Sınıf, İç Sınıfın metodlarına erişebilir
	
	// Static iç sınıfların metodları da statik olabilir.
	
	// static olmayan sınıfların metodları static olamaz. Bu sınıflarda sadece normal degişkenler, metodlar ve sabitler tanımlanabilir
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		İçSınıf i = new İçSınıf(); //-> Statik tanımlı iç sınıflar, aynı sınıftalarsa direk adlarıyla tanımlanabilirler.
		
		DahiliSınıflar.Inner iç = new DahiliSınıflar().new Inner(); // Dahili sınıfın içinde yer alan Inner Sınıfının refernsı, Dahilisınıf referansının içinde yeralan Inner sınıfının
		//referansıdır.
		
		DahiliSınıflar d = new DahiliSınıflar();
		
		DahiliSınıflar.Canlı dc = d.new Canlı();
		
		DahiliSınıflar.Canlı.Hayvanlar hayvan = dc.new Hayvanlar();
		
		//new operatörü : Bize bellekte referans tipinde bir yer ayırır.
		
		//int a = 5000;
		
		// 00000110....1101
		
		//new Scanner();
		
		// 00101010 10101 0101011 
		
		İçSınıf.iç2.iç3 nesne = new İçSınıf().new iç2().new iç3();
		 
		i.yazdır();
	}

}

class Constants{
	public static class OtonomSabitleri{
		public static final double hiz = 0.75;
	}
	
	public static class TeleopSabitleri{
		public static final int encoder = 5;
	}
	
	public static class GörüntüİşlemeSabitleri{
		
	}
}