/*
Sara Patyi
Lab 2 2720
*/

/*
Comments on the code below:
I believe doing the long string of if, else if, loops is highly inefficient,
as it needs to address every single possible combination of inputs.
However, I did it that way since the instructions said that we had to create 
a separate user interface for the inputs from the classes that used the Mammal
interface, so I couldn't combine the definitions for the methods from the Mammal
interface with the possible user inputs to create a more efficient program.
However, it does address the problem that it was created to address.
*/


import java.util.Scanner;

//Mammal interface for the speak, eat, sleep, mate methods
interface Mammal {
	public void speak();
	public void eat(Mammal example);
	public void sleep();
	public void mate(Mammal example);
}

//user interface to allow users to create an animal and give it an action
interface UserInput {
	public void getUserInput();
}


//canine class to house the different actions that a canine can do
class Canine implements Mammal {
	public void speak() {
		System.out.println("I am a canine, howl!");
	}

	public void eat(Mammal example) {
		if (example instanceof Canine) {
			System.out.println(this + " cannot eat " + example);
		}
		else {
			System.out.println(this + " can and does eat " + example);
		}
	}

	public void sleep() {
		System.out.println("I am a canine, going to sleep, zzzz!");
	}

	public void mate(Mammal example) {
		if (example instanceof Canine) {
			System.out.println(example + " is a mate of " + this);
		}
		else {
			System.out.println(example + " is not a mate of " + this);
		}
	}

}

//bovine class to house the different actions that a bovine can do
class Bovine implements Mammal {
	public void speak() {
		System.out.println("I am a bovine, moooooo!");
	}

	public void eat(Mammal example) {
		if (example instanceof Bovine) {
			System.out.println(this + " cannot eat " + example);
		}
		else {
			System.out.println(this + " can and does eat " + example);
		}
	}

	public void sleep() {
		System.out.println("I am a bovine, going to sleep, zzzz!");
	}

	public void mate(Mammal example) {
		if (example instanceof Bovine) {
			System.out.println(example + " is a mate of " + this);
		}
		else {
			System.out.println(example + " is not a mate of " + this);
		}
	}

}

//feline class to house the different actions that a feline can do
class Feline implements Mammal {
	public void speak() {
		System.out.println("I am a feline, purrrr!");
	}

	public void eat(Mammal example) {
		if (example instanceof Feline) {
			System.out.println(this + " cannot eat " + example);
		}
		else {
			System.out.println(this + " can and does eat " + example);
		}
	}

	public void sleep() {
		System.out.println("I am a feline, going to sleep, zzzz!");
	}

	public void mate(Mammal example) {
		if (example instanceof Feline) {
			System.out.println(example + " is a mate of " + this);
		}
		else {
			System.out.println(example + " is not a mate of " + this);
		}
	}

}

//tiger class to house the actions that make a tiger different from a feline
class Tiger extends Feline {
	public void speak() {
		System.out.println("I am a tiger, chuff.");
		super.speak();
	}
	public String toString() {
		return "Tiger";
	}
}

//lion class to house the actions that make a lion different from a feline
class Lion extends Feline {
	public void speak() {
		System.out.println("I am a lion, roar.");
		super.speak();
	}
	public String toString() {
		return "Lion";
	}
}

//bull class to house the actions that make a bull different from a bovine
class Bull extends Bovine {
	public void speak() {
		System.out.println("I am a bull, bellow.");
		super.speak();
	}
	public String toString() {
		return "Bull";
	}
}

//wolf class to house the actions that make a wolf different from a canine
class Wolf extends Canine {
	public void speak() {
		System.out.println("I am a wolf, awoooo.");
		super.speak();
	}
	public String toString() {
		return "Wolf";
	}
}

//user input class that uses the user input interface to create animal objects and to give them actions
//most inefficient section of the code
//outlines every single combination of inputs possible
class objectInput implements UserInput {
	public void getUserInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer from 1 to 4 for the type of animal: tiger(1), lion(2), bull(3) or wolf(4).");
		System.out.println("Also enter an intger 5 to 8 for the type of action: speak(5), eat(6), sleep(7), mate(8).");
		System.out.println("If you entered 6 or 8 for the action number, i.e., eat or mate, pick another number 1 to 4 for the animal to eat or mate.");
		System.out.println("If you picked 5 or 7 as the action, i.e., speak or sleep, then enter 9999 for the speak or sleep action to run.");
		int animal = input.nextInt();
		int action = input.nextInt();
		int actionPartner = input.nextInt();

		if (actionPartner == 9999) {
			if (animal == 1 && action == 5){
				Tiger T1 = new Tiger();
				T1.speak();
			}
			else if (animal == 1 && action == 7) {
				Tiger T1 = new Tiger();
				T1.sleep();
			}
			else if (animal == 2 && action == 5) {
				Lion L1 = new Lion();
				L1.speak();
			}
			else if (animal == 2 && action == 7) {
				Lion L1 = new Lion();
				L1.sleep();
			}
			else if (animal == 3 && action == 5) {
				Bull B1 = new Bull();
				B1.speak();
			}
			else if (animal == 3 && action == 7) {
				Bull B1 = new Bull();
				B1.sleep();
			}
			else if (animal == 4 && action == 5) {
				Wolf W1 = new Wolf();
				W1.speak();
			}
			else if (animal == 4 && action == 7) {
				Wolf W1 = new Wolf();
				W1.sleep();
			}
		}
		else {
			
			if (animal == 1 && action == 6 && actionPartner == 1) {
				Tiger T1 = new Tiger();
				Tiger T2 = new Tiger();
				T1.eat(T2);
			}
			else if (animal == 1 && action == 6 && actionPartner == 2) {
				Tiger T1 = new Tiger();
				Lion L1 = new Lion();
				T1.eat(L1);
			}
			else if (animal == 1 && action == 6 && actionPartner == 3) {
				Tiger T1 = new Tiger();
				Bull B1 = new Bull();
				T1.eat(B1);
			}
			else if (animal == 1 && action == 6 && actionPartner == 4) {
				Tiger T1 = new Tiger();
				Wolf W1 = new Wolf();
				T1.eat(W1);
			}
			else if (animal == 1 && action == 8 && actionPartner == 1) {
				Tiger T1 = new Tiger();
				Tiger T2 = new Tiger();
				T1.mate(T2);
			}
			else if (animal == 1 && action == 8 && actionPartner == 2) {
				Tiger T1 = new Tiger();
				Lion L1 = new Lion();
				T1.mate(L1);
			}
			else if (animal == 1 && action == 8 && actionPartner == 3) {
				Tiger T1 = new Tiger();
				Bull B1 = new Bull();
				T1.mate(B1);
			}
			else if (animal == 1 && action == 8 && actionPartner == 4) {
				Tiger T1 = new Tiger();
				Wolf W1 = new Wolf();
				T1.mate(W1);
			}
			else if (animal == 2 && action == 6 && actionPartner == 1) {
				Lion L1 = new Lion();
				Tiger T1 = new Tiger();
				L1.eat(T1);
			}
			else if (animal == 2 && action == 6 && actionPartner == 2) {
				Lion L1 = new Lion();
				Lion L2 = new Lion();
				L1.eat(L2);
			}
			else if (animal == 2 && action == 6 && actionPartner == 3) {
				Lion L1 = new Lion();
				Bull B1 = new Bull();
				L1.eat(B1);
			}
			else if (animal == 2 && action == 6 && actionPartner == 4) {
				Lion L1 = new Lion();
				Wolf W1 = new Wolf();
				L1.eat(W1);
			}
			else if (animal == 2 && action == 8 && actionPartner == 1) {
				Lion L1 = new Lion();
				Tiger T1 = new Tiger();
				L1.mate(T1);
			}
			else if (animal == 2 && action == 8 && actionPartner == 2) {
				Lion L1 = new Lion();
				Lion L2 = new Lion();
				L1.mate(L2);
			}
			else if (animal == 2 && action == 8 && actionPartner == 3) {
				Lion L1 = new Lion();
				Bull B1 = new Bull();
				L1.mate(B1);
			}
			else if (animal == 2 && action == 8 && actionPartner == 4) {
				Lion L1 = new Lion();
				Wolf W1 = new Wolf();
				L1.mate(W1);
			}
			else if (animal == 3 && action == 6 && actionPartner == 1) {
				Bull B1 = new Bull();
				Tiger T1 = new Tiger();
				B1.eat(T1);
			}
			else if (animal == 3 && action == 6 && actionPartner == 2) {
				Bull B1 = new Bull();
				Lion L1 = new Lion();
				B1.eat(L1);
			}
			else if (animal == 3 && action == 6 && actionPartner == 3) {
				Bull B1 = new Bull();
				Bull B2 = new Bull();
				B1.eat(B2);
			}
			else if (animal == 3 && action == 6 && actionPartner == 4) {
				Bull B1 = new Bull();
				Wolf W1 = new Wolf();
				B1.eat(W1);
			}
			else if (animal == 3 && action == 8 && actionPartner == 1) {
				Bull B1 = new Bull();
				Tiger T1 = new Tiger();
				B1.mate(T1);
			}
			else if (animal == 3 && action == 8 && actionPartner == 2) {
				Bull B1 = new Bull();
				Lion L1 = new Lion();
				B1.mate(L1);
			}
			else if (animal == 3 && action == 8 && actionPartner == 3) {
				Bull B1 = new Bull();
				Bull B2 = new Bull();
				B1.mate(B2);
			}
			else if (animal == 3 && action == 8 && actionPartner == 4) {
				Bull B1 = new Bull();
				Wolf W1 = new Wolf();
				B1.mate(W1);
			}
			else if (animal == 4 && action == 6 && actionPartner == 1) {
				Wolf W1 = new Wolf();
				Tiger T1 = new Tiger();
				W1.eat(T1);
			}
			else if (animal == 4 && action == 6 && actionPartner == 2) {
				Wolf W1 = new Wolf();
				Lion L1 = new Lion();
				W1.eat(L1);
			}
			else if (animal == 4 && action == 6 && actionPartner == 3) {
				Wolf W1 = new Wolf();
				Bull B1 = new Bull();
				W1.eat(B1);
			}
			else if (animal == 4 && action == 6 && actionPartner == 4) {
				Wolf W1 = new Wolf();
				Wolf W2 = new Wolf();
				W1.eat(W2);
			}
			else if (animal == 4 && action == 8 && actionPartner == 1) {
				Wolf W1 = new Wolf();
				Tiger T1 = new Tiger();
				W1.mate(T1);
			}
			else if (animal == 4 && action == 8 && actionPartner == 2) {
				Wolf W1 = new Wolf();
				Lion L1 = new Lion();
				W1.mate(L1);
			}
			else if (animal == 4 && action == 8 && actionPartner == 3) {
				Wolf W1 = new Wolf();
				Bull B1 = new Bull();
				W1.mate(B1);
			}
			else if (animal == 4 && action == 8 && actionPartner == 4) {
				Wolf W1 = new Wolf();
				Wolf W2 = new Wolf();
				W1.mate(W2);
			}
			
		}

		
	}
}

//main class that runs the program
class Main {
	
	public static void main(String[] args) {
		objectInput select = new objectInput();
		select.getUserInput();
	}
}