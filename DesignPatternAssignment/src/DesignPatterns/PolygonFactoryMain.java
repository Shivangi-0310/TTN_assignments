package DesignPatterns;

interface PolygonType {
    String getPolygonType();
}

class Triangle1 implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 3 sided polygon :: Triangle";
    }
}

class Square1 implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 4 sided polygon :: Square";
    }
}

class Pentagon implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 5 sided polygon :: Pentagon";
    }
}

class Hexagon implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 6 sided polygon :: Hexagon";
    }
}

class Heptagon implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 7 sided polygon :: Heptagon";
    }
}

class Octagon implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Its a 8 sided polygon :: Octagon";
    }
}

class NotAPolygon implements PolygonType {

    @Override
    public String getPolygonType() {
        return "Polygon not added";
    }
}

class Polygon {
    PolygonType polygonType;

    public PolygonType getPolygon() {
        return polygonType;
    }

    public void setPolygon(PolygonType polygonType) {
        this.polygonType = polygonType;
    }
}

class PolygonFactory {

    static Polygon getPolygonInstance(int numberOfSides) {

        Polygon polygon = new Polygon();
        switch (numberOfSides) {
            case 3:
                polygon.setPolygon(new Triangle1());
                break;
            case 4:
                polygon.setPolygon(new Square1());
                break;
            case 5:
                polygon.setPolygon(new Pentagon());
                break;
            case 6:
                polygon.setPolygon(new Hexagon());
                break;
            case 7:
                polygon.setPolygon(new Heptagon());
                break;
            case 8:
                polygon.setPolygon(new Octagon());
                break;
            default:
                polygon.setPolygon(new NotAPolygon());
        }
        return polygon;

    }
}

public class PolygonFactoryMain {
    public static void main(String[] args) {
        Polygon polygon1 = PolygonFactory.getPolygonInstance(3);
        System.out.println(polygon1.getPolygon().getPolygonType());
        Polygon polygon2 = PolygonFactory.getPolygonInstance(5);
        System.out.println(polygon2.getPolygon().getPolygonType());
        Polygon polygon3 = PolygonFactory.getPolygonInstance(6);
        System.out.println(polygon3.getPolygon().getPolygonType());
        Polygon polygon4 = PolygonFactory.getPolygonInstance(10);
        System.out.println(polygon4.getPolygon().getPolygonType());

    }

}
