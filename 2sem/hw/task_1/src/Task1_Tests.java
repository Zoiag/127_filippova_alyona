import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void Check_DoubleLinkedList_isEmpty(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void Check_DoubleLinkedList_isEmpty2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void Check_DoubleLinkedList_getSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
    @Test
    public void Check_DoubleLinkedList_pushFront() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }
    @Test
    public void Check_DoubleLinkedList_pushFront2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }
    @Test
    public  void Check_DoubleLinkedList_getHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void Check_DoubleLinkedList_getHead2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void Check_DoubleLinkedList_getTaill(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }

}
