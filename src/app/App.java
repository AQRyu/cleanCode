package app;

import app.betterConstructor.builderPattern.CaPheSua;
import app.utils.Loai;

public class App {
    public static void main(String[] args) throws Exception {
        CaPheSua caPheSuaBuilderPattern = new CaPheSua.Builder()    //Bad way to naming (do not code like this)
        .caPhe(1)
        .sua(1)
        .loai(Loai.NONG)
        .build();
        System.out.println(caPheSuaBuilderPattern.toString());
    }
}