package main;

import java.util.*;

public class tree {
       public int nodedata;
       public List<tree> childs;
       public String position;
       
       public tree(int data) {
    	   super();
    	   nodedata=data;
    	   childs=new ArrayList<tree>();
    	   childs.clear();
    	   position="";
       }
       
       public tree() {
    	   super();
       }
          
       public void add (tree Tree) {
    	   childs.add(Tree);
       }
}
