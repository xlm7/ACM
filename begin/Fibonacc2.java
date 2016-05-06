import java.util.*;
public class Main {
	public static void main(String[] args) {
		 int n,i,s,j,size;
		 int[] fib=new int[45];
		 int[] x;
		 Main amain=new Main();
		 for(i=0;i<45;i++)
			 fib[i]=amain.getfib(i);
		 
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  x=new int[n];
	  for(i=0;i<n;i++)
		  x[i]=sc.nextInt();
	  for(i=0;i<n;i++){
		  System.out.println(fib[(x[i])]);
	  }
	
}
	int getfib(int x){
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else 
			return getfib(x-1)+getfib(x-2);
	}
}