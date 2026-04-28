package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member mem1 = new Member();
		Member mem2 = new Member();
		mem1.name = "Miura Manabu";
		mem1.age = 24;
		mem1.rank = 1;
		mem2.name = "Sato Kensuke";
		mem2.age = 36;
		mem2.rank = 2;
		System.out.println("---SHOW DATA---");
		mem1.showMember();
		mem2.showMember();

	}

}
