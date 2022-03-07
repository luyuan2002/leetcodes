package cn.xiaoyes.algorithm.day0307;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目链接: https://www.lanqiao.cn/problems/584/learning/
 * @author BPDBSIR
 */
public class LanQiao584 {

	static List<List<Integer>> res = new ArrayList<>();
	
	public static void main(String[] args) {
		dfs(1, new ArrayList<>());
		System.out.println(res.size());
	}
	
	public static void dfs(int index,List<Integer> list) {
		if(list.size() == 5) {
			if(!res.contains(list)) {
				res.add(new ArrayList<>(list));
			}
			return;
		}
		for (int i = index; i <= 10; i++) {
			list.add(i);
			dfs(i,list);
			list.remove(list.size() - 1);
		}
	}
}
