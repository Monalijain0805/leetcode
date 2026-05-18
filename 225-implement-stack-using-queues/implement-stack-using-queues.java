// class MyStack {
//     Queue <Integer> q=new LinkedList<>();

//     public MyStack() {
        
//     }
    
//     public void push(int x) {
//         q.add(x);
        
//     }
    
//     public int pop() { //1 2 3 4 ki queue , stack m 4 hua top pr toh whi pop hoga phle
//         for(int i=1;i<q.size();i++){ // 1 2 3 yeh remove hue bacha 4 akela
//             q.add(q.remove()); // 4 ke baad unhi 1 2 3 ko add kr dia bna -> 4 1 2 3
//         }
//         int val =q.remove(); //4 pop hota
//         return val;//4 return hua
        
//     }
    
//     public int top() { //1 2 3 4 ki queue, stack m 4 hua top pr
//         for(int i=1;i<q.size();i++){ //1 se 3 tk 
//             q.add(q.remove()); //remove kiye fir add kiye oth bn -> 4 1 2 3
//         }
//         int val=q.peek();// 4 top pr hua toh peek value bn gyi
//         q.add(q.remove());// fir 4 ko remove kia 1 2 3 bache, fir 4ko  add kia bna -> 1 2 3 4 
//         return val; // 4 
        
//     }
    
//     public boolean empty() {
//         if(q.size()==0) return true;
//         else return false;
        
//     }
// }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
//  * boolean param_4 = obj.empty();
 */



//POP EFFICIENT APPROACH
 class MyStack {
    Queue <Integer> q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
       if(q.size()==0){
        q.add(x);
       }
       else{
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
       }
    }
    
    public int pop() {
        return q.remove();
        
    }
    
    public int top() { 
        return q.peek(); 
        
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
        
    }
}