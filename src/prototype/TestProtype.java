package prototype;

import java.awt.Color;

import mvc.Point;

public class TestProtype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		// Testiranje shallow copy načine izrade prototipa
		LineShallow l1 = new LineShallow(p1, p2, Color.BLACK);
		LineShallow l2 = l1.clone();
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.getStartPoint().setX(500);
		System.out.println(l1); // ---> 500, 10
		System.out.println(l2); // ---> 500, 10
		System.out.println("--------");
		
		
		// Testiranje deep copy načina izrade prototipa
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		LineDeep l3 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep l4 = l3.clone();
		
		l3.getStartPoint().setX(8000);
		
		System.out.println(l3); //---> 8000, 30
		System.out.println(l4); //---> 30, 30

	}

}
