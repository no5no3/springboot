package net.no5no3.util;

public enum Color{
    RED(1,"红"),
    GREEN(2,"绿"),
    BLUE(3,"蓝");
    private int code;
    private String name;

    Color(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public static Color get(int code){
        for (Color color : Color.values()){
            if (color.code == code) {
                return color;
            }
        }
        return null;
    }
}
