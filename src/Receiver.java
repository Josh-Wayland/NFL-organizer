/**COSC 210-002 Assignment 6
 * Receiver.java
 * 
 * This program creates a constructor
 * Receiver that extends Player
 * 
 * @author Josh Wayland
 *
 */
import java.util.*;
public class Receiver extends Player
{

	public Receiver(String first, String last, String team, String position
			, int receptions, double yards) 
	{
		super(first, last, team, position, receptions, yards);
		this.first = first;
		this.last = last;
		this.team = team;
		this.position = position;
		this.receptions = receptions;
		this.yards = yards;
	}
	public double yardsPerReception()
	{
		return ((double)yards/receptions);
	}
	public double yardsPerGame()
	{
		return yards/16;
	}

}
