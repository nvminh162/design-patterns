# 02 - Bad (Vi phạm OCP)

Phiên bản này vẫn chạy đúng, nhưng vi phạm nguyên tắc OCP.

Lý do vi phạm:
- Lớp Socket phụ thuộc trực tiếp vào từng loại thiết bị cụ thể (Tivi, Fridge, Fan).
- Mỗi lần thêm thiết bị mới, phải sửa constructor và hàm activate trong Socket.

Hệ quả:
- Lớp trung tâm bị sửa liên tục.
- Code khó bảo trì, khó test, khó mở rộng.

Tóm lại:
- Chạy được không có nghĩa là thiết kế tốt.
