package bai04.vd2animal;

public class Meo extends DongVat {
	private String giongmeo;
	private String maulong;

	public Meo(String ten, int tuoi, float cannang, String giongmeo, String maulong) {
		super(ten, tuoi, cannang);
		this.setGiongmeo(giongmeo);
		this.setMaulong(maulong);
	}

	public String getGiongmeo() {
		return giongmeo;
	}

	public void setGiongmeo(String giongmeo) {
		this.giongmeo = giongmeo;
	}

	public String getMaulong() {
		return maulong;
	}

	public void setMaulong(String maulong) {
		this.maulong = maulong;
	}

	@Override
	public String toString() {
		return "Meo [giongmeo=" + giongmeo + ", maulong=" + maulong + ", getTen()=" + getTen() + ", getTuoi()="
				+ getTuoi() + ", getCannang()=" + getCannang() + ", toString()=" + super.toString() + "]";
	}

}
