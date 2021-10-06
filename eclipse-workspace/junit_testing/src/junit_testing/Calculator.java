package junit_testing;

public class Calculator {
	public int add(int z, int b)
    {
        return z+b;
    }
    public int sub(int z, int b)
    {
        if(z>b)
            return z-b;
        else 
            return b-z;
    }
}
