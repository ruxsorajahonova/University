package University;

public class Direktor extends Shablon {
    double oylik;


    public Direktor(double maosh, String ism, String fam, String otaIsm, String phoneNumber, String email1){
        oylik =maosh;
        super.name=ism;
        super.surname=fam;
        super.middleName=otaIsm;
        super.phoneNumber=phoneNumber;
        super.email=email1;
    }
    public Direktor(){}
}
