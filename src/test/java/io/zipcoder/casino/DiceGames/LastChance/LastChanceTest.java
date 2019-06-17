package io.zipcoder.casino.DiceGames.LastChance;

import io.zipcoder.casino.utilities.*;
import org.junit.Test;

import io.zipcoder.casino.DiceGames.LastChance.LastChance;
import io.zipcoder.casino.utilities.BasePlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LastChanceTest {
    /*public BasePlayer player;
    public ConsoleIO console;
    public ArrayList<String> expected;
   */
    Console consoleLC = new Console(System.in,System.out);

  /*  @Before
    public void setup(){
        expected = new ArrayList<>();
        player = new BasePlayer();
    }*/

    @Test
    public void initGame(){
        //given
        //when
        //then
    }

    @Test
    public void welcomeScreen(){
        //given
        //when
        //then

    }
    @Test
    public void setPlayer(){
        //given
        BasePlayer player = new LastChancePlayer("Abram");
       // LastChance lastChance = new LastChance(player);

        //when

        //then

    }

    @Test
    public void setupGame(){
        //given
        Integer iBet = 10;
        Integer iMultiple = 5;
        //when
        LastChance.setupGame();

        //then

    }
    @Test
    public void playGame(){
        //given
        //when
        //then

    }
    @Test
    public void printGame(){
        //given
        //when
        //then

    }
    @Test
    public void checkWin(){
        //given
        //when
        //then

    }


}
