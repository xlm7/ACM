import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,j,x1[][],p;
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
			x1=new int[n][m];
			p=1;
			for(i=0;i<n;i++){
                    //ż���У���0��ʼ����������Ҹ�ֵ
				if(i%2==0){
				for(j=0;j<m;j++){
					x1[i][j]=p++;
				}
				}
                         //�����У���0��ʼ�����������ֵ
                        else{
					for(j=m-1;j>=0;j--){
						x1[i][j]=p++;
					}
				}
			}
			for(i=0;i<n;i++){
				for(j=0;j<m;j++){
					if(j!=m-1){
					System.out.printf("%2d ",x1[i][j]);				
				}else{
					System.out.printf("%2d\n",x1[i][j]);
				}
				
			}
			
	}
}
}
}