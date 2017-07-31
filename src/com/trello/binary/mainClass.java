package com.trello.binary;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		System.out.println("- deðerlerde fonksiyon patlýyor !!!");
		//Scanner s=new Scanner(System.in);
		//System.out.println("sayý giriniz:");
		//int number=s.nextInt();
		for(int j=-5;j<=30;j++){
		System.out.println("sonuc1:"+Integer.toBinaryString(j));
		convertBinary cb=new convertBinary();
		cb.toBinary(j);
		}

	}

}
