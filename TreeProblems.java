/*
 * *** Celeste Gonzalez / COMP272 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    Set<Integer> xset = new TreeSet<>(setB);  // new treeset w/ all elemnts from setb
    xset.removeAll(setA); // remove repeated elements also in setA
    setA.removeAll(setB); // remove repeated elements also in setB
    setA.addAll(xset); // add the remaining elements from the temporary set to setA
    return setA; // return only the changed elements 
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    treeMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 0);
    return; //removing even keys
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE
    return tree1.equals(tree2); // this will compare both maps in the equals method
  }

} // end treeProblems class
