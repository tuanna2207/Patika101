import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * Not Ortalaması Hesaplayan Program Java ile Matematik, Fizik, Kimya, Türkçe,
		 * Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
		 * hesaplayıp ekrana bastırılan programı yazın.
		 * 
		 * Ödev Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
		 * ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
		 * yazsın.
		 * 
		 * Not : If ve Else kullanılmayacak...
		 */
		
		int mat, fiz,kim, turk, tar, muz;
		Scanner a= new Scanner(System.in);
		System.out.print("matematik notunuzu girin:");
		mat= a.nextInt();
		
		
		System.out.print("fizik notunuzu girin:");
		fiz= a.nextInt();
		
		
		System.out.print("kimya notunuzu girin:");
		kim= a.nextInt();
		
		
		System.out.print("türkçe notunuzu girin:");
		turk= a.nextInt();
		
		
		System.out.print("tarih notunuzu girin:");
		tar= a.nextInt();
		
		
		System.out.print("müzik notunuzu girin:");
		muz= a.nextInt();
		
		int toplam= (mat+fiz+kim+turk+tar+muz);
		double ortalama= toplam/6;
		System.out.println("ortalamanız:"+ortalama);
		
		
		String sonuc= ortalama > 60 ? "geçti" : "kaldı";
		System.out.println(sonuc);
		
		
	}

}
