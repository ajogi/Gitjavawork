package Practice;

public class evaluate 
{
    public static void main(String args[]) 
    {
        int a[] = {1,2,3,4,5};
    int d[] = a;
    int sum = 0;
    int j = 0;
    for (j = 0; j < 3; ++j)
            sum += (a[j]*d[j+1])+(d[j]*a[j+1]);
    System.out.println(sum);
    } 
}