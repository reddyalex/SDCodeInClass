/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Reddy
 */
class RecentCounter {
    
    Queue<Integer> q;
    
    public RecentCounter() {
        q = new LinkedList<>();
        
    }
    
    public int ping(int t) {
        
        
        while(!q.isEmpty() && t - q.peek()  > 3000 ){
            q.poll();
        }
        q.offer(t);
        
        return q.size();
        
    }
}

