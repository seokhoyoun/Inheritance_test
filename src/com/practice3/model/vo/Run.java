package com.practice3.model.vo;

import com.practice3.controller.Favorite;
import com.practice3.controller.MyInfo;
import com.practice3.controller.Stuff;

public class Run {

	public static void main(String[] args) {
		MyInfo[] inf = new MyInfo[6];
		inf[0] = new Stuff("홍길동",19,"세이코","갤럭시 노트2",4);
		inf[1] = new Stuff("유관신",20,"롤렉스","아이폰 7",3);
		inf[2] = new Stuff("이순선",22,"다이브","갤럭시 8",5);
		inf[3] = new Favorite("장발장", 25, "하이킹" , 3 , "사과");
		inf[4] = new Favorite("임걱중", 27, "음악감상" , 7 , "딸기");
		inf[5] = new Favorite("김유산", 29, "게임하기" , 10 , "수박");
		memberInform(inf);
	}
	public static void memberInform(MyInfo[] mi) {
		System.out.println("----------------------------- 소유물 -----------------------------");
		for(int i = 0; i < mi.length; i++) {
			if(mi[i] instanceof Stuff) {
				System.out.println(((Stuff)mi[i]).toString());
			}
			else if(i == 3){
				System.out.println("----------------------------- 취향 -----------------------------");
				System.out.println(((Favorite)mi[i]).toString());
			}
			else
				System.out.println(((Favorite)mi[i]).toString());
		}
	}
}
