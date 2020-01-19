/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCharacter;

/**
 *
 * @author xigncode
 */
public class MyCharacter {
    protected String name;
    protected int age;
    protected String gender;
    protected int choices;
    
    
    public MyCharacter(){
    
    }
   
    public MyCharacter(String iName, int iAge, String iGender){
        name = iName;
        age = iAge;
        gender = iGender;
    }
    public String getName(){
            return name;
        }
    public int getAge(){
            return age;
        }
    public String getGender(){
            return gender;
        }
    public void setName(String nName){
            name = nName;
        }
    public void setAge(int nAge){
            age = nAge;
        }
    public void setGender(String nGender){
            gender = nGender;
        }
   
public void omniSlash(){
        System.out.println(name+":Omnislash!*");
    }
public void vineTangle(){
        System.out.println(name+": Vine Tangle");
    }

  public void going(String place){
        System.out.println("Si "+name + " ay pupunta sa " + place + ".");
        this.isHungry = true;
    }
    
    //STEP 7: SET UP THE STATES
        //States are composed of boolean variables:
        //Starts with the word "is"
    private boolean isSleeping, isHungry, isHappy;
        //States are being affected by behaviors
    
    //STEP 7.5 SET UP THE STATES ACCESSOR
    public boolean checkSleeping(){
        return this.isSleeping;
    }
    public boolean checkIsHungry(){
        return this.isHungry;
    }
    public boolean checkIsHappy(){
        return this.isHappy;
    }
}
