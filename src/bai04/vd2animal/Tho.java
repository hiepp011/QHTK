package bai04.vd2animal;

public class Tho extends DongVat {
	private float chieudaitai;
	private String thucanyt;

	public Tho(String ten, int tuoi, float cannang, float chieudaitai, String thucanyt) {
		super(ten, tuoi, cannang);
		this.setChieudaitai(chieudaitai);
		this.setThucanyt(thucanyt);
	}

	public float getChieudaitai() {
		return chieudaitai;
	}

	public void setChieudaitai(float chieudaitai) {
		this.chieudaitai = chieudaitai;
	}

	public String getThucanyt() {
		return thucanyt;
	}

	public void setThucanyt(String thucanyt) {
		this.thucanyt = thucanyt;
	}

	@Override
	public String toString() {
		return "Tho [chieudaitai=" + chieudaitai + ", thucanyt=" + thucanyt + ", getTen()=" + getTen() + ", getTuoi()="
				+ getTuoi() + ", getCannang()=" + getCannang() + ", toString()=" + super.toString() + "]";
	}

}
