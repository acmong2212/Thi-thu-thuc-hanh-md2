package quanly_sanpham;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements Manager {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> sanPhams = new ArrayList<>();

    static {
        sanPhams.add(new SanPham("Iphone 7", 5000000, 5, "Màu hồng cá tính"));
        sanPhams.add(new SanPham("Iphone 8", 7000000, 6, "Màu đen lạnh lùng"));
    }

    @Override
    public int find() {
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
        for (SanPham a : sanPhams) {
            System.out.println(a);
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

        sanPhams.add(new SanPham(name, gia, soLuong, moTa));
    }

    @Override
    public void update() {
        int id = find();
        if (id >= 0) {
            System.out.println("Nhập tên sản phẩm mới: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá: ");
            double gia = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập mô tả: ");
            String moTa = scanner.nextLine();

            sanPhams.get(id).tenSanPham = name;
            sanPhams.get(id).gia = gia;
            sanPhams.get(id).soLuong = soLuong;
            sanPhams.get(id).moTa = moTa;

        } else {
            System.out.println("Không tìm thấy sản phẩm, vui lòng nhập lại!!");
        }
    }

    @Override
    public void delete() {
        int id = find();

        if (id >= 0) {
            sanPhams.remove(id);
        } else {
            System.out.println("Không tìm thấy sản phẩm, vui lòng nhập lại!!");
        }
    }

    @Override
    public void sort() {

    }
}
