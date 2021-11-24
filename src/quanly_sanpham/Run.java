package quanly_sanpham;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "---- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----" + "\n"
                            + "Chọn chức năng theo số (để tiếp tục)" + "\n"
                            + "1. Xem danh sách" + "\n"
                            + "2. Thêm mới" + "\n"
                            + "3. Cập nhập" + "\n"
                            + "4. Xoá" + "\n"
                            + "5. Sắp xếp" + "\n"
                            + "6. Tìm sản phẩm có giá đắt nhất" + "\n"
                            + "0. Exit" + "\n"
                            + "Chọn chức năng:"
            );
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.display();
                    break;
                case 2:
                    controller.add();
                    break;
                case 3:
                    controller.update();
                    break;
                case 4:
                    controller.delete();
                    break;
                case 5:
                    controller.sort();
                    break;
                case 6:
                    controller.findPriceMax();
                    break;
                case 0:
                    controller.exit();
                    System.exit(0);
                    break;
            }
        }
    }
}
