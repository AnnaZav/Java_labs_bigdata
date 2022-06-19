package lab4.p1;

import java.util.ArrayList;

public class HelpTransport {
    int num;
    ArrayList<Transport> transport = new ArrayList<Transport>();

    public HelpTransport(int num, int[] time_all, String[] ways, int[] cost_all) {
        this.num = num;
        for (int i = 0; i < num; i++) {
            int time = time_all[i];
            String way = ways[i];
            int cost = cost_all[i];
            transport.add(new Transport(time, way, cost));
        }
    }

    @Override
    public String toString() {
        String str = new String("");
        for (int i = 0; i < this.num; i++) {
            str = str + "HelpTransport{" +
                    "transport=" + transport.get(i) +
                    '}' + '\n';
        }
        return str;
    }

    public class Transport {
        int time;
        String way;
        int cost;

        public Transport(int time, String way, int cost) {
            this.time = time;
            this.way = way;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Transport{" +
                    "time=" + time +
                    ", way='" + way + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] time_all = new int[]{1,2,3,4,5};
        String[] ways = new String[]{"one", "two", "three", "four", "five"};
        int[] cost_all = new int[]{6,7,8,9,10};

        HelpTransport trans = new HelpTransport(5, time_all, ways, cost_all);
        System.out.println(trans.toString());
    }
}



