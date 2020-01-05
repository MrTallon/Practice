package fp;

/**
 * @version v1.0.0
 * @author: yangbo
 * @create: 2019-11-22 15:29
 */

// functional/LambdaExpressions.java

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

/**
 * @author yangbo
 */
public class LambdaExpressions {

    static Body bod = h -> h + " No Parens!";

    static Body bod2 = (h) -> h + " More details";

    static Description desc = () -> "Short info";

    static Multi mult = (h, n) -> h + n;

    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
