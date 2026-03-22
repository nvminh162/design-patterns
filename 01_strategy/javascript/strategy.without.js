function getPrice(originalPrice, typePromotion) {

    // Giảm giá khi người dùng đặt trước một sản phẩm của VINFAST
    if (typePromotion === 'preOrder') {
        return originalPrice * 0.8; // giảm 20%
    } // Ở giai đoạn này nếu như bạn đã biết về SOLID thì nó đã phá vỡ nguyên tắc đầu tiên. Đó là Nguyên tắc trách nhiệm duy nhất.

    // Tiếp tục thêm tính năng khuyến mãi thông thường, ví dụ nếu giá gốc < 200 thì giảm 10%, còn > thì giảm tối đa 30
    if (typePromotion === 'promotion') {
        return originalPrice <= 200 ? originalPrice * 0.9 : originalPrice - 30;
    }

    // Thời xưa chưa có marketing như bây giờ.
    if (typePromotion === 'default') {
        return originalPrice;
    }
}

console.log('-----> PRICE:::', getPrice(200, 'promotion'));