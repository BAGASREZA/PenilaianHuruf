package perkuliahan;

public class Penilaian {
    public String hitungNilaiHuruf (int nilaiMatematika,int nilaiFisika, int nilaiKimia,int nilaiBiologi, int nilaiKomputer){
        String nilaiDalamHuruf;
        
        int nilaiRataRata = (nilaiMatematika + nilaiFisika + nilaiKimia + nilaiBiologi + nilaiKomputer)/5;
        
        if (nilaiRataRata <= 100 && nilaiRataRata >= 90){
            nilaiDalamHuruf = "A";
        } else if (nilaiRataRata <= 90 && nilaiRataRata >= 80){
            nilaiDalamHuruf = "B";
        } else if (nilaiRataRata <= 80 && nilaiRataRata >= 70){
            nilaiDalamHuruf = "C";
        } else if (nilaiRataRata <= 70 && nilaiRataRata >= 60){
            nilaiDalamHuruf = "D";
        } else if (nilaiRataRata <= 60 && nilaiRataRata >= 0){
            nilaiDalamHuruf = "E";
        } else {
            nilaiDalamHuruf = "input salah";
        }
        return nilaiDalamHuruf;
    }

    public String hitungNilaiHuruf(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
