class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    Stack()
    {
      this.top = -1;
    }
    boolean isEmpty() 
    { 
       return this.top == -1;
    }

    boolean push(int x) 
    { 
        if(this.top == MAX - 1){
            return  false;
        } else {
            this.top = this.top + 1;
            a[this.top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            return 0;
        } else {
            int poppedItem = a[this.top];
            this.top = this.top - 1;
            return poppedItem;

        }
    } 
  
    int peek() 
    { 
       if(isEmpty()){
           return 0;
       } else {
           return a[this.top];
       }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        boolean ten =s.push(10);
        System.out.println("Push 10 into stack success "+ ten);
        boolean twenty = s.push(20);
        System.out.println("Push 20 into stack success "+ twenty);
        boolean thirty = s.push(30);
        System.out.println("Push 30 into stack success "+ thirty);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println("Stack is empty " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Stack is empty " + s.isEmpty());
    }
}
