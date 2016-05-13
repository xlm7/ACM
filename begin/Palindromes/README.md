# [零起点学算法系列](https://github.com/xlm7/ACM/tree/master/begin)

###Palindromes<br><br>
Description<br>
“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”。

Input
输入包含多个测试实例，输入数据的第一行是一个正整数n,表示测试实例的个数，后面紧跟着是n个字符串。每个字符串长度不超过150。

Output
如果一个字符串是回文串，则输出"yes",否则输出"no".

Sample Input 

    4
    level
    abcde
    noon
    haha

Sample Output

    yes
    no
    yes
    no

**这个第二个代码我用了java中StringBuffer自带的函数reserve(),把字符串倒置后与原来字符串比较，如果还equal，那就是回文咯！<br>第一个则设置一个标记int i=0，代表这是回文,然后字符串首尾依次比较，如果有不一样则将i设为1，代表不是回文，并退出该次循环比较。**
		
