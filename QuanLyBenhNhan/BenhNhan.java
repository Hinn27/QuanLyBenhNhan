package QLBN.QuanLyBenhNhan;

public abstract class BenhNhan
		implements IBenhNhan {
	private String ten;
	private String ma;
	private double tienThuoc;

	public BenhNhan() {
		this.ten = "";
		this.ma = "";
		this.tienThuoc = 0.0;
	}

	public BenhNhan(String ten, String ma, double tienThuoc) {
		this.ten = ten;
		this.ma = ma;
		this.tienThuoc = tienThuoc;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public double getTienThuoc() {
		return this.tienThuoc;
	}

	public void setTienThuoc(double tienThuoc) {
		this.tienThuoc = tienThuoc;
	}

	@Override
	public String toString() {
		return "Ten: " + ten + ". Ma: " + ma + ". Tien thuoc: " + tienThuoc;
	}
}
