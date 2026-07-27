public class MyList{
    // Initalising the array with the size of 100
    // A pointer to follow the last filled index

    private int[] arr = new int[100];
    private int size = 0;

    public void add(int value){
        if(size == arr.length){
            grow();
        }

        arr[size] = value;
        size++;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return arr[index];
    }

    // method to delete an element using its index
    public void deleteByIndex(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        //moving the elements to the right of deleted element by single index to left
        for(int i=index ;i<size-1;i++){
            arr[i] = arr[i+1];
        }

        size--;
        shrink(); // calling shrink() to check if the array size can be reduced
    }

    // method to delete first occurance of the value
    public void deleteByValue(int value){
        for(int i=0;i<size;i++){
            if(arr[i] == value){
                deleteByIndex(i); // reusing Delete by index method
                return;
            }
        }

        System.out.println("Value not found");
    }

    //method to grow the array size by twice
    private void grow(){

        //initialize a temp array twice the size of original array and copying every elements in origianl array to the temp
        int[] temp = new int[arr.length * 2];

        for(int i=0;i<size;i++){
            temp[i] = arr[i];
        }

        arr = temp;
    }

    //method to reduce the unused space of the array
    private void shrink(){
        if(arr.length > 100 && size <= arr.length / 4){ // if 75% of the array is left unused shrik the array size by half
            int[] temp = new int[arr.length / 2];

            for(int i=0;i<size;i++){
                temp[i] = arr[i];
            }

            arr = temp;
        }
    }

    public void display(){
        System.out.println("MyList : ");

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}