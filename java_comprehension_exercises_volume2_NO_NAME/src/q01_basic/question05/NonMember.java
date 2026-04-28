package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {
		this.name = name;
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + " purchased the item at a fixed price");
	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + " is a non-member");
	}

}
