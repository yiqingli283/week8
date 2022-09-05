//递归思路


//定义一个带参函数，将要添加的元素传入函数  向外提供
    public void add(E e){
        
        //但凡是递归操作的我们都是从头结点开始的，所以我们要将头结点当作参数传入
        root = add(root, e);
    }
 
    //在以node为根的树中插入元素e，并返回新树的根
    private Node add(Node node, E e){
        //如果为空，将新元素进行封装并返回给父节点
        if (node == null){
            size++;
            return new Node(e);
        }
        //如果当前元素比结点元素小，
        if (e.compareTo(node.e) < 0){
            //将当前结点的右子结点与e传入函数再进行比较
            node.right = add(node.right, e);
        }else if (e.compareTo(node.e) > 0){
            //将当前结点的左结点与e传入函数再进行比较
            node.right = add(node.right, e);
        }
        //返回根结点
        return node;
    }