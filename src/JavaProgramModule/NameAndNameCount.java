package JavaProgramModule;

import java.util.Arrays;

public class NameAndNameCount {

	public static void main(String[] args) {
//		String[] name = { "piyush", "riya", "piyush", "riya", "joti" };
		String str = "piyush riya piyush riya joti";
        String[] name = str.split(" ");
System.out.println(Arrays.toString(name));

		// o/p: piyush2riya2joti1

		for (int i = 0; i < name.length; i++) {
			int count = 0;
			for (int j = 0; j < name.length; j++) {
				if (name[i] == name[j]) {
					count++;
				}

			}
		
				//System.out.println(name[i] + "=====" + count);
				if (Arrays.toString(name).lastIndexOf(name[i])==i) {
					System.out.print(name[i] + count);
				}
		}

	}

}
