package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

abstract public class Person {
        private String namn;
        private String adress;
        private int ålder;
        private String kön;

        public Person(String namn, String adress, int ålder, String kön) {
            this.namn = namn;
            this.adress = adress;
            this.ålder = ålder;
            this.kön = kön;
        }

        public String getNamn() {
            return namn;
        }

        public void setNamn(String namn) {
            this.namn = namn;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public int getÅlder() {
            return ålder;
        }

        public void setÅlder(int ålder) {
            this.ålder = ålder;
        }

        public String getKön() {
            return kön;
        }

        public void setKön(String kön) {
            this.kön = kön;
        }
    }

