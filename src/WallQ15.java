//15. Wall Area
//Write a class with the name Wall.
// The class needs two fields (instance variables) with name width and height of type double.

public class WallQ15 {

        double width;//create variables
        double height;//create variable
        public WallQ15(){
            System.out.println("This is no parameters constructor");
        }
        public WallQ15(double width,double height){
            if (width<0){
                this.width=0;//if it is negative assign zero
            }
            else
            {
                this.width=width;//if it is not negative than assign width
            }
            if (height<0){
                this.height=0;//if it is negative assign zero
            }
            else
            {
                this.height=height;//if it is not negative than assign height

            }


        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {

            if (width<0){
                this.width=0;//if it is negative assign zero
            }
            else
            {
                this.width=width;//if it is not negative than assign width
            }

        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height<0){
                this.height=0;//if it is negative assign zero
            }
            else
            {
                this.height=height;//if it is not negative than assign height

            }

        }
        public double getArea(){//instance method
            double area= this.height*this.width;//that is why we have used this.
            return area;
        }

        public static void main(String[] args) {
            WallQ15 wall = new WallQ15 (5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());

        }




















    }
