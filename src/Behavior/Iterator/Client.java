package Behavior.Iterator;

import java.util.Iterator;

/**
 * @ClassName: Client
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 15:46
 */
public class Client {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("1");
        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");
        TreeNode node4 = new TreeNode("4");
        TreeNode node5 = new TreeNode("5");

        node1.setLeft(node3);
        node3.setLeft(node5);
        node1.setRight(node4);
        node4.setLeft(node2);

        TreeNodeUtils utils = new TreeNodeUtils("树1", node1);
        Iterator iterator = utils.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
