public class ArrayStack<T> implements Stack<T>
{
    public T[] arr = (T[]) new Object[10];
    public int top = -1;

    @Override
    public void push(T item)
    {
        //check length of arr if it needs increase
        if (top == arr.length - 1)
        {
            growArr();
        }
        top++;
        arr[top] = item;
    }

    @Override
    public T pop() throws Exception
    {
        if(empty())
        {
            throw new Exception();
        }
        T t = arr[top];
        top--;
        final var t1 = t;
        return t1;
    }

    @Override
    public T peek() throws Exception
    {
        if(empty())
        {
            throw new Exception();
        }
        return arr[top];
    }

    @Override
    public boolean empty()
    {
        return top == -1;
    }

    public void growArr()
    {
        T[] arrA = (T[]) new Object[2 * arr.length];
        for (int i = 0; i < arr.length; i++)
            arrA[i] = arr[i];
        arr = arrA;
    }
}
