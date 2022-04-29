public class Fila {

    public int[] fila;
    public int size;
    public int base = 0;
    public int topo = 0;

    

    public Fila(int size){
        this.size = size;
        this.fila = new int[size];

        this.base = fila[base];
        this.topo = fila[topo];
    }

    public void add(int element){

        if(!isFull()){
            this.fila[this.topo] = element;
            this.topo = this.topo + 1;

            if(this.topo >= this.size){
                this.topo = 0;
            }

        } else {
            System.out.println("A fila ta cheia animal");
        }
    }

    public int remove(){
        int element = this.fila[this.base];
        this.fila[base] = 0;
        this.base = this.base + 1;
        if(this.base > this.size){
            this.base = 0;
        }

        return element;
    }

    public boolean isFull(){
        if(!this.isEmpty() && this.topo == this.base){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){

        for(int i = 0; i < this.size; i++){
            if(this.fila[i] != 0){
                return false;
            }
        }

        return true;
    }


    public void printFila(){
        for(int i = 0; i < this.size; i++){
            System.out.println(this.fila[i]);
        }
    }
}
