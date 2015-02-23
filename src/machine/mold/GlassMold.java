/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine.mold;

import java.util.List;
import machine.Machine;
import machine.product.*;

/**
 *
 * @author Adam
 */
public class GlassMold extends Machine{

  private IceCreamGlass product = new IceCreamGlass();
  
  /**
   *
   * @return the machine.product.Product
   */
  @Override
  public Product work() 
  {
    this.setFlavors();
    this.setSauces();
    this.setDecorations();
    return product;
  }

  @Override
  public void setProcess(List<Integer> flavorActions, List<Integer> sauceActions, List<Integer> decorationActions) {
    super.setFlavorActions(flavorActions);
    super.setSauceActions(sauceActions);
    super.setDecorationActions(decorationActions);
  }
  
  private void setFlavors()
  {
    for(int i:super.getFlavorActions())
    {
      switch(i)
      {
        case 1: //set chocolate flavor
          product.setFlavor("chocolate");
          break;
        case 2: //set blackberry flavor
          product.setFlavor("blackberry");
          break;
        case 3: //set soursop flavor
          product.setFlavor("soursop");
          break;
        case 4: //set strawberry flavor
          product.setFlavor("strawberry");
          break;
        default: // nothing
      }
    }
  }
  
  private void setSauces()
  {
    for(int i:super.getSauceActions())
    {
      switch(i)
      {
        case 1: //set chocolate sauce
          product.setSauce("chocolate");
          break;
        case 2: //set caramel sauce
          product.setSauce("caramel");
          break;
        case 3: //set pineapple sauce
          product.setSauce("pineapple");
          break;
        case 4: //set blackberry sauce
          product.setSauce("blackberry");
          break;
        default: // nothing
      }
    }
  }
  
  private void setDecorations()
  {
    for(int i:super.getDecorationActions())
    {
      switch(i)
      {
        case 1: //set chiclets decoration
          product.setDecoration("chiclets");
          break;
        case 2: //set sparks decoration
          product.setDecoration("sparks");
          break;
        case 3: //set chocolate sparks decoration
          product.setDecoration("chocolate sparks");
          break;
        default: // nothing
      }
    }
  }
}
