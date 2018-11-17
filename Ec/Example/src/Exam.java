
public class Exam {
	
	static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは");
		System.out.println(add(5,7));

	}

}

class Magazine{
	String title="";
	int vol;
	
	void disp() {
		System.out.println(Header.msg);
		System.out.print(title+vol+"号");
	}
}

class Header{
	static String msg = "今週のおすすめ";
}