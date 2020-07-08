package arrays;

public class Array {

    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        //if the array is full, resize it
        if(items.length == count){
            //create a new array twice the size
            int[] newItems = new int[count * 2];

            //copy all existing items
            for (int i = 0; i < count ; i++) {
                newItems[i] = items[i];
            }

            //Set new items to item
            items = newItems;
        }
        //Add the new item at end of array
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate the index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        //Shift items to left to fill the hole
        //[10,20,30,40]
        //index - 1
        //1 <- 2
        //2 <- 3
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i < count ; i++) {
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }
}
