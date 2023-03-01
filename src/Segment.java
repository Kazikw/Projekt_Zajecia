public class Segment {
    Point first;
    Point secend;

    public void setFirst(Point first) {
        this.first = first;
    }

    public void setSecend(Point secend) {
        this.secend = secend;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecend() {
        return secend;
    }

    public double getDist (){
        return Math.hypot(first.x - secend.x, first.y - secend.y);
        //return Math.sqrt(Math.pow(first.x - secend.x, 2)+ Math.pow(first.y - secend.y, 2));

    }
}
//check it konfa w lbl ostateczny final static mozna modyfikowac obiekt ale nie mozna przypisac nowego svg kod linia jak zolw    Napisy w zalezonsi z kropka lub przecinkiem
//w zalezonsi  od jezyka trzeba podac English cos tam
