package org.epi.list;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ListZipTest {

    Node head = null;
    @Before
    public void intializeList() {
        Node node0 = Node.getNode(5,null);
        Node node1 = Node.getNode(4,node0);
        Node node2 = Node.getNode(3,node1);
        Node node3 = Node.getNode(2,node2);
        head = Node.getNode(1,node3);
    }

    @Test
    public void testListZipApproach1() {
        ListZip.zipListApproach1(head);
        assertEquals("Zip is not successful expected output is 15243 but the o/p is: "+head,"15243",
                head.toString());
    }


    @Test
    public void testListZipApproach2() {
        ListZip.zipListApproach2(head);
        assertEquals("Zip is not successful expected output is 15243 but the o/p is: "+head,"15243",
                head.toString());
    }
}
