package etud;

public abstract class VoitureMontee implements Voiture{

    private Voiture voiture;

    public VoitureMontee(Voiture v) {
        super();
        this.voiture = v;
    }

    @Override
    public float getPrix() {
        return voiture.getPrix();
    }

    @Override
    public float getMasse() {
        return voiture.getMasse();
    }

    @Override
    public float getPuissanceMoteur() {
        return voiture.getPuissanceMoteur();
    }

    @Override
    public float getRegimeOptimal() {
        return voiture.getRegimeOptimal();
    }

    @Override
    public float getForceFreinageCst() {
        return voiture.getForceFreinageCst();
    }

    @Override
    public float getCoeffFreinageProp() {
        return voiture.getCoeffFreinageProp();
    }

    @Override
    public float getRapportRouesMoteur() {
        return voiture.getRapportRouesMoteur();
    }

    @Override
    public float getRayonRoues() {
        return voiture.getRayonRoues();
    }

    @Override
    public float getAcceleration() {
        return voiture.getAcceleration();
    }

    @Override
    public float getFreinage() {
        return voiture.getFreinage();
    }
}
