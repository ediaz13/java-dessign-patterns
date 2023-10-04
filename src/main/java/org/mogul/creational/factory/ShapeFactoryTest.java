package org.mogul.creational.factory;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ShapeFactoryTest {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape roundFood = shapeFactory.getFood("Round");
    Shape cylinderFood = shapeFactory.getFood("Cylinder");

    @Test
    public void factoryMethodTest() {
        assertEquals("Round", roundFood.getShape());
        assertEquals("Cylinder", cylinderFood.getShape());
    }

}
