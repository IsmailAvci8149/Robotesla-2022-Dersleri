package nesne_tabanli_programlama;

public class DahiliS�n�flar {
	
	//S�n�f i�erisinde Tan�mlanm�� S�n�flar
	
	// Dahili �ye s�n�flar -> Direk s�n�f�n i�inde tan�mlan�rlar
	// Yerel S�n�flar -> Metodlar i�inde tan�mlan�rlar
	// Anonim S�n�flar -> Aray�z nesneleri vas�tas�yla tan�mlan�rlar
	
	//Dahili �ye s�n�flar: 
	
	private static class ��S�n�f {
		public class i�2 {
			public class i�3 {
				
			}
		}
		
		public static int a = 2;
		public void yazd�r() {
			System.out.println("Bu yaz� bir i� s�n�f taraf�ndan yazd�r�lm��t�r");
		}
	} 
	
	public class Inner {
		public double turn = 5;
		
		public static final double pi = 3.14; //->Sabitler non-static i� s�n�flarda tan�mlanabilir
		public static final double e = 2.17;
		
	}
	
	public class Canl� {
		public class Hayvanlar {
			
		}
	}
	
	// Bir Dahili S�n�f D�� S�n�fa Eri�ebilir
	
	// Eri�im belirteci ne olursa olsun bir D�� S�n�f, �� S�n�f�n metodlar�na eri�ebilir
	
	// Static i� s�n�flar�n metodlar� da statik olabilir.
	
	// static olmayan s�n�flar�n metodlar� static olamaz. Bu s�n�flarda sadece normal degi�kenler, metodlar ve sabitler tan�mlanabilir
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		��S�n�f i = new ��S�n�f(); //-> Statik tan�ml� i� s�n�flar, ayn� s�n�ftalarsa direk adlar�yla tan�mlanabilirler.
		
		DahiliS�n�flar.Inner i� = new DahiliS�n�flar().new Inner(); // Dahili s�n�f�n i�inde yer alan Inner S�n�f�n�n referns�, Dahilis�n�f referans�n�n i�inde yeralan Inner s�n�f�n�n
		//referans�d�r.
		
		DahiliS�n�flar d = new DahiliS�n�flar();
		
		DahiliS�n�flar.Canl� dc = d.new Canl�();
		
		DahiliS�n�flar.Canl�.Hayvanlar hayvan = dc.new Hayvanlar();
		
		//new operat�r� : Bize bellekte referans tipinde bir yer ay�r�r.
		
		//int a = 5000;
		
		// 00000110....1101
		
		//new Scanner();
		
		// 00101010 10101 0101011 
		
		��S�n�f.i�2.i�3 nesne = new ��S�n�f().new i�2().new i�3();
		 
		i.yazd�r();
	}

}

class Constants{
	public static class OtonomSabitleri{
		public static final double hiz = 0.75;
	}
	
	public static class TeleopSabitleri{
		public static final int encoder = 5;
	}
	
	public static class G�r�nt���lemeSabitleri{
		
	}
}