public class Skeleton extends Boss{
    public int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;


    }
    @Override public String info() { return super.info() + getArrow(); }
}

