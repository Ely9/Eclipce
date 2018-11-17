
public class Chap1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Magazine1 m1 = new Magazine1();	
		m1.title="『日本映画史』";
		m1.vol=1;	
		m1.disp();
	}
}

class Magazine1{
	String title="";
	int vol;
	void disp() {
		System.out.println(Header1.msg);
		System.out.println(title+vol+"号");
		String note;
		if(vol == 1) {
			note = "購読を開始しました";
		} else {
			note = "バックナンバーは各ジャンル棚にあります";
		}
		System.out.println(note);
	}
}

class Header1{
	static String msg = "今週のおすすめ";
}