package q03_extra;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから実装する
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public boolean execute(int id, String password, String name, String birthday) throws IllegalInputException {
		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id) {
				throw new IllegalInputException("IDが重複しています。再度入力してください");
			}
		}
		memberStorage.getMembers().add(Member.getInstance(id, password, name, birthday));

		return true;
	}

}
