package quanly_sanpham;

import java.util.Comparator;

public class SortPriceMax implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        double gia1 = o1.gia;
        double gia2 = o2.gia;
        if (gia1 < gia2) {
            return 1;
        } else {
            return -1;
        }
    }
}
