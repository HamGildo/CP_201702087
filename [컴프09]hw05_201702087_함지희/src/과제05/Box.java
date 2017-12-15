package 과제05;

public class Box {
	private double width = 0, length = 0, height = 0;

	public double getWidth() { return width ;}
    public void setWidth(double w) { width = w ;}
    public double getLength() { return length ;}
    public void setLength(double l) { length = l ;}
    public double getHeight() { return height ;}
    public void setHeight(double h) { height = h ;}
    
    public int getVolume() {
		int volume;
		volume = (int) (getWidth() * getLength() * getHeight());
		return volume;
	}

	public void print() {
		System.out.println("상자의 가로 : " + getWidth());
		System.out.println("상자의 세로 : " + getLength());
		System.out.println("상자의 높이 : " + getHeight());
		System.out.println("상자의 부피 : " + getVolume());
	}

}
