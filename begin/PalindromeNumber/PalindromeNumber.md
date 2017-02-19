###9. Palindrome Number
Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?<br>
判断一个int是否为回文数，不能用额外的空间（不能把int转换为其他形式再做判断）<br><br>
### 1.首先可以判断负数不是回文<br> 2.接下来考虑int首尾判断，这就需要知道int长度例如12321，一次判断1==1,2==2<br>if(x/num!=x%10)<br>　　return  false;<br>x=x/num;<br>x=x%10;<br>num=num/100;<br> if(x<num&&x%10!=0)return false;<br>3.最后注意类似100021这样的数不能判断为回文 ,上面的if语句就是这样的作用，一个数去掉首尾部位后，不能将剩下的部分继续判断，因为这时候如果剩下的数首位为0，会被忽略，如果去掉首位后剩下的首位为0，就该判断尾部是否为0。
