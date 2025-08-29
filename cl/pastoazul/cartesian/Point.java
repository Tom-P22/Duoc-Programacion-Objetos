package cl.pastoazul.cartesian;

public class Point {
    private double x;
    private double y;

    //Posibilidad 1
    //public void setX(int x){
        //this.x = x;
            //set define el parametro
    //}

    //Posibilidad 2:
    public void setX(double a) {
        x = a;
    }

    public void setY(double b) {
        y = b;
    }

    public double getX(){
        return x;
        //si no se coloca el return, no se va a poder compilar
    }

    public double getY() {
        return y;
    }
}

