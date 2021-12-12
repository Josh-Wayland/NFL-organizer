/**COSC 210-002 Assignment 6
 * Prog6.java
 * 
 * This program reads information in
 * a file and diplays that information
 * 
 * @author Josh Wayland
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class Prog6 {
	public static void main(String[] args)
	{
		String first = null;
		String last = null;
		String team = null;
		String position = null;
		int completions = 0;
		int attempts = 0;
		double yards = 0;
		int receptions = 0;
		Scanner inFile = null;
		int count = 0;
		Player[] players = new Player[20];
		
		try
		{
			inFile = new Scanner( new File( "nfl.txt."));
		}
		catch( FileNotFoundException e )
		{
			System.err.println( "Error : nfl file not found");
			System.exit(1);
		}
		// read file
		while ( inFile.hasNext() )
		{
			try
			{
				first = inFile.next();
				last = inFile.next();
				team = inFile.next();
				position = inFile.next();
				if(position.equals( "QB" )) 
				{
					completions = inFile.nextInt();
					attempts = inFile.nextInt();
					yards = inFile.nextDouble();
					Quarterback qb = new Quarterback(first, last, team,
							position, completions, attempts, yards);
					players[count] = qb;
				}
				else if( position.equals( "WR" ) )
				{
					receptions = inFile.nextInt();
					yards = inFile.nextDouble();
					Receiver wr = new Receiver(first, last, team
							, position, receptions, yards);
					players[count] = wr;
				}
			}
			catch( InputMismatchException e )
			{
				System.err.println( "File format error");
				System.exit(1);
			}
			count++;
		}
		System.out.println("NFL 2017 Player Passing/Receiving"
				+ " Statistics");
		System.out.println("Quarterbacks\n");
		System.out.println("Player                     Team    Comp"
				+ " Att   Pct   Yds   Yds/A    Yds/G");
		Arrays.sort(players);
		for(int i = 0; i < players.length; i++)
		{
			if(players[i] instanceof Quarterback)
			{
				System.out.printf("%-15s, %-10s  %-5s  %d  %d  %.1f  %.0f   %.2f    %.2f\n" ,
						players[i].getLast(), players[i].getFirst(),
						players[i].getTeam(), players[i].getCompletions(),
						players[i].getAttempts(),
						((Quarterback)players[i]).percent(),
						players[i].getYards(),
						((Quarterback)players[i]).yardsPerAttempt()
						,((Quarterback)players[i]).yardsPerGame());
			}
		}
		System.out.println("\nWide Receivers");
		System.out.println("\nPlayer                     Team  Rec"
				+ "     Yds   Avg   Yds/G");
		for(int i = 0; i < players.length; i++)
		{
			if(players[i] instanceof Receiver)
			{
				System.out.printf("%-15s, %-10s %-5s %d   %.0f  %.1f  %.1f\n"
						,players[i].getLast(), players[i].getFirst()
						,players[i].getTeam(),
						((Receiver)players[i]).getReceptions()
						,players[i].getYards(),
						((Receiver)players[i]).yardsPerReception()
						,((Receiver)players[i]).yardsPerGame());
			}
		}
	}
}
