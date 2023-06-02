public class Hur {
    public double calcArea(double aSide, double bSide, double cSide, double dSide){
        double s = (aSide + bSide + cSide + dSide)/2;
        if (aSide<=0 || bSide<=0 || cSide<=0 || dSide<=0) {
            return -1;
        }
        double area = Math.sqrt((s-aSide)*(s-bSide)*(s-cSide)*(s-dSide));
        return area;
    }
}
