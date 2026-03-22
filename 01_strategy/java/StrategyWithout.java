public class StrategyWithout {

    public static double getPrice(double originPrice, String typePromotion) {
        // Giảm giá khi người dùng đặt trước một sản phẩm của VINFAST
        if (typePromotion == "preOrder") {
            return originPrice * 0.8; // giảm 20%
        } // Ở giai đoạn này nếu như bạn đã biết về SOLID thì nó đã phá vỡ nguyên tắc đầu
          // tiên. Đó là Nguyên tắc trách nhiệm duy nhất.

        // Tiếp tục thêm tính năng khuyến mãi thông thường, ví dụ nếu giá gốc < 200 thì
        // giảm 10%, còn > thì giảm tối đa 30
        if (typePromotion == "promotion") {
            return originPrice <= 200 ? originPrice * 0.9 : originPrice - 30;
        }

        // Thời xưa chưa có marketing như bây giờ.
        return originPrice;
    }

    public static void main(String[] args) {
        System.out.println("-----> PRICE::: " + getPrice(300, "promotion"));
    }
}
