/*
DATE 26/07/2024 
ADDITION OF 2 NUMBERS
*/

// error: incompatible types: possible ---------"lossy conversion"----------- from int to byte

/*
class Add
{
	public static void main(Strnig args[])
	{
		byte a,b,c;
		a=2;
		b=5;
		c = a+b;
		System.out.println(c);
	}
}*/

// EXPLICIT TYPECASTING IS DONE TO REMOVE LOSSY CONVERSION

class Add
{
	public static void main(String args[])
	{
		byte a,b,c;
		a=2;
		b=5;
		c = (byte)(a+b);
		System.out.println(c);
	}
}
