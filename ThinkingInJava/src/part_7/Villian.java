package part_7;

class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я объект Villain и мое имя " + name;
    }
}

class Orc extends Villain {
        private int orcNumber;

        public Orc(String name, int orcNumber) {
            super(name);
            this.orcNumber = orcNumber;
        }

        public void change(String name, int orcNumber) {
            set(name); // Доступно, так как объявлено protected
            this.orcNumber = orcNumber;
        }

        public String toString() {
            return "Orc " + orcNumber + ": " + super.toString();
        }

        public static void main(String[] args) {
            Orc orc = new Orc("Лимбургер", 12);
            System.out.println(orc);//при вызове sout вызывается метод toString который мы переопределили
            orc.change("Bob", 19);
            System.out.println(orc);
        }
    }