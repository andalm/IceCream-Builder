/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine.product;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public abstract class Product {
  private String name;
  private ArrayList<String> flavors = new ArrayList<>();
  private ArrayList<String> sauces = new ArrayList<>();
  private ArrayList<String> decorations = new ArrayList<>();

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  protected void setName(String name) {
    this.name = name;
  }

  /**
   * @param index
   * @return the flavor
   */
  public String getFlavor(byte index) {
    return flavors.get(index);
  }

  /**
   * @param flavor
   */
  public void setFlavor(String flavor) {
    this.flavors.add(flavor);
  }

  /**
   * @param index
   * @return the sauce
   */
  public String getSauce(byte index) {
    return sauces.get(index);
  }

  /**
   * @param sauce
   */
  public void setSauce(String sauce) {
    this.sauces.add(sauce);
  }

  /**
   * @param index
   * @return the decoration
   */
  public String getDecoration(byte index) {
    return decorations.get(index);
  }

  /**
   * @param decoration
   */
  public void setDecoration(String decoration) {
    this.decorations.add(decoration);
  }
  
  public int getCountFlavors(){
    return flavors.size();
  }
  
  public int getCountSauces(){
    return sauces.size();
  }
  
  public int getCountDecorations(){
    return decorations.size();
  }
}
