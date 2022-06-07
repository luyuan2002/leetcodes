package cn.xiaoyes.leetcode

class Solution {
  public int addDigits(int num) {
      return (num - 1) % 9 + 1;
  }
}