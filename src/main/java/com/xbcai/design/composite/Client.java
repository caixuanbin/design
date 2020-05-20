package com.xbcai.design.composite;

/**
 * 测试组合模式：测试对文件夹下面的文件进行杀毒，如果文件夹下面有文件则进行杀毒，或者文件夹下面还有文件夹
 * 使用组合模式的场景：
 * --把部分喝整理的关系用树形结构来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象
 * 组合模式核心：
 * --抽象构件（Component）角色：定义了叶子和容器构件的共同点
 * --叶子（Leaf）构建角色：无子节点
 * --容器（Composite）构件角色：有容器特征，可以包含子节点
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5,f6;
        Folder f1 = new Folder("我的收藏夹");
        f2 = new ImageFile("老高的头像.jpg");
        f3 = new TextFile("Hello.txt");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();

    }
}
