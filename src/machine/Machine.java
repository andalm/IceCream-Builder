/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

import java.util.ArrayList;
import machine.interfaces.IMachine;

/**
 *
 * @author Adam
 */
public abstract class Machine implements IMachine{
  private ArrayList<Integer> flavorActions;
  private ArrayList<Integer> sauceActions;
  private ArrayList<Integer> decorationActions;

  /**
   * @return the flavorActions
   */
  public ArrayList<Integer> getFlavorActions() {
    return flavorActions;
  }

  /**
   * @return the sauceActions
   */
  public ArrayList<Integer> getSauceActions() {
    return sauceActions;
  }

  /**
   * @return the decorationActions
   */
  public ArrayList<Integer> getDecorationActions() {
    return decorationActions;
  }

  /**
   * @param flavorActions the flavorActions to set
   */
  protected void setFlavorActions(ArrayList<Integer> flavorActions) {
    this.flavorActions = flavorActions;
  }

  /**
   * @param sauceActions the sauceActions to set
   */
  protected void setSauceActions(ArrayList<Integer> sauceActions) {
    this.sauceActions = sauceActions;
  }

  /**
   * @param decorationActions the decorationActions to set
   */
  protected void setDecorationActions(ArrayList<Integer> decorationActions) {
    this.decorationActions = decorationActions;
  }
}
