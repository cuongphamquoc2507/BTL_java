/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28th10;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class sinhvien {
    protected String masv;
    private String hoten;
    private int tongdiem;
    public sinhvien(){
        
    }
    public sinhvien(String masv, String hoten, int tongdiem){
     this.masv=masv;
     this.hoten=hoten;
     this.tongdiem=tongdiem;
    }
     void nhap(){
        Scanner s=new Scanner(System.in);
        System.out.print(" Nhập mã sv: ");
        masv=s.nextLine();
        System.out.print("Nhập tên họ tên sinh viên: ");
        hoten=s.nextLine();
         System.out.println("Nhập tổng điểm của sinh viên");
         tongdiem=s.nextInt();
    }
      static void xuatTieuDe(){
        //Sử dụng hàm printf với mẫu hàm và khoảng cách tương tự để dóng dữ liệu
        System.out.printf("%-15s%-10s%15s%n", "Mã sv","Ten", "Tổng điểm");
    }
    public void xuat(){
         System.out.printf("%-15s%-10s%15s%n", masv, hoten, tongdiem);
    }

    
   
}