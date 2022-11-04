public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args) {
         Wall wall = new Wall(0,1.25);
         System.out.println("area= " + wall.getArea());


         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());
    }
}
