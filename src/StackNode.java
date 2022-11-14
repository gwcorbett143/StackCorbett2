import java.util.EmptyStackException;

public class StackNode <N>{

    private N data; //instance data adapted from OG node class
    private StackNode nxt; //nxt is the most important variable because it stacks the data

    public StackNode(N arg, StackNode n){ //StackNode constructor
        data = arg; //the type of data gets set
        nxt = n; //the next variable is set here
    }

    public void setData(N arg){ //sets a variable in stack to the new argument
        data = arg;
    }

    public N getData(){//returns the data from a varible
        return data;
    }

    public StackNode getNxt() { //returns the next value in the stack
        return nxt;
    }

    public void setNxt(StackNode n) { //sets the variable thata on the top of teh stack
        nxt = n;
    }


    StackNode top; //Top is the variable on the top of the stack
    int size; //how many items are in the stack

    public StackNode(){ //empty constructor with 0 arguments
        top = null;
        size = 0;
    }

    public boolean isEmpty(){ //returns if there are no values
        return top == null;
    }

    public int size(){ //returns the # of items in the stack
        return size;
    }

    public void push(N arg){ //adds a new item to the stack
        StackNode n = new StackNode(arg, top);//this allows values to be assigned accurately
        top = n; //sets teh top value to the argument provided
        size++; //adds 1 more to the stack
    }

    public N pop(){ //removes the top variable
        N data = null; //sets the value to null because it doesn't matter
        if (isEmpty() != true){ //if the stack isn't empty, then the value can be popped
            data = (N) top.getData(); //sets the data to the top value
            StackNode temp = top; //temp gets set to the top variable to keep it
            top = top.getNxt(); //the next variable gets set to the top
            temp.setNxt(null); //basically deletes the old next in the stack and brings up the next next variable
            size--; //decreases the size by one
        }
        return data;
    }

    public N peek(){ //returns the top variable
        N data = null; //data is set to non-existent basically
        if(isEmpty()) { //if there is no variable their can't be a top value
            throw new EmptyStackException(); //the stack is empty when this command is executed
        }else{
            data = (N) top.getData(); //saves the top value
        }
        return data;//returns the value that was saved
    }
}

