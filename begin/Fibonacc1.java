import java.util.*;
public class Main {
	public static void main(String[] args) {
		 int n,i;
		 int[] x;
		 Main amain=new Main();
  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  x=new int[n];
	  for(i=0;i<n;i++)
		  x[i]=sc.nextInt();
	  for(i=0;i<n;i++){
		  System.out.println(amain.getfib(x[i]));
	  }
}
	int getfib(int x){
		int f1,f2,m=0;
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else 
			{
			f1=0;
			f2=1;
			for(int i=1;i<x;i++){			
			m=f1+f2;
			f1=f2;
			f2=m;
			}
			return m;
			}
	}
}