/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import machine.Machine;
import machine.mold.*;

/**
 *
 * @author Adam
 */
public class Builder {
  private Machine machine;
  
  public void selectMachine(byte opt) throws Exception
  {
    switch(opt)
    {
      case 1:
        machine = new ConeMold();
        break;
      case 2:
        machine = new CupMold();
        break;
      case 3:
        machine = new GlassMold();
        break;
      default:
        throw new Exception("WTF!!, you are very sick :(");
    }
  }
}
