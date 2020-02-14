package OOPPart1;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {

        if (height >= 0 && width >= 0 ){
            this.width = width;
            this.height = height;
        }else if(width >= 0 && height < 0){
            this.width= width;
            this.height = 0;
        } else if(height >= 0 && width < 0 ){
            this.height = height;
            this.width=0;
         } else if( height < 0 && width < 0){
            this.width = 0;
            this.height = 0;        
        }

    }

    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        if (this.width > 0 || this.height > 0){
            return this.height*this.width;
        } else return 0;
    }
}


