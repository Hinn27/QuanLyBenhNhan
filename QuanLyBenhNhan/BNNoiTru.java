package QLBN.QuanLyBenhNhan;

public class BNNoiTru
		extends BenhNhan {
	private int soNgayNamVien;
	private double phiNgay;

	public BNNoiTru(String ten, String ma, double tienThuoc, int soNgayNamVien, double phiNgay) {
		super(ten, ma, tienThuoc);
		this.soNgayNamVien = soNgayNamVien;
		this.phiNgay = phiNgay;
	}

	public int getSoNgayNamVien() {
		return this.soNgayNamVien;
	}

	public void setSoNgayNamVien(int soNgayNamVien) {
		this.soNgayNamVien = soNgayNamVien;
	}

	public double getPhiNgay() {
		return this.phiNgay;
	}

	public void setPhiNgay(double phiNgay) {
		this.phiNgay = phiNgay;
	}

	public double phuPhi() {
		// toán tử 3 ngôi, điều kiện đúng thì 100, sai thì 50
		return (soNgayNamVien > 10) ? 100 : 50;
	}

	@Override
	public double vienPhi() {
		return getTienThuoc() * soNgayNamVien + phiNgay * soNgayNamVien + phuPhi();
	}

	@Override
	public String toString() {
		return super.toString() + ". So ngay nam vien: " + soNgayNamVien + ". Phi ngay: " + phiNgay + ". Vien phi: " +
				vienPhi();
	}
}
