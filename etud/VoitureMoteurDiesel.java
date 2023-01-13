package etud;

/** Représente un moteur diesel */
public class VoitureMoteurDiesel extends VoitureMontee{

	public VoitureMoteurDiesel(Voiture v) {
		super(v);
	}

	@Override
	public float getMasse() {
		return 300+super.getMasse();
	}

	@Override
	public float getPrix() {
		return 1500+ super.getPrix();
	}

	@Override
	public float getAcceleration() {
		return super.getAcceleration() + 0.50f;
	}
}
