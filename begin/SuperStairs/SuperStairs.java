import java.util.*;
public class Main {
	public static int count=0;
	public static void main(String[] args) {
		int m;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			m=sc.nextInt();
			count=0;
			cal(m);
			System.out.println(count);
		}
  }
	public static void cal(int m){
		if(m==1||m==2){
			count++;
		}
		else{
			cal(m-1);			
			cal(m-2);
		}
			
	}
}
