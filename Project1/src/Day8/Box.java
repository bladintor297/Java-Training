package Day8;

public class Box {
	double width, height, depth;
	
	Box (double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	Box(){
		width = height = depth = 0;
	}
	
	Box(double len){
		width = height = depth = len;
	}
	
	double volume() {
		return width*height*height;
	}

}
