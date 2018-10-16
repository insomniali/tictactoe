package main;


import java.util.Scanner;



public class manager {
	 
        void change(int x,int y,map map1,int flag) {
        	if(flag==0) {
        	map1.MAP[x-1][y-1].value="O";
            }
        	else {
        		map1.MAP[x-1][y-1].value="X";
        	}
        	map1.MAP[x-1][y-1].reachable=false;
        	map1.step-=1;	
        }
       
        void run(map map1) throws Exception  {
        	Scanner human = null;
        	
        	for(int i=0;i<9;i++) {
        	if(judge(map1)!=0)break;
        	human=new Scanner(System.in);
        	System.out.println("enter the positionx:");
        	int humanx=human.nextInt();
        	System.out.println("enter the positiony:");
        	int humany=human.nextInt();
        	if(humanx<1||humanx>3||humany<1||humany>3) {
        		System.out.println("错误坐标，请重新输入！");
        		i--;
        		continue;
        	}
        	if(map1.MAP[humanx-1][humany-1].reachable==false) {
        		System.out.println("错误坐标，请重新输入！");
        		i--;
        		continue;
        	}
        	change(humanx, humany, map1,0);
        	map1.show(); 
        	if(judge(map1)!=0)break;
        	System.out.println("map weight:"+new Integer (new AI().calculator(map1)).toString());
        	//
        	System.out.println();
        	String position=new AI().nextposition(map1);
        	String []positions=position.split(",");
        	if(judge(map1)!=0)break;
        	System.out.println(positions[0]);
        	System.out.println(new Integer(positions[0]).intValue());
        	System.out.println(new Integer(positions[1]).intValue());
            change(new Integer(positions[0]).intValue(), new Integer(positions[1]).intValue(), map1,1);
            map1.show(); 
            if(judge(map1)!=0)break;
            System.out.println("map weight:"+new Integer (new AI().calculator(map1)).toString());
            //
            
            tree Tree=new tree(0);
            new AI().bulidtree(map1, 3, Tree);
            
        	}
        	switch(judge(map1)) {
        	case 1:System.out.println("human is winner");break;
        	case -1:System.out.println("machine is winner");break;
        	case 2:System.out.println("It is draw");break;
        	}
        	human.close();
        }
 
        int judge(map map1) {
        	
        	map temp=map1;
        	
        	
        	if(temp.MAP[0][0].value=="O"&&temp.MAP[0][1].value=="O"&&temp.MAP[0][2].value=="O")return 1;
         	if(temp.MAP[1][0].value=="O"&&temp.MAP[1][1].value=="O"&&temp.MAP[1][2].value=="O")return 1;
         	if(temp.MAP[2][0].value=="O"&&temp.MAP[2][1].value=="O"&&temp.MAP[2][2].value=="O")return 1;
         	if(temp.MAP[0][0].value=="O"&&temp.MAP[1][0].value=="O"&&temp.MAP[2][0].value=="O")return 1;
         	if(temp.MAP[0][1].value=="O"&&temp.MAP[1][1].value=="O"&&temp.MAP[2][1].value=="O")return 1;
         	if(temp.MAP[0][2].value=="O"&&temp.MAP[1][2].value=="O"&&temp.MAP[2][2].value=="O")return 1;
         	if(temp.MAP[0][0].value=="O"&&temp.MAP[1][1].value=="O"&&temp.MAP[2][2].value=="O")return 1;
         	if(temp.MAP[0][2].value=="O"&&temp.MAP[1][1].value=="O"&&temp.MAP[2][0].value=="O")return 1;

         	
         	if(temp.MAP[0][0].value=="X"&&temp.MAP[0][1].value=="X"&&temp.MAP[0][2].value=="X")return -1;
         	if(temp.MAP[1][0].value=="X"&&temp.MAP[1][1].value=="X"&&temp.MAP[1][2].value=="X")return -1;
         	if(temp.MAP[2][0].value=="X"&&temp.MAP[2][1].value=="X"&&temp.MAP[2][2].value=="X")return -1;
         	if(temp.MAP[0][0].value=="X"&&temp.MAP[1][0].value=="X"&&temp.MAP[2][0].value=="X")return -1;
         	if(temp.MAP[0][1].value=="X"&&temp.MAP[1][1].value=="X"&&temp.MAP[2][1].value=="X")return -1;
         	if(temp.MAP[0][2].value=="X"&&temp.MAP[1][2].value=="X"&&temp.MAP[2][2].value=="X")return -1;
         	if(temp.MAP[0][0].value=="X"&&temp.MAP[1][1].value=="X"&&temp.MAP[2][2].value=="X")return -1;
         	if(temp.MAP[0][2].value=="X"&&temp.MAP[1][1].value=="X"&&temp.MAP[2][0].value=="X")return -1;
			
         	if(map1.step==0)return 2;
         	
         	return 0;
        }

        void dechange(int x,int y,map map1) {
        	map1.MAP[x-1][y-1].value=".";
        	map1.MAP[x-1][y-1].reachable=true;
        	map1.step+=1;	
        }

}
