package DXC;

public class FanProb {
	public static int SLOW=1;
	public static int MEDIUM=2;
	public static int FAST =3;
	
	private int speed=SLOW;
	private boolean on= false;
	private double radius=5;
	private String color="white";
	
	public FanProb() {
		
	}
	public void incSpeed() {
		if(speed==SLOW)
			speed=MEDIUM;
		else if(speed==MEDIUM)
			speed=FAST;
		else
			System.out.println("Fan is already running at highest speed");
		
	}
	public void decSpeed() {
		if(speed==FAST)
			speed=MEDIUM;
		else if(speed==MEDIUM)
			speed=SLOW;
		else
			System.out.println("Fan is already running at lowest speed");
}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	public String toString()
	{
		String result="speed"+ speed+ "\n" + "color" + color +"\n"+ "radius" +radius + "\n";
		if(isOn())
			result +="fan is on";
		else
			result+="fan is off";
		return result;
	}


		public static void main(String[]args)
		{
			FanProb fan1 =new FanProb();
			fan1.setSpeed(FanProb.FAST);;
			fan1.setRadius(15);
			fan1.setColor("Blue");
			fan1.turnOn();
			fan1.incSpeed();
			System.out.println(fan1.toString());
			
			FanProb fan2 =new FanProb();
			fan2.setSpeed(FanProb.MEDIUM);;
			fan2.setRadius(10);
			fan2.setColor("Orrange");
			fan2.turnOn();
			fan2.decSpeed();
			System.out.println(fan2.toString());
		}
		}