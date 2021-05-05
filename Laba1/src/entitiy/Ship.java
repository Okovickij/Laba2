package entitiy;
public class Ship {
    Cargo cargo =new Cargo();
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    private int id;
        public int getId()
        {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String nameOfShip;
        public String getNameOfShip()
        {
            return nameOfShip;
        }
    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public Ship(int id,String nameOfShip,int x,int y,int z)
        {
            this.setId(id);
            this.setNameOfShip(nameOfShip);
            this.cargo.setNumberOfBigCargo(x);
            this.cargo.setNumberOfSmallCargo(y);
            this.cargo.weight = z;
        }
}
