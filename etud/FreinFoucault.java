package etud;

/** Représente des freins à courant de foucault */
public class FreinFoucault extends VoitureMontee{

	/** Décore une voiture avec des freins à disque */
	public FreinFoucault(Voiture v) {
		super(v);
	}

	@Override
	public float getPrix() {
		return super.getPrix() + 50;
	}

	@Override
	public float getMasse() {
		return super.getMasse() + 30;
	}

	@Override
	public float getFreinage() {
		return super.getFreinage() + 0.99f;
	}
}
