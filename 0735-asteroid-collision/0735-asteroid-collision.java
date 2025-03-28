class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int val : asteroids)
        {
            if(val>0)
                stack.push(val);
            else
            {
                while(!stack.isEmpty() && stack.peek()>0 )
                {
                    if(stack.peek()+val==0)
                    {
                        stack.pop();
                        val=0;
                        break;
                    }
                    else if(stack.peek()+val<0)
                        stack.pop();
                    else
                    {
                        val=0;
                        break;
                    }

                }
                if(val!=0)
                    stack.push(val);
            }
        }
        int[] list=new int[stack.size()];
        int i=0;
        for(int val : stack)
        {
            list[i++]=val;

        }
        return list;
        
    }
}