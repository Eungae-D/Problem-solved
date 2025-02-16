import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double X = Double.parseDouble(st.nextToken());
		double Y = Double.parseDouble(st.nextToken());
		double R = (1000 / Y) * X;
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			double r = (1000 / y) * x;
			
			R = Math.min(R, r);
		}
		//오차는 0.01까지 허용한다했다. 그말은 소수점 둘째자리까지 반올림 하라는 뜻인것 같다.
		//String.forat을 이용
		System.out.println(String.format("%.2f", R));
	}

}