package org.tvf.singleton;

import java.util.Objects;

public class Singleton {
    private String data;
    private static Singleton instance = null;

    /**
     * private constructor để ngăn không cho bất kỳ thành phần nào bên ngoài lớp gọi new và tạo 1 instance mới
     *
     */
    private Singleton() {
        data = "Example data for singleton class";
    }

    /**
     * Vì constructor là private, bạn cần 1 cách để truy cập instance duy nhất của lớp mà không cần tạo mới đối tượng trước. Thì static có thể gọi trực tiếp từ tên lớp.
     * @return instance
     */
    private static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    /**
     * Tại sao không dùng public static instance trực tiếp?
     * - Có một cách đơn giản hơn là khai báo public static Singleton instance = new Singleton(); và access qua Singleton.instance.
     * Không kiểm soát được thời điểm khởi tạo. (Vì instance sẽ được tạo ngay khi lớp được nạp (eager initialization) --> lãng phí tài nguyên nếu instance chưa cần dùng ngay.
     * Không linh hoạt. --> Không thể thêm logic khởi tạo châm (lazy initialization) hoặc xử lý các trường hợp đặc biệt.
     * @param args
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (Objects.equals(s1.data, s2.data)) {
            System.out.println("Both objects are same");
        }else {
            System.out.println("Both objects are different");
        }
    }
}

