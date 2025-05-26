package QLBN.QuanLyBenhNhan;

import java.util.Scanner;

public class dsbenhnhan {
	public static void main() {
		DSBN dsbn = new DSBN();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Them benh nhan");
			System.out.println("2. In danh sach benh nhan");
			System.out.println("3. Tim va in danh sach benh nhan vien phi >= 3000");
			System.out.println("4. Hien thi thong tin benh nhan bang ma");
			System.out.println("5. Thoat");
			System.out.print("Chon so: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
				case 1:
					System.out.println("Chon loai benh nhan: 1. Noi tru | 2. Ngoai tru");
					int loai = Integer.parseInt(sc.nextLine());

					// Thông tin chung
					System.out.print("Ma benh nhan: ");
					String ma = sc.nextLine();
					System.out.print("Ten benh nhan: ");
					String ten = sc.nextLine();
					System.out.print("Tien thuoc: ");
					double tienThuoc = Double.parseDouble(sc.nextLine());

					if (loai == 1) {
						System.out.print("So ngay nam vien: ");
						int soNgayNamVien = Integer.parseInt(sc.nextLine());
						System.out.print("Phi ngay: ");
						double phiNgay = Double.parseDouble(sc.nextLine());
						dsbn.themBenhNhan(new BNNoiTru(ten, ma, tienThuoc, soNgayNamVien, phiNgay));
					} else if (loai == 2) {
						System.out.print("Phi kham: ");
						double phiKham = Double.parseDouble(sc.nextLine());
						System.out.print("Phi xet nghiem: ");
						double phiXetNghiem = Double.parseDouble(sc.nextLine());
						dsbn.themBenhNhan(new BNNgoaiTru(ten, ma, tienThuoc, phiKham, phiXetNghiem));
					} else
						System.out.println("Loai benh nhan khong hop le!");
					break;

				case 2:
					dsbn.hienThiDanhSach();
					break;
			}
		}
	}
}

class DSBN {
	private java.util.List<BenhNhan> danhSachBenhNhan;

	public DSBN() {
		// Mảng động, có thể thay đổi kích thước
		danhSachBenhNhan = new java.util.ArrayList<>();
	}

	public void themBenhNhan(BenhNhan bn) {
		danhSachBenhNhan.add(bn);
	}

	public void hienThiDanhSach() {
		for (BenhNhan bn : danhSachBenhNhan) {
			System.out.println(bn);
		}
	}
}
