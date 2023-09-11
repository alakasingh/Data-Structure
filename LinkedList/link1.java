public class link1{
   public static class NODE{
    int data;
    NODE next;
    public NODE(int data){
        this.data=data;
        this.next=null;
    }
   }
   public static NODE head;
   public static NODE tail;

   public void addFirst(int data){

    //CREATE A NEW NODE
    NODE newNode=new NODE(data);
    //WHEN HEAD = NULL
    if(head==null){
        head=tail=newNode;
        return;
    }

    //ASSIGH NEWNODE.NEXT->HEAD
    newNode.next=head;

    //ASSIGH HEAD=NEWNODE
    head=newNode;
   }

   public void addLast(int data){
    //CREATE A NODE
    NODE newNode=new NODE(data);

    if(head==null){
        head=tail=newNode;
    }

    //TAILNEXT->NEWNODE
    tail.next=newNode;

    //TAIL=NEWNODE
    tail=newNode;

   }
   public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    NODE temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");

   }
   // ADD A NODE IN MIDDLE LINKEDLIST
    
   public void add(int index, int data){
    if(index==0){
        addFirst(data);
    }
      NODE newNode=new NODE(data);
      NODE temp=head;
      int i=0;
      while(i<index-1){
        temp=temp.next;
        i++;
      }
      //i=idex-1, temp->prev
      newNode.next=temp.next;
      temp.next=newNode;
       
   }



    public static void main(String args[]){
        link1 ll=new link1();
        ll.print();
        ll.addFirst(1); ll.print();
        ll.addFirst(2); ll.print();
        ll.addLast(3); ll.print();
        ll.addLast(4); ll.print();
        ll.add(3, 22);ll.print();
        

        

    }
}