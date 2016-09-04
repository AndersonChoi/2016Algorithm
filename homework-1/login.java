import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class login {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new FileReader("login.inp"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("login.out"));
			
			String s;
			s = in.readLine();
			String[] splitStr = s.split("\\s+");
			int[][] arr = new int[Integer.parseInt(splitStr[0])][Integer.parseInt(splitStr[1])];

			for (int i = 0; i < Integer.parseInt(splitStr[0]); i++) {
				s = in.readLine();
				String[] splitStr2 = s.split("\\s+");

				for (int j = 0; j < Integer.parseInt(splitStr[1]); j++) {
					arr[i][j]=Integer.parseInt(splitStr2[j]);
				}
			}

			int count = Integer.parseInt(in.readLine());
			int[] question = new int[count];

			    
			for(int i=0;i<count;i++){
				s = in.readLine();
				String[] splitStr3 = s.split("\\s+");
				
				for(int j=Integer.parseInt(splitStr3[0])-1;j<Integer.parseInt(splitStr3[1]);j++){
					for(int k=Integer.parseInt(splitStr3[2])-1;k<Integer.parseInt(splitStr3[3]);k++){
						question[i]+=arr[k][j];
					}
				}
			    writer.write(""+question[i]);
			    writer.newLine();
			}
	        writer.close( );
			
			in.close();
		} catch (IOException e) {
			System.exit(1);
		}

	}
}
