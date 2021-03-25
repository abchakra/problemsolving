package com.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Smoothie {


  public static String ingredients(String order) {

    Map<String, Set<String>> smoothies = new HashMap<String, Set<String>>();
    Set<String> CLASSIC = Stream.of("strawberry", "banana", "pineapple", "mango", "peach", "honey")
        .collect(Collectors.toCollection(TreeSet::new));
    Set<String> FREEZIE =
        Stream.of("blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt")
            .collect(Collectors.toCollection(TreeSet::new));
    Set<String> GREENIE =
        Stream.of("green apple", "lime", "avocado", "spinach", "ice", "apple juice")
            .collect(Collectors.toCollection(TreeSet::new));
    Set<String> JUST_DESSERTS = Stream.of("banana", "ice cream", "chocolate", "peanut", "cherry")
        .collect(Collectors.toCollection(TreeSet::new));
    smoothies.put("classic", CLASSIC);
    smoothies.put("freezie", FREEZIE);
    smoothies.put("greenie", GREENIE);
    smoothies.put("justdesserts", JUST_DESSERTS);


    String finalSmoothieIngredients = null;

    if (order == null || order.trim().isEmpty()) {
      throw new IllegalArgumentException();
    }
    String[] items = order.trim().split(",");


    // First item is the smoothie name

    int inputItemsLength = items.length;
    if (inputItemsLength > 0) {
      Set<String> originalSmoothieIngredients = smoothies.get(items[0].trim().toLowerCase());

      if (originalSmoothieIngredients == null) {
        throw new IllegalArgumentException();
      }


      if (inputItemsLength == 1) {
        finalSmoothieIngredients = getStringForSet(originalSmoothieIngredients);
      } else {
        // Set<String> copySmoothieIngredients = cloneSet(originalSmoothieIngredients);
        for (int i = 1; i < inputItemsLength; i++) {

          String entry = items[i].trim();
          // items to be removed as allergic
          if (entry.contains("-")) {
            String allegricEntry = entry.substring(1, entry.length());
            originalSmoothieIngredients.remove(allegricEntry.trim());

          } else {
            // additional ingredient which is not part of original ingredients
            if (!originalSmoothieIngredients.contains(entry)) {
              throw new IllegalArgumentException();
            }
          }

        }
        finalSmoothieIngredients = getStringForSet(originalSmoothieIngredients);
      }
    }
    return finalSmoothieIngredients;



  }

  private static Set<String> cloneSet(Set<String> originalSet) {

    Set<String> copySet = new TreeSet<String>();
    for (String string : originalSet) {
      copySet.add(string);
    }
    return copySet;
  }

  private static String getStringForSet(Set<String> setOfString) {
    String joined = String.join(",", setOfString);
    return joined;
  }
}
