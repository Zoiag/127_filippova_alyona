import org.junit.*;
public class Task2_Tests extends Assert {
    @Test
    public void Check_BubbleSort_createSorting() {
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 0;
            }
        };

        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    class SomeComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void Check_BubbleSort_checking(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void Check_BubbleSort_checking2(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3, 5, 7};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 7}, myArray);
    }
    @Test
    public void Check_BubbleSort_checking3(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 2, 2, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{2, 2, 2, 2}, myArray);
    }
    @Test
    public void Check_BubbleSort_checking4(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{2}, myArray);
    }
    @Test
    public void Check_insertionSort_checking(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void Check_insertionSort_checking2(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }
    @Test
    public void Check_insertionSort_checking3(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 5, 2, 6};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 5, 6}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking2(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking3(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking4(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2, 10, 5, 7, 4};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 7, 10}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking5(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3, 4, 5, 7, 10};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 7, 10}, myArray);
    }
    @Test
    public void Check_SelectionSort_checking6(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {3, 1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 3}, myArray);
    }
}
