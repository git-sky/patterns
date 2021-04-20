package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo2;

import java.util.List;

public interface Filter {

    List<Consumer> filtrate(List<Consumer> consumers);

}