package etud;

public class AdaptateurChassis extends Chassis{

    private ChassisAnglais chassisAnglais;

    public AdaptateurChassis(ChassisAnglais chassisAnglais) {
        this.chassisAnglais = chassisAnglais;
    }

    @Override
    public float getMasse() {
        return chassisAnglais.getMass();
    }

    @Override
    public float getPuissanceMoteur() {
        return super.getPuissanceMoteur();
    }

    @Override
    public float getRegimeOptimal() {
        return super.getRegimeOptimal();
    }

    @Override
    public float getForceFreinageCst() {
        return super.getForceFreinageCst();
    }

    @Override
    public float getCoeffFreinageProp() {
        return super.getCoeffFreinageProp();
    }

    @Override
    public float getRapportRouesMoteur() {
        return super.getRapportRouesMoteur();
    }

    @Override
    public float getRayonRoues() {
        return super.getRayonRoues();
    }

    @Override
    public float getAcceleration() {
        return chassisAnglais.getAccel();
    }

    @Override
    public float getFreinage() {
        return chassisAnglais.getBreaking();
    }

    @Override
    public float getPrix() {
        return chassisAnglais.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
