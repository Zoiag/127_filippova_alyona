import org.junit.*;
public class Task3_Tests extends Assert{

    @Test
    public void Check_HeapSort_compare(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void Check_QuickSort_compare(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void Check_QuickSort_compare2(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void Check_QuickSort_compare3(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void Check_QuickSort_sort2(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void Check_QuickSort_sort3(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void Check_QuickSort_sort4(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }

    @Test
    public void Check_QuickSort_SortSame(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 3, 2, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{2, 2, 3, 4}, array);
    }

    @Test
    public void Check_MergeSort_compare(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void Check_MergeSort_compare2(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void Check_MergeSort_compare3(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void Check_MergeSort_sort2(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void Check_MergeSort_sort3(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void Check_MergeSort_sort3inverse(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void Check_MergeSort_SortLarge(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1, 5, 9, 7, 4, 6};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 9}, array);
    }

    @Test
    public void Check_HeapSort_compare2(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void Check_QuickSort_sortAgain(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {5, 2, 1, 0 , 6, 0, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{0, 0, 1, 2, 3, 5, 6}, array);
    }

}