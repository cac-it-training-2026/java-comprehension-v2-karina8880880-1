package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Member {
	//TODO ここから実装する
	private int id;
	private String password;
	private String name;
	private Date birthday;
	private int rank;
	private List<Coupon> coupons;

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, Date birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;

		List<Coupon> coupons = new ArrayList<Coupon>();
		this.coupons = coupons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public static Member getInstance(int id, String password, String name, String birthdayString) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date birthday = null;
		try {
			birthday = dateFormat.parse(birthdayString);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Member member = new Member(id, password, name, birthday, (int) (Math.random() * 30 + 1));
		member.coupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.coupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));
		return member;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons.toString() + "]";
	}

	public void showMember() {
		System.out.println(toString());
	}

}
