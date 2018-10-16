package main;

import java.util.*;

public class tree {
       public int nodedata;
       public List<tree> childs;
       public String position;
       public int alpha;
       public int beta;
       
       public tree(int data) {
    	   super();
    	   nodedata=data;
    	   childs=new ArrayList<tree>();
    	   childs.clear();
    	   position="";
    	   alpha=-8;
    	   beta=8;
       }
       
       public tree() {
    	   super();
       }
          
       public void add (tree Tree) {
    	   childs.add(Tree);
       }
}
