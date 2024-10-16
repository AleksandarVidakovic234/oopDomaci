package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int width;
	private int length;
	private boolean selected;
	
	public Rectangle() {
	}

	public Rectangle(Point upperLeftPoint, int width, int length, boolean selected) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.length = length;
		this.selected = selected;
	}

	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double area() {
		return width * length;
	}
	public double circumference() {
		return 2 * width + 2 * length;
	}
}
