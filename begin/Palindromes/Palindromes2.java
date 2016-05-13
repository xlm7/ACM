import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,x[];
		String s;
		StringBuffer sb;
		while(sc.hasNext()){
			n=sc.nextInt();
			x=new int[n];
			for(i=0;i<n;i++){
			s=sc.next();
			sb=new StringBuffer(s);
			sb=sb.reverse();
			if(!sb.toString().equals(s))
				x[i]=1;
			}
			for(i=0;i<n;i++){
			  if(x[i]==1){
				  System.out.println("no");
			  }else{
				  System.out.println("yes");  
			  }
			}
}
		
	}
	}