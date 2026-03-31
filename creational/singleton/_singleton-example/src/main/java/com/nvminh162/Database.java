package com.nvminh162;

class Database {
    private static Database instance;
    private final String connection;

    // Constructor private để không cho tạo trực tiếp
    private Database() {
        connection = "Connected to the database";
    }

    // Phương thức lấy instance duy nhất
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }
}
