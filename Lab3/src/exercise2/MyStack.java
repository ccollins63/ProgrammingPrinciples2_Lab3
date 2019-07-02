package exercise2;

import java.util.ArrayList;

public class MyStack extends ArrayList <Object>
{
    private ArrayList <Object> list = new ArrayList <> ( );

    public boolean isEmpty()
    {
        return list.isEmpty ( );
    }

    public int getSize()
    {
        return list.size ( );
    }

    public Object peek()
    {
        return get (size ( ) - 1);
    }

    public Object pop()
    {
        Object o = get (size ( ) - 1);
        remove (size ( ) - 1);
        return o;
    }

    public void push(Object o)
    {
        add (o);
    }

    @Override
    public String toString()
    {
        return "stack: " + list.toString ( );
    }
}
