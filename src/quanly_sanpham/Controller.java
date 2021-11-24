package quanly_sanpham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller implements Manager {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> sanPhams = new ArrayList<>();

    static {
        sanPhams.add(new SanPham("Iphone 7", 5000000, 5, "Màu hồng cá tính"));
        sanPhams.add(new SanPham("Iphone 8", 7000000, 6, "Màu đen lạnh lùng"));
        sanPhams.add(new SanPham("Iphone 10", 10000000, 10, "Màu trắng"));
        sanPhams.add(new SanPham("Iphone XR", 9500000, 15, "Màu xanh ngọc"));
        sanPhams.add(new SanPham("Iphone 10S Max", 11000000, 20, "Màu xanh da trời"));
        sanPhams.add(new SanPham("Iphone 11", 15900000, 25, "Màu đỏ"));
        sanPhams.add(new SanPham("Iphone 11 Pro Max", 20000000, 4, "Màu blue"));
        sanPhams.add(new SanPham("Iphone 12", 23900000, 7, "Màu green ngọc"));
        sanPhams.add(new SanPham("Iphone 12 Pro Max", 25000000, 9, "Màu pink "));
        sanPhams.add(new SanPham("Iphone 13 Pro Max", 50000000, 2, "Màu black"));
    }

    public int findID() {
        System.out.println("Nhập mã sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).maSanPham == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (i % 5 == 0 && i != 0) {
                scanner.nextLine();
            }
            System.out.println(sanPhams.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên sản phẩm mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả: ");
        String moTa = scanner.nextLine();

        System.out.println("ĐÃ THÊM VÀO DANH SÁCH!!!");

        sanPhams.add(new SanPham(name, gia, soLuong, moTa));
    }

    @Override
    public void update() {
        int id = findID();
        if (id >= 0) {
            System.out.println("Nhập tên sản phẩm mới: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá: ");
            double gia = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập mô tả: ");
            String moTa = scanner.nextLine();

            System.out.println("ĐÃ CẬP NHẬP!!!");

            sanPhams.get(id).tenSanPham = name;
            sanPhams.get(id).gia = gia;
            sanPhams.get(id).soLuong = soLuong;
            sanPhams.get(id).moTa = moTa;
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã sản phẩm trên, vui lòng nhập lại!!");
        }
    }

    @Override
    public void delete() {
        int id = findID();

        if (id >= 0) {
            System.out.println("Nhập 'Y' để xác nhận xoá khỏi bộ nhớ");
            String confirm = scanner.nextLine();
            if (confirm.equals("Y")) {
                sanPhams.remove(id);
                System.out.println("ĐÃ XOÁ!!!");
            } else {
                System.out.println("Nhập Y cơ mà, nhập lại đê");
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã sản phẩm trên, vui lòng nhập lại!!");
        }
    }

    @Override
    public void sort() {
        System.out.println("Nhấn phím 1 hoặc 2 để hiện thị danh sách sản phẩm sau khi sắp xếp " + "\n"
                            + "Nhấn phím 3 để quay lại Menu");
        int number = scanner.nextInt();

        if (number == 1 || number == 2) {
            Collections.sort(sanPhams, new SortPriceMax());
            System.out.println("ĐÃ SẮP XẾP!!!");
        } else if (number == 3) {
            System.out.print(" ");
        } else {
            System.out.println("Nhập cái gì vại trời");
        }
    }

    @Override
    public void findPriceMax() {
        Collections.sort(sanPhams, new SortPriceMax());
        System.out.println("Đây là sản phẩm có giá đắt nhất: " + "\n"
                + sanPhams.get(0));
    }

    @Override
    public void exit() {
        System.out.println("ĐÃ THOÁT!!!");
    }
}