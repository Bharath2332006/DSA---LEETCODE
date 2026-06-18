class Solution {
    public double angleClock(int hour, int minutes) {
        double h=30*hour;
        double m=(5.5*minutes);
        double small= Math.abs(h-m);
        return Math.min(small,360.0-small);
    }
}