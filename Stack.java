public class Stack{
    private CharNode _top;

    public Stack(){
        _top = null;
    }

    public boolean isEmpty(){
        return _top == null;
    }

    public void push(char c){
        CharNode temp = new CharNode(c, _top);
        _top = temp;
    }

    public char pop(){
        char temp = _top.getValue();
        _top = _top.getNext();
        return temp;
    }

    public char top(){
        if(_top == null) return 'z';
        return _top.getValue();
    }
}
