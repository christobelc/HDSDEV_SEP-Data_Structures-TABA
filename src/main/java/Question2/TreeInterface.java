package Question2;

//interface
public interface TreeInterface <T>{

    //methods to be implemented
    public boolean isEmpty();

    public void addNodes(T element);

    public int countNodes();

    public T findMaxHealthyIndex();

    public T findMinHealthyIndex();
}
