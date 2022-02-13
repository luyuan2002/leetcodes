package cn.xiaoyes.algorithm.day0213;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String source = "****     180.90       88折\n" +
                "****      10.25       65折\n" +
                "****      56.14        9折\n" +
                "****     104.65        9折\n" +
                "****     100.30       88折\n" +
                "****     297.15        半价\n" +
                "****      26.75       65折\n" +
                "****     130.62        半价\n" +
                "****     240.28       58折\n" +
                "****     270.62        8折\n" +
                "****     115.87       88折\n" +
                "****     247.34       95折\n" +
                "****      73.21        9折\n" +
                "****     101.00        半价\n" +
                "****      79.54        半价\n" +
                "****     278.44        7折\n" +
                "****     199.26        半价\n" +
                "****      12.97        9折\n" +
                "****     166.30       78折\n" +
                "****     125.50       58折\n" +
                "****      84.98        9折\n" +
                "****     113.35       68折\n" +
                "****     166.57        半价\n" +
                "****      42.56        9折\n" +
                "****      81.90       95折\n" +
                "****     131.78        8折\n" +
                "****     255.89       78折\n" +
                "****     109.17        9折\n" +
                "****     146.69       68折\n" +
                "****     139.33       65折\n" +
                "****     141.16       78折\n" +
                "****     154.74        8折\n" +
                "****      59.42        8折\n" +
                "****      85.44       68折\n" +
                "****     293.70       88折\n" +
                "****     261.79       65折\n" +
                "****      11.30       88折\n" +
                "****     268.27       58折\n" +
                "****     128.29       88折\n" +
                "****     251.03        8折\n" +
                "****     208.39       75折\n" +
                "****     128.88       75折\n" +
                "****      62.06        9折\n" +
                "****     225.87       75折\n" +
                "****      12.89       75折\n" +
                "****      34.28       75折\n" +
                "****      62.16       58折\n" +
                "****     129.12        半价\n" +
                "****     218.37        半价\n" +
                "****     289.69        8折";
        String[] res = source.split("     ");
        List<Double> prices = new ArrayList<>();
        List<Double> discounts = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < res.length; i++) {
            String cur = res[i].trim();
            if (i % 2 == 0) {
                int id = 0;
                if ((id = cur.indexOf("折")) != -1) {
                    String dis = cur.substring(0, id);
                    double v = Double.parseDouble(dis);
                    if (dis.length() == 2) {
                        v /= 10;
                    }
                    v /= 10;
                    discounts.add(Double.parseDouble(df.format(v)));
                } else if (cur.contains("半价")) {
                    discounts.add(Double.parseDouble("0.5"));
                }
            } else {
                prices.add(Double.parseDouble(cur));
            }
        }
        int sum = 0;
        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i) * discounts.get(i);
        }
        int i = 100;
        while (i < sum) {
            i = i + 100;
        }
        System.out.println(i);
    }
}
