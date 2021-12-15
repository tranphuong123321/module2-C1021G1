package bai_7.bai_tap.trien_khai_interface_colorable;


    public class Rectangle extends Shape  {
        private double height = 1;
        private double windth = 2;

        public Rectangle() {
        }
        public Rectangle(double height, double windth) {
            this.height = height;
            this.windth = windth;
        }

        public Rectangle(String color, Boolean filled, double height, double windth) {
            super(color, filled);
            this.height = height;
            this.windth = windth;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWindth() {
            return windth;
        }

        public void setWindth(double windth) {
            this.windth = windth;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "height=" + height +
                    ", windth=" + windth +
                    super.toString()+
                    '}';
        }

    }

