
public class Circle {
	public double BanKinh;
	//constructor 
	public Circle(double BanKinh){
		this.BanKinh = BanKinh;
	}
	public Circle(){
		
	}
	public double TinhDienTich(){
		double S = 0;
		S = 3.14*Math.pow(this.BanKinh, 2);
		return S;
	}
	
	public double TinhChuVi(){
		double C = 0;
		C = 2*3.14*this.BanKinh;
		return C;
	}

	public void setBanKinh(double banKinh) {
		BanKinh = banKinh;
	}
	
}
