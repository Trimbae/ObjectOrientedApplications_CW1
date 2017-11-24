import java.io.*;
import java.util.*;


public interface GameInterface{

	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static RandomInterface r=new LinearCongruentialGenerator();

	public void playGame() throws Exception;
	
	public void initialiseGame() throws Exception;

	public void mainGame() throws Exception;

	public void declareWinner() throws Exception;
}