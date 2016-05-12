import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int[]a=new int[4];
		int i;
		char c;
		while(sc.hasNext()){
			s=sc.nextLine();
			a[0]=a[1]=a[2]=a[3]=0;
			for(i=0;i<s.length();i++){
				c=s.charAt(i);
				if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
					a[0]++;
				}else if(c>='0'&&c<='9'){
					a[1]++;
				}else if(c==' '){
					a[2]++;
				}else{
					a[3]++;
				}
				
			}
			
			for(i=0;i<4;i++){
				if(i!=3)
				    System.out.print(a[i]+" ");
				else
					System.out.println(a[i]);
			}
	}
	}	}