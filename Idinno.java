package idunno;

import java.util.Scanner;

public class Idinno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("lol ur mum g-...");
	
	int[]DS=new int[5];
	Scanner scan = new Scanner (System.in);
	System.out.println("5 numbers");
	
	for(int i =0;i<DS.length;i++){
		DS[i]=scan.nextInt();
	}
	for(int i2 =0;i2<DS.length;i2++){
		if(DS[i2]%4==0 && DS[i2]%5==0){
			System.out.println(DS[i2]);
		}
	}
		
	scan.close();
	scanner.close();
	
	}

	
}






