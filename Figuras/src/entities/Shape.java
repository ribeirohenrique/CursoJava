package entities;

import entities.enums.Color;

//deve ser informado que é abstrata
public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Por ser uma classe abstrata, o metodo é invocado dessa maneira
    public abstract double area();
}
