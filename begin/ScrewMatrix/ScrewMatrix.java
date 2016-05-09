import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s,x[],max,min,j;
		while(sc.hasNext()){
			n=sc.nextInt();
			x=new int[n+1];
			for(i=1;i<=n;i++){
			   for(j=i;j<=n;j+=i){
				   x[j]=1-x[j];
			   }
			}
			s=0;
			for(i=1;i<=n;i++){
				if(x[i]==1)
					s++;					
			}
			System.out.println(s);
	}
}
}