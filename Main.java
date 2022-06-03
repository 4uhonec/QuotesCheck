
public class Main {
    public static void main(String[] args) {
        String s = "public class Stack {\n" +
                "    private IntNode _top;\n" +
                "\n" +
                "    public Stack(){\n" +
                "        _top = null;\n" +
                "    }\n" +
                "\n" +
                "    public boolean isEmpty(){\n" +
                "        return _top == null;\n" +
                "    }\n" +
                "\n" +
                "    public void push(int num){\n" +
                "        _top = new IntNode(num, _top);\n" +
                "    }\n" +
                "    //check isEmpty before implementing\n" +
                "    public int pop(){\n" +
                "        int temp = _top.getValue();\n" +
                "        _top = _top.getNext();\n" +
                "        return temp;\n" +
                "    }\n" +
                "\n" +
                "    public int top(){\n" +
                "        return _top.getValue();\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    public String toString(){\n" +
                "        Stack sTemp = new Stack();\n" +
                "        String string = \"\";\n" +
                "        while(!isEmpty()){\n" +
                "            int temp = pop();\n" +
                "            sTemp.push(temp);\n" +
                "            string = string + temp + \"\\t\";\n" +
                "        \n" +
                "        while(!sTemp.isEmpty()){\n" +
                "            push(sTemp.pop());\n" +
                "        }\n" +
                "        return string;\n" +
                "    }\n" +
                "}";

        Stack stack = new Stack();
        boolean f = true;
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty()){
                if(stack.top() == '(' && (s.charAt(i) == ']' || s.charAt(i) == '}')) {f=false;i=s.length();};
                if(stack.top() == '[' && (s.charAt(i) == ')' || s.charAt(i) == '}')) {f=false;i=s.length();};
                if(stack.top() == '{' && (s.charAt(i) == ')' || s.charAt(i) == ']')) {f=false;i=s.length();};
            }
            if(stack.top() == '[' && s.charAt(i) == ')') stack.pop();
            else if(stack.top() == '(' && s.charAt(i) == ')') stack.pop();
            else if(stack.top() == '{' && s.charAt(i) == '}') stack.pop();
            else if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='[') stack.push(s.charAt(i));
        }
        System.out.println(f);
        System.out.println(s);
    }
}
