import java.util.*;
public class Main {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a;
	 while(sc.hasNext()){
		a=sc.nextInt();
		if((a%4==0&&a%100!=0)||a%400==0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	}
}