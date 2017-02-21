public class Solution {
     public   String convert(String s, int numRows) {
         if(s.equals("")||numRows==1)
          return s;
    	int leng=s.length();
    	char[]c=s.toCharArray();
    	int n=(leng/(2*numRows-2)+1)*(numRows-1);
    	char[][] bufc=new char[numRows][n];
    	int flagj=0,flagi=0;
    	int flag=0;//0 向下 1向上
    	for(int i=0;i<leng;i++){
    		if(flag==0){
    			bufc[flagi][flagj]=c[i];
    			//System.out.println(c[i]);
    			flagi++;
    			if(flagi==numRows){
    				flagi--;
    				flag=1;
    			}
    		}else{
    			flagi--;
    			flagj++;
    			bufc[flagi][flagj]=c[i];
    			//System.out.println(c[i]);
    			if(flagi==0){
    			flag=0;
    			flagi++;
    			
    			}
    		}
    	}
    	String ss="";
       for(int i=0;i<numRows;i++)
    	   for(int j=0;j<n;j++)
    	   {
    		   if(bufc[i][j]!='\0')
    			   ss+=bufc[i][j];
    	   }
       return ss;
    }
}
