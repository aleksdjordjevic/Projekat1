package MucZaBuc;


    public abstract class Grocery implements Energy {
        //Поља:company - String (Imlek, Stark, Carnex, ...),name - String
        private String company;
        private String name;
        private Double kcal;

        public Grocery (String company, String name, Double kcal) {
            this.company = company;
            this.name = name;
            this.kcal = kcal;
        }

        public Grocery (String company, String name) {
            this.company = company;
            this.name = name;
            this.kcal=0.0;
        }

        public Grocery() {   //na ovaj konstruktor gleda super() iz Nutriment, ali super(company,  name)
            // ne vidi konstruktor public Grocery (String company, String name)-ZASTO

        }

        public void setCompany(String company) {
            this.company = company;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany() {
            return company;
        }
        public String getName() {
            return name;
        }

        public Double getKcal(){
            return kcal;
        };

        public void setKcal(Double kcal){
            this.kcal = kcal;
        }
        //Методе: Grocery(String name), getName()getId()--???


        // equals(Object o) - Два објекта класе Grocery су иста ако су company и name исти

    }
