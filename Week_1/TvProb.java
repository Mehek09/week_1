package DXC;


import java.util.Scanner;
public class TvProb {

		    int channel, volumeLevel;
		    boolean on;

		    public TvProb(int channel, int volumeLevel, boolean on)
		    {
		        this.channel=channel;
		        this.volumeLevel=volumeLevel;
		        this.on=on;
		    }

		    public void turnOn()
		    {
		        this.on=true;
		        System.out.println(true);
		    }
		    public void turnOff()
		    {
		        this.on=false;
		        System.out.println(false);
		    }
		    public void setChannel(int newChannel)
		    {
		        this.channel=newChannel;
		    }
		    public void setVolume(int newVolumeLevel)
		    {
		        this.volumeLevel=newVolumeLevel;
		    }
		    public void channelUp()
		    {
		        this.channel+=1;
		        System.out.println(this.channel);
		    }
		    public void channelDown()
		    {
		        this.channel-=1;
		        System.out.println(this.channel);
		    }
		    public void volumeUp()
		    {
		        this.volumeLevel+=1;
		        System.out.println(this.volumeLevel);
		    }
		    public void volumeDown()
		    {
		        this.volumeLevel-=1;
		        System.out.println(this.volumeLevel);
		    }
		    public static void main(String args[])
		    {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter true or false for on and off value: ");
		        boolean on = sc.nextBoolean();
		        System.out.println("Enter channel number");
		        int channel = sc.nextInt();
		        System.out.println("Enter volume");
		        int volume = sc.nextInt();
		        
		        TvProb t1 = new TvProb(channel, volume, on);
		        System.out.println(on);
		        System.out.println(channel);
		        System.out.println(volume);
		       
		    }
		
	}