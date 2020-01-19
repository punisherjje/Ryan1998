/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialattributes;
import myCharacter.MyCharacter;

/**
 *
 * @author xigncode
 */
public class SpecialAttributes extends MyCharacter{
    private String mastery, guild, race;
    
    public SpecialAttributes(){
    }
    
    public SpecialAttributes(String iMastery, String iGuild, String iRace){ 
      
        mastery = iMastery;
        guild = iGuild;
        race = iRace;
    }
   public String getMastery(){
       return mastery;
   }
   public String getGuild(){
       return guild;
   }
   public String getRace(){
       return race;
   }
   
   
}
