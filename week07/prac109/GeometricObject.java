package week07.prac109;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated; //imports from inside

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** color */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     so, the get method name is isFilled */
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}