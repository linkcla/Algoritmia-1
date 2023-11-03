package searchs;

public class LinearSearch<E> {
    /**
     * Performs a linear search for a specific element in the given array using an iterative approach.
     *
     * @param array The array in which to search for the element.
     * @param element The element to be searched for.
     * @return The index of the element in the array if found; otherwise, returns -1.
     */
    public int linealSearchIterative(E[] array, E element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search for a specific element in the given array using a recursive approach.
     *
     * @param array The array in which to search for the element.
     * @param element The element to be searched for.
     * @param index The current index being checked.
     * @return The index of the element in the array if found; otherwise, returns -1.
     */
    public int linealSearchRecursive(E[] array, E element, int index) {
        if (index == array.length) {
            return -1;
        }
        if (array[index].equals(element)) {
            return index;
        }
        return linealSearchRecursive(array, element, index + 1);
    }

}
