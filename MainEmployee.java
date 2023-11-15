import java.util.Scanner;
public class MainEmployee {
	public static void main(String[] args) {
		String ten, chucvu;
		double hesoluong = 0;
		Scanner ip = new Scanner(System.in);
		int soluongnv = 0;
		Employee[] A = new Employee[10000];
		//Giao dien nguoi dung:
		int key = 0;
		while(true){
			System.out.print("\n+---------------------------------------+");
			System.out.print("\n|     1.Nhap thong tin nhan vien        |");
			System.out.print("\n|     2.Them n nhan vien                |");
			System.out.print("\n|     3.Xuat thong tin nhan vien        |");
			System.out.print("\n|     4.Thoat                           |");
			System.out.print("\n+---------------------------------------+");
			System.out.print("\nNhap phim chon: ");
			key = ip.nextInt();
			switch(key){
			case 1:
				System.out.print("Nhap so luong nhan vien: ");
				soluongnv = ip.nextInt();
				for(int i=0 ; i<soluongnv ; i++){
					System.out.print("\nNhap thong tin nhan vien thu "+(i+1));
					ip.nextLine();
					System.out.print("\nNhap vao ten: ");
					ten = ip.nextLine();
					System.out.print("Nhap vao chuc vu: ");
					chucvu = ip.nextLine();
					System.out.print("Nhap he so luong: ");
					hesoluong = ip.nextDouble();
					A[i] = new Employee(ten,chucvu,hesoluong);
				}
				break;
			case 2: //them thong tin n nhan vien
				int soluongthem=0;
				System.out.print("\nNhap so luong nhan vien can them: ");
				soluongthem = ip.nextInt();
				soluongnv += soluongthem;
				for(int i=soluongnv-1 ; i<soluongnv ; i++){
					System.out.print("\nNhap thong tin nhan vien thu "+(i+1));
					ip.nextLine();
					System.out.print("\nNhap vao ten: ");
					ten = ip.nextLine();
					System.out.print("Nhap vao chuc vu: ");
					chucvu = ip.nextLine();
					System.out.print("Nhap he so luong: ");
					hesoluong = ip.nextDouble();
					A[i] = new Employee(ten,chucvu,hesoluong);
				}
				break;
			case 3: 
				for(int i=0 ; i<soluongnv ; i++){
					System.out.print("\n\nThong tin nhan vien thu "+(i+1)+": ");
					A[i].OutPut();
					System.out.print("\nLuong: "+A[i].TinhLuong()+" trieu dong");
				}
				System.out.print("\nAn phim bat ki de tiep tuc!");
				ip.nextLine();
				ip.nextLine();
				break;
			case 4: 
				System.out.print("\nKet thuc chuong trinh!");
				System.exit(1);
			default:
				System.out.print("\nKhong co chuc nang nay!");
				System.exit(0);
				break;
			}
		}
	}

}
