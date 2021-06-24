package Question1;

import java.util.ArrayList;
import java.util.List;

    public class ArrayListStack<T> implements UserStack<T> {
        private List<T> list = new ArrayList<>();

        // pushes element to the stack
        @Override
        public void push(T e) {
            list.add(e);
        }

        //pops the stack
        @Override
        public T pop() {
            //we dont have to code is Empty method
            if(list.isEmpty()){
                System.out.println("Stack is empty!!!");
                throw new IndexOutOfBoundsException();
            }else {
                //size
                int n = list.size();
                //last element
                T value = list.get((int) (n-1));
                //removing
                list.remove(n-1);
                return value;
            }
        }

        // peeks the stack
        @Override
        public T peek() {
            if (list.isEmpty()){
                System.out.println("Stack is empty");
                throw new IndexOutOfBoundsException();
            }else {
                //size
                int n = list.size();
                //last element
                //top of the stack is the end of the list
                T value = list.get((int) (n-1));

                return value;
            }
        }

        // checks if empty
        @Override
        public boolean isEmpty() {
            if(list.isEmpty()){
                return true;
            }
            return false;
        }

        // returns the size
        @Override
        public int size() {
            return list.size();
        }

        // print whats in the stack
        @Override
        public String toString(){
            String str = "TOP";
            for(int i = list.size()-1; i >= 0; i--){
                str += "\n" + list.get(i);
            }
            return str + "\nBOTTOM";
        }
    }

