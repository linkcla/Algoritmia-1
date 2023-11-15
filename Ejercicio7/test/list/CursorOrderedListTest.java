package list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author jcasben
 * @author linkcla
 */
public class CursorOrderedListTest {
    private CursorOrderedList<Integer> list;
    
    public CursorOrderedListTest() {
    }
    
    @Before
    public void setUp() {
        list = new CursorOrderedList<>(5,Integer.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class CursorOrderedList.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("Add test");
        list.add(4);
        assertEquals(true, list.contains(4));
    }
    
    @Test
    public void testAddFullList() throws List.FullListException {
        System.out.println("Add test");
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertThrows(List.FullListException.class,()->{list.add(9);});
    }
    /**
     * Test of clear method, of class CursorOrderedList.
     */
    @Test
    public void testClear() {
        System.out.println("Clear test");
        list.clear();
        assertEquals(true, list.isEmpty());
    }

    /**
     * Test of contains method, of class CursorOrderedList.
     */
    @Test
    public void testContains() throws List.FullListException {
        System.out.println("Contains test");
        list.add(1);
        assertEquals(true, list.contains(1));
        assertEquals(false, list.contains(2));
    }

    /**
     * Test of isEmpty method, of class CursorOrderedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("Is Empty test");
        assertEquals(true, list.isEmpty());
    }

    /**
     * Test of remove method, of class CursorOrderedList.
     */
    @Test
    public void testRemove() throws List.EmptyListException, List.FullListException {
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
