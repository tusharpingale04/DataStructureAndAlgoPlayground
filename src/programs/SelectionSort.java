package programs;

public class SelectionSort {
  //Find the minimum value from the array
  //and exchange that with initial positions
  public void sort(int[] array) {
    for (var i = 0; i < array.length; i++) {
      var minIndex = i;
      for (var j = i; j < array.length; j++)
        if (array[j] < array[minIndex])
          minIndex = j;
      swap(array, minIndex, i);
    }
  }

  private void swap(int[] array, int index1, int index2) {
    var temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
