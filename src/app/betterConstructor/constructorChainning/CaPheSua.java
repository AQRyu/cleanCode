package app.betterConstructor.constructorChainning;

/**
 * Pha ca phe sua
 */
public class CaPheSua {
    enum Loai {
        NONG, LANH;
    }

    private Double caPhe;
    private Double sua;
    private Loai loai;

    CaPheSua() {
    }

    CaPheSua(double caPhe) {
        this();
        if(caPhe<=0){
            throw new IllegalArgumentException("Ca phe sua khong the khong co ca phe");
        }
        this.caPhe = caPhe;
    }

    CaPheSua(double caPhe, double sua) {
        this(caPhe);
        if(sua<=0){
            throw new IllegalArgumentException("Ca phe sua khong the khong co sua");
        }
        this.sua = sua;
    }

    CaPheSua(double caPhe, double sua, Loai loai) {
        this(caPhe, sua);
        this.loai = loai;
    }

    public Double getCaPhe() {
        return caPhe;
    }

    public void setCaPhe(Double caPhe) {
        this.caPhe = caPhe;
    }

    public Double getSua() {
        return sua;
    }

    public void setSua(Double sua) {
        this.sua = sua;
    }

    public Loai getLoai() {
        return loai;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }

}