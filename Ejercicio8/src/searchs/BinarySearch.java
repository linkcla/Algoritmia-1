package searchs;

public class BinarySearch {

    /**
     * Performs an iterative binary search to find the specified target element in a sorted array.
     *
     * @param elements An array of elements to search within.
     * @param target The element to find in the array.
     * @param <E> The type of elements in the array, which must implement the Comparable interface.
     * @return The index of the target element if found, or -1 if not found.
     */
    public static <E extends Comparable<E>> int binarySearchIterative(E[] elements, E target) {
        int left = 0, right = elements.length - 1;
        int center = (left + right) / 2;
        while (left <= right) {
            int comparison = elements[center].compareTo(target);
            if (comparison == 0) {
                return center; // Element found.
            } else if (comparison < 0) {
                left = center + 1; // Adjust the left boundary.
            } else {
                right = center - 1; // Adjust the right boundary.
            }
            center = (left + right) / 2;
        }
        return -1; // Element not found.
    }


    /**
     * Performs a recursive binary search to find the specified target element in a sorted array of generic elements.
     *
     * @param array An array of elements to search within.
     * @param target The element to find in the array.
     * @param left The left boundary of the current search range.
     * @param right The right boundary of the current search range.
     * @param <E> The type of elements in the array, which must implement the Comparable interface.
     * @return The index of the target element if found, or -1 if not found.
     */
    public static <E extends Comparable<E>> int binarySearchRecursive(E[] array, E target, int left, int right) {
        if (left > right) {
            return -1; // Element not found in the array.
        }
        int center = left + (right - left) / 2;
        if (array[center].compareTo(target) == 0) {
            return center; // Element found.
        } else if (array[center].compareTo(target) < 0) {
            return binarySearchRecursive(array, target, center + 1, right); // Search in the right half.
        } else {
            return binarySearchRecursive(array, target, left, center - 1); // Search in the left half.
        }
    }



}
