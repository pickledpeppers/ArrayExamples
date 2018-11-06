public class recursionDriver
{
   
    public static int countElephant(int n)
    {
        if (n == 0)
        return 0;
        return 2 + countElephant(n-1);
    }
    
    public static int countNum(int n)
    {
        if (n<=0)
        return 0;
        else
        return n + countNum(n-2);
    }
    
    public static void main(String[] args)
    {
         /*
          * Count 
          * 1. Number of legs  10 elephant have
          * 2. Number of students in a school if each
          *    class has 20 students and there are 12 rooms
          * 3. Number of fingers if there are 8 people
          * 4. Find the sum of odd numbers from 0 to N
          * 5. Find the sum of even numbers from 0 to N
     
          * 
          */   
         int counted=0;

         // Task 1.
         counted = countElephant(10);
         System.out.println(counted);
         // Task 4.
         System.out.println(countNum(5));
         // Task 5.
         
         
    }
}