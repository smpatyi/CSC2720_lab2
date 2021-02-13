#include <iostream>
using namespace std;
template<typename Base, typename T>
inline bool instanceof(const T*) {
   return is_base_of<Base, T>::value;
}

class Mammal {
    public: 
		Mammal *example;
	    virtual void speak() = 0;
	    virtual void eat() = 0;
	    virtual void sleep() = 0;
	    virtual void mate() = 0;
};

class UserInput {
    public: 
	    virtual void getUserInput() = 0;
};

class Canine: public Mammal {
    public:
        //Canine *example;
        void speak() {
		    cout << "I am a canine, howl!" << endl;
	    }

	    void eat(Mammal animal) {
		    if (instanceof<Canine>(example)) {
			    cout << this << " cannot eat " << example << endl;
		    }
		    else {
			    cout << this << " can and does eat " << example << endl;
		    }
	    }

	    void sleep() {
		    cout << "I am a canine, going to sleep, zzzz!" << endl;
	    }

	    void mate(Mammal animal) {
		    if (instanceof<Canine>(example)) {
			    cout << example << " is a mate of " << this << endl;
		    }
		    else {
			    cout << example << " is not a mate of " << this << endl;
		    }
	    }
};

class Bovine: public Mammal {
    public:
        //Bovine *example;
        void speak() {
		    cout << "I am a bovine, mooooo!" << endl;
	    }

	    void eat(Mammal animal) {
		    if (instanceof<Bovine>(example)) {
			    cout << this << " cannot eat " << example << endl;
		    }
		    else {
			    cout << this << " can and does eat " << example << endl;
		    }
	    }

	    void sleep() {
		    cout << "I am a bovine, going to sleep, zzzz!" << endl;
	    }

	    void mate(Mammal animal) {
		    if (instanceof<Bovine>(example)) {
			    cout << example << " is a mate of " << this << endl;
		    }
		    else {
			    cout << example << " is not a mate of " << this << endl;
		    }
	    }
};

class Feline: public Mammal {
    public:
        //Feline *example;
        void speak() {
		    cout << "I am a feline, purrr!" << endl;
	    }

	    void eat(Mammal animal) {
		    if (instanceof<Feline>(example)) {
			    cout << this << " cannot eat " << example << endl;
		    }
		    else {
			    cout << this << " can and does eat " << example << endl;
		    }
	    }

	    void sleep() {
		    cout << "I am a feline, going to sleep, zzzz!" << endl;
	    }

	    void mate(Mammal animal) {
		    if (instanceof<Feline>(example)) {
			    cout << example << " is a mate of " << this << endl;
		    }
		    else {
			    cout << example << " is not a mate of " << this << endl;
		    }
	    }
};

class Tiger: public Feline {
	public:
		void speak() {
			cout << "I am a tiger, chuff." << endl;
			//Feline::speak();
		}
		string toString() {
			return "Tiger";
		}

};

class Lion: public Feline {
	public:
		void speak() {
			cout << "I am a lion, roar." << endl;
			//Feline::speak();
		}
		string toString() {
			return "Lion";
		}
};

class Bull: public Bovine {
	public:
		void speak() {
			cout << "I am a bull, bellow." << endl;
			//Bovine::speak();
		}
		string toString() {
			return "Bull";
		}
};

class Wolf: public Canine {
	public:
		void speak() {
			cout << "I am a wolf, awoooo." << endl;
			//Canine::speak();
		}
		string toString() {
			return "Wolf";
		}
};

class objectInput: public UserInput {
	public:
		void getUserInput() {
			
			cout <<"Enter an integer from 1 to 4 for the type of animal: tiger(1), lion(2), bull(3) or wolf(4)."<< endl;
			cout <<"Also enter an intger 5 to 8 for the type of action: speak(5), eat(6), sleep(7), mate(8)."<< endl;
			cout <<"If you entered 6 or 8 for the action number, i.e., eat or mate, pick another number 1 to 4 for the animal to eat or mate."<< endl;
			cout <<"If you picked 5 or 7 as the action, i.e., speak or sleep, then enter 9999 for the speak or sleep action to run."<< endl;
			int animal, action, actionPartner;
			
			cin >> animal, action, actionPartner;

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

int Main () {
	objectInput select = new objectInput();
	select.getUserInput();
    
}