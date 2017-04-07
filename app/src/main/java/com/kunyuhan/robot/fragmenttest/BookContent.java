package com.kunyuhan.robot.fragmenttest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anroid on 2017/4/7.
 */

public class BookContent {

    public  static List<Book> ITEMS= new ArrayList<Book>();
    public static Map<Integer,Book> ITEM_MAP = new HashMap<Integer,Book>();
    public static  class Book
    {
        public Integer id;
        public  String title;
        public String desc;

        public Book(Integer id, String title, String desc) {
            this.id = id;
            this.title = title;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return title;
        }

        static
        {
            addItem(new Book(1,"疯狂Java讲义","一本全面。深入的Java学习图书，已被多家高效选为教材。"));
            addItem(new Book(2,"疯狂Android讲义","Android学习的首选书，常年占据京东，当当、"+"亚马逊3大网站Android销售排行榜的榜首"));
            addItem(new Book(3,"轻量级JavaEE企业应用实践","全面介绍Java EE开发的Struts 2、Spring 3、Hibernate 4框架"));
        }

        private static void addItem(Book book) {
            ITEMS.add(book);
            ITEM_MAP.put(book.id,book);
        }
    }
}
