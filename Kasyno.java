package kasyno;

public class Kasyno {

    private static Kasyno inst;
    int kasa;
    
private Kasyno(){
}
public static Kasyno inst(){
    if(inst == null){
        inst = new Kasyno();
    }
    return inst;
}

    public void setKasa(int kasa) {
        this.kasa = kasa;
    }
    public int getKasa() {
        return kasa;
    }

}
