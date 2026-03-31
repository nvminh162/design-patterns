package com.nvminh162;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng đầu tiên
        Database db1 = Database.getInstance();
        System.out.println(db1.getConnection());

        // Tạo đối tượng thứ hai
        Database db2 = Database.getInstance();
        System.out.println(db2.getConnection());

        // Kiểm tra hai đối tượng có giống nhau không
        System.out.println(db1 == db2); // true
    }
}
