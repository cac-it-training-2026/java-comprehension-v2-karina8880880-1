package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(1, "aaaAAA", "Sato Kensuke", 43, 1));
		System.out.println("＝＝＝会員情報を表示します＝＝＝");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します＝＝＝");
		int id = 0;
		String password = "";
		try {
			id = cr.inputNumber();
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;
		}
		try {
			password = cr.inputString();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;
		}
		MemberManager.updatePassword(members, id, password);
		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
