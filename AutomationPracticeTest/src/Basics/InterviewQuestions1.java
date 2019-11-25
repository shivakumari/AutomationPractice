package Basics;

public class InterviewQuestions1 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5, 8, 10,11 };
		int[] y = { 2, 3, 4, 11 };
		int[] r = new int[x.length - y.length];
		int l = 0;

		for (int m = 0; m < x.length; m++) {
			boolean isMatchFound = false;
			for (int n = 0; n < y.length; n++) {
				if (x[m] == y[n]) {
					isMatchFound = true;
					break;
				}
			}
			if (!isMatchFound) {
				r[l] = x[m];
				l++;
			}
		}
		for (int k = 0; k < r.length; k++) {
			System.out.println(r[k]);
		}

	}
}
