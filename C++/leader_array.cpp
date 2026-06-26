#include <iostream>

void findingLeaders()
{
    int arr[] = {14, 12, 9, 19, 5, 2, 3};
    int i = 0;
    int arr_length = sizeof(arr)/sizeof(arr[i]);
    

    for (int i = 0; i < arr_length; i++)
    {
        bool isLeader = true;
        for (int j = i + 1; j < arr_length; j++)
        {
            if (arr[j] > arr[i])
            {
                isLeader = false;
                break;
            }
        }
        if (isLeader)
        {
            std::cout << arr[i] << " ";
        }
    }

}

int main()
{
    findingLeaders();
    return 0;
}