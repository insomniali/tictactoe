package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class map implements Serializable {
       /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	public node [][]MAP;
       public int step;
       
       public map deepClone()throws Exception {
    	   //将对象写入流中
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
           objectOutputStream.writeObject(this);
           //从流中取出
           ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
           ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
           return (map)objectInputStream.readObject();
       }
   
       public map() {
		     MAP=new node[3][3];
		     for(int i=0;i<3;i++) {
		    	 for (int j=0;j<3;j++) {
		    		 MAP[i][j]=new node(i+1,j+1,".",true);
		    	 }
		     }
		     this.step=9;
	}

       public void show() {
    	   for(int i=0;i<3;i++) {
		    	 for (int j=0;j<3;j++) {
		    		 System.out.print(MAP[i][j].value+"  ");
		    	 }
		    	 System.out.println();
		     }
	}
       
}
