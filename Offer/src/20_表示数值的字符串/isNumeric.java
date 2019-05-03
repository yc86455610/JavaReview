import javax.print.DocFlavor;

public class isNumeric {
    //表示数值的字符串
    /**
     *
     * true
     *
     * "+100"
     * "5e2"
     * "-123"
     * "3.1416"
     * "-1E-16"
     *
     * false
     *
     * "12e"
     * "1a3.14"
     * "1.2.3"
     * "+-5"
     * "12e+4.3"
     *
     * */

    /**
     * []  ： 字符集合
     * ()  ： 分组
     * ?   ： 重复 0 ~ 1
     * +   ： 重复 1 ~ n
     * *   ： 重复 0 ~ n
     * .   ： 任意字符
     * \\. ： 转义后的 .
     * \\d ： 数字
     * */

    public boolean isNumeric(char[] str) {
        if(str == null || str.length == 0)
            return false;
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}
