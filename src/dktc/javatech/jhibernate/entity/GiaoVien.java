package dktc.javatech.jhibernate.entity;

public class GiaoVien {
	private int idGiaoVien;
	private String tenGiaoVien;
	private String tuoi;
	private String sdt;
	
	public int getIdGiaoVien() {
		return idGiaoVien;
	}
	public void setIdGiaoVien(int idGiaoVien) {
		this.idGiaoVien = idGiaoVien;
	}
	public String getTenGiaoVien() {
		return tenGiaoVien;
	}
	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
}
