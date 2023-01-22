static void isPalindrome(int N)
	{
	   // Your code here
	   int original = N;
		int reverse = 0;
		while (N != 0) {
		int remainder = N % 10;
		reverse = reverse * 10 + remainder;
		N = N / 10;
		}
		if (original == reverse) {
		System.out.print("True");
		} else {
		System.out.print("False");
	}
}
