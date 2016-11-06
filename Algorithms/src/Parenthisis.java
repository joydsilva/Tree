import java.util.Scanner;

/**
 * algorithm to find the properly closed parenthesis "}}{}}}"-->2 to 3. "}}}{{}}}}" -->
 * 3 to 6
 * 
 * @author joydsilva
 *
 */
public class Parenthisis {

	public static int[] result = new int[2];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(input);

		args = input.split("");
		int start = 0;
		int end = 0;
		/**
		 * find the inner most parenthesis
		 */
		for (int i = 0; i < args.length - 1; i++) {
			if ("{".equals(args[i]) && "}".equals(args[i + 1])) {
				start = i;
				end = i + 1;
			}
		}

		if (start > 0 && end < args.length - 1) {
			findValidParenthesis(args, start, end);
		}
		/**
		 * if start==0 or last element
		 */
		else {
			System.out.println(start + "-----" + end);
		}
	}

	/**
	 * expand the parenthesis check to the outer
	 * 
	 * @param args
	 * @param start
	 * @param end
	 */
	public static void findValidParenthesis(String[] args, int start, int end) {

		int outerstart = start;
		int outerend = end;

		boolean condition = true;
		while (condition) {

			if ("{".equals(args[outerstart]) && "}".equals(args[outerend])) {
				result[0] = outerstart;
				result[1] = outerend;

				outerstart = outerstart - 1;
				outerend = outerend + 1;

			} else {

				condition = false;
			}

		}

		System.out.println(result[0] + "<---->" + result[1]);

	}

}
