# [零起点学算法系列](https://github.com/xlm7/ACM/tree/master/begin)

###Fibonacci<br><br>
Fibonacci数列定义为（1,1,2,3,5,8,.....），即每个元素是前两个元素的和。如果一个Fibonacci数与所有小于它的Fibonacci数互质，那么称之为Fibonacci质数。 
现在要求你输出前n个Fibonacci数 
The Fibonacci Numbers {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...} are defined by the recurrence: <br>
F(0)=0 <br>
F(1)=1 <br>
F(i)=F(i-1)+F(i-2) <br>
Write a program to calculate the Fibonacci Numbers.<br>
Input<br>
 The first line of the input file contains a single integer T, the number of test cases. The following T lines,each contains an integer n ( 0 <= n <= 45 ), and you are expected to calculate Fn

Output<br>
 Output Fn on a separate line.<br><br>
Sample Input <br>
5<br>
0<br>
3<br>
5<br>
9<br>
20<br><br>

Sample Output<br>
0<br>
2<br>
5<br>
34<br>
6765<br><br>

####这个用递归做的话很容易，我第一次提交的程序是Fibonacc2，编译通过的，但最后还是不行，因为“Time Limit Exceed”，递归是很耗时的操作，每一次调用都会把方法压入栈，改成Fibonacc1那样就好了。每次只用处理三个简单的赋值或加法，节省空间和时间。

