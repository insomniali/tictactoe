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
    	
    	 if(map1.step>2) {
    	 tree Tree=new tree(0);
    	 bulidtree(map1,3,Tree);
    	// print(Tree,1);
    	 alphabeta(Tree);
    	 nextpos=Tree.position;
    	 }
    	 else {
    		 int temp=8;
    		 for(int i=0;i<3;i++) {
    			for(int j=0;j<3;j++) {
    				if(map1.MAP[i][j].reachable==true) {
    					new manager().change(i+1, j+1, map1, 1);
    					if(new AI().calculator(map1)<temp) {
    						temp=new AI().calculator(map1);
    						nextpos=new Integer(i+1).toString()+","+new Integer(j+1).toString();
        				}
    					new manager().dechange(i+1, j+1, map1);
    				}
    		 }
    	 }
    	 
    	
    	 }
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

     

     public void alphabeta(tree Tree) {
    	 int mindata=8;

    	 for(tree j:Tree.childs) {
    		
    		for(tree i:j.childs) {
    			
    			for(tree k:i.childs) {
    				if(k.nodedata<i.beta) {
    					i.beta=k.nodedata;
    					if(i.beta<j.alpha) {
    						break;
    					}
    				}
    				else {
    					continue;
    				}
    			}
    			
    			i.nodedata=i.beta;
    			if(i.nodedata>j.alpha) {
    				j.alpha=i.nodedata;
    				if(j.alpha>Tree.beta) {
    					break;
    				}
    			}
    			else {
    				continue;
    			}
    			
    		}
    		
    		
    		j.nodedata=j.alpha;

    		if(j.nodedata<mindata) {
    			mindata=j.nodedata;
    			Tree.nodedata=j.nodedata;
    			Tree.position=j.position;
    		}
    		
    	}
    	
    	
    }

     public void print(tree Tree,int depth) {
    	 System.out.println(Tree.position+" "+Tree.nodedata+" "+depth);
    	 if(Tree.childs.isEmpty()==false&&depth!=4) {
    		 for(tree i:Tree.childs) {
    			 print(i,depth+1);
    		 }
    	 }
    	 else if(depth==4) {
    		 return ;
    	 }
     }
}
