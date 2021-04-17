package com.test;
import com.shape.*;

public class Ass6{
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.setLength(15);
		rec.setBreadth(10);
		rec.calArea();
		rec.calPer();
		Square sqr=new Square();
		sqr.setside(5);
		sqr.calArea();
		sqr.calPer();
	}

}
