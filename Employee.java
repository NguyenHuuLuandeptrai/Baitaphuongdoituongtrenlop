
public class Employee {
	private String Ten, ChucVu;
    private double Luong,HeSo;
    public Employee(String Ten, String ChucVu, double HeSo){
    	this.Ten = Ten;
    	this.ChucVu = ChucVu;
    	this.HeSo = HeSo;
    }
    public void OutPut(){
    	System.out.print("\nTen cua nhan vien: "+this.Ten);
    	System.out.print("\nChuc vu cua nhan vien: "+this.ChucVu);
    }
    
    public double TinhLuong(){
    	double luongcoban = 1.8;
    	return this.Luong = luongcoban*this.HeSo;
    }
    
    public boolean Xoanhanvien(String Nhanviencanxoa){
    	return (this.Ten.equalsIgnoreCase(Nhanviencanxoa));
    }
}
