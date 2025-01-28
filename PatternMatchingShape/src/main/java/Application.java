import logic.ShapeService;
import shape.Shape;
import shape.Triangle;

public class Application {

	public static void main(String[] args) {
		ShapeService shapeService = new ShapeService();
		Shape circle = new Triangle(15, 35);
		String result = shapeService.getShapeAnalysis(circle);
		System.out.println(result);
	}

}
