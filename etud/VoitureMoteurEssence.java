package etud;

/** Représente un moteur à essence */
public class VoitureMoteurEssence extends VoitureMontee {
	/** Décore la voiture spécifiée avec un moteur à essence */
	public VoitureMoteurEssence(Voiture v) {
		super(v);
	}

	@Override
	public float getMasse() {
		return super.getMasse() + 400;
	}

	@Override
	public float getPrix() {
		return super.getPrix() + 900;
	}

	@Override
	public float getAcceleration() {
		return super.getAcceleration() + 0.65f;
	}
}
