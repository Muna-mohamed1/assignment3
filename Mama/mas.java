package Mama;

abstract class mas {

        int ID;
        String Name;

        public mas (int ID, String Name)
        {
            this.ID=ID;
            this.Name=Name;
        }

        public abstract void getDetails();

        public int compute(int number)
        {
            return number * 10 ;
        }


    }


