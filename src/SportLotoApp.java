
public class SportLotoApp {

	public static void main(String[] args) {
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, varNum = 0, i = 0;

						
			while (i < 6) {
				varNum = getRandomInt(1, 49);
				if (i == 0) {
				x1 = varNum;
				System.out.print(x1 + ", ");
					i++;
				}
				if (i == 1 && varNum != x1) {
					x2 = varNum;
					System.out.print(x2 + ", ");
					i++;
				}
				if (i == 2 && varNum != x2 && varNum != x1) {
					x3 = varNum;
					System.out.print(x3 + ", ");
					i++;
				}
				if (i == 3 && varNum != x3 && varNum != x2 && varNum != x1) {
					x4 = varNum;
					System.out.print(x4 + ", ");
					i++;
				}
				if (i == 4 && varNum != x4 && varNum != x3 && varNum != x2 && varNum != x1) {
					x5 = varNum;
					System.out.print(x5 + ", ");
					i++;
				}
				if (i == 5 && varNum != x5 && varNum != x4 && varNum != x3 && varNum != x2 && varNum != x1) {
					x6 = varNum;
					System.out.print(x6 + " ");
					i++;
				}
			}
	}
		
		public static int getRandomInt(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
		
	}
		}










