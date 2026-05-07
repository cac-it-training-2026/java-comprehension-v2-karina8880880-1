package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member mem1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member mem2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members[0] = mem1;
		members[1] = mem2;
		System.out.println("---SHOW ALL MEMBERS---");
		MemberManager.showAllMembers(members);

	}

}
