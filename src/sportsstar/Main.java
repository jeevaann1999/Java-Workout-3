package sportsstar;

import sports.*;
import sports.OutdoorGame;

public class Main
{
    public static void main(String[] args)
    {
        Cricket cricket = new Cricket();
        Cricketer c1 = new Cricketer(cricket, "Kohli","Indian",2.5,9 );
        c1.calculateRating(c1.battingAverage, c1.bowlingAverage);
        System.out.println(c1.rating);
        c1.income(c1.rating);

        OutdoorGame Football = new Football();
        Footballer f1 = new Footballer(Football, "Ronaldo", "Portugal", 8, 1);
        f1.calculateRating(f1.goalsSaved,f1.goalsScored);
        System.out.println(f1.rating);
        f1.income(f1.rating);
    }
}