package main;

import java.util.ArrayList;

import java.util.List;


public class AI {
	

     AI(){
    	 super();
     }
     
     int calculator(map map1) {
     	map temp=map1;
     	int max=0;
     	int min=0; 
     	
     	if(temp.MAP[0][0].value.equals("O")&&temp.MAP[0][1].value.equals("O")&&temp.MAP[0][2].value.equals("O"))return 8;
     	if(temp.MAP[1][0].value.equals("O")&&temp.MAP[1][1].value.equals("O")&&temp.MAP[1][2].value.equals("O"))return 8;
     	if(temp.MAP[2][0].value.equals("O")&&temp.MAP[2][1].value.equals("O")&&temp.MAP[2][2].value.equals("O"))return 8;
     	if(temp.MAP[0][0].value.equals("O")&&temp.MAP[1][0].value.equals("O")&&temp.MAP[2][0].value.equals("O"))return 8;
     	if(temp.MAP[0][1].value.equals("O")&&temp.MAP[1][1].value.equals("O")&&temp.MAP[2][1].value.equals("O"))return 8;
     	if(temp.MAP[0][2].value.equals("O")&&temp.MAP[1][2].value.equals("O")&&temp.MAP[2][2].value.equals("O"))return 8;
     	if(temp.MAP[0][0].value.equals("O")&&temp.MAP[1][1].value.equals("O")&&temp.MAP[2][2].value.equals("O"))return 8;
     	if(temp.MAP[0][2].value.equals("O")&&temp.MAP[1][1].value.equals("O")&&temp.MAP[2][0].value.equals("O"))return 8;
     	
     	if(temp.MAP[0][0].value.equals("X")&&temp.MAP[0][1].value.equals("X")&&temp.MAP[0][2].value.equals("X"))return -8;
     	if(temp.MAP[1][0].value.equals("X")&&temp.MAP[1][1].value.equals("X")&&temp.MAP[1][2].value.equals("X"))return -8;
     	if(temp.MAP[2][0].value.equals("X")&&temp.MAP[2][1].value.equals("X")&&temp.MAP[2][2].value.equals("X"))return -8;
     	if(temp.MAP[0][0].value.equals("X")&&temp.MAP[1][0].value.equals("X")&&temp.MAP[2][0].value.equals("X"))return -8;
     	if(temp.MAP[0][1].value.equals("X")&&temp.MAP[1][1].value.equals("X")&&temp.MAP[2][1].value.equals("X"))return -8;
     	if(temp.MAP[0][2].value.equals("X")&&temp.MAP[1][2].value.equals("X")&&temp.MAP[2][2].value.equals("X"))return -8;
     	if(temp.MAP[0][0].value.equals("X")&&temp.MAP[1][1].value.equals("X")&&temp.MAP[2][2].value.equals("X"))return -8;
     	if(temp.MAP[0][2].value.equals("X")&&temp.MAP[1][1].value.equals("X")&&temp.MAP[2][0].value.equals("X"))return -8;
     	
     	//"O"的成功路线
     	if((temp.MAP[0][0].value.equals("O")||temp.MAP[0][0].reachable==true)&&(temp.MAP[0][1].value.equals("O")||temp.MAP[0][1].reachable==true)&&(temp.MAP[0][2].value.equals("O")||temp.MAP[0][2].reachable==true))max++;
     	if((temp.MAP[1][0].value.equals("O")||temp.MAP[1][0].reachable==true)&&(temp.MAP[1][1].value.equals("O")||temp.MAP[1][1].reachable==true)&&(temp.MAP[1][2].value.equals("O")||temp.MAP[1][2].reachable==true))max++;
     	if((temp.MAP[2][0].value.equals("O")||temp.MAP[2][0].reachable==true)&&(temp.MAP[2][1].value.equals("O")||temp.MAP[2][1].reachable==true)&&(temp.MAP[2][2].value.equals("O")||temp.MAP[2][2].reachable==true))max++;
     	if((temp.MAP[0][0].value.equals("O")||temp.MAP[0][0].reachable==true)&&(temp.MAP[1][0].value.equals("O")||temp.MAP[1][0].reachable==true)&&(temp.MAP[2][0].value.equals("O")||temp.MAP[2][0].reachable==true))max++;
     	if((temp.MAP[0][1].value.equals("O")||temp.MAP[0][1].reachable==true)&&(temp.MAP[1][1].value.equals("O")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][1].value.equals("O")||temp.MAP[2][1].reachable==true))max++;
     	if((temp.MAP[0][2].value.equals("O")||temp.MAP[0][2].reachable==true)&&(temp.MAP[1][2].value.equals("O")||temp.MAP[1][2].reachable==true)&&(temp.MAP[2][2].value.equals("O")||temp.MAP[2][2].reachable==true))max++;
     	if((temp.MAP[0][0].value.equals("O")||temp.MAP[0][0].reachable==true)&&(temp.MAP[1][1].value.equals("O")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][2].value.equals("O")||temp.MAP[2][2].reachable==true))max++;
     	if((temp.MAP[0][2].value.equals("O")||temp.MAP[0][2].reachable==true)&&(temp.MAP[1][1].value.equals("O")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][0].value.equals("O")||temp.MAP[2][0].reachable==true))max++;
     	
     	//"X"的成功路线
     	if((temp.MAP[0][0].value.equals("X")||temp.MAP[0][0].reachable==true)&&(temp.MAP[0][1].value.equals("X")||temp.MAP[0][1].reachable==true)&&(temp.MAP[0][2].value.equals("X")||temp.MAP[0][2].reachable==true))min++;
     	if((temp.MAP[1][0].value.equals("X")||temp.MAP[1][0].reachable==true)&&(temp.MAP[1][1].value.equals("X")||temp.MAP[1][1].reachable==true)&&(temp.MAP[1][2].value.equals("X")||temp.MAP[1][2].reachable==true))min++;
     	if((temp.MAP[2][0].value.equals("X")||temp.MAP[2][0].reachable==true)&&(temp.MAP[2][1].value.equals("X")||temp.MAP[2][1].reachable==true)&&(temp.MAP[2][2].value.equals("X")||temp.MAP[2][2].reachable==true))min++;
     	if((temp.MAP[0][0].value.equals("X")||temp.MAP[0][0].reachable==true)&&(temp.MAP[1][0].value.equals("X")||temp.MAP[1][0].reachable==true)&&(temp.MAP[2][0].value.equals("X")||temp.MAP[2][0].reachable==true))min++;
     	if((temp.MAP[0][1].value.equals("X")||temp.MAP[0][1].reachable==true)&&(temp.MAP[1][1].value.equals("X")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][1].value.equals("X")||temp.MAP[2][1].reachable==true))min++;
     	if((temp.MAP[0][2].value.equals("X")||temp.MAP[0][2].reachable==true)&&(temp.MAP[1][2].value.equals("X")||temp.MAP[1][2].reachable==true)&&(temp.MAP[2][2].value.equals("X")||temp.MAP[2][2].reachable==true))min++;
     	if((temp.MAP[0][0].value.equals("X")||temp.MAP[0][0].reachable==true)&&(temp.MAP[1][1].value.equals("X")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][2].value.equals("X")||temp.MAP[2][2].reachable==true))min++;
     	if((temp.MAP[0][2].value.equals("X")||temp.MAP[0][2].reachable==true)&&(temp.MAP[1][1].value.equals("X")||temp.MAP[1][1].reachable==true)&&(temp.MAP[2][0].value.equals("X")||temp.MAP[2][0].reachable==true))min++;
     	return max-min;
     }

     public String nextposition(map map1) throws Exception{
    	 
    	 String nextpos="";
    	
    	 tree Tree=new tree(0);
    	 bulidtree(map1,3,Tree);
    	 backtrack(Tree);
    	 System.out.println(Tree.position);
    	 nextpos=Tree.position;
    	 
		 return nextpos;
     }
     
     public void bulidtree(map map1,int k,tree Tree) throws Exception{
    	if(k>0) {
    		map temp=(map) map1.deepClone();
    		List<map> mapgroup=new ArrayList<map>();
    		map temp2;
    		
    		for(int i=0;i<3;i++) {
        		for (int j=0;j<3;j++) {
        			      if(temp.MAP[i][j].reachable==true) {
        			    	  if(k%2==0) {
        			    	  new manager().change(i+1, j+1, temp, 0);
        			    	  }
        			    	  else {
        			    		  new manager().change(i+1, j+1, temp, 1);
        			    	  }
        			    	  tree node = new tree(0);
        			    	  int nodevalue=calculator(temp);
        			    	  /*temp.show();
        			    	  System.out.println(nodevalue);*/
        			    	  node.nodedata=nodevalue;
        			    	  node.position=new Integer(i+1).toString()+","+new Integer(j+1).toString();
        			    	  Tree.add(node);
        			    	  temp2=(map) temp.deepClone();
        			    	  mapgroup.add(temp2);
        			    	  new manager().dechange(i+1, j+1, temp);
        			      }
        			}
        		}
    		
    		for(int i=0;i<mapgroup.size();i++) {
    			bulidtree(mapgroup.get(i),k-1,Tree.childs.get(i));
    		}
    		
    	}
    	else { 
		return ;
		}
     }

    public void minvalue(tree Tree) {
    	int min=100;
    	for(tree i:Tree.childs) {
    		if(i.nodedata<min) {
    			min=i.nodedata;
    			Tree.position=i.position;
    		}
    	}
    	Tree.nodedata=min;
    }
     
    public void maxvalue(tree Tree) {
    	int max=-100;
    	for(tree i:Tree.childs) {
    		if(i.nodedata>max) {
    			max=i.nodedata;
    			Tree.position=i.position;
    		}
    	}
    	Tree.nodedata=max;
    }
    
    public void backtrack(tree Tree) {
    	
    	
    	List<tree> treegroup1=new ArrayList<tree>();
    	List<tree> treegroup2=new ArrayList<tree>();
    	
    	for(tree i:Tree.childs) {
    		treegroup1.add(i);
    	}
    	
    	for(int i=0;i<treegroup1.size();i++) {
    		tree temp=treegroup1.get(i);
    		for(tree j:temp.childs) {
    			treegroup2.add(j);
    		}
    	}
    	
    	for (tree k:treegroup2) {
    		minvalue(k);
    	}
    	
    	for(tree m:treegroup2) {
    		maxvalue(m);
    	}
    	
    	minvalue(Tree);
    }
}
