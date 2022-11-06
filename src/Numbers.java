import java.util.Scanner;

public class Numbers {
static public int getNdigits(long number) {
	int res = 0;
	do {
		number /= 10;
		res++;
		
	}
	while(number != 0);
return res;
}


static public boolean isHappyNumber(int number) {
	boolean res = false;
	number = 377890;
	if(number >= 100000 && number <= 999999) {
		int first = number % 10;
		int second = number / 10 % 10;
		int third = number / 100 % 10;
		int fourth = number / 1000 % 10;
		int fifth = number / 10000 % 10;
		int sixth = number / 100000 % 10;
		System.out.print(first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth + " ");
		
	if (first + second + third == fourth + fifth + sixth) {
		
		res = true;
		System.out.println();
	System.out.print(res);
	}
	
	}
	
	return res;
	
	}

}

	
	
	
	