package com.epam.training.student_anastasiia_chupina.seventh.figures_extra;

public class Quadrilateral extends Figure {
    Point a, b, c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (area() == 0) {
            throw new IllegalArgumentException();
        }
        if (isItDegenerative()){
            throw new IllegalArgumentException();
        }
        if (!isItConvex()) {
            throw new IllegalArgumentException();
        }

    }
    private double area() {
        double aX = a.getX();
        double aY = a.getY();
        double bX = b.getX();
        double bY = b.getY();
        double cX = c.getX();
        double cY = c.getY();
        double dX = d.getX();
        double dY = d.getY();
        return 0.5*(Math.abs((aX-bX)*(aY+bY)+(bX-cX)*(bY+cY)+(cX-dX)*(cY+dY)+(dX-aX)*(dY+aY)));
    }
    private boolean isItConvex(){
        Point ab = b.sub(a);
        Point bc = c.sub(b);
        Point cd = d.sub(c);
        Point da = a.sub(d);
        double zABC = ab.cross(bc);
        double zBCD = bc.cross(cd);
        double zCDA = cd.cross(da);
        double zDAB = da.cross(ab);
        if (zABC > 0){
            if (zBCD < 0 || zCDA < 0 || zDAB < 0) {
                return false;
            }
        } else {
            if (zABC < 0) {
                if (zBCD > 0 || zCDA > 0 || zDAB > 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isItDegenerative () {
        double delta = 1e-6;
        double lengthAB = Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2)));
        double lengthBC = Math.sqrt((Math.pow((b.getX() - c.getX()), 2)) + (Math.pow((b.getY() - c.getY()), 2)));
        double lengthCD = Math.sqrt((Math.pow((c.getX() - d.getX()), 2)) + (Math.pow((c.getY() - d.getY()), 2)));
        double lengthDA = Math.sqrt((Math.pow((a.getX() - d.getX()), 2)) + (Math.pow((a.getY() - d.getY()), 2)));
        double lengthAC = Math.sqrt((Math.pow((a.getX() - c.getX()), 2)) + (Math.pow((a.getY() - c.getY()), 2)));
        double lengthBD = Math.sqrt((Math.pow((b.getX() - d.getX()), 2)) + (Math.pow((b.getY() - d.getY()), 2)));
        Point [] points = new Point[] {a, b, c, d};
        for (int i=0; i<4; i++) {
            for (int j=i+1; j<4; j = j+1){
                if (points[i].isTheSame(points[j])){
                    return true;
                }
            }
        }
        if ((lengthAB + lengthBC) > (lengthAC + delta) && (lengthBC + lengthAC) > (lengthAB + delta) && (lengthAB + lengthAC) > (lengthBC + delta)
                && (lengthBC + lengthCD) > (lengthBD + delta) && (lengthCD + lengthBD) > (lengthBC + delta) && (lengthBD + lengthBC) > (lengthCD + delta)
                && (lengthCD + lengthDA) > (lengthAC + delta) && (lengthDA + lengthAC) > (lengthCD + delta) && (lengthAC + lengthCD) > (lengthDA + delta)
                && (lengthDA + lengthAB) > (lengthBD + delta) && (lengthAB + lengthBD) > (lengthDA + delta) && (lengthBD + lengthDA) > (lengthAB + delta)){
            return false;
        }
        return true;
    }
    public Point centroid(){
        Point gA = b.add(c).add(d).div(3);
        Point gB = a.add(c).add(d).div(3);
        Point gC = a.add(b).add(d).div(3);
        Point gD = a.add(b).add(c).div(3);
        double centroidX = (gA.cross(gC)*(gB.getX()-gD.getX())-(gA.getX()-gC.getX())*gB.cross(gD))/
                ((gA.getX()-gC.getX())*(gB.getY()-gD.getY())-(gA.getY()-gC.getY())*(gB.getX()-gD.getX()));
        double centroidY = (gA.cross(gC)*(gB.getY()-gD.getY())-(gA.getY()-gC.getY())*gB.cross(gD))/
                ((gA.getX()-gC.getX())*(gB.getY()-gD.getY())-(gA.getY()-gC.getY())*(gB.getX()-gD.getX()));
        return new Point(centroidX,centroidY);
    }
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Quadrilateral) {
            Quadrilateral quad = (Quadrilateral) figure;
            Point [] points1 = new Point[] {a, b, c, d};
            Point [] points2 = new Point[] {quad.a, quad.b, quad.c, quad.d};
            int i=0;
            for (Point element1:points1) {
                for (Point element2:points2){
                    if (element1.isTheSame(element2)) {
                        i++;
                        break;
                    }
                }
            }
            return i == 4;
        }
        return false;
    }
}
