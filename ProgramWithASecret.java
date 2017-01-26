import java.util.Random;
import java.util.Scanner;

public class ProgramWithASecret {
    private int secret;
    private Random rand;

    public ProgramWithASecret(int secret) {
    	this.secret = secret;
    	rand = new Random();
    }

    public void interrogate() {
    	taunt();
    	char guess = nextGuess();
    	while(guess != 'q') {
    	    if(checkGuess(guess)) {
    		giveUp();
    		return;
    	    } else {
    		taunt();
    		guess = nextGuess();
    		secret = rand.nextInt(10);
    	    }
    	}
    	taunt();
    }

    public void taunt() {
    	String taunts[] = {"I've got a secret. Na-na!",
    			   "You're dumb, you'll never guess my secret!",
    			   "Tee-hee. I'll never tell you my secret!",
    			   "My secret is so cool, and you'll never know it!"};
    	System.out.println("\n" + taunts[rand.nextInt(4)]);
    }

    public char nextGuess() {
    	System.out.print("Guess: ");
    	Scanner scanner = new Scanner(System.in);
    	return (char) scanner.nextByte();
    }

    public boolean checkGuess(char guess) {
    	return secret == guess;
    }

    public void giveUp() {
	       System.out.println("Aw man, you guessed my secret. I guess I'll just die now...");
    }

    public static void main(String args[]) {
    	ProgramWithASecret pwas = new ProgramWithASecret(3);
    	pwas.interrogate();
    }
}
