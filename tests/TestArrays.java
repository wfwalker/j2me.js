package tests;

public class TestArrays {
    public static void main(String[] args) {
	byte b[][] = new byte[3][4];
	b[1][2] = 5;
	for (int n = 0; n < b.length; ++n)
	    for (int m = 0; m < b[n].length; ++m)
		System.out.println(b[n][m]);
	Object o[][] = new Object[5][5];
	o[1][1] = new Integer(5);
   }
}