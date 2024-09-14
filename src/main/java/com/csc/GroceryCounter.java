package com.csc;

public class GroceryCounter {
  //tens ones tenths one-hundredths
  int[] counter = new int[4];
  public void increment_tens()
  {
    //counter[0]
    counter[1] = counter[1] + 10;
  }

  public void increment_ones()
  {
    //counter[1]
    // if
    counter[1]++;
  }

  public void increment_tenths()
  {
    //counter[2]
    if (counter[2] < 9){
      counter[2]++;
    }
    else{
      counter[1]++;
      //increment_ones();
      counter[2] = 0;
    }
  }

  public void increment_hundredths()
  {
    //counter[3]++;

    // check to see what counter[3] is equal to
    // if it is less than 9, then increment and don't do anything else
    // if it is equal to 9, then increment counter[2] and set counter[3] equal to zero
    if (counter[3] < 9){
      counter[3]++;
    }
    else {
      increment_tenths();
      counter[3] = 0;
    }
  }

  public String total()
  {

    return "$" + counter[1] + "." + counter[2] + counter[3];
    
  }

  /**public int number_of_overflows()
  {

  }

  public void clear()
  {
    for (int i=0; i < counter.length; i++){
      counter[i] = 0;
    }
  }*/

  //do i need a static void main?
  
}
