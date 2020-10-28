

//Sneha Simkhada    w0712680 10/14/2020

/*Assignment 4
 * ROCK PAPER SCISSORS LIZARD AND SPOCK!!!
 * ENTER YOUR GESTURE(1- Rock, 2-Paper, 3- Scissors, 4-LIZARD, 5-SPOCK)
 Scissors cuts paper
Paper covers rock
Rock crushes lizard
Lizard poisons Spock
Spock smashes scissors
Scissors decapitates lizard
Lizard eats paper
Paper disproves Spock
Spock vaporizes rock
Rock crushes scissors
 * You WIN */



// working on a development branch 

import java.util.Scanner;
public class RPSLSgame {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int gesture=-1;
		int ComputerWins = 0 ;
		int YourWins = 0 ;
		int Draw = 0 ;
		int Game = 0;
		

		while( gesture!= 0) {

			System.out.println("ROCK PAPER SCISSORS LIZARD SPOCK");

			System.out.println("ENTER YOUR GESTURE(1- Rock, 2-Paper, 3- Scissors, 4-LIZARD, 5-SPOCK, 0-Exit) :");
			gesture = input.nextInt();
			// if gesture is equal to 1 then do this
			if (gesture == 1) {
				System.out.println("You have selected Rock");
				Game++;
			}
			else
				if (gesture == 2) {
					System.out.println("You have selected Paper");
					Game++;
				}
				else
					if (gesture==3) {
						System.out.println("You have selected Scissors");
						Game++;
						}
			
					else
						if (gesture == 4) {
							System.out.println("You have selected LIZARD");
							Game++;
							}
						else
							if (gesture == 5) {
								System.out.println("You have selected SPOCK");
								Game++;
								}
					else 
						if (gesture ==0) {
						System.out.println("Game over.");
						break;

					}
						
					else {
						System.out.println("You messed up");
						System.exit(0);
					}

			int botChoice =(int)(Math.random() *5) +1;
			if (botChoice == 1) {
				System.out.println("Computer have selected Rock");
			}
			else
				if (botChoice == 2) {
					System.out.println("Computer have selected Paper");
				}
				else
					if (botChoice == 3) {
						System.out.println ("Computer have selected Scissors") ;
					}
				else
				   if (botChoice == 4) {
					System.out.println("Computer have selected Lizard ");
				}
				   else
					   if (botChoice == 5) {
						System.out.println("Computer have selected Spock ");
					}
					   else
						System.out.println("That was never an option. ");
			
			
			//The game.
			
		    //Rock
			if ( gesture== 1 && botChoice == 2 ) {
				System.out.println("Paper covers Rock");
				System.out.println("Computer Wins");
				ComputerWins++;
			}

			else if ( gesture== 1 && botChoice == 3 ) {
				System.out.println("Rock smashes Scissors");
				System.out.println("You Win");
				YourWins++;
			}

			else if ( gesture== 1 && botChoice == 1 ) {
				System.out.println("Rock and Rock ");
				System.out.println("It's a draw.");
				Draw++;
			}
			 else if ( gesture== 1 && botChoice == 4 ) {
					System.out.println("Rock crushes lizard");
					System.out.println("You win.");
					YourWins++;
					}
				    else if ( gesture== 1 && botChoice == 5 ) {
						System.out.println("Spock vaporizes rock");
						System.out.println("Computer Wins");
						ComputerWins++;
					}
					
			
			
			//Paper
			
			else if ( gesture== 2 && botChoice == 1 ) {
				System.out.println("Paper covers Rock");
				System.out.println("You Win");
				YourWins++;
			}

			else if ( gesture== 2 && botChoice == 3 ) {
				System.out.println("Scissors cut paper");
				System.out.println("Computer Wins");
				ComputerWins++;
			}
			else if ( gesture== 2 && botChoice == 2 ) {
				System.out.println("Paper and Paper ");
				System.out.println("It's a draw.");
				Draw++;
			}
		 
		    else if ( gesture== 2 && botChoice == 5 ) {
			System.out.println("Paper disproves Spock");
			System.out.println("You win.");
			YourWins++;
			}
		    else if ( gesture== 2 && botChoice == 4 ) {
				System.out.println("Lizard eats paper");
				System.out.println("Computer Wins");
				ComputerWins++;
			}
			
			
			//Scissors
			else if ( gesture== 3 && botChoice == 1 ) {
				System.out.println("Rock crushes scissors");
				System.out.println("Computer Wins");
				ComputerWins++;
			}

			else if ( gesture== 3 && botChoice == 4 ) {
				System.out.println(" Scissors decapitates lizard ");
				System.out.println("You Win.");
				YourWins++;
			}
			else if ( gesture== 3 && botChoice == 2 ) {
				System.out.println("Scissors cuts paper ");
				System.out.println("You win.");
				YourWins++;
		    }
			else if ( gesture== 3 && botChoice == 5 ) {
				System.out.println("Spock smashes scissors");
				System.out.println("Computer wins.");
				ComputerWins++;
				}
			else if ( gesture== 3 && botChoice == 4 ) {
				System.out.println(" Scissors and Scissors ");
				System.out.println("It's a Draw.");
				Draw++;
			}
			
			
			//Lizard
				else if ( gesture== 4 && botChoice == 1 ) {
					System.out.println("Rock crushes lizard");
					System.out.println("Computer Wins");
					ComputerWins++;
				}

				else if ( gesture== 4 && botChoice == 3 ) {
					System.out.println(" Scissors decapitates lizard ");
					System.out.println("Computer Wins.");
					ComputerWins++;
				}
				else if ( gesture== 4 && botChoice == 2 ) {
					System.out.println("Lizard eats paper ");
					System.out.println("You win.");
					YourWins++;
			    }
				else if ( gesture== 4 && botChoice == 5 ) {
					System.out.println("Lizard poisons Spock");
					System.out.println("Computer wins.");
					ComputerWins++;
					}
				else if ( gesture== 4 && botChoice == 4 ) {
					System.out.println(" Lizard and Lizard ");
					System.out.println("It's a Draw.");
					Draw++;
				}
			
			//Spock
				else if ( gesture== 5 && botChoice == 1 ) {
					System.out.println("Spock vaporizes rock.");
					System.out.println("You Win");
					YourWins++;
				}

				else if ( gesture== 5 && botChoice == 3 ) {
					System.out.println(" Spock smashes scissors ");
					System.out.println(" You Win.");
					YourWins++;
				}
				else if ( gesture== 5 && botChoice == 2 ) {
					System.out.println("Paper disproves Spock. ");
					System.out.println("Computer wins.");
					ComputerWins++;
			    }
				else if ( gesture== 5 && botChoice == 4) {
					System.out.println("Lizard poisons Spock");
					System.out.println(" Computer wins.");
					ComputerWins++;
					}
				else if ( gesture== 5 && botChoice == 5 ) {
					System.out.println(" Spock and Spock ");
					System.out.println("It's a Draw.");
					Draw++;
				}
			}
		System.out.println("Game Summary ");
		System.out.println("You played " + Game + " games.");
		System.out.println("You lost " + ComputerWins + " games.");
		System.out.println("Your won " + YourWins + " games.");
		System.out.println("Total Draws: " + Draw);
    }

}
