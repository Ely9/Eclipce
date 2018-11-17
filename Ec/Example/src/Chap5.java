
public class Chap5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int pt = 500;
		boolean a = pt>=1000;
		boolean a1 = (pt<1000)&&(pt>=500);
		boolean a2 = (pt<1000)&&(pt>=500);
		boolean a3 = pt == 500;
		boolean a4 = pt<500;
		
		 if(a) {
			System.out.println(pt);
			System.out.println("aaaa");
		} else if(a1) {
			if(a2) {
				System.out.print("あと"+(1000-pt));
			}else if(a3) {
				System.out.println("おめでとう!!");
			} else {
				System.out.println("ppppp");
			}
		} else if(a4) {
			System.out.println(pt);
			System.out.println("cccc");
		}
	}
}
