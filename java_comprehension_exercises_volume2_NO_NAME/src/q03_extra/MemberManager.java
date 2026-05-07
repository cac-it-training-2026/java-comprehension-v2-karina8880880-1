package q03_extra;

import java.util.List;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(List<Member> members, int id) {
		for (Member member : members) {
			if (member.getId() == id)
				member.showMember();
		}
	}

}
