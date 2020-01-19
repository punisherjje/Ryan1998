/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamapsobjectoriented;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author CEB
 */
public class MyMap {
    HashMap<String, Integer> grades = new HashMap ();
    PriorityQueue<String> gradeSort = new PriorityQueue(); 
    String key;
    int value;
    //boolean for checking input
    boolean activeInput=true;
    //Scanner to use
    Scanner input = new Scanner(System.in);
    public void mapEntry(){
        //This is a while loop for continuous input, Typing "STOP" or "stop" will trigger the sorting
        while(activeInput){
            System.out.println("***===Just type stop to start sorting===***");
            System.out.println("Enter student name:");
            key = input.nextLine();            
            inputCheck(key);  //Iche-check nito yung input kung "STOP" or "stop" *Look at the method public void inputCheck()
            if(!activeInput){
                break;//Kapag nag false yung boolean na active input, ititrigger ng if statement na ito yung break na magpapatapos ng while loop then proceed sa sorting
            }            
            System.out.println("Enter grade:");
            String temp;
            temp = input.nextLine();
            inputCheck(temp); //Iche-check nito yung input kung "STOP" or "stop"*Look at the method public void inputCheck() SA LINE 78
            if(!activeInput){
                break; //Kapag nag false yung boolean na active input, ititrigger ng if statement na ito yung break na magpapatapos ng while loop then proceed sa sorting
            } else{
                value= Integer.parseInt(temp); //From string, gagawing Integer ni java yung input ni user na nilagay sa value para hindi mag inputmismatchexception SA LINE 78
                grades.put(key, value);
            }
        } //End of while
        
        //Showing all the items in the map
        System.out.println("v=======Map Contents========v");
        for (HashMap.Entry e : grades.entrySet()){
            System.out.println(e.getKey()+ ":" + e.getValue());
        }
        System.out.println("^=======Map Contents========^");
        
        sortTheMap();
        
    }
    
    public void sortTheMap(){
        System.out.println("How do you want to arrange the data?");
        System.out.println("Input A :  by name");
        System.out.println("Any key :  by grade");
        String option = input.nextLine().toUpperCase(); //Convert the input to capital para isa na lang ang ichecheck ni if , si "A" na lang                
        if(option.equals("A")){
            arrangeByName();//See Codes Line 85
        } else {
            arrangeByGrade();//See Codes Line 90
        }       
        System.out.println("+=======Sorted Contents========+");
        while(!gradeSort.isEmpty()){
            System.out.println(gradeSort.remove());
        }
        
        System.out.println("+=======Sorted Contents========+");
        //CONTINUE THIS CODE BY MAKING THE USER SEARCH THE MAP WE MADE
    }
    
    //===========ITO YUNG INPUT CHECK FOR CHECKING THE STOP INPUT=========
    public void inputCheck(String in){
        in.toUpperCase();
        if (in.equals("STOP")||in.equals("stop")){
            activeInput= false;
        }
    }
    
    public void arrangeByName(){        
        for (HashMap.Entry e : grades.entrySet()){
            gradeSort.add(e.getKey()+ ":" + e.getValue());
        }
    }
    public void arrangeByGrade(){
        for (HashMap.Entry e : grades.entrySet()){
            gradeSort.add(e.getValue()+ ":" + e.getKey());
        }
    }
}
