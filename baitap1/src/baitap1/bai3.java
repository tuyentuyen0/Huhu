package baitap1;

import java.util.Scanner ;

public class bai3 {

	  private int a , b , c ;
	public static void main(String[] args)	
	{
		
     Scanner input = new Scanner (System.in);
	 Scanner scanner =  new Scanner (System.in);
	 
	 int a;
     System.out.println("Nhap so thu nhat") ;
     a = input.nextInt();
     System.out.println(a) ;
     
     int b;
     System.out.println("Nhap so thu hai") ;
     b = input.nextInt();
     System.out.println(b) ;
     
     int c;
     System.out.println("Nhap so thu ba") ;
     c = input.nextInt();
     System.out.println(c) ;
     
     if(a+b > c && a+c> b&& b+c> a) 
     {
    	 System.out.println("La 3 canh cua tam giac") ;
     }
     else
     {
    	 System.out.println("Khong la 3 canh cua tam giac") ;
     }
     
	}

}
