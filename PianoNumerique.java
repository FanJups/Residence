public class PianoNumerique extends Piano{

	private boolean avoirToucherLourd;
	private int[] qualiteEchantillonnage = {1,2,3};
	
	public PianoNumerique() {
		
	}
	
	public PianoNumerique(boolean avoirToucherLourd, int[]qualiteEchantillonnage) {
		super.getNom();
		super.getPrixAchat();
		super.getPrixVente();
		super.getLongueur();
		super.getLargeur();
		super.getNombreTouche();
		this.avoirToucherLourd = avoirToucherLourd;
		this.qualiteEchantillonnage = qualiteEchantillonnage;
	}

	public boolean isAvoirToucherLourd() {
		return avoirToucherLourd;
	}

	public void setAvoirToucherLourd(boolean avoirToucherLourd) {
		this.avoirToucherLourd = avoirToucherLourd;
	}

	public int[] getQualiteEchantillonnage() {
		return qualiteEchantillonnage;
	}

	public void setQualiteEchantillonnage(int[] qualiteEchantillonnage) {
		this.qualiteEchantillonnage = qualiteEchantillonnage;
	}
	
}
