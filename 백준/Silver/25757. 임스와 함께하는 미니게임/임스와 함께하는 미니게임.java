import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int Person = Integer.parseInt(st.nextToken());
		String gameSelect = st.nextToken();

		int players = 0;
		if(gameSelect.equals("Y")){
			players = 1;
		}else if(gameSelect.equals("F")){
			players = 2;
		}else if(gameSelect.equals("O")){
			players = 3;
		}

		HashSet<String> playMember = new HashSet<>();
		int playCount = 0;
		int playersTemp = players;

		for(int i = 0 ; i < Person ; i++){
			String name = br.readLine();
			if(playMember.contains(name)){
				continue;
			}
			else{
				playMember.add(name);
				players--;
				if(players==0){
					playCount++;
					players = playersTemp;
				}
			}
		}
		System.out.println(playCount);


	}
}
