public class Sample3
{
    public static void main(String[] args)
	{
		String s1 = "0123456789";
		int n = s1.length();
		int h = n / 2;
		
		String s2 = s1.substring(h) + s1.substring(0, h);
		System.out.println(s1);
		System.out.println(s2);
	}
}