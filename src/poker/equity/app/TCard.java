/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.equity.app;

enum ECardSuit {
    Spade,
    Club,
    Diamond,
    Heart
}

enum ECardValue {
    Ace,
    Deuce,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King //13
}

/**
 *
 * @author tntul
 */
public class TCard {
    ECardValue Value;
    ECardSuit Suit;
}
