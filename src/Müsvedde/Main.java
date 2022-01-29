package Müsvedde;

import java.io.*;
import java.util.*;

public class Main {
		
	// serileþtrime sayesinde heryerden o bilgi okunabilir di.
	public static void main(String[] args) {
		Ogrenci S = new Ogrenci(888, "Ýsmail", "Avcý", 5123456789l, "ABCD");
		Not G = new Not(888, "Ýsmail", "Avcý", "Matematik", 100);
		
		try {
			serileþtir(S, "ogrenci.txt");
			serileþtir(G, "not.txt");
			
			Ogrenci o = (Ogrenci) deserileþtir("ogrenci.txt");
			Not n = (Not) deserileþtir("not.txt");
			
			System.out.println("Eriþilen Bilgi: " + o.getAd() + " " + o.getSoyad());
			System.out.println("Eriþilen Bilgi: " + n.getAd() + " " + n.getSoyad());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public static void serileþtir(Object s, String path) throws IOException {
		FileOutputStream fOS = new FileOutputStream(path);
		ObjectOutputStream oOS = new ObjectOutputStream(fOS);
			
		oOS.writeObject(s);
		
		oOS.close();
		fOS.close();
	}
	
	public static Object deserileþtir(String path) throws IOException, ClassNotFoundException {
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		
		Object o = oIS.readObject();
		
		fIS.close();
		oIS.close();
		
		return o;
	}
}

class Ogrenci implements Serializable {
	private int no;
	private String ad;
	private String soyad;
	private long telefon;
	private String adres;

	public Ogrenci(int no, String ad, String soyad, long telefon, String adres) {
		super();
		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.adres = adres;
	}

	public int getNo() {
		return no;
	}

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public long getTelefon() {
		return telefon;
	}

	public String getAdres() {
		return adres;
	}
}

class Not implements Serializable{
	private int numara;
	private String ad;
	private String soyad;
	private String ders;
	private int not;
	
	public Not(int numara, String ad, String soyad, String ders, int not) {
		this.numara = numara;
		this.ad = ad;
		this.soyad = soyad;
		this.ders = ders;
		this.not = not;
	}

	public int getNumara() {
		return numara;
	}

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public String getDers() {
		return ders;
	}

	public int getNot() {
		return not;
	}
}