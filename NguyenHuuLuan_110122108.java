import java.util.Scanner;
import java.lang.Math;
public class NguyenHuuLuan_110122108 {

	public static void main(String[] args) {
		int n, tong = 0;
		float a,b,c;
		Scanner ip = new Scanner(System.in);
		System.out.print("---TINH TONG TU 1 DEN N---");
		System.out.print("\nNhap vao n: ");
		n = ip.nextInt();
		//Tinh tong tu 1 den n nhap tu ban phim
	    for(int i=1 ; i <= n ; i++){
	    	tong += i;
	    }
	    System.out.print("Tong tu 1 den n la: "+tong);
        System.out.print("\nAn phim bat ki de kiem tra a,b,c co the tao thanh 1 tam giac hay khong!");
	    ip.nextLine();
	    ip.nextLine();
	   //Bai 3 kiem tra tam giac
        System.out.print("\n\n---KIEM TRA A,B,C TAO THANH TAM GIAC---");
		 boolean check = false;
	    System.out.print("\nNhap vao a: ");
	    a = ip.nextFloat();
	    System.out.print("Nhap vao b: ");
	    b = ip.nextFloat();
	    System.out.print("Nhap vao c: ");
	    c = ip.nextFloat();
	    if(a+b>c && a+c>b && b+c>a){
	    	check = true;
	    }
	    
	    //In ra man hinh ket qua: 
	    if(check == true){
	    	System.out.print("a,b,c co the tao thanh mot tam giac!");
	    }
	    else{
	        System.out.print("a,b,c khong the tao thanh mot tam giac!");
	    }
	    
	    
	    //Xet truong hop tam giac can
	    boolean check2 = false;
	    if(check == true){  //Neu a,b,c co the tao thanh mot tam giac
	    	
		    if(a==b){
		    	check2 = true;
		    }
		    else if(a==c){
		    	check2 = true;
		    }
		    else if(b==c){
		    	check2 = true;
		    }
		    
		    //In ra man hinh ket qua:
		    if(check2==true){
		    	System.out.print("\nabc la mot tam giac can!");
		    }
		    else{
		    	System.out.print("\nabc khong the tao thanh tam giac can");
		    }
	    }
	   
	    //Xet truong hop tam giac deu: 
	    if(check==true){
	    	if(a==b && a==c){
	    		System.out.print("\nabc la mot tam giac deu");
	    	}
	    }
	    
	    //Xet truong hop tam giac vuong: 
	    boolean check3 = false;
	    if(check == true){
	    	
	    	if(a>b && a>c){
	    		if( (a*a) == ((b*b)+(c*c))){
	    			check3 = true;
	    		}
	    	}
	    	else if(b>a && b>c){
	    		if( (b*b) == ((a*a)+(c*c)) ){
	    			check3 = true;
	    		}
	    	}
	    	else if(c>a && c>b){
	    		if( c*c == ((a*a)+(b*b)) ){
	    			check3 = true;
	    		}
	    	}
	    	//Xuat ra man hinh ket qua: 
	    	if(check3==true){
	    		System.out.print("\nabc la mot tam giac vuong!");
	    	}
	    	else{
	    		System.out.print("\nabc khong phai la mot tam giac vuong!");
	    	}
	    }
	    
	    
	    //Xet truong hop tam giac vuong can:
	    if(check3 == true && check2 == true){
	    	System.out.print("\nabc la mot tam giac vuong can!");
	    }
	    else{
	    	System.out.print("\nabc khong phai la mot tam giac vuong can!");
	    }
	    
	    //Xet truong hop tam giac thuong:
	    if(check == true && check2 == false && check3 == false){
	    	System.out.print("\nabc la tam giac thuong!");
	    }
	    else{
	    	System.out.print("\nabc khong la tam giac thuong!");
	    }
	    System.out.print("\nAn phim bat ki de tim so lon nhat trong 4 so nhap tu ban phim!");
	    ip.nextLine();
	    ip.nextLine();
	    
	    System.out.print("\n\n---TIM MAX 4 SO---");
	    //Viet chuong trinh nhap vao 4 số nguyen duong va tim so lon nhat trong 4 so nguyen duong
	    int s1=0,s2=0,s3=0,s4 = 0, max=0;
	    do{
	    	System.out.print("\nNhap 4 so duong:");
		    System.out.print("\nNhap vao so nguyen duong thu nhat: ");
		    s1 = ip.nextInt();
		    System.out.print("Nhap vao so nguyen duong thu hai: ");
		    s2 = ip.nextInt();
		    System.out.print("Nhap vao so nguyen duong thu ba: ");
		    s3 = ip.nextInt();
		    System.out.print("Nhap vao so nguyen duong thu bon: ");
		    s4 = ip.nextInt();
	    }while(s1<0||s2<0||s3<0||s4<0);
	    
	    if(s1 > s2 && s1>s3 && s1>s4){
	    	max = s1;
	    }
	    else if(s2 > s1 && s2 > s3 && s2 > s4){
	    	max = s2;
	    }
	    else if(s3 > s1 && s3 > s2 && s3 > s4){
	    	max = s3;
	    }
	    else if(s4 > s1 && s4 > s2 && s4 > s3 ){
	    	max = s4;
	    }
	    System.out.print("\nSo lon nhat trong 4 so la: "+max);
	    System.out.print("\nAn phim bat ki de giai phuong trinh bac 2!");
	    ip.nextLine();
	    ip.nextLine();
	    // Giai phuong trinh bac 2
	    System.out.print("\n\n---GIAI PHUONG TRINH BAC 2---");
	    double A,B, C,Delta,x1,x2;
	    System.out.print("\nNhap vao so A: ");
	    A = ip.nextDouble();
	    System.out.print("Nhap vao so B: ");
	    B = ip.nextDouble();
	    System.out.print("Nhap vao so C: ");
	    C = ip.nextDouble();
	    
	    //Tinh Delta
	    Delta = (B*B) - (4*A*C);
	    if(Delta < 0){
	    	System.out.print("\nPhuong trinh vo nghiem!");
	    }
	    else if(Delta == 0){
	    	x1 = (-B/(2*A));
	    	System.out.print("Nghiem kep x1 = x2 =  "+x1);
	    }
	    else if(Delta > 0){
	    	x1 = (((-B) + Math.sqrt(Delta))/(2*A));
	    	x2 = (((-B) - Math.sqrt(Delta))/(2*A));
	    	System.out.print("Nghiem thu nhat= "+x1);
	    	System.out.print("Nghiem thu hai= "+x2);
	    }
	    
	    System.out.print("\nAn phim bat ki de ket thuc chuong trinh");
	    ip.nextLine();
	    ip.nextLine();
	}

}
