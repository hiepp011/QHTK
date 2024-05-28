package bai04.vd01;

import java.time.LocalDate;

public class Nguoi {
	private String hoTen;
	private int namSinh;

	public Nguoi(String hoTen, int namSinh) {
		super();
		this.setHoTen(hoTen);
		this.setNamSinh(namSinh);
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		LocalDate ngayht = LocalDate.now();
		int namht = ngayht.getYear();
		if ((namSinh <= 0) || (namSinh > namht)) {
			System.out.println("nam sinh ko phu hop");
		} else {
			this.namSinh = namSinh;
		}
	}

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", namSinh=" + namSinh + "]";
	}

}
