public boolean contains(E e){
        //迭代思路
        //定义一个游标指针从根结点开始
        Node cur = root;
        while (true){
            if (e.compareTo(cur.e) < 0){
                //如果cur的左结点为空，说明遍历完了还没有找到元素，返回false
                if (cur.left == null){
                    return false;
                }
                //如果cur左子节点不为空，将游标指针向下移
                cur = cur.left;
            }else if (e.compareTo(cur.e) > 0){
                //如果cur的右结点为空，说明遍历完了还没有找到元素，返回false
                if (cur.right == null){
                    return false;
                }
                cur = cur.right;
            //如果cur结点的元素的值与e相等，则返回true
            }else {
                return true;
            }
        }
    }