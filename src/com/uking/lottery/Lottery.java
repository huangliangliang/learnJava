package com.uking.lottery; 

import java.util.Scanner;

public class Lottery {
	int []a = new int[7]; //输入的数
	int []b = new int[7]; //随机中奖数
	int []c = new int[7]; //判断是否和中奖数字相同(1为相同/0为不同)
	
	public void lottery(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入七位数字");
		for(int i = 0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		System.out.println("您输入的数字为: \t");
		for(int i = 0;i<a.length;i++){
			System.out.println("  "+a[i]+"\t");
		}
		for(int i = 0;i<a.length;i++){
			b[i] = (int)(Math.random()*10);
		}
		System.out.println("本期中奖的号码为:  \t");
		for(int i = 0;i<a.length;i++){
			System.out.println("  "+b[i]+"\t");
		}
		System.out.println("\n");
		System.out.println("其中\t\t");
		for(int i = 0;i<a.length;i++){
			if(a[i]==b[i]){
				System.out.println("相同\t");
				c[i] = 1;
			}else{
				System.out.println("不同\t");
			}
		}
		System.out.println("\n");
	}
	//判断中奖与否
	public void estimate(){
		if((c[0]==1&&c[1]==1)||
			(c[1]==1&&c[2]==1)||
			(c[2]==1&&c[3]==1)||
			(c[3]==1&&c[4]==1)||
			(c[4]==1&&c[5]==1)||
			(c[5]==1&&c[6]==1)){
			System.out.println("恭喜中得6等奖！奖金五元！");
		}else if((c[0]==1&&c[1]==1&&c[2]==1)||
				(c[1]==1&&c[2]==1&&c[3]==1)||
				(c[2]==1&&c[3]==1&&c[4]==1)||
				(c[3]==1&&c[4]==1&&c[5]==1)||
				(c[4]==1&&c[5]==1&&c[6]==1)
				){
			System.out.println("恭喜中得5等奖！奖金二十元！");
		}else if((c[0]==1&&c[1]==1&&c[2]==1&&c[3]==1)||
				(c[1]==1&&c[2]==1&&c[3]==1&&c[3]==1)||
				(c[2]==1&&c[3]==1&&c[4]==1&&c[4]==1)||
				(c[3]==1&&c[4]==1&&c[5]==1&&c[5]==1)
				){
			System.out.println("恭喜中得四等奖！奖金300元！");
		}else if((c[0]==1&&c[1]==1&&c[2]==1&&c[3]==1&&c[4]==1)||
				(c[1]==1&&c[2]==1&&c[3]==1&&c[3]==1&&c[5]==1)||
				(c[2]==1&&c[3]==1&&c[4]==1&&c[4]==1&&c[6]==1)
				){
			System.out.println("恭喜中得三等奖！奖金1800元!");
		}else if((c[0]==1&&c[1]==1&&c[2]==1&&c[3]==1&&c[4]==1&&c[5]==1)||
				(c[1]==1&&c[2]==1&&c[3]==1&&c[3]==1&&c[5]==1&&c[6]==1)){
			System.out.println("恭喜中得二等奖！奖金50万元！");
		}else if((c[0]==1&&c[1]==1&&c[2]==1&&c[3]==1&&c[4]==1&&c[5]==1&&c[6]==1)){
			System.out.println("恭喜中得一等奖！奖金500万！");
		}else{
			System.out.println("还差一点，继续加油！");
		}
	}
	
}
