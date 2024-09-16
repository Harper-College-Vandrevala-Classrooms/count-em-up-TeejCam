package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGroceryCounter {

  GroceryCounter counter;

  @BeforeEach
  void setUp() {
    counter = new GroceryCounter();
  }

  @Test
  void itReturnsZeroDollarsIfNoEntriesHaveBeenMade() {
    assertEquals("$0.00", counter.total());
  }

  @Test
  void itRetunsOneCent() {
    counter.increment_hundredths();
    assertEquals("$0.01", counter.total());
  }

  @Test
  void itReturnsTwoCents() {
    counter.increment_hundredths();
    counter.increment_hundredths();
    assertEquals("$0.02", counter.total());
  }

  @Test
  void itReturnsNineCents() {
    for(int i = 0; i < 9; i++) {
      counter.increment_hundredths();
    }
    assertEquals("$0.09", counter.total());
  }

  @Test
  void itReturnsTenCents(){
    for (int i=0; i<10; i++){
      counter.increment_hundredths();
    }
    assertEquals("$0.10", counter.total());
  }

  @Test
  void itReturnsElevenCents(){
    for (int i=0; i<11; i++){
      counter.increment_hundredths();
    }
    assertEquals("$0.11", counter.total());
  }

  @Test
  void itIncrementsByTenCents() {
    counter.increment_tenths();
    assertEquals("$0.10", counter.total());
  }

  @Test
  void itIncrementsByTenCentsTenTimes() {
    for (int i=0; i<10; i++){
      counter.increment_tenths();
    }
    assertEquals("$1.00", counter.total());
  }

  @Test
  void itIncrementsByOneCentOneHundredTimes() {
    for (int i=0; i<100; i++){
      counter.increment_hundredths();
    }
    assertEquals("$1.00", counter.total());
  }

  @Test
  void itIncrementsByOneDollar() {
    counter.increment_ones();
    assertEquals("$1.00", counter.total());
  }

  @Test
  void itIncrementsByOneDollarTenTimes() {
    for (int i=0; i<10; i++){
      counter.increment_ones();
    }
    assertEquals("$10.00", counter.total());
  }

  @Test
  void itIncrementsByOneDollarNinetyNineTimes() {
    for (int i=0; i<99; i++){
      counter.increment_ones();
    }
    assertEquals("$99.00", counter.total());
  }

  @Test
  void itIncrementsByTenDollarsOneTime() {
    counter.increment_tens();
    assertEquals("$10.00", counter.total());
  }

  @Test
  void itIncrementsByTenDollarsTenTimes() {
    for (int i=0; i<10; i++){
      counter.increment_tens();
    }
    assertEquals("$90.00", counter.total());
  }
  @Test
  void itIncrementsByTenDollarsNineTimes()
  {
    for (int i=0; i<9; i++){
      counter.increment_tens();
    }
    assertEquals("$90.00", counter.total());
  }

  @Test
  void incremenentsByTenDollarsTenTimesAndOneDollarTenTimes(){
    for (int i=0; i<10; i++){
      counter.increment_tens();
      counter.increment_ones();
    }
    assertEquals("$99.00", counter.total());
  }
}
