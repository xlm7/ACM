import java.util.*;
/**
用count来记录拍手次数，i表示报的数，j表示人的编号
flag用来结束循环
*/
public class Main {
	static int count=0;//表示拍手次数
	public static void main(String[] args) {
		int a,b,c,i,j,q=1;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			flag=true;
			q=1;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==0&&b==0&&c==0)
			return;
		count=0;
		//i表示报的数字
		for(i=1,j=1;flag;i++,j=j+q){
			if(j==1)
				q=1;
			if(j==a)
				q=-1;
			//是否编号为b的人第c次拍手
			if(j==b&&cal(i,c))
			{
				System.out.println(i);
				flag=false;
			}
		}
  } 
	}
	//判断这是否是第c次拍手
	public static boolean cal(int i,int c){
		if(i%7==0||(""+i).contains("7"))
			count++;
		return c==count;
	}			
}
