import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum =0;
		try {
			int n = Integer.parseInt(bf.readLine());
			int[] result = new int[n];
			for(int i=0; i < n; i++) {
				String s = bf.readLine();
				StringTokenizer st = new StringTokenizer(s);
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				result[i] = x+y;		
			}
			bf.close();
			for(int i=0; i < n; i++) {
				bw.write(result[i]+"\n");
			}
			bw.flush();
			bw.close();
		}catch(IOException e) {e.getMessage();}
	}

}