/**
* UnitTest.java
*/
package test.binarytree.search;

import org.junit.Test;

import binarytree.BinarySearchTree;

/**
 *
 * @author LiuChen
 * @date 2016年11月24日 下午4:38:46
 *
 */

public class UnitTest {
    private static BinarySearchTree iTree = new BinarySearchTree();
    
    static {
        iTree.insertSearch(6).insertSearch(3).insertSearch(4).insertSearch(5).insertSearch(1).insertSearch(2);
//        for(int i=0; i<1000; i++) {
//            iTree.insertSearch(Double.valueOf(Math.floor(Math.random()*1000)).intValue());
//        }
    }
    
    @Test
    public void testTraverse() {
        iTree.preOrderTraverse(iTree.getRoot());System.out.println();
        iTree.inOrderTraverse(iTree.getRoot());System.out.println();
        iTree.postOrderTraverse(iTree.getRoot());System.out.println();
    }
    
    @Test
    public void testSearch() {
        System.out.println(iTree.searchNode(iTree.getRoot(), 123));
    }
    
    @Test
    public void testSearchParent() {
        System.out.println(iTree.searchParentNode(iTree.getRoot(), 7));
    }
}
