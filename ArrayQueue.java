public class ArrayQueue<T> implements Queue<T>
{
    public T[] arr = (T[]) new Object[10];
    public int head = -1;
    public int tail = -1;

    @Override
    public T dequeue()
    {
        head++;
        T t = arr[head];
        arr[head] = null;
        return t;
    }

    @Override
    public void enqueue(T item)
    {
        if (tail == arr.length-1)
        {
            growArr();
        }
        tail++;
        arr[tail] = item;

    }
    private void growArr()
    {
        //length doesn't fit, increasing size
        T[] arrA = (T[]) new Object[2 * arr.length];
        for (int i = 0; i < arr.length; i++)
            arrA[i] = arr[i];
        arr = arrA;
    }

    @Override
    public boolean empty()
    {
        return head == tail;
    }
}
