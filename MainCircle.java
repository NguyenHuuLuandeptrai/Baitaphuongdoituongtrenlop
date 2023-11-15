import java.util.Scanner;
public class MainCircle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("\nNhap vao ban kinh cua hinh tron: ");
	    double BK = ip.nextDouble();
	    Circle t = new Circle();
	    t.setBanKinh(BK);
	    System.out.print("An phim bat ki de xuat hien giao dien");
	    ip.nextLine();
	    ip.nextLine();
		//Giao dien:
		int key = 0;
		while(true){
		System.out.print("\n+---------------------------------------+");
		System.out.print("\n|      1. Nhap lai ban kinh             |");
		System.out.print("\n|      2. Tinh Chu vi                   |");
		System.out.print("\n|      3. Tinh dien tich                |");
		System.out.print("\n|      4. Thoat                         |");
		System.out.print("\n+---------------------------------------+");
		System.out.print("\nNhap phim chon: ");
		key = ip.nextInt();
			switch(key){
				case 1:
					System.out.print("\nNhap lai ban kinh: ");
					double BK2 = ip.nextDouble();
					t.setBanKinh(BK2);
					break;
				case 2:
					System.out.print("\nChu vi hinh tron la: "+t.TinhChuVi());
					break;
				case 3:
					System.out.print("\nDien tich hinh tron la: "+t.TinhDienTich());
					break;
				case 4:
					System.out.print("\nKet thuc chuong trinh!");
					System.exit(1);
				default:
					System.out.print("\nKhong co chuc nang nay!");
					System.exit(0);
			}
		}		
	}
}

