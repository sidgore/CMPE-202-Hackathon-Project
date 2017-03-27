import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoCreditCardState implements State
{
    private String stateName = "HasNoCreditCard";
GasPumpMachine gasPumpMachine;

  public HasNoCreditCardState(GasPumpMachine gasPumpMachine) {
    this.gasPumpMachine = gasPumpMachine;
  }
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardClick(){
        System.out.println("In HasNoCreditCardState, on credit card swipe");
        gasPumpMachine.setState(gasPumpMachine.getHasCreditCardState());
        return new HasValidCreditCardState(this.gasPumpMachine);
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
    public State onUnFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    public State onPrmFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public void insertCreditCard()
	{
	}
    public void enterPinCode()
	{
	}


  public String toString() {
    return "Waiting to pump fuel";
  }
}