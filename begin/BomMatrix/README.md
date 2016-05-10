# [零起点学算法系列](https://github.com/xlm7/ACM/tree/master/begin)

###BomMatrix<br><br>
Description<br>
输出n*m的弓型矩阵<br><br>

Input<br>
多组测试数据 <br>
每组输入2个整数 n和m(不大于20)<br><br>
Output<br>
输出n*m的弓型矩阵，要求左上角元素是1，（每个元素占2个位置，靠右）<br><br>

Sample Input 
			
	4 3		


Sample Output
		
		 1	 2	 3
		 6	 5	 4
		 7	 8	 9
		12	11  10
												
####用一个int作为计数器，然后给一个二维数组赋值就可以了，赋值时与普通的数组赋值的区别就在于加一个if判断语句，（行数从0开始）偶数行是从左到右赋值，奇数行是从右到左赋值。

