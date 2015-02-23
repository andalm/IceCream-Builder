/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine.interfaces;

import machine.product.Product;
import java.util.List;

/**
 *
 * @author Adam
 */
public interface IMachine {

  /**
   *
   * @return the machine.product.Product
   */
  public Product work();

  /**
   *
   * @param flavorActions the value of flavorActions
   * @param sauceActions the value of sauceActions
   * @param decorationActions the value of decorationActions
   */
  public void setProcess(
          List<Integer> flavorActions, List<Integer> sauceActions, List<Integer> decorationActions);
}
