class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {
            
            int curr = asteroids[i];

            while(!st.isEmpty() && curr < 0 && st.peek() > 0) {
                
                int top = st.peek();

                if(top < Math.abs(curr)) {
                    st.pop();
                }
                else if(top == Math.abs(curr)) {
                    st.pop();
                    curr = 0;
                    break;
                }
                else {
                    curr = 0;
                    break;
                }
            }

            if(curr != 0) {
                st.push(curr);
            }
        }

        int[] ans = new int[st.size()];

        for(int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}

        