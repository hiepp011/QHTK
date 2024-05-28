package bai04.vd01;

public class SinhVien extends Nguoi {
	private String masoSV;
	private String nganh;

	public SinhVien(String hoTen, int namSinh, String masoSV, String nganh) {
		super(hoTen, namSinh);
		this.setMasoSV(masoSV);
		this.setNganh(nganh);
	}

	public String getMasoSV() {
		return masoSV;
	}

	public void setMasoSV(String masoSV) {
		this.masoSV = masoSV;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return "SinhVien [masoSV=" + masoSV + ", nganh=" + nganh + ", toString()=" + super.toString() + "]";
	}

}
