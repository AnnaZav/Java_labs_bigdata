package main.java;

import static spark.Spark.get;
public class FirstSpark {
    public static void main(String[] args) {
        get("/first", (req, res) -> "First Spark application");
    }
}
