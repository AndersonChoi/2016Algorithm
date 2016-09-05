import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class trio {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new FileReader("trio.inp"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("trio.out"));

			String s;
			s = in.readLine();
			int count = Integer.parseInt(s);

			float[][] arr = new float[count][2];

			for (int i = 0; i < count; i++) {
				s = in.readLine();
				String[] splitStr2 = s.split("\\s+");

				arr[i][0] = Integer.parseInt(splitStr2[0]);
				arr[i][1] = Integer.parseInt(splitStr2[1]);
			}

			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					if (i != j) {

						float a = arr[i][0] / arr[i][1];
						float b = arr[j][0] / arr[j][1];
						for (int k = 0; k < count; k++) {
							float c = arr[k][0] / arr[k][1];
							if (a<=b&&a + b == c) {
								System.out.println("i:"+(i+1)+" ->"+a);
								System.out.println("j:"+(j+1)+" ->"+b);
								System.out.println("k:"+(k+1)+" ->"+c);
							}
						}
					}
				}
			}
			
			writer.write("");
			writer.newLine();
			writer.close();

			in.close();
		} catch (IOException e) {
			System.exit(1);
		}

	}
}
