package imaginbank;

public class cuentaBancaria {

    private final String IBAN;
    private final String Titular;
    private double Saldo;
    private double[] Movimiento;
    private int num_movimineto;

    public cuentaBancaria(String IBAN, String Titular) {
        if (IBAN.length() > 4 && IBAN.length() < 4) {
            System.out.println("ERROR el IBAN tiene que tener 4 caracteres");
        }
        if (Titular.isBlank() && Titular.isEmpty()) {
            System.out.println("ERROR el titular no tiene que estar en blanco");
        }
        if (Saldo < -50) {
            System.out.println("Error: El saldo no puede ser inferior a -50. ");
        }

        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimiento = new double[100];
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return Titular;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public double[] getMovimiento() {
        return Movimiento;
    }

    public void ingreso(double ingreso) {
        boolean vacio = false;
        if (ingreso < 0) {
            System.out.println("El ingreso no puede ser negativo");
        } else if (ingreso > 3000) {
            System.out.println("Notificar hacienda");
        } else {
            this.Saldo = this.Saldo + ingreso;
            for (int i = 0; i < Movimiento.length; i++) {
                if ((Movimiento[i] == 0) && (vacio = true)) {
                    vacio = true;
                    Movimiento[i] = ingreso;
                }
            }
        }
    }

    public void retirada(double retirada) {
        if (retirada > 3000) {
            System.out.println("Notificar a hacienda");
        } else {
            this.Saldo = this.Saldo - retirada;
            if (this.Saldo < -50) {
                System.out.println("No se ha realizado el movimiento, por saldo negativo");
            }
        }
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setMovimiento(double[] Movimiento) {
        this.Movimiento = Movimiento;
    }
    
    public void imprimir(){
        System.out.println("IBAN: " + getIBAN() + " - Titular: " + getTitular() 
                + " - Saldo: " + getSaldo());
    }

}
