/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerserver;

/**
 *
 * @author supithaweerasinghe
 */

import java.util.ArrayList;

public class PokerServer {
    
    void creatingCards(){
        
        //creating an array list
        ArrayList cards = new ArrayList();
        
        for(int i=0;i<4;i++){
            //there are 4 types of cards spades,clubs,diamods,hearts
            //adding 14 cards belongs to spade
            if(i==0){
                String type = "spade";
                for(int x=2;x<=14;x++){
                    Cards a = new Cards();
                    a.cnumber = x;
                    a.ctype = type;
                    cards.add(a);
                }
            //adding 14 cards belongs to clubs
            }else if(i==1){
                String type = "clubs";
                for(int x=2;x<=14;x++){
                    Cards a = new Cards();
                    a.cnumber = x;
                    a.ctype = type;
                    cards.add(a);
                }
            //adding 14 cards belongs to diamonds
            }else if(i==2){
                String type = "diamonds";
                for(int x=2;x<=14;x++){
                    Cards a = new Cards();
                    a.cnumber = x;
                    a.ctype = type;
                    cards.add(a);
                }
            //adding 14 cards belongs to hearts
            }else{
                String type = "hearts";
                for(int x=2;x<=14;x++){
                    Cards a = new Cards();
                    a.cnumber = x;
                    a.ctype = type;
                    cards.add(a);
                }
            }
        }
        
        for(int i=0;i<52;i++){
            Cards a = (Cards)cards.get(i);
            System.out.print(a.cnumber);
            System.out.println(a.ctype);
        }
        
    }
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokerServer p = new PokerServer();
        p.creatingCards();
    }
    
}
