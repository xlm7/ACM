public class Solution {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){		
			int s=sc.nextInt();
			System.out.println(isPalindrome(s));
		}
		}
	public static int getlength(int x){
		int i=0;
		while(x!=0){
			x=x/10;
			i++;
		}
		System.out.println(i);
		return i;
	}
	 public static boolean isPalindrome(int x) {
		 if(x<0)
			 return false;
		 int length=getlength(x);
		 int num=(int) Math.pow(10,length-1);
		 while(x>=10){
			 if(x/num!=x%10)
				 return false;
			 x=x%num;
			 x=x/10;
			 num=num/100;
			 if(x<num&&x%10!=0)//int ��Ӧ�м���0����� ��100021���ǻ��� ȥ�����ж���� ����Ϊ�ǻ���
				 return false;
			
		 }
	        return true;
	    }
}

