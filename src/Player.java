/**COSC 210-002 Assignment 5
 * Prog5.java
 * 
 * This program creates a constructor Player
 * that sorts the information in the nfl.txt
 * 
 * @author Josh Wayland
 *
 */
import java.util.*;
public class Player implements Comparable<Player>
{
	String first;
	String last;
	String team;
	String position;
	int completions;
	int attempts;
	int yards;
	int receptions;
	public Player(String first, String last, String team, 
			String position, int receptions, int yards)
	{
		super();
		this.first = first;
		this.last = last;
		this.team = team;
		this.position = position;
		this.receptions = receptions;
		this.yards = yards;
	}
	public Player(String first, String last, String team, 
			String position, int completions, int attempts, int yards)
	{
		super();
		this.first = first;
		this.last = last;
		this.team = team;
		this.position = position;
		this.completions = completions;
		this.attempts = attempts;
		this.yards = yards;
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public String getTeam() {
		return team;
	}
	public String getPosition() {
		return position;
	}
	public int getCompletions() {
		return completions;
	}
	public int getAttempts() {
		return attempts;
	}
	public int getYards() {
		return yards;
	}
	public int getReceptions() {
		return receptions;
	}
	public int compareTo(Player plays)
	{
		return this.last.compareTo(plays.getLast());
	}
}
