public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(57);
        hashTable.print();
        System.out.println();

        hashTable.insert(21);
        hashTable.print();
        System.out.println();

        hashTable.insert(94);
        hashTable.print();
        System.out.println();

        hashTable.insert(33);
        hashTable.print();
        System.out.println();

        hashTable.insert(28);
        hashTable.print();
        System.out.println();

        hashTable.insert(70);
        hashTable.print();
        System.out.println();

        hashTable.insert(17);
        hashTable.print();
        System.out.println();

        hashTable.insert(51);
        hashTable.print();
        System.out.println();

        hashTable.insert(38);
        hashTable.print();
        System.out.println();

        hashTable.insert(67);
        hashTable.print();
        System.out.println();

        hashTable.insert(29);
        hashTable.print();
        System.out.println();

        hashTable.insert(82);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(36);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(31);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(62);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(87);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(8);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(7);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(55);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(28);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(19);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(37);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(21);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(19);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(27);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(85);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(24);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(31);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(36);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(85);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(55);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(7);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(48);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(26);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(11);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(47);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(60);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(33);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(83);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(40);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(18);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(70);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(35);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(40);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(70);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(60);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(66);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(32);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(77);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(66);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(47);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(4);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(12);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(56);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(35);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(4);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(12);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(56);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(33);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(70);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(68);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(46);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(80);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(32);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(79);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(54);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(2);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(95);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(25);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(35);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(23);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(5);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(35);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(47);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(24);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(38);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(67);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(66);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(3);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(14);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(51);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(23);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(20);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(72);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(75);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(87);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(72);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(5);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(67);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(47);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(20);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(96);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(77);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(15);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(55);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(58);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(61);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(67);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(70);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(33);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(25);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(58);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(61);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(18);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(33);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(77);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(67);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(59);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(87);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(87);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(55);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(96);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(15);
        listHashTable2.print();
        System.out.println();
    }
}