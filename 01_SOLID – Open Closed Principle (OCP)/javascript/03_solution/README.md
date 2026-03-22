# 03 - Solution (Đúng OCP)

Ý tưởng chính:
- Socket không biết cụ thể đó là Tivi, Fridge hay Fan.
- Socket chỉ quản lý danh sách thiết bị và gọi chung một hành vi: connect().

Cách làm:
- Socket có mảng devices.
- Thêm thiết bị bằng addDevice(device).
- Khi activate(), Socket duyệt devices và gọi device.connect().

Lợi ích:
- Thêm thiết bị mới mà không cần sửa class Socket.
- Hệ thống dễ mở rộng hơn (Open for extension).
- Hạn chế sửa code đã ổn định (Closed for modification).

Ví dụ mở rộng:
- Muốn thêm AirConditioner, chỉ cần tạo class mới có hàm connect().
- Sau đó gọi socket.addDevice(new AirConditioner()).