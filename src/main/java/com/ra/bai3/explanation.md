Phần 1: Phân tích
Việc đưa các thông số vào file application.properties thay vì hard-code (viết cứng) trong Java mang lại những lợi ích quan trọng:

Tính linh hoạt & Bảo trì: Khi cần thay đổi thông tin (ví dụ: đổi số hotline), bạn chỉ cần sửa tại một file duy nhất thay vì phải tìm và sửa ở hàng chục file Java khác nhau.

Không cần biên dịch lại: Trong nhiều môi trường triển khai thực tế, bạn có thể thay đổi file cấu hình mà không cần phải compile lại toàn bộ mã nguồn ứng dụng.

Quản lý theo môi trường: Dễ dàng cấu hình các thông số khác nhau cho từng môi trường (ví dụ: Database của môi trường Development sẽ khác với môi trường Production) thông qua các file profile (application-dev.properties, application-prod.properties).

Tính bảo mật: Tách biệt các thông tin nhạy cảm (như mật khẩu database, API key) ra khỏi mã nguồn để tránh lộ thông tin khi chia sẻ code.