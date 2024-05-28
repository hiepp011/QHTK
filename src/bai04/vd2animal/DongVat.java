package bai04.vd2animal;

public class DongVat {
	private String ten;
	private int tuoi;
	private float cannang;

	public DongVat(String ten, int tuoi, float cannang) {
		super();
		this.setTen(ten);
		this.setTuoi(tuoi);
		this.setCannang(cannang);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getCannang() {
		return cannang;
	}

	public void setCannang(float cannang) {
		this.cannang = cannang;
	}

	@Override
	public String toString() {
		return "DongVat [ten=" + ten + ", tuoi=" + tuoi + ", cannang=" + cannang + "]";
	}

}
