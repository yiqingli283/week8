 //迭代思路
 public void add(E e){
        //将要添加的元素封装成一个结点；
        Node node = new Node(e);
        //做一个判断，判断树书否为空，如果为空将root直接指向新来的结点即可；
        if (isEmpty()){
            root = node;
            //每添加一个元素，size搜药加1
            size++;
        }
 
 
        /*
        1.如果不是空；我们就比较新结点与当前结点值的大小
        2.如果大于当前结点并且当前结点的右子树为空就将新结点的地址储存进当前结点的右结点,
           如果当前结点的右子树不为空，就以右结点为当前结点继续比较。
        3.如果小于当前结点并且当前结点的左子树为空就将新结点的地址储存进当前结点的左结点,
           如果当前结点的左子树不为空，就以左结点为当前结点继续比较。
         */
 
        //设置游标从根结点开始比较
        Node cur = root;
        while (true){
            //新元素比当前元素大，让新结点去当前元素的右结点
            if (node.e.compareTo(cur.e) > 0){
                //当前元素的右结点为空的话直接添加
                if (cur.right == null){
                    cur.right = node;
                    size++;
                    //结点添加成功直接退出循环
                    break;
                 //当前元素的右结点不为空，
                }else {
                    //将游标移动到当前元素的右结点（右结点变成了当前元素），接着循环进行比较
                    cur = cur.right;
                }
             //新元素比当前元素小，让新结点去当前元素的左结点
            }else if (node.e.compareTo(cur.e) < 0){
                //当前元素的左结点为空的话直接添加
                if (cur.left == null){
                    cur.left = node;
                    size++;
                    break;
                }else {
                    cur = cur.left;
                }
             //如果相等，不储存，直接跳出循环
            }else {
                break;
            }
        }
    }