import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] arr = new int[num];
    for (int i = 0; i < num; i++)
      {
        arr[i] = in.nextInt();
        
      }
    int max = 0;
    int mode = 0;
    for (int i = 0; i < num; i++)
      {
        int count = 0;
        for (int j = 0; j < num; j++)
          {
            if (arr[i] == arr[j])
            {
              count++;
            }
          }
        if (count > max)
        {
          max = count;
          mode = arr[i];
        }
      }
    System.out.println(mode);
    
  }
}
