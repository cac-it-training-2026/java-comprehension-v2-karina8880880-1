package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {
		List<Member> mems = memberStorage.getMembers();
		for (int i = 0; i < mems.size(); i++) {
			if (mems.get(i).getId() == id && mems.get(i).getPassword().equals(password)) {
				return mems.get(i);
			}
		}
		return null;
	}
}
