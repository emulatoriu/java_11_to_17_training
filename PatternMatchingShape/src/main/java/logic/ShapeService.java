package logic;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class ShapeService {
	public String getShapeAnalysis(Shape shape) {
		/*if(shape instanceof Circle circle) {
			//Circle circle = (Circle) shape;
			return "This shape is a circle with radius %f".formatted(circle.length());
		}
		if(shape instanceof Rectangle rectangle) {
			//Rectangle rectangle = (Rectangle) shape;
			return "This shape is a rectangle with length %f and width %f"
					.formatted(rectangle.length(), rectangle.width());
		}
		if(shape instanceof Triangle triangle) {
			//Triangle triangle = (Triangle) shape;
			return "This shape is a triangle with length %f and width %f"
					.formatted(triangle.length(), triangle.height());
		}
		return "Unknown shape";*/
		return switch(shape) {
			case Circle circle -> "This shape is a circle with radius %f".formatted(circle.length());
			case Rectangle rectangle -> "This shape is a rectangle with length %f and width %f"
			.formatted(rectangle.length(), rectangle.width());
			case Triangle triangle -> "This shape is a triangle with length %f and width %f"
			.formatted(triangle.length(), triangle.height());
			default -> "Unknown shape";
		};		
	}
}
