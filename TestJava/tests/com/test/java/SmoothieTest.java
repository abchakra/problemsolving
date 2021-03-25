package com.test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmoothieTest {
  @Test
  public void classicSmoothie() {
    assertEquals("banana,honey,mango,peach,pineapple,strawberry", Smoothie.ingredients("Classic"));
  }

  @Test
  public void freezieSmoothie() {
    assertEquals("black currant,blackberry,blueberry,frozen yogurt,grape juice",
        Smoothie.ingredients("freezie"));
  }


  @Test
  public void greenieSmoothie() {
    assertEquals("apple juice,avocado,green apple,ice,lime,spinach",
        Smoothie.ingredients("greenie"));
  }

  @Test
  public void justdessertsSmoothie() {
    assertEquals("banana,cherry,chocolate,ice cream,peanut", Smoothie.ingredients("justdesserts"));
  }


  @Test
  public void classicSmoothieIngredientsOnly() {
    assertEquals("banana,honey,mango,peach,pineapple",
        Smoothie.ingredients("Classic,-strawberry,-null"));
  }

  @Test
  public void classicGreenies() {
    assertEquals("ice,spinach",
        Smoothie.ingredients("Greenie,-green apple,-lime, -avocado,-apple juice"));
  }


  @Test
  public void classicSmoothieWithoutStrawberry() {
    assertEquals("banana,honey,mango,peach,pineapple", Smoothie.ingredients("Classic,-strawberry"));
  }

  @Test
  public void classicSmoothieAllergic() {
    assertEquals("banana,honey,mango,peach,pineapple",
        Smoothie.ingredients("Classic,-strawberry,-peanut"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void classicSmoothieInvalidIngredient() {
    assertEquals("", Smoothie.ingredients("Classic,chocolate"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void classicSmoothieInvalidSmoothie() {
    assertEquals("", Smoothie.ingredients("Vitamin smoothie"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void noIngredientsSmoothie() {
    assertEquals("", Smoothie.ingredients(""));
  }
}
