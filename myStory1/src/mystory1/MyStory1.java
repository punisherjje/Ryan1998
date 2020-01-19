/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystory1;

import java.util.Scanner;
import myCharacter.MyCharacter;

/**
 *
 * @author xigncode
 */
public class MyStory1 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        boolean indicator = false;
        
        System.out.println("           -------INITIIAL FORM-------");
        System.out.println(" --------------------------------------------------");
        System.out.println("| This is your initial details, please make changes |");
        System.out.println(" --------------------------------------------------");
        MyCharacter avatar = new MyCharacter("Artemis",17,"Female");
        System.out.println("Character's name: "+avatar.getName());
        System.out.println("Character's age: "+avatar.getAge());
        System.out.println("Character's gender: "+avatar.getGender());
        System.out.println("");
        System.out.println("");
        
        do{
        Scanner sc = new Scanner (System.in);
        System.out.println(" --------------------------------------------------");
        System.out.println("|                 CHAPTER 1                        |");
        System.out.println(" --------------------------------------------------");
        System.out.print("Enter a new name: ");
        avatar.setName(sc.nextLine());
        System.out.print("Enter new age: ");
        avatar.setAge(sc.nextInt());
        System.out.print("Choose from Male or Female: ");
        String gender = sc.nextLine();
        avatar.setGender(sc.nextLine());
        System.out.println("");
        
        
        System.out.println(avatar.getName()+": *thud* Where am I?");
        System.out.println(".");
        System.out.println("You are looking around you and you found that you were in a room");
        System.out.println(".");
        System.out.println("You are wabbling to get on your feet as if like you were hit by something hard");
        System.out.println("You heard that there is someone is going through your location. ");
        System.out.println("");
        System.out.println("What will you do?");
        System.out.println(" 1. Hide in the nearby cabinet");
        System.out.println(" 2. Look for something");
        System.out.println(" 3. Hide behind the door");
        System.out.println("Enter the number of your action:");
        int choices = sc.nextInt();
        
        switch (choices) {
            case 1:
                System.out.println("");
                System.out.println("You rushed through the cabinet");
                System.out.println("");
                System.out.println("A loud creeking sound was heard from the door");
                System.out.println("");
                System.out.println("A deep voice of a man was heard");
                System.out.println("");
                System.out.println("?: Playing hide and seek eh?");
                System.out.println("");
                System.out.println("?: You know that this room is small right?");
                System.out.println("");
                System.out.println("?: And you know that in no time soon I will find you");
                System.out.println("");
                System.out.println("I will give you time to think");
                System.out.println(" 1. Stay");
                System.out.println(" 2. Come out");
                System.out.println("");
                choices = sc.nextInt();
                if (choices == 1){
                    System.out.println("?: 3...2...1..");
                    System.out.println("");
                    System.out.println("I give you time and I lost my patience");
                    System.out.println("");
                    System.out.println("Suddenly the doors opened and you only see a smoke coming out from the nuzzle");
                    System.out.println("");
                    System.out.println("As you staggger your way through your blood continues to flow");
                    System.out.println("");
                    System.out.println("You heard another noise and that's the last thing you'll hear");
                    System.out.println("");
                    indicator = false;
                }else{
                    System.out.println("?: What the hell are you doing?");
                    System.out.println("");
                    System.out.println(avatar.getName()+": Who are you!?");
                    System.out.println("He turned out to be a Caucassian male on his 40's");
                    System.out.println("");
                    System.out.println("Not that old nor young but he has an intimidating posture");
                    System.out.println("?: I said what were you doing?!");
                    System.out.println("");
                    System.out.println("? Kid don't mess with me or I can mess you up real good");
                    System.out.println(avatar.getName()+": ......");
                    indicator = true;
                }   break;
            case 2:
                System.out.println("");
                System.out.println("You rushed through the pile of boxes and look for something");
                System.out.println("");
                System.out.println("Way before you grabbed something the door opened");
                System.out.println("");
                System.out.println("A deep voice of a man was heard");
                System.out.println("");
                System.out.println("?: What the hell are you doing?");
                System.out.println("");
                System.out.println(avatar.getName()+": Who are you!?");
                System.out.println("He turned out to be a Caucassian male on his 40's");
                System.out.println("");
                System.out.println("Not that old nor young but he has an intimidating posture");
                System.out.println("?: I said what were you doing?!");
                System.out.println("");
                System.out.println("? Kid don't mess with me or I can mess you up real good");
                System.out.println(avatar.getName()+": ......");
                System.out.println("");
                indicator = true;
                break;
            case 3:
                System.out.println("You hide behind the door");
                System.out.println("");
                System.out.println("A loud creeking sound was heard from the door");
                System.out.println("");
                System.out.println("A deep voice of a man was heard");
                System.out.println("");
                System.out.println("?: Playing hide and seek eh?");
                System.out.println("");
                System.out.println("?: You know that this room is small right?");
                System.out.println("");
                System.out.println("?: And you know that in no time soon I will find you");
                System.out.println("");
                System.out.println("I will give you time to think");
                System.out.println(" 1. Stay");
                System.out.println(" 2. Come out");
                System.out.println("");
                choices = sc.nextInt();
                if (choices == 1){
                    System.out.println("?: 3...2...1..");
                    System.out.println("");
                    System.out.println("I give you time and I lost my patience");
                    System.out.println("");
                    System.out.println("Suddenly you heard a loud bang on the other side of the door and \nyou only see a smoke coming out from the nuzzle");
                    System.out.println("");
                    System.out.println("As you staggger your way through your blood continues to flow");
                    System.out.println("");
                    System.out.println("You heard another noise and that's the last thing you'll hear");
                    indicator = false;
                    
                }else{
                    System.out.println("?: What the hell are you doing?");
                    System.out.println("");
                    System.out.println(avatar.getName()+": Who are you!?");
                    System.out.println("He turned out to be a Caucassian male on his 40's");
                    System.out.println("");
                    System.out.println("Not that old nor young but he has an intimidating posture");
                    System.out.println("?: I said what were you doing?!");
                    System.out.println("");
                    System.out.println("? Kid don't mess with me or I can mess you up real good");
                    System.out.println(avatar.getName()+": ......");
                    indicator = true;
                }   break;
            default:
                System.out.println("Wrong input");
                indicator = false;
            }
        }while(indicator == false);
        int choices;
        Scanner sc = new Scanner(System.in);
        System.out.println("?: I'm sure that you're aware of everything that is happening");
            System.out.println("");
            System.out.println(avatar.getName()+": What I can't remember! Please let me go.");
            System.out.println("");
            System.out.println("?: Sorry but you have hit deep");
            System.out.println("");
            System.out.println("By the look from it he's a former police officer from he's posture");
            System.out.println("and judging his holster with a sigil of a police dept.");
            System.out.println("");
            System.out.println("So your name is "+avatar.getName()+" and you're the most valuable man of the New York underworld");
            System.out.println("");
            System.out.println("?: Well I'm tasked to eliminate you as quick as possible");
            System.out.println("");
            System.out.println("what will be your response?");
            System.out.println(" 1. You know deputy I don't know what you're talking about, or should I say Roach");
            System.out.println(" 2. Sir I really don't know what's going on here, I think somehow I know you is it Roach right?");
            choices =sc.nextInt();
            if(choices == 1){
                System.out.println("Roach: Are you pissing me off?");
                System.out.println("");
                System.out.println(avatar.getName()+": It's your fault for not removing your trenchcoat and your holster's sigil");
                System.out.println("Roach: *pulled-off his pistol*");
                System.out.println("");
                System.out.println(avatar.getName()+": I won't do that if I were you");
                System.out.println("");
                System.out.println("Even before Roach can pull the trigger you somehow to move with your instincts.");
                System.out.println("");
                System.out.println("Roach was stunned by your fast combination");
                System.out.println("");
                System.out.println(avatar.getName()+": Woah! What the f was that!?");
                System.out.println("");
                System.out.println(" Roach grunts");  
    }else{
                  System.out.println("Roach: Are you pissing me off?");
                System.out.println("");
                System.out.println(avatar.getName()+": It's your fault for not removing your trenchcoat and your holster's sigil");
                System.out.println("Roach: *pulled-off his pistol*");
                System.out.println("");
                System.out.println(avatar.getName()+": I won't do that if I were you");
                System.out.println("");
                System.out.println("Even before Roach can pull the trigger you somehow to move with your instincts.");
                System.out.println("");
                System.out.println("Roach was stunned by your fast combination");
                System.out.println("");
                System.out.println(avatar.getName()+": Woah! What the f was that!?");
                System.out.println("");
                System.out.println(" Roach grunts");
                System.out.println("");
            }
        System.out.println("As you passed the hallway you noticed that it's like you've been here before");
        System.out.println("");
        System.out.println("Suddenly a series of flashes has come before your eyes");
        System.out.println(avatar.getName()+": My head still hurt, I can't remember anything at all and how come I can do those things?");
        System.out.println("");
        System.out.println("The hallway seems aged  bit, walpapers were torn down, water spots can be seen dripping, series of paintings were crooked");
        System.out.println("It was look like an abandoned Mansion");
        System.out.println(avatar.getName()+"I should better be get going and find some answers");
        System.out.println("");
        
        
        
       do{
        System.out.println(" --------------------------------------------------");
        System.out.println("|                 CHAPTER 2                        |");
        System.out.println(" --------------------------------------------------");
        System.out.println("You've reached the kitchen");
        System.out.println("");
        System.out.println("What are your next step?");
        System.out.println("");
        System.out.println(" 1.Search the cabinet");
        System.out.println(" 2.Look on the suspicious letter kinfed at the top of the table");
        System.out.println(" 3. Go out the kitchen");
        choices = sc.nextInt();
        
       
        switch (choices){
            case 1: System.out.println("You found rotten canned goods");
                    System.out.println("");
                    System.out.println(avatar.getName()+": I guessed I spoiled my own appetite.");
                    System.out.println("");
                    System.out.println("What are you going to do next?");
                    System.out.println(" 1.Look on the suspicious letter kinfed at the top of the table");
                    System.out.println(" 2.Go out the kitchen");
                    Scanner sc1 = new Scanner(System.in);
                    choices = sc1.nextInt();
                    if (choices == 1){
                        System.out.println("You've come to the kinfed letter");
                        System.out.println("");
                        System.out.println("There you have read the letter with a symbol at the right corner similar to the deputy's sigil:");
                        System.out.println("March 20, 2012");
                        System.out.println("Project Behemoth");
                        System.out.println("        Exactly 14o'clock the project will be held, all of the investors are invited,");
                        System.out.println("even the heads are there to witness the final phase of the project. A project will be ");
                        System.out.println("the big leap for mankind. Specially to us. God bless mother Russia.");
                        System.out.println("As you read the bottom part you are shocked, seeing your own signature.");
                        System.out.println(avatar.getName()+": What how!? My mind is splitting in half!");
                        System.out.println("");
                        System.out.println("I better take this knife");
                        System.out.println("");
                        System.out.println("You stepped out the kitchen");
                        
                    }else{
                }
                    break;
            case 2: System.out.println("You've come to the kinfed letter");
                    System.out.println("");
                    System.out.println("There you have read the letter with a symbol at the right corner similar to the deputy's sigil:");
                    System.out.println("March 20, 2012");
                    System.out.println("Project Behemoth");
                    System.out.println("        Exactly 14o'clock the project will be held, all of the investors are invited,");
                    System.out.println("even the heads are there to witness the final phase of the project. A project will be ");
                    System.out.println("the big leap for mankind. Specially to us. God bless mother Russia.");
                    System.out.println("As you read the bottom part you are shocked, seeing your own signature.");
                    System.out.println(avatar.getName()+": What how!? My mind is splitting in half!");
                    System.out.println("");
                    System.out.println("I better take this knife");
                    System.out.println("");
                    System.out.println("You stepped out the kitchen");
                   
                    break;
            case 3:
                    System.out.println("You stepped out the kitchen");
                    System.out.println("");
                    System.out.println("There you see Roach spitting blood on the mat");
                    System.out.println("");
                    System.out.println("Roach: Hold it right there!");
                    System.out.println(avatar.getName()+": Then what? you're going to kill me?");
                    System.out.println("");
                    System.out.println("Roach: You know if you don't resist, this will be over quickly");
                    System.out.println("");
                    System.out.println(avatar.getName()+": Can you tell me what's happening? Why my signature is in this paper?");
                    System.out.println("                    Where am I? Why I even know you!?");
                    System.out.println("");
                    System.out.println("Roach: I am not supposed to tell you anything");
                    System.out.println("Roach: Just surrender cause this will not be over without one of us is not walking out here alive");
                    System.out.println("Suddenly you get that instinct from earlier and you feel your blood is flowing inside you");
                    System.out.println("");
                    System.out.println("Roach shoots at you");
                    System.out.println("You dodged away below the table");
                    System.out.println("");
                    System.out.println("Roach approaches your location");
                    System.out.println("");
                    System.out.println("He fires at you and heavily missed");
                    System.out.println("");
                    System.out.println("The gun clicks and it seems he is out of bullet");
                    System.out.println("");
                    System.out.println("You rushed at him but way before that");
                    System.out.println("");
                    System.out.println("He completed his reload and shoots you point blank");
                    System.out.println("Roach: Sorry Doc but you are a threat to us!");
                    System.out.println("Game over");
                    indicator = false;
                    break;
            default:
                    System.out.println("Wrong input");
                    indicator = false;
        }
        
        System.out.println("");
                    System.out.println("There you see Roach spitting blood on the mat");
                    System.out.println("");
                    System.out.println("Roach: Hold it right there!");
                    System.out.println(avatar.getName()+": Then what? you're going to kill me?");
                    System.out.println("");
                    System.out.println("Roach: You know if you don't resist, this will be over quickly");
                    System.out.println("");
                    System.out.println(avatar.getName()+": Can you tell me what's happening? Why my signature is in this paper?");
                    System.out.println("                    Where am I? Why I even know you!?");
                    System.out.println("");
                    System.out.println("Roach: I am not supposed to tell you anything");
                    System.out.println("Roach: Just surrender cause this will not be over without one of us is not walking out here alive");
                    System.out.println("Suddenly you get that instinct from earlier and you feel your blood is flowing inside you");
                    System.out.println("");
                    System.out.println("Roach shoots at you");
                    System.out.println("You dodged away below the table");
                    System.out.println("");
                    System.out.println("Roach approaches your location");
                    System.out.println("");
                    System.out.println("He fires at you and heavily missed");
                    System.out.println("");
                    System.out.println("The gun clicks and it seems he is out of bullet");
                    System.out.println("What will you do?");
                    System.out.println(" 1.Rush through him while he is reloading");
                    System.out.println(" 2.Use your knife");
                    choices = sc.nextInt();
                    
                    switch (choices){
                    case 1:
                       System.out.println("You rushed at him but way before that");
                       System.out.println("");
                       System.out.println("He completed his reload and shoots you point blank");
                       System.out.println("");
                       System.out.println("Roach: Sorry Doc but you are a threat to us!");
                       System.out.println("");
                       System.out.println("Game over");
                       indicator = false;
                       break;
                    case 2:
                        System.out.println("You watched him slowly");
                        System.out.println("");
                        System.out.println("You immediately throwed th knife on to his knee cap");
                        System.out.println("");
                        System.out.println("Roach screams in pain");
                        System.out.println("");
                        System.out.println("Roach: I'm gonna ki...");
                        System.out.println("");
                        System.out.println("You land a powerful blow on his stomach");
                        System.out.println("");
                        System.out.println("Roach is out cold");
                        System.out.println("");
                        System.out.println(avatar.getName()+": *vomits*");
                        System.out.println("");
                        System.out.println(avatar.getName()+": Maybe I should check this to see if I can find some clues");
                        System.out.println("");
                        indicator = true;
                        break;
                    default:
                        System.out.println("Wrong input");
                        indicator = false;
                    }
        
    }  while(indicator == false);
       
       do{
        System.out.println(" --------------------------------------------------");
        System.out.println("|                 CHAPTER 3                        |");
        System.out.println(" --------------------------------------------------");
        System.out.println("You searched his pocket");
        System.out.println("");
        System.out.println("You found his wallet");
        System.out.println("");
        System.out.println("There you get to see what kind of man he is");
        System.out.println("");
        System.out.println("He has the picture of his wife and daughter with the background of the Grand Canyon");
        System.out.println("");
        System.out.println("On the other side of the wallet there you saw a paper with blood stain");
        System.out.println("");
        System.out.println("You quickly opened it and you saw a lot of names, some with crosses some with not");
        System.out.println("");
        System.out.println("You even saw your name there which has a circle indicating that you are the next target");
        System.out.println(avatar.getName()+": I can assume that this guy is an undercover cop working as a hitman");
        System.out.println("");
        System.out.println("His phone rang");
        System.out.println("");
        System.out.println("You answered the phone..... ?: Is it done?");
        System.out.println("What will be your response?");
        System.out.println("1. Who are you?");
        System.out.println("2. ....");
        System.out.println("3. *swore*");
        choices = sc.nextInt();
        
        switch( choices ){
            case 1:
                 System.out.println(avatar.getName()+": Who are you?");
                 System.out.println("");
                 System.out.println("?: I guessed he failed");
                 System.out.println("");
                 System.out.println("The voice of the caller is masked as if it was like coming from a bot voice");
                 System.out.println(avatar.getName()+": I SAID WHO ARE YOU? WHY DID YOU SEND HIM TO ME?");
                 System.out.println("?: You will soon meet me, I'll be the one who will be coming for you "+avatar.getName());
                 System.out.println("");
                 System.out.println("The phone call ended... You obtained Roache's handgun and checked his pulse");
                 System.out.println("");
                 System.out.println("He is much pretty alive but out cold");
                 System.out.println("");
                 indicator = true;
                 break;
            case 2:
                System.out.println(avatar.getName()+": ....");
                System.out.println("");
                System.out.println("?: Hello are you there?");
                System.out.println("");
                System.out.println(avatar.getName()+": ....");
                System.out.println("");
                System.out.println("?: If you ever hearing this make sure you finished him off");
                System.out.println("");
                System.out.println("?: I don't want to have a problem with that person");
                System.out.println("");
                System.out.println("?: After you killed him make sure to finish the list");
                System.out.println("?: Next is will be his/her family");
                System.out.println("");
                System.out.println("The phone call ended... You obtained Roache's handgun and checked his pulse");
                System.out.println("");
                System.out.println("He is much pretty alive but out cold");
                System.out.println("");
                indicator = true;
                break;
            case 3:
                System.out.println(avatar.getName()+": WHO THE HELL ARE YOU?");
                System.out.println("");
                System.out.println("?: I guessed he failed");
                System.out.println("");
                System.out.println("?: I WILL BE COMING FOR YOU");
                System.out.println("?: You will soon meet me, I will be the one who will be coming for you "+avatar.getName());
                System.out.println("");
                System.out.println(avatar.getName()+": Oh you will be dead before that, fuck you!!!");
                System.out.println("");
                System.out.println("The phone call ended... You obtained Roache's handgun and checked his pulse");
                System.out.println("");
                System.out.println("He is much pretty alive but out cold");
                System.out.println("");
                indicator = true;
                break;
            default:
                System.out.println("Wrong input");
                indicator = false;
        }
       }while(indicator != true);
       
        System.out.println(avatar.getName()+": Who's that caller?");
        System.out.println("");
        System.out.println(avatar.getName()+": Maybe he has some connection to everything that is happening to me");
        System.out.println("");
        System.out.println(avatar.getName()+": I guessed I have to visit the people who might I know");
        System.out.println("");
        System.out.println(avatar.getName()+": I will start to my family.");
        System.out.println("");
        System.out.println("TO BE CONTINUED");
    }
}
       
  