package q02_advanced.question02;

import java.util.List;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
			System.out.println("***************");
		}
	}

	public static void updatePassword(List<Member> members, int targetid, String newPassword) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId() == targetid) {
				members.get(i).setPassword(newPassword);
				return;
			}
		}
		System.out.println("該当者はいませんでした。");
	}
}
