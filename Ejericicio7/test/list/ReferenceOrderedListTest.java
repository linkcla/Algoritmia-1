package list;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jcasben
 * @author linkcla
 */
public class ReferenceOrderedListTest {
    private ReferenceOrderedList<Integer> list;
    
    public ReferenceOrderedListTest() {
    }
    
    @Before
    public void setUp() {
        list = new ReferenceOrderedList<>();
    }

    /**
     * Test of add method, of class ReferenceOrderedList.
     */
    @Test
    public void testAdd() {
        System.out.println("Add test");
        list.add(4);
        assertEquals(true, list.contains(4));
    }

    /**
     * Test of clear method, of class ReferenceOrderedList.
     */
    @Test
    public void testClear() {
        System.out.println("Clear test");
        list.clear();
        assertEquals(true, list.isEmpty());
    }

    /**
     * Test of contains method, of class ReferenceOrderedList.
     */
    @Test
    public void testContains() {
        System.out.println("Contains test");
        list.add(1);
        assertEquals(true, list.contains(1));
        assertEquals(false, list.contains(2));
  
    }

    /**
     * Test of isEmpty method, of class ReferenceOrderedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("Is Empty test");
        assertEquals(true, list.isEmpty());
    }

    /**
     * Test of remove method, of class ReferenceOrderedList.
     */
    @Test
    public void testRemove() throws List.EmptyListException {
        System.out.println("Remove test");
        list.add(1);
        list.remove(1);
        assertEquals(true, list.isEmpty());
    }
    
    @Test
    public void testRemoveEmptyList() throws List.EmptyListException {
        System.out.println("Remove Empty List exception test");
        assertThrows(List.EmptyListException.class,()->{list.remove(1);});
    }
    
}
