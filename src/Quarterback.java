/**COSC 210-002 Assignment 6
 * Quarterback.java
 * 
 * This program creates a constructor
 * for quarterback that extends Player
 * 
 * @author Josh Wayland
 *
 */
import java.util.*;
public class Quarterback extends Player
{

	public Quarterback(String first, String last, String team, String position,
			int completions, int attempts, int yards) 
	{
		super(first, last, team, position, completions
				, attempts, yards);
		this.first = first;
		this.last = last;
		this.team = team;
		this.position = position;
		this.completions = completions;
		this.attempts = attempts;
		this.yards = yards;
	}
	public double percent()
	{
		return ((double)completions/attempts)*100;
	}
	public double yardsPerAttempt()
	{
		return ((double)yards/attempts);
	}
	public double yardsPerGame()
	{
		return ((double)yards / 16.0);
	}

}
