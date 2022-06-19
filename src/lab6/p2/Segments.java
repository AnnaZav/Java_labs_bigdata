package lab6.p2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static lab6.p2.Segments.Vector2.crs;
import static lab6.p2.Segments.Vector2.fromDifferentSides;

public class Segments {
    public static void main(String[] args) {
        int n = 3;
        List<Dot> coordinates = new ArrayList<Dot>();
        coordinates.add(new Dot(1, 2));
        coordinates.add(new Dot(5, 7));
        coordinates.add(new Dot(0, 0));
        coordinates.add(new Dot(5, 0));
        coordinates.add(new Dot(1, 5));
        coordinates.add(new Dot(2, 0));
        Dot min_dot = new Dot(100,0);
        System.out.println("Точки пересечения");
        for (int i=0; i <= n; i = i+2){
            for (int j=i+2; j < n*2; j = j+2) {
                Dot temp = pointOfIntersection(coordinates.get(i),
                        coordinates.get(i + 1), coordinates.get(j), coordinates.get(j + 1));
                System.out.println(temp);
                if (temp != null)
                    if (min_dot.x > temp.x) min_dot = temp;
            }
        }
        System.out.println("С наименьшей абсциссой");
        System.out.println(min_dot);
    }

    public static Dot pointOfIntersection(Dot a, Dot b, Dot c, Dot d) {

        Vector2 main = new Vector2(c,d);
        Vector2 v1= new Vector2(c,a);
        Vector2 v2 = new Vector2(c,b);
        if (fromDifferentSides(main,v1,v2)) {
            main = new Vector2(a,b);
            v1 = new Vector2(a,c);
            v2 = new Vector2(a,d);

            double product1 = crs(main ,v1), product2 = crs(main ,v2);
            if (product1>=0&&product2<=0 || product1<=0&&product2>=0) {
                double k = Math.abs(product2 / product1);
                if (Float.isInfinite((float) k)) return c;
                Vector2 dc = new Vector2(d, c);
                dc.scl((float) (1 / (k + 1)*k));
                return new Dot(d.x + dc.x, d.y + dc.y);
            }

        }

        return null;
    }

    public static boolean linesIntersect(Dot a, Dot b, Dot c, Dot d) {
        Vector2 main = new Vector2(a,b);
        Vector2 v1 = new Vector2(a,c);
        Vector2 v2 = new Vector2(a,d);

        if (fromDifferentSides(main,v1,v2)) {
            main = new Vector2(c,d);
            v1 =new Vector2(c,a);
            v2 =new Vector2(c,b);
            return fromDifferentSides(main,v1,v2);
        }
        return false;
    }

    static class Dot {
        float x,y;
        Dot(float x, float y){
            this.x =x;
            this.y = y;
        }

        Comparator<Dot> comparator = new Comparator<Dot>(){
            @Override
            public int compare(Dot o1, Dot o2) {
                float a = o1.x;
                float b = o2.x;
                return (a < b) ? -1 : ((a == b) ? 0 : 1);
            }
        };
        @Override
        public String toString() {
            return "x:"+x+" y:"+y;
        }
    }


    public static class Vector2 {
        float x,y;

        public Vector2(Dot d1, Dot d2) {
            this.x = d2.x-d1.x;
            this.y = d2.y-d1.y;
        }

        public static float crs(Vector2 v1, Vector2 v2) {
            return v1.x * v2.y - v1.y * v2.x;
        }

        public Vector2 scl (float scalar) {
            x *= scalar;
            y *= scalar;
            return this;
        }

        public static boolean fromDifferentSides(Vector2 main, Vector2 v1, Vector2 v2){
            float product1 =crs(main ,v1), product2 = crs(main ,v2);
            return (product1>=0&&product2<=0 || product1<=0&&product2>=0);
        }

        public static double round(double value, int places) {
            if (places < 0) throw new IllegalArgumentException();
            BigDecimal bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
    }
}
