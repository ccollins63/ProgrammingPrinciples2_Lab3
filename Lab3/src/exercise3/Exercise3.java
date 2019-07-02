package exercise3;

import java.util.ArrayList;

public class Exercise3 extends ArrayList
{
    public static Integer max(ArrayList<Integer> list)
    {
        int max = 0;

        for (int i = 0; i < list.size(); i++)
        {
            Integer maxInteger = list.get(i);

            int maxInt         = maxInteger.intValue();

            if (maxInt > max)
            {
                max = maxInt;
            }
        }

        return max;
    }

    public static Integer sum(ArrayList<Integer> list)
    {
        Integer sum = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sum = (sum + list.get(i));
        }

        return sum;
    }

    public static ArrayList union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
