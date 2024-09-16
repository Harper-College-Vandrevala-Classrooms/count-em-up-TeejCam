package com.csc;

public class GroceryCounter {
  //tens ones tenths one-hundredths
  int[] counter = new int[3];
  public void increment_tens()
  {
    //i will not let the number here go to 100
    if(counter[0] < 90){
      counter[0] = counter[0] + 10;
    }
  }

  public void increment_ones()
  {
      counter[0]++;
  }
  
  public void increment_tenths()
  {
    //counter[2]
    if (counter[1] < 9){
      counter[1]++;
    }
    else{
      counter[0]++;
      //increment_ones();
      counter[1] = 0;
    }
  }

  public void increment_hundredths()
  {
    //counter[3]++;

    // check to see what counter[3] is equal to
    // if it is less than 9, then increment and don't do anything else
    // if it is equal to 9, then increment counter[2] and set counter[3] equal to zero
    if (counter[2] < 9){
      counter[2]++;
    }
    else {
      increment_tenths();
      counter[2] = 0;
    }
  }

  public String total()
  {

    return "$" + counter[0] + "." + counter[1] + counter[2];
    
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
  
}
