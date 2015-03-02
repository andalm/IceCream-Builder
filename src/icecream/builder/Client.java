/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream.builder;

import builder.Builder;
import java.util.Scanner;
import machine.Machine;
import machine.product.*;

/**
 *
 * @author Adam
 */
public class Client {

  private static Builder builder = new Builder();
  /**
   * @param args the command line arguments
   * @throws java.lang.Exception
   */
  public static void main(String[] args) throws Exception {
    selectMachine();
    selectFlavors();
    selectSauces();
    selectDecorations();
    
    Machine myIcecreamMachine = builder.getMachine();
    Product myProduct;
    myProduct = myIcecreamMachine.work();
    int maxCount;
    
    System.out.println("Your product is a " + myProduct.getName());
    maxCount = myProduct.getCountFlavors();
    for(int i = 0; i<maxCount; i++)
    {
      System.out.println("Flavor " + (i+1) + ": " + myProduct.getFlavor((byte)i));
    }
    
    maxCount = myProduct.getCountSauces();
    for(int i = 0; i<maxCount; i++)
    {
      System.out.println("Sauce " + (i+1) + ": " + myProduct.getSauce((byte)i));
    }
    
    maxCount = myProduct.getCountDecorations();
    for(int i = 0; i<maxCount; i++)
    {
      System.out.println("Decoration " + (i+1) + ": " + myProduct.getDecoration((byte)i));
    }
    
  }
  
  private static void selectMachine() throws Exception{
    System.out.println("Choose a icecream machine type:\n1. Cone\n2. Cup\n3. Glass");
    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();
    builder.selectMachine((byte)opt);
  }
  
  private static void selectFlavors(){
    Scanner sc = new Scanner(System.in);
    int opt;    
    do
    {
      System.out.println("Choose flavors for add at your icecream machine:\n1. Chocolate\n2. Blackberry\n"
              + "3. Soursop\n4. Strawberry\n0. Salir");
      opt = sc.nextInt();
      switch(opt){
        case 1: 
          builder.addChocolateFlavor();
          break;
        case 2: 
          builder.addBlackberryFlavor();
          break;
        case 3: 
          builder.addSoursopFlavor();
          break;
        case 4: 
          builder.addStrawberryFlavor();
          break;
        default: //nothing
      }      
    }
    while(opt != 0);
  }
  
  private static void selectSauces(){
    Scanner sc = new Scanner(System.in);
    int opt;    
    do
    {
      System.out.println("Choose sauces for add at your icecream machine:\n1. Chocolate\n2. Caramel\n"
              + "3. Pineapple\n4. Blackberry\n0. Salir");
      opt = sc.nextInt();
      switch(opt){
        case 1: 
          builder.addChocolateSauce();
          break;
        case 2: 
          builder.addCaramelSauce();
          break;
        case 3: 
          builder.addPineappleSauce();
          break;
        case 4: 
          builder.addBlackberrySauce();
          break;
        default: //nothing
      }      
    }
    while(opt != 0);
  }
  
  private static void selectDecorations(){
    Scanner sc = new Scanner(System.in);
    int opt;    
    do
    {
      System.out.println("Choose decorations for add at your icecream machine:\n1. Chiclets\n2. Sparks\n"
              + "3. Chocolate Sparks\n0. Salir");
      opt = sc.nextInt();
      switch(opt){
        case 1: 
          builder.addChicletsDecoration();
          break;
        case 2: 
          builder.addSparksDecoration();
          break;
        case 3: 
          builder.addChocolateSparksDecoration();
          break;
        default: //nothing
      }      
    }
    while(opt != 0);
  }
}
