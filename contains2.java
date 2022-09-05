 public boolean contains(E e){
       
        //递归思路
        return contains(root, e);
    }
    private boolean contains(Node node, E e){
        if (node == null){
            return false;
        }
        //如果e比当前结点元素小
        if (e.compareTo(node.e) < 0){
            //返回左子节点比较的结果
            return contains(node.left, e);
        }else if (e.compareTo(node.e) > 0){
            //返回右子节点比较的结果
            return contains(node.right, e);
         //相等，说明找到了直接返回true
        }else {
            return true;
        }
    }