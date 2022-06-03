public class CharNode {
    private char _ch;
    private CharNode _next;

    public CharNode(char ch){
        _ch = ch;
        _next = null;
    }

    public CharNode(char ch, CharNode next){
        _ch = ch;
        _next = next;
    }

    public char getValue(){
        return _ch;
    }

    public CharNode getNext(){
        return _next;
    }
}
