package programs;

public class CountingSort {
  //First copy all the items from array to new array which has length = max item in array
  //assign count to all items respective to occurrence
  //copy the new array items to old array
  public void sort(int[] array, int max) {
    int[] counts = new int[max + 1];
    for (var item : array)
      counts[item]++;

    var k = 0;
    for (var i = 0; i < counts.length; i++)
      for (var j = 0; j < counts[i]; j++)
        array[k++] = i;
  }
}
