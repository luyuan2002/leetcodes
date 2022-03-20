package cn.xiaoyes.algorithm.day0320;

public class LanQiao1022 {
	public static void main(String[] args) {
		
	}
}

/**
#include "iostream"
using namespace std;

int dx[4]={1,0,-1,0};	//方向控制 
int dy[4]={0,1,0,-1};
	int a[4][4]={0};
int n=0;
int main()
{
	void dfs(int stay,int x,int y);

	int stay=0;	//玩具蛇共16节 已放置了stay节 
	int i,k;
	for(i=0;i<4;i++)	//对4x4的格子 枚举玩具蛇第一个步放置的所有可能。 
	{
		for(k=0;k<4;k++)		
		{
			a[i][k]=1;	//对已放置的格子进行标记 
			dfs(1,i,k);
			a[i][k]=0;	//清除标记 
		}
	}
	cout<<n;
	return 0;
}
void dfs(int stay,int x,int y)	//x,y相当于正在放置的格子的坐标 
{
	
	int tx,ty;
	if(stay==16)	//递归终止条件 
	{

		n++;
		return;
	}

	for(int i=0;i<4;i++)	//尝试向四个方向放置 
	{
		tx=x+dx[i];			//方向 
		ty=y+dy[i];
		if(a[tx][ty]==1||tx<0||tx>3||ty<0||ty>3)		//该格子不可放置 或越界 跳过该方向 
		continue;
		a[tx][ty]=1;	// 对已放置的格子进行标记 
		dfs(stay+1,tx,ty);
		a[tx][ty]=0;	//清除标记 
		
	}
}
**/