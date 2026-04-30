package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		Member member = null;
		int id = 0;
		String password = "";

		while (member == null) {
			System.out.print("input id>>");
			try {
				id = cr.inputNumber();
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				System.out.println("不正な値です。再度入力してください");
				continue;
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				return;
			}
			System.out.print("input password>>");
			try {
				password = cr.inputString();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				return;
			}
			member = loginService.doLogin(id, password);
			if (member == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
			}
		}

		System.out.println("ログインに成功しました");
		System.out.println(member.toString());
	}

}
