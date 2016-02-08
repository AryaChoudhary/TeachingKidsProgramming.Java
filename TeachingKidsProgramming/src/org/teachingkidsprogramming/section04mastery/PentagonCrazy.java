package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    //
    Color color1 = createColorPalette();
    //
    //    drawPentagon (recipe below) --#10.1
    //
    drawPentagon(color1);
  }
  private static void drawPentagon(Color color1)
  {
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 300; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      adjustPen(color1);
      //
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      int sideNumber = i;
      int currentLength = sideNumber++;
      Tortoise.move(currentLength);
      Tortoise.turn(360 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(1);
      //    Repeat --#2.2
      //    ------------- End of drawPentagon recipe --#10.3
    }
  }
  private static void adjustPen(Color color1)
  {
    //        ------------- Recipe for adjustPen --#9.2
    //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15       
    Tortoise.setPenWidth(1);
    int penWidth = 3;
    //        If the tortoises pen width is greater than 4, then --#17
    if (penWidth > 4)
      ;
    {
    }
    //            Reset it to 1 --#16
    Tortoise.setPenWidth(1);
    //        ------------- End of adjustPen recipe --#9.3 
  }
  private static Color createColorPalette()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    Color color1 = PenColors.Blues.SteelBlue;
    ColorWheel.addColor(color1);
    //    Add dark orchid to the color wheel --#11
    Color color2 = PenColors.Purples.DarkOrchid;
    ColorWheel.addColor(color2);
    //    Add dark slate blue to the color wheel --#12
    Color color3 = PenColors.Blues.SlateBlue;
    ColorWheel.addColor(color3);
    //    Add teal to the color wheel --#13
    Color color4 = PenColors.Blues.Teal;
    ColorWheel.addColor(color4);
    //    Add indigo to the color wheel --#14
    Color color5 = PenColors.Purples.Indigo;
    ColorWheel.addColor(color5);
    //    ------------- End of createColorPalette recipe --#8.3
    return color1;
  }
}
