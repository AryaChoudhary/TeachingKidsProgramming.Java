package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Browns;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#10
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setColor(Grays.Black);
    //    The current branch length = 60 --#1.2
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    //    ------------- Recipe for drawBranch --#2.2
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (length > 0)
    {
      //        adjustColor (recipe below)--#15.1
      adjustColor(length);
      Tortoise.move(length);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor(int length)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //            A 10 pixel long branch is lime --#20
    if (length == 10)
    {
      Tortoise.setPenColor(Greens.Lime);
    }
    if (length == 20)
    {
      Tortoise.setPenColor(Greens.ForestGreen);
    }
    if (length == 30)
    {
      Tortoise.setPenColor(Greens.DarkGreen);
    }
    if (length == 40)
    {
      Tortoise.setPenColor(Greens.Olive);
    }
    if (length == 50)
    {
      Tortoise.setPenColor(Browns.Sienna);
    }
    if (length == 60)
    {
      Tortoise.setPenColor(Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    drawShorterBranch(length);
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    adjustColor(length);
    Tortoise.move(-length);
  }
  private static void drawShorterBranch(int length)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    //                drawBranch (10 pixels shorter) --#4
    drawBranch(length - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}