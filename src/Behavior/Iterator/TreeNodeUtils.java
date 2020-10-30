package Behavior.Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName: DataStruction
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 15:28
 */
public class TreeNodeUtils {

    private String name;
    private TreeNode node;

    public TreeNodeUtils(String name, TreeNode node) {
        this.name = name;
        this.node = node;
    }

    public String getName() {
        return name;
    }

    public Iterator iterator(){
        return new TreeIterator(node);
    }
}
