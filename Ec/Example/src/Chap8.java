import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap8 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("パスワード");
		int e;
		for(e=1;e<4;e++) {
			String pass = br.readLine();
			boolean a1 = pass.equals("１２３４");
			if(a1) {
				System.out.println("一致します");
			} else {
				System.out.println("一致しません");
			}
		}
			System.out.print("パスワードが一致しませんでした");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
