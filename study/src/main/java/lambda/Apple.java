package lambda;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @Author zhiming.li
 * @Date 2020/6/11 14:42
 */
public class Apple {
    private Long id;
    private Color color;
    private Float weight;
    private String origin;

    public Color getColor() {
        return color;
    }

    public Float getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public Apple(Long id, Color color, Float weight, String origin){
        this.id=id;
        this.color=color;
        this.weight=weight;
        this.origin=origin;
    }

    public static void main(String[] args) {
        List<Apple> apples=new ArrayList<>();
//        List<Apple> filterApples=filterApplesByApplleFilter(apples, new AppleFilter() {
//            @Override
//            public boolean accept(Apple apple) {
//                return Color.RED.equals(apple.getColor()) && apple.getWeight() > 100;
//            }
//        });
        List<Apple> filterApples=filterApplesByApplleFilter(apples,
                (Apple apple)->Color.RED.equals(apple.getColor()) && apple.getWeight() > 100);

    }

    public static List<Apple> filterApplesByApplleFilter(List<Apple> apples,AppleFilter filter){
        List<Apple> filterApples=new ArrayList<>();
        for (final Apple apple : apples) {
            if (filter.accept(apple)) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }
}
@FunctionalInterface
interface AppleFilter{
    boolean accept(Apple apple);
}
