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
       if(this.top == -1){
           return true;
       } else {
           return false;
       }
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
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");

    } 
}
