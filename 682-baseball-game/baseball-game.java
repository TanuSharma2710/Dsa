class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                int n=st.peek();
                st.push(2*n);
            }
            else if(ch.equals("+")){
                int n1=st.pop();
                int n2=st.pop();
                int n3=n1+n2;
                st.push(n2);
                st.push(n1);
                st.push(n3);
            }
            else{
                int num=Integer.parseInt(ch);
                st.push(num);
            }
        }
        while(!st.isEmpty()){
            int number=st.pop();
            sum=sum+number;
        }
        return sum;
        
    }
}