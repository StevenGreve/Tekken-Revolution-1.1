import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound 
{
	Clip clip;
	
	public void setURL(URL soundFileName) 
	{
		try 
		{
			AudioInputStream sound = AudioSystem.getAudioInputStream(soundFileName);
			clip = AudioSystem.getClip();
			clip.open(sound);
		}
		catch(Exception e) 
		{
			
		}
	}
	
	public void play() 
	{
		clip.setFramePosition(0);
		clip.start();
	}
}