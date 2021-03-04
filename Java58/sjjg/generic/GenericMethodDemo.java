package Java58.sjjg.generic;

public class GenericMethodDemo
{
    public static void bubbleSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] array)
    {
    }

    public static void main(String[] args)
    {
        Teacher2[] teacher = new Teacher2[10];

        //完整写法
        GenericMethodDemo.<Teacher2>bubbleSort(teacher);
        GenericMethodDemo.bubbleSort(teacher);

        bubbleSort(teacher);
    }
}
