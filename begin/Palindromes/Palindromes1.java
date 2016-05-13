import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,x[];
		String s;
		char[] cc;
		while(sc.hasNext()){
			n=sc.nextInt();
			x=new int[n];
			for(i=0;i<n;i++){
			s=sc.next();
			cc=s.toCharArray();
			for(j=0;j<cc.length/2;j++){
				if(cc[j]!=cc[cc.length-1-j]){
					x[i]=1;
					break;
				}
					
			}
			}
			for(i=0;i<n;i++){
			  if(x[i]==0){
				  System.out.println("yes");
			  }else{
				  System.out.println("no");  
			  }
			}
}
		
	}
	}