
public class Queue<T> implements MyQ<T> {


        private T t;
        private T[] arr;
        private int size , currentToAdd , currentToMove;


        public Queue(){
            size = 0 ;
            currentToMove = 0;
            currentToAdd = 0;
            arr = (T[]) new Object[10*10];
        }

        public Queue(int arrSize){

            size = 0;
            currentToAdd = 0;
            currentToMove = 0;
            arr = (T[]) new Object[arrSize];
        }

        @Override
        public T dequeue() {

            size --;
            return arr[currentToMove++];
        }

        @Override
        public void enqueue(T obj) {

            arr[currentToAdd] = obj;
            currentToAdd++;
            size++;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        public String toString(){

            return "size: "+size;
        }
    }
