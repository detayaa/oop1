public class Flower {
    private String flowerColor;
    private String county;
    private double cost;
    int lifeSpan;

    Flower(String flowerColor, String county, double cost, int lifeSpan) {

        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {this.flowerColor = "белый";}
        if (county != null && !county.isEmpty() && !county.isBlank()) {
            this.county = county;
        } else {this.county = "России";}
        if (cost > 0) {
            this.cost = cost;
        } else {this.cost = 1;}
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {this.lifeSpan = 3;}
    }

    void flower() {
        System.out.println(flowerColor + " из " + county + ", стоимость штуки - " + cost + ", срок стояния - " + lifeSpan);
    }


    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {this.flowerColor = "белый";}
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        if (county != null && !county.isEmpty() && !county.isBlank()) {
            this.county = county;
        } else {this.county = "России";}
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {this.cost = 1;}
    }



}
