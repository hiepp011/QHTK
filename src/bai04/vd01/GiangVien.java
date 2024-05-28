package bai04.vd01;

public class GiangVien extends Nguoi {
	private String masoGV;
	private String trinhDo;
	private String chuyenNganh;

	public GiangVien(String hoTen, int namSinh, String masoGV, String trinhDo, String chuyenNganh) {
		super(hoTen, namSinh);
		this.setMasoGV(masoGV);
		this.setTrinhDo(trinhDo);
		this.setChuyenNganh(chuyenNganh);
	}

	public String getMasoGV() {
		return masoGV;
	}

	public void setMasoGV(String masoGV) {
		this.masoGV = masoGV;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public String toString() {
		return "GiangVien [masoGV=" + masoGV + ", trinhDo=" + trinhDo + ", chuyenNganh=" + chuyenNganh + ", toString()="
				+ super.toString() + "]";
	}

}
