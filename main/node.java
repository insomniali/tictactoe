package main;

import java.io.*;

public class node implements Serializable{
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   public int x;
       public int y;
       public Boolean reachable;
       public String value;
       
       public node(int x,int y,String value,Boolean reachable) {
    	   super();
    	   this.x=x;
    	   this.y=y;
    	   this.value=value;
    	   this.reachable= reachable;
       }
       
       public node() {
    	   super();
       }

       /*public node deepClone()throws Exception{
    	   //将对象写入流中
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
           objectOutputStream.writeObject(this);
           //从流中取出
           ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
           ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
           return (node)objectInputStream.readObject();
     }*/
       
}
