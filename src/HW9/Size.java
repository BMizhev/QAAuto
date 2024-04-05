package HW9;

public enum Size {
    S("Size S", 5, 5),
    M("Size M", 10, 10),
    L("Size L", 15, 15),
    XL("Size XL", 20, 20);
    private String name;
    private double width;
    private double length;

    @Override
    public String toString() {
        return "Size{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    Size(String name, double width, double length){
        this.name = name;
        this.width = width;
        this.length = length;

    }
    public String getName(){
        return name;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
}
