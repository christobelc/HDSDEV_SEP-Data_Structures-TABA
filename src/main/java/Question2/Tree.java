package Question2;

public class Tree <T extends Comparable<T>> implements TreeInterface<T>{

    Node<T> root = null;

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void addNodes(T element) {
        if(root == null) {
            root = new Node<T> (element);
        } else {
            addNode(root, element);
        }
    }

    //helper recursive method for addNodes
    private void addNode(Node<T> current, T element){
        if(element.compareTo(current.element)> 0) {
            // we go right
            if(current.right == null){
                root = new Node<T>(element);
                return;
            }else {
                addNode(current.right, element);
            }
            //we go left
        }else if (element.compareTo(current.element)< 0){
            // we go right
            if(current.left == null){
                root = new Node<T>(element);
                return;
            }else {
                addNode(current.left, element);
            }
        }
        if(element.compareTo(current.element) ==0){
            System.out.print("Sorry that value is not allowed");
        }
    }

    @Override
    //counts the nodes
    public int countNodes() {
        return countNodes(root);
    }

    public int countNodes(Node<T> root) {
        if (root == null){
            return 0;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    @Override
    public T findMaxHealthyIndex() {
        if (root == null) {
            return null;
        }
        Node<T> max = root;
        while (max.right != null) {
            max = max.right;
        }
        return max.element;
    }

    @Override
    public T findMinHealthyIndex() {
        if (root == null) {
            return null;
        }
        Node<T> min = root;
        while (min.left != null) {
            min = min.left;
        }
        return min.element;
    }
}
