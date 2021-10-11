package com.epam.rd.autotasks.triangle;

class Triangle {
    Point a;
    Point b;
    Point c;
    Line firstLine;
    Line secondLine;
    Line thirdLine;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        firstLine = new Line(a, b);
        secondLine = new Line(b, c);
        thirdLine = new Line(c, a);
        if ((firstLine.length() < secondLine.length() + thirdLine.length()) &
                (secondLine.length() < firstLine.length() + thirdLine.length()) &
                (thirdLine.length() < firstLine.length() + secondLine.length())) {
        } else {
            throw new RuntimeException();
        }
    }

    public double area() {
        double semiPerimeter = (firstLine.length() + secondLine.length() + thirdLine.length()) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstLine.length()) * (semiPerimeter - secondLine.length()) * (semiPerimeter - thirdLine.length()));
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }
}
