public class tugasque1 {
    int data[];
    int head = 0;
    int tail = -1;

    public tugasque1(int size) {
        data = new int[size];
    }
    public boolean isempty (){
        if (tail== -1){
            return true ;
        }else {
            return false ;
        } }

        public boolean isfull () {
            if (tail == data.length - 1) {
                return true;
            } else {
                return false;
            }

        }


    public void enqueue (int databaru) {
        if (isempty()) {
            tail = head;
            data[tail] = databaru;
        } else if (isfull()) {
            tail++;
            data[tail]= databaru ;
        }else if (isfull()){
            System.out.println("antrian penuh");

        }
    }
    public int dequeue (){
        int temp = data [head];
        for(int i = head; i <=tail-1; i++){
           data [i]= data[i+1];

        }tail--;
        return temp;
    }
    public void print (){
        if(isempty()){
            int index = head ;
            while(index <= tail){
                System.out.println(data[index]);
            index++;
            }
            System.out.println();
        }else {
            System.out.println("kosong");
        }
    }
}

