package myList;

public class GenericMyList<T> {
    private Object[] arr;
    private int size;

    public GenericMyList(){
        arr= new Object[100];
    }

    public void add(T value){
        if(size == arr.length){
            grow();
        }

        arr[size] = value;
        size++;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        return (T) arr[index];
    }

    public void deleteByIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        for(int i=index;i< size-1;i++){
            arr[i] = arr[i+1];
        }

        System.out.println("Element deleted");
        size--;
        arr[size] = null;

        shrink();
    }

    public void deleteByValue(T value){
        for(int i=0;i<size;i++){
            if(arr[i].equals(value)){
                deleteByIndex(i);
                return;
            }
        }

        System.out.println("Value not found");
    }

    private void grow(){
        Object[] temp = new Object[arr.length * 2];

        System.arraycopy(arr, 0, temp, 0, size);
        arr = temp;
    }

    private void shrink() {
        if (arr.length > 100 && size <= arr.length / 4) { // if 75% of the array is left unused shrik the array size by half
            Object[] temp = new Object[arr.length / 2];

            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}