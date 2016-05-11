import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,p,q,flag;
		char[]ch=new char[20];
		
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
				ch[0]=0;
				flag=1;
				if(n<0){
					flag=-1;
					n=-1*n;
				}
				while(n!=0){					
					ch[0]++;
					p=n%m;
                              n=n/m;
					if(p>9){
						ch[ch[0]]=(char) ('A'+p-10);
					}else{
						ch[ch[0]]=(char) ('0'+p);
					}
					
				}
				if(flag==-1)
					{System.out.print("-");
					
					}
				for(q=ch[0];q>=1;q--){
					
					System.out.print(ch[q]);
				}
				System.out.println();
			
}	
	}
	}