# [零起点学算法系列](https://github.com/xlm7/ACM/tree/master/begin)

###LongestPalindromicSubstring<br><br>
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
<br>**Example**
> Input: "babad"<br>
Output: "bab"<br>
Note: "aba" is also a valid answer.

**Example**
> Input: "cbbd"<br>
Output: "bb"<br>

**最易于想到的是时间复杂度为O(n^3)的方法，就是简单地从前往后遍历，既然是回文就容易想到那个回文串可以从两边到中间遍历，这就需要考虑回文串长度是奇数还是偶数的区别，这样，可以把时间复杂付减小至O(n^2),还可以更小，那就是“马拉车”算法。**