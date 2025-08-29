package cl.pastoazul;

import cl.pastoazul.cartesian.Point;

public class POO {
    public static void main(String[] args) {
        //codigo y logica
        Point p = new Point();
        p.setX(10);
        p.setY(15);
        double x = p.getX();
        double y = p.getY();
        String mensaje = String.format("x = %d, y = %d", x, y);
        System.out.println(mensaje);

        Point p2 = new Point();
        p2.setX(100);
        p2.setY(-25);

        double xDiff = Math.pow(p2.getX() - p.getX(), 2.0);
        double yDiff = Math.pow(p2.getY() - p.getY(), 2.0);
        double distancia = Math.sqrt(xDiff + yDiff);
        System.out.println("Distancia entre p y p2 =" + distancia);
    }
}