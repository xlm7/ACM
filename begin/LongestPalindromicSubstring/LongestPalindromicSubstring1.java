public class Solution {
   public String longestPalindrome(String s) {
		 int length=s.length(),maxlen,len;
		 String str="";
		 int gap=0;
		 if(length==0)
			 return "";
		 if(length==1)
			 return s;
		 char[] chars=s.toCharArray();
		 maxlen=1;
		 str=""+chars[0];
		 for(int i=0;i<length;i++){
			 gap=0;
			 len=1;
			 while(i-gap>=0&&i+gap<length&&chars[i-gap]==chars[i+gap]){
				gap++;
			 }
			 len+=(gap-1)*2;
			 if(len>maxlen){
				 maxlen=len;
				 str=s.substring(i-gap+1, i+gap+1-1);
			 }
		 }
		 for(int i=0;i<length;i++){
			 gap=0;
			 len=0;
			 if(i+1<length&&chars[i]==chars[i+1]){
			 while(i-gap>=0&&i+gap+1<length&&chars[i-gap]==chars[i+gap+1]){
				gap++;
			 }
		
			 len+=gap*2;
			 if(len>maxlen){
				 maxlen=len;
				 str=s.substring(i-gap+1, i+gap+2-1);
			 }
			 }
		 }
		return str;
	    }
}