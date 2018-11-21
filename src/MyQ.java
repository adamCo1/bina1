
    /**
     * interface for creating a generic Queue of class T
     * @param <T> the Class to be held in the Queue
     */
    public interface MyQ<T> {

        T dequeue();
        void enqueue(T obj);
        boolean isEmpty();

    }

