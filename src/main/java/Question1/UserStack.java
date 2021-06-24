package Question1;

public interface UserStack <T>{
        //add elements
        public void push(T e);

        //remove elements
        public T pop();

        //viewing top element
        public T peek();

        //checks if the stack is Empty
        public boolean isEmpty();

        // size
        public int size();
}
