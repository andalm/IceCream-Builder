/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

import java.util.List;
import machine.interfaces.IMachine;

/**
 *
 * @author Adam
 */
public abstract class Machine implements IMachine{
  private List<Integer> flavorActions;
  private List<Integer> sauceActions;
  private List<Integer> decorationActions;

  /**
   * @return the flavorActions
   */
  public List<Integer> getFlavorActions() {
    return flavorActions;
  }

  /**
   * @return the sauceActions
   */
  public List<Integer> getSauceActions() {
    return sauceActions;
  }

  /**
   * @return the decorationActions
   */
  public List<Integer> getDecorationActions() {
    return decorationActions;
  }

  /**
   * @param flavorActions the flavorActions to set
   */
  protected void setFlavorActions(List<Integer> flavorActions) {
    this.flavorActions = flavorActions;
  }

  /**
   * @param sauceActions the sauceActions to set
   */
  protected void setSauceActions(List<Integer> sauceActions) {
    this.sauceActions = sauceActions;
  }

  /**
   * @param decorationActions the decorationActions to set
   */
  protected void setDecorationActions(List<Integer> decorationActions) {
    this.decorationActions = decorationActions;
  }
}
