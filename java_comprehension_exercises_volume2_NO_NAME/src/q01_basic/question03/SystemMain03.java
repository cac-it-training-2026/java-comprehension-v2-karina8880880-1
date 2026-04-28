package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member mem = new Member();
		Member mem2 = new Member("Miura Manabu", 28, 2);
		System.out.println("---SHOW DATA(NULL)---");
		mem.showMember();
		System.out.println("---SHOW DATA(Miura)---");
		mem2.showMember();
	}

}
