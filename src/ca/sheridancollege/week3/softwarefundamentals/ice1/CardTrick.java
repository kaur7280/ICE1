/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
                c.setValue(1 + (int)Math.random()*13);
 c.setSuit(Card.SUITS[1+((int)Math.random()*4)]);
            magicHand[i]=c;
        
           }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
           //
           
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter Card Value: ");
        int value = k.nextInt();
        
        System.out.print("Enter Suit: ");
        String suit=k.next();
        
        for(int sub=0; sub<magicHand.length; sub++)
        {
            if(value == magicHand[sub].getValue())
            {
                if(suit.equalsIgnoreCase(magicHand[sub].getSuit()))
                {
                    System.out.println("Card Found");
                }
            }
            else
                System.out.println("Card Not Found");
            
        
    }
    }
}