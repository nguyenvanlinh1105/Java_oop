package Bai4;

import java.util.Scanner;

public class DSShape {
    private Shape[] list;
    private int currentIndex=0; 
    
    
    public DSShape(int size) {
        list = new Shape[size];
    }
    public DSShape(){
        
    }
            
    public Shape[] getShapes() {
        return list;
    }
        
     public void addShape(Shape shape) {
        if (currentIndex >= 0 && currentIndex < list.length) {
            list[currentIndex] = shape;
            currentIndex++; // Tăng index sau khi thêm hình
        } else {
            System.out.println("Invalid index.");
        }
    }

    public Shape getShape(int index) {
        // vì khi khởi tạo mảng thì phần tử bắt đầu có index = 0 vì vậy chúng ta làm việc với index = 0 đến n-1;
        if (index >= 0 && index < list.length+1) {
            return list[index];
        } else {
            System.out.println("Invalid index");
            return null;
        }
    }

    public static double tinhtongdientich(Shape[] list1) {
        double totalArea = 0;
        int n = list1.length;
        for (int i = 0;i<n;i++) {
            if (list1[i] != null) {
                totalArea += list1[i].getArea();
            }
        }
        return totalArea;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập vào hình nào ?");
        int luaChon =0;
         do{
             System.out.println("1.Thêm hình tròn ");
             System.out.println("2.Thêm hình chữ nhật ");
             System.out.println("0. Hủy thêm hình.");
             luaChon= sc.nextInt(); sc.nextLine();
             switch(luaChon){
                 case 1:
                        int luaChonHinh1 = 0;
                        System.out.println("Hãy nhập lựa chọn ");
                        System.out.println("1.Thêm một hình tròn với kích thước bán kính mặc đinh");
                        System.out.println("2.Thêm một hình tròn kích thước bán kính r nhập vào bàn phím");
                        luaChonHinh1 = sc.nextInt();
                        sc.nextLine();
                        if(luaChonHinh1==1){
                            Shape circle = new Circle();
                            this.addShape(circle);
                        }else if(luaChonHinh1==2){
                            System.out.println("Nhập vào bán kính: ");
                            int r = sc.nextInt();sc.nextLine();
                            Shape circle = new Circle(r);
                            this.addShape(circle);
                        }
                        break;
                        
                 case 2:
                        int luaChonHinh2 = 0;
                        System.out.println("Hãy nhập lựa chọn ");
                        System.out.println("1.Thêm một hình chữ nhật với kích thước mặc đinh");
                        System.out.println("2.Thêm một chữ nhật với width và height nhập vào bàn phím");
                        luaChonHinh2 = sc.nextInt();
                        sc.nextLine();
                        if(luaChonHinh2==1){
                            Shape rectangle = new Rectangle();
                            this.addShape( rectangle);
                        }else if(luaChonHinh2==2){
                            System.out.println("Nhập vào chiều dài");
                            int chieuDai = sc.nextInt();
                            System.out.println("Nhập vào chiều rộng:");
                            int chieuRong = sc.nextInt();
                            Shape rectangle = new Rectangle(chieuDai, chieuRong);
                            this.addShape(rectangle);
                        }
                        
                         break;
                }
        
            }while(luaChon!=0);
    }
    public void ShowShapes(){
        int n = list.length;
        int dem =0;
        for(int i = 0;i<n;i++){
            Shape shape = this.getShape(i);
            if(shape != null){
                dem++;
                System.out.println("Hình thứ "+i+": ");
                System.out.println("Diện tích :"+shape.getArea());
                System.out.println("-------------");
            }
        }
        if(dem==0){
            System.out.println("Không có phần tử nào trong mảng để hiển thị");
        }
    }

}

