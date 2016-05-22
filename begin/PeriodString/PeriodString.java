import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		char[] cc;
		int i,j;
		boolean period=true;
		while(sc.hasNext()){
			s=sc.nextLine();
			cc=s.toCharArray();
			//System.out.println(cc);
			for(i=1;i<cc.length;i++){
				if(cc.length%i==0){
					period=true;
					for(j=i;j<cc.length;j++){
						if(cc[j%i]!=cc[j]){
							period=false;
							break;
						}
					}
				
				if(period){
					System.out.println(i);
					break ;
				}
				}
			}
			}
}
		
}	