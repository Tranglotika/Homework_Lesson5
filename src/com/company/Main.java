package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product products[] = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập mã sản phẩm thứ %d: ", i + 1);
            String id = sc.nextLine();
            System.out.printf("Nhập tên sản phẩm thứ %d: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Mô tả sản phẩm thứ %d: ", i + 1);
            String description = sc.nextLine();
            System.out.printf("Nhập số lượng sản phẩm thứ %d: ", i + 1);
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhập giá bán sản phẩm thứ %d: ", i + 1);
            int price = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhập loại sản phẩm thứ %d: ", i + 1);
            String producttype = sc.nextLine();

            Product p = new Product(id, name, description, quantity, price, producttype);
            products[i] = p;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(products[i]);
        }

        //Tìm sản phẩm dựa theo tên
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (products[i].name.contains(findName)) {
                System.out.println(products[i]);
            } else {
                System.out.println("Không có sản phẩm này");
            }
        }
    }
}
