/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import machine.Machine;
import machine.mold.*;

/**
 *
 * @author Adam
 */
public class Builder {
  private Machine machine;
  private ArrayList<Integer> flavorActions = new ArrayList<Integer>();
  private ArrayList<Integer> sauceActions = new ArrayList<Integer>();
  private ArrayList<Integer> decorationActions = new ArrayList<Integer>();
  
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
  
  //Flavors
  public void addChocolateFlavor(){
    this.flavorActions.add(1);
  }
  
  public void addBlackberryFlavor(){
    this.flavorActions.add(2);
  }
  
  public void addSoursopFlavor(){
    this.flavorActions.add(3);
  }
  
  public void addStrawberryFlavor(){
    this.flavorActions.add(4);
  }
  
  //Sauces
  public void addChocolateSauce(){
    this.sauceActions.add(1);
  }
  
  public void addCaramelSauce(){
    this.sauceActions.add(2);
  }
  
  public void addPineappleSauce(){
    this.sauceActions.add(3);
  }
  
  public void addBlackberrySauce(){
    this.sauceActions.add(4);
  }
  
  //Decorations
  public void addChicletsDecoration(){
    this.decorationActions.add(1);
  }
  
  public void addSparksDecoration(){
    this.decorationActions.add(2);
  }
  
  public void addChocolateSparksDecoration(){
    this.decorationActions.add(3);
  }
  
  public Machine getMachine() throws Exception{
    if(machine == null)
    {
      throw new Exception("You must choose a icecream machine");
    }
    machine.setProcess(flavorActions, sauceActions, decorationActions);
    return machine;
  }
}
