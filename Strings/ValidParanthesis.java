class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
             else if(c==')')
              {
                 if(st.isEmpty())
                     return false;
                 char x = st.pop();
                  if(x!='(')
                      return false;
              }
           else  if(c=='}')
              {
                if(st.isEmpty())
                     return false;
                 char x = st.pop();
                  if(x!='{')
                      return false;
              }
           else  if(c==']')
              {
                if(st.isEmpty())
                     return false;
                 char x = st.pop();
                  if(x!='[')
                      return false;
              }


        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}