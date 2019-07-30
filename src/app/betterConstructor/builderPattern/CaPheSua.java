package app.betterConstructor.builderPattern;

import app.utils.Loai;

/**
 * Pha ca phe sua bang builder pattern (khong co tinh thuc dung - chi la 1 trong nhung cach implement builder pattern) 
 * when:
 * - Loai bo su trung lap cua cac constructor trong 1 class (telescoping constructor anti-pattern) 
 * - Encapsulate(create) 1 immutable class 
 * why:
 *  - gon, dep, de nhin - giup viec tao constructor dynamically
 *  -thuan tien hon trong testing 
 * who:
 *  - tester 
 * how:
 *  - tao 1 inner build class
 *  -tao 1 package rieng biet chua cac builder song song voi object tuong ung
 */
public class CaPheSua {

    private Double caPhe;
    private Double sua;
    private Loai loai;

    public CaPheSua(Builder builder) {
        this.caPhe = builder.caPhe;
        this.sua = builder.sua;
        this.loai = builder.loai;
    }

    

    public static class Builder {
    
        private Double caPhe;
        private Double sua;
        private Loai loai;

    
        public Builder caPhe(double caPhe) {
            if(caPhe<=0){
                throw new IllegalArgumentException("Ca phe sua khong the khong co ca phe");
            }
            this.caPhe = caPhe;
            return this;
        }
    
        public Builder sua(double sua) {
            if(sua<=0){
                throw new IllegalArgumentException("Ca phe sua khong the khong co sua");
            }
            this.sua = sua;
            return this;
        }

        public Builder loai(Loai loai) {
            this.loai = loai;
            return this;
        }

        public CaPheSua build(){
            return new CaPheSua(this);
        }
    }

    @Override
    public String toString() {
        return "CaPheSua [caPhe=" + caPhe + ", loai=" + loai + ", sua=" + sua + "]";
    }
}