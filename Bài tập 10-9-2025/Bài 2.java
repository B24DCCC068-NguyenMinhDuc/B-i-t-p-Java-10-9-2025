1. Kiểu dữ liệu nguyên thủy (Primitive Types)

Java có 8 kiểu dữ liệu nguyên thủy:

byte

Kích thước: 8 bit (1 byte)

Giá trị: từ -128 đến 127

Dùng để tiết kiệm bộ nhớ khi lưu số nhỏ.

short

Kích thước: 16 bit (2 byte)

Giá trị: từ -32,768 đến 32,767

Hiếm khi dùng, chủ yếu cho dữ liệu số nhỏ.

int

Kích thước: 32 bit (4 byte)

Giá trị: từ -2,147,483,648 đến 2,147,483,647

Kiểu số nguyên phổ biến nhất trong Java.

long

Kích thước: 64 bit (8 byte)

Giá trị: từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807

Dùng cho số nguyên rất lớn (cần thêm hậu tố L).

float

Kích thước: 32 bit (4 byte)

Dùng cho số thực (số thập phân) độ chính xác đơn (~7 chữ số thập phân).

Ví dụ: 3.14f

double

Kích thước: 64 bit (8 byte)

Dùng cho số thực độ chính xác kép (~15 chữ số thập phân).

Kiểu số thực mặc định trong Java.

char

Kích thước: 16 bit (2 byte, Unicode)

Lưu trữ một ký tự ('a', '1', '#'...).

boolean

Chỉ có 2 giá trị: true hoặc false.

Dùng trong các biểu thức điều kiện.

2. Kiểu dữ liệu tham chiếu (Reference Types)

String: chuỗi ký tự .

Mảng (Array): tập hợp nhiều phần tử cùng kiểu.

Class, Object, Interface: kiểu dữ liệu do người lập trình định nghĩa.