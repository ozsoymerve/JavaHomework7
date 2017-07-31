package com.trello.binary;

public class convertBinary {

	public String toBinary(int number){
		String binary="";
		if(number==1 || number ==0){
			return "1 veya 0";
			//System.out.println("1veya 0");
		}
		else if(number>1) {
			int division=1;
			int remeinder=0;
			
			while(division>0){
				remeinder=number%2;
				binary=remeinder+binary;
				
				division=number/2;
				number=division;
			}
			System.out.println("hesaplanan sonuc:"+binary);
			return binary;
		 
			}
		else{
			number=-number;
			int division=1;
			int remeinder=0;
			
			while(division>0){
				remeinder=number%2;
				binary=remeinder+binary;
				
				division=number/2;
				number=division;
			}
			System.out.println("hesaplanan sonuc:"+"-"+binary);
			return "-"+binary;
			
			}
		}
}

