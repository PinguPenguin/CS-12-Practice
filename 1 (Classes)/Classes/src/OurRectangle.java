public class OurRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //constructor
    public OurRectangle (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if (this.width < 0) this.width = 0;
        if (this.height < 0) this.height = 0;
    }

    //accessors
    public String toString () {
        return "base: (" + x + "," + y + ") w:" + width + " h:" + height;
    }
    public int area () {
        return width * height;
    }
    public int perimeter () {
        return width * 2 + height * 2;
    }
    public static OurRectangle intersection(OurRectangle r1, OurRectangle r2) {
        //catching edge cases (where do not overlap)
        if (r1.x + r1.width < r2.x || r2.x + r2.width < r1.x || r1.y + r1.height < r2.y || r2.y + r2.height < r1.y) {
            return new OurRectangle(0, 0, 0, 0);
        } else if (r1.x + r1.width == r2.x || r2.x + r2.width == r1.x || r1.y + r1.height == r2.y || r2.y + r2.height == r1.y) {
            return new OurRectangle(Math.max(r1.x, r2.x), Math.max(r1.y, r2.y), 0 ,0);
        }
        int width = 0;
        int height = 0;
        int x = Math.max(r1.x, r2.x);
        int y = Math.max(r1.y, r2.y);
        int widthTo = Math.max(r1.x,r2.x) - Math.min(r1.x, r2.x);
        int heightTo = Math.max(r1.y,r2.y) - Math.min(r1.y,r2.y);
        //lord forgive me
        if (r1.x < r2.x) {
            width = r1.width - widthTo;
            if (r2.x + r2.width < r1.x + r1.width) {
                width -= (r1.x + r1.width - (r2.x + r2.width));
            }
        } else {
            width = r2.width - widthTo;
            if (r1.x + r1.width < r2.x + r2.width) {
                width -= (r2.x + r2.width - (r1.x + r1.width));
            }
        }
        if (r1.y < r2.y) {
            height = r1.height - heightTo;
            if (r2.y + r2.height < r1.y + r1.height) {
                height -= (r1.y + r1.height - (r2.y + r2.height));
            }
        } else {
            height = r2.height - heightTo;
            if (r1.y + r1.height < r2.y + r2.height) {
                height -= (r2.y + r2.height - (r1.y + r1.height));
            }
        }
        return new OurRectangle(x, y, width, height);
    }
    public static int totalPerimeter(OurRectangle r1, OurRectangle r2){
        int perim = r1.height * 2 + r1.width * 2 + r2.height * 2 + r2.width * 2;
        perim -= OurRectangle.intersection(r1, r2).height * 2 + OurRectangle.intersection(r1, r2).width * 2;
        return perim;
    }

    public boolean contains (OurRectangle rect) {
        //if statements are more readable to me than just putting everything into return
        //also MY EYES
        if ((x <= rect.x && x + width >= rect.x + rect.width) && (y <= rect.y && y + height >= rect.y + rect.height)) {
            return true;
        }
        return false;
    }
}
