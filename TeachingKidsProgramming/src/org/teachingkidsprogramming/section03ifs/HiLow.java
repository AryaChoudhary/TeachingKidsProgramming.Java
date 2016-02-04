package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = 67;
    for (int i = 0; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a Number");
      //         If the guess is correct --#4
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("Congrats! You wasted some time in your precious youth to play this stupid game!");
        break;
      }
      //         Otherwise, if the guess is too high --#6
      else if (guess > answer)
      {
        MessageBox.showMessage("too HIGH");
      }
      else
      {
        MessageBox.showMessage("too low");
      }
      //
      if (i == 8)
      {
        MessageBox.showMessage("You lost");
      }
    }
  }
}
