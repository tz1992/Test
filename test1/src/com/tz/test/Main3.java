package com.tz.test;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
public static void main(String[] args) {
	
	
}


public Node deleteDuplication(Node pHead)
{
    
   Map<Node, Integer> map=new HashMap<>();
   Node temp=pHead;
   while(temp.next!=null){
       temp=temp.next;
       if(map.containsKey(temp)){
    	   int val=map.get(temp);
    	   map.put(temp,val+1);
       }
   }
   Node result=new Node(2);
   for(Map.Entry<Node, Integer> entry:map.entrySet()){
	   if(entry.getValue()==1){
		   result.next=entry.getKey();
	   }
   }
   return result;
}
static class Node{
  int val;
  Node next=null;
  public Node(int val) {
	this.val=val;
}
}
}
