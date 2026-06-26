public class leader_array {
    static void findingLeaders()
    {
        int[] arr = {14,12,9,19,5,2,3};
        for (int i = 0; i < arr.length; i++)
        {
            boolean isLeader = true;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    isLeader = false;
                    break;
                }
                
            }
            if (isLeader)
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
    public static void main(String[] args)
    {
        findingLeaders();
    }

}