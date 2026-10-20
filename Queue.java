
package queue;


public class Queue {
    
    private int[] elements;
    private int size;
    
    public Queue(){
        elements=new int[8];
        size=0;
    }
    
    
    
     public void enqueue(int v) {
    if (size >= elements.length) {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }
    elements[size] = v;
    size++;
}
    
    public int dequeue() {
    int silinenEleman = elements[0];
    for (int i = 0; i < size - 1; i++) {
        elements[i] = elements[i + 1];
    }
    size--;
    return silinenEleman;
}
   
    
    public boolean empty(){
     if(this.size==0){
         
         return true;
         
     }
     else{
         return false;
     }
    }
    
    public int getSize(){
    return size; 
}
    
}  
    

    
    
    

