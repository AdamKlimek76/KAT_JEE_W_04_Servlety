package b_Zadania_Domowe.a_Dzien_1;

import java.util.regex.Pattern;

public class Main2 {

	String reg1= "[1-9]\\d*\\.\\d+";
	String reg2= "[0-9]\\.\\d+E[\\-\\+]\\d{2}";
	String reg3= "((((0[1-9])|([12][0-9]))/(0[1-9]|1[0-2]))|(30/((0[469])|11))|(3[01]/((0[13578])|(1[02]))))/\\d{4}";
	String reg4= "((2\\d{2}[1-9])|([3-9]\\d{3}))\\-((((0[1-9])|(1[0-2]))\\-((0[1-9]])|([12][0-9])))|(((0[469])|11)\\-30)|(((0[13578])|(1[02]))\\-3[01]))";

	public static void main(String[] args) {
		boolean result1 = Pattern.matches("[1-9]\\d*\\.\\d+", "505.6146540");
		System.out.println(result1);

		boolean result2 = Pattern.matches("[0-9]\\.\\d+E[\\-\\+]\\d{2}", "2.0000342E-06");
		System.out.println(result2);

		boolean result3 = Pattern.matches("((((0[1-9])|([12][0-9]))/(0[1-9]|1[0-2]))|(30/((0[469])|11))|(3[01]/((0[13578])|(1[02]))))/\\d{4}", "01/12/2005");
		System.out.println(result3);

		boolean result4 = Pattern.matches("((2\\d{2}[1-9])|([3-9]\\d{3}))\\-((((0[1-9])|(1[0-2]))\\-((0[1-9]])|([12][0-9])))|(((0[469])|11)\\-30)|(((0[13578])|(1[02]))\\-3[01]))", "3000-12-31");
		System.out.println(result4);




	}

}
