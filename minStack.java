class minStack{









    public static void main(String args[]){
minStack ms = new minStack();


    }
}

/*
class MinStack {
public:
    stack<int> in;
    stack<int> min_stack;
    void push(int x) {
        if (in.empty()) {
            min_stack.push(x);
        } else if (!in.empty() && x <= min_stack.top()) {
            min_stack.push(x);
        }
        in.push(x);
    }

    void pop() {
        if (!in.empty()) {
            if (in.top() == min_stack.top())
                min_stack.pop();
            in.pop();
        }
    }

    int top() { 
        if (!in.empty())
        return in.top();
    }

    int getMin() {
        if (!min_stack.empty())
        return min_stack.top();
    }
};*/