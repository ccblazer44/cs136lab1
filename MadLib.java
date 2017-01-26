import java.util.Scanner;

public class MadLib{
  String adj1;
  String adj2;
  String adj3;
  String noun1;
  String noun2;
  String noun3;
  String verb1;
  String verb2;
  String verb3;

  public void getWords(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Adjective: ");
    adj1 = reader.nextLine();
    System.out.println("Adjective: ");
    adj2 = reader.nextLine();
    System.out.println("Adjective: ");
    adj3 = reader.nextLine();

    System.out.println("Noun: ");
    noun1 = reader.nextLine();
    System.out.println("Noun: ");
    noun2 = reader.nextLine();
    System.out.println("Noun: ");
    noun3 = reader.nextLine();

    System.out.println("Verb: ");
    verb1 = reader.nextLine();
    System.out.println("Verb: ");
    verb2 = reader.nextLine();
    System.out.println("Verb: ");
    verb3 = reader.nextLine();
  }

  public void printMadLib(){
    System.out.println("Did you ever " + verb1 + " the " + noun1 + " of Darth Plagueis the " + adj1 + "? I thought not. It is not a " + noun2 + " the Jedi would tell you. It is a " + noun3 + " legend. Darth Plagueis was a " + adj2 + " Lord of the Sith, so " + adj3 +" and so wise he could " + verb2 + " the Force to influence the midichlorians to " + verb3 + " life... He had such a knowledge of the dark side that he could even keep the ones he cared about from dying.");
  }

  public void run(){
    getWords();
    printMadLib();
  }


  public static void main(String args[]){
    MadLib gogo = new MadLib();
    gogo.run();
  }

}
