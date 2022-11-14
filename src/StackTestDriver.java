public class StackTestDriver {
    public static void main(String[] args) {

        StackNode<Integer> stack = new StackNode<Integer>();//creates a new stack object
        stack.push(57); //adds new data to the stack
        stack.push(45);
        stack.push(55);
        stack.push(21);
        stack.push(89);

        System.out.println("Stack size: " + stack.size()); //returns how many items there are in the stack
        System.out.println("Top element: " + stack.peek()); //returns the last element placed on the stack

        for(int i = 0; i < 2; i++){ //pops off 2 elements
            stack.pop();
        }

        System.out.println();
        System.out.println("Stack size (post pop) : " + stack.size()); //returns # of items in stack
        System.out.println("Top element post pop: " + stack.peek()); //returns the element on top of the stack
        System.out.println();
        System.out.println("Is empty?: " + stack.isEmpty()); //returns if the stack has no elements

        for(int i = 0; i < 3; i++){ //empties the stack
            stack.pop();
        }

        System.out.println("Is empty? (post pop): " + stack.isEmpty()); //returns if the stack has no elements
    }
}
