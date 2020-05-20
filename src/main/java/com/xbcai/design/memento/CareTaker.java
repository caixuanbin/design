package com.xbcai.design.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
@Data
public class CareTaker {
    private EmpMemento memento;
    /**
     * 如果要添加很多备忘录类的话，可以采用容器进行管理
     */
    //private List<EmpMemento> list = new ArrayList<>();

}
