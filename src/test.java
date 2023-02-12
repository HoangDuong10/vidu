import java.io.PrintWriter;

public class test {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\Duong\\eclipse-workspace\\File\\file1.dat","UTF-8");
			pw.println("Hoàng Xuân Dương");
			pw.println("AT17B");
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
