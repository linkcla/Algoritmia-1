package tree;

/**
 *
 * @author Jesús Castillo Benito y Marc Link Cladera
 */
public class BinaryTreeReference<E extends Comparable<E>> implements BinaryTree<E> {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int longestBranch() {
        return -1;
    }

    @Override
    public E getMother(E e) {
        return e;
    }

    @Override
    public E getRoot() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
