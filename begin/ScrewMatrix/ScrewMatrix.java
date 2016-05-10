import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,j,x1[][],p,q,a,b,c;
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
			x1=new int[n][m];
			p=1;
			c=Math.min(n, m);
			q=(c+1)/2;			
			for(i=0;i<q;i++){
				//上
				for(j=i;j<m-1-i;j++){
					x1[i][j]=p++;
				}						
				//右
				for(j=i;j<n-1-i;j++){
					x1[j][m-i-1]=p++;
				}				
				//下
				for(j=m-i-1;j>i;j--){
					x1[n-1-i][j]=p++;
				}				
			//左
				for(j=n-i-1;j>i;j--){
					x1[j][i]=p++;
				}
	}	
			//用来处理行数等于列数且为奇数的时候，最中间的那个数
			if(m==n&&m%2==1){
				x1[m/2][n/2]=p;
			}
			for(a=0;a<n;a++){
			for(b=0;b<m;b++){
				if(b!=m-1)
				  System.out.printf("%2d ",x1[a][b]);
				else
					 System.out.printf("%2d\n",x1[a][b]);
			}			
		}
}	
	}
	}