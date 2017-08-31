public class weightCalculator
{
	public static void main(String[] args)
	{
		double earthWeight = Double.parseDouble(args[0]);
		System.out.println("Earth:" + earthWeight);
		double marsWeight = earthWeight * 0.38;
		System.out.println("mars:" + marsWeight);
		double jupiterWeight = earthWeight * 2.36;
		System.out.println("Juiter:" + jupiterWeight);
		double venusWeight = earthWeight * 0.91; 
		System.out.println("Venus:" + venusWeight );
		double saturnWeight = earthWeight * 1.06;
		System.out.println("Saturn:" + saturnWeight);
	}
}