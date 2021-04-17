package com.shape;

public class Square implements Polygon {
	float side;
	float n=4;


public  float getSide() {
	return side;
}
public void setside(float side) {
	this.side=side;
}
public void calArea()
{
	System.out.println("area is:"+(side*side));
}
public void calPer()
{
	System.out.println("perimeter is:"+(n*side));
}


}

	

