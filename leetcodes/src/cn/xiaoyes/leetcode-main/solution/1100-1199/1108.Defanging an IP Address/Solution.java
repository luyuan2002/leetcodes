package cn.xiaoyes.leetcode

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}