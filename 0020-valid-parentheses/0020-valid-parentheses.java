class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp=='{')
            {
                stack.push('}');
            }
            else if(temp=='(')
            {

                stack.push(')');
            }
            else if(temp=='[')
            {
                stack.push(']');
            }
            else
            {
                if(stack.isEmpty()||stack.peek()!=temp)
                {
                    return false;
                }
                stack.pop();
            }

        }
        if(stack.isEmpty())
            return true;
        
        return false;
    }
}