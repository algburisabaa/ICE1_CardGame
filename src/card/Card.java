/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 * Modified by: Sabaa Al-Gburi
 * Student ID: 991736646
 * Date: January 25, 2025
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   // Constructor with parameters
   public Card(int value, String suit) {
       this.value = value;
       this.suit = suit;
   }

   // Default constructor
   public Card() {
   
       this.value = value;
       this.suit = suit;
   }

   // Getter and setter methods
   public String getSuit() {
       return suit;
   }

   public void setSuit(String suit) {
       this.suit = suit;
   }

   public int getValue() {
       return value;
   }

   public void setValue(int value) {
       this.value = value;
   }
}
