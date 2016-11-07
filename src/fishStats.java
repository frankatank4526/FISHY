
public class fishStats {
	public int centerX = 100;
	public int centerY = 300;
	public int bodyLength = 118;
	public int bodyHeight = 74;
	public int bodyColor = color(162, 0, 255);

	//noStroke();
	//fill(bodyColor);
	// body
	public fishStats(int tailWidth, int tailHeight){
	 ellipse(centerX, centerY, bodyLength, bodyHeight);
	// tail
	tailWidth = bodyLength/4;
    tailHeight = bodyHeight/2;
	triangle(centerX-bodyLength/2, centerY,
	         centerX-bodyLength/2-tailWidth, centerY-tailHeight,
	         centerX-bodyLength/2-tailWidth, centerY+tailHeight);
	// eye
	//fill(25, 224, 78);
	ellipse(centerX+bodyLength/3, centerY, bodyHeight/4, bodyHeight/4);
	}
	

	private void triangle(int i, int centerY2, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		
	}


	private void ellipse(int centerX2, int centerY2, int bodyLength2, int bodyHeight2) {
		// TODO Auto-generated method stub
		
	}


	private int color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return 0;
	};
}
