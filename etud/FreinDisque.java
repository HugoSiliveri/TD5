package etud;
/** Représente des freins à disque */
public class FreinDisque extends VoitureMontee{

    /** Décore une voiture avec des freins à disque */
    public FreinDisque(Voiture v) {
        super(v);
    }

    @Override
    public float getPrix() {
        return super.getPrix() + 20;
    }

    @Override
    public float getMasse() {
        return super.getMasse() + 10;
    }

    @Override
    public float getFreinage() {
        return super.getFreinage() + 0.7f;
    }
}
