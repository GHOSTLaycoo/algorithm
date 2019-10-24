package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/2 0002 - 下午 22:30
 *
 * 题目:饿汉式单例模式
 */
public class Q_1 {
        private static Q_1 instance = new Q_1();
        private Q_1 (){}
        public static Q_1 getInstance() {
            return instance;
        }
}
