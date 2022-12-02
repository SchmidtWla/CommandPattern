package receiver;

public class Stereoanlage {

	private String cd;
	private boolean an;
	private boolean spielt;
	private int lautstaerke;
	
	public void spieleAb() {
		this.spielt = true;
		System.out.println("Starte das playback...");
	}
	
	public void stoppePlayback(){
		this.spielt = false;
		System.out.println("Stoppe das Playnack");
	}
	
	public void anschalten() {
		this.an = true;
		System.out.println("Die Stereoanlage ist jetzt AN");
	}
	
	public void ausschalten() {
		this.an = false;
		System.out.println("Die Stereoanlage ist jetzt aus");
	}
	
	public void setLautstaerke(int lautst) {
		this.lautstaerke = lautst;
		System.out.println("Ändere Lautstärke");
	}
	
	public int getLautstaerke () {
		return this.lautstaerke;
	}
	
	public void setCD(String cdName) {
		this.cd = cdName;
	}
	
	public String getCD() {
		return this.cd;
	}
	
	
	public Stereoanlage() {
		this.an = false;
		this.cd = new String("NO CD");
		this.lautstaerke = 4;
		this.spielt = false;
	}

}
