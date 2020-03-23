import java.util.Arrays;

/**
 * 代替字符串中的空格方法！
 */
public class Main {

    public static void main(String[] args) {
        String str = "Hello World! My Name is Jack.Chen !";
        //第一种方法（利用charAt()和String.valueOf()）
        // String s = replaceSpace(str);

        //第二种简单方法
        String s = simpleWay(str);
        System.out.println(" :" + s);

//        String[] strs={"chaurses","cb","chaose","cadr","carome","char"};
//        String compare = compare(strs);
//
//        System.out.println(compare);
    }

    //第一种方法
    public static String replaceSpace(String str) {
        int length = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {

            char c = str.charAt(i);
            if (String.valueOf(c).equals(" ")) {
                result.append("_");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }


    //第二种方法
    public static String simpleWay(String str) {


        return str.toString().replaceAll("\\s", "_");
    }


}
