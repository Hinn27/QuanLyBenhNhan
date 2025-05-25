package QuanLyBenhNhan.QuanLyBenhNhan;

public abstract class BNNgoaiTru
		extends BenhNhan {
	private double phiKham, phiXetNghiem;

	public BNNgoaiTru(String ten, String ma, double tienThuoc, double phiKham, double phiXetNghiem) {
		super(ten, ma, tienThuoc);
		this.phiKham = phiKham;
		this.phiXetNghiem = phiXetNghiem;
	}

	public double getPhiKham() {
		return this.phiKham;
	}

	public void setPhiKham(double phiKham) {
		this.phiKham = phiKham;
	}

	public double getPhiXetNghiem() {
		return this.phiXetNghiem;
	}

	public void setPhiXetNghiem(double phiXetNghiem) {
		this.phiXetNghiem = phiXetNghiem;
	}

	@Override
	public double vienPhi() {
		return phiKham + phiXetNghiem + tienThuoc;
	}

	@Override
	public String toString() {
		return super.toString() + ". Phi kham: " + phiKham + ". Phi xet nghiem: " + phiXetNghiem + ". vienPhi: " +
				vienPhi();
	}
}
