package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		
		DrawingModel model = new DrawingModel();
		
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.BLACK);
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		//Testiranje komande dodavanja
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		
		addPointCmd.execute(); 
		System.out.println(model.getShapes().size()); // --> 1
		
		addPointCmd.unexecute();
		System.out.println(model.getShapes().size()); // --> 0
		
		addPointCmd.execute(); 
		System.out.println(model.getShapes().size()); // --> 1
		
		// Testiranje uklanjanja tačke
		RemovePointCmd removePointCmd = new RemovePointCmd(p1, model);
		
		removePointCmd.execute(); 
		System.out.println(model.getShapes().size()); // --> 0
		
		removePointCmd.unexecute(); 
		System.out.println(model.getShapes().size()); // --> 1
		
		
		// Testiranje modifikacije tačke
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		
		updatePointCmd.execute();
		System.out.println(p1);
		//p1 = p2;
		updatePointCmd.unexecute();
		System.out.println(p1);
		
		
		// Testiranje dodavanja i brisanje linije
		Line l1 = new Line(p1, p2, Color.BLACK);
		Line l2 = new Line(p3, p4, Color.BLACK);
		
		AddLineCmd addLineCmd = new AddLineCmd(l1, model);
		RemoveLineCmd removeLineCmd = new RemoveLineCmd(l1, model);
		
		addLineCmd.execute();
		System.out.println(model.getShapes().size()); // --> 2
		
		removeLineCmd.execute();
		System.out.println(model.getShapes().size()); // --> 1
	
		removeLineCmd.unexecute();
		System.out.println(model.getShapes().size()); // --> 2
		
		addLineCmd.unexecute();
		System.out.println(model.getShapes().size()); // --> 1
		
		
		// Testiranja modifikacije linije
		UpdateLineCmd updateLineCmd = new UpdateLineCmd(l1, l2);

		System.out.println(l1); // ---> 10, 10 | 20, 20
		updateLineCmd.execute();
		System.out.println(l1); // ---> 30, 30 | 40, 40
		
		p3.setX(100);
		System.out.println(l1); // ---> 30, 30 | 40, 40 ; a ne 100, 30 | 40, 40
		

	}

}
