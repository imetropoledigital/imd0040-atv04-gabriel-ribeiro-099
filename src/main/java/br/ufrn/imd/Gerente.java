package br.ufrn.imd;

public class Gerente extends Funcionario {

    protected enum Nivel {
        JUNIOR(1000), PLENO(2000), SENIOR(3000);
        private double bonus;

        private Nivel(double bonus) {
            this.bonus = bonus;
        }

//        public static Nivel valueOf(String nivel) {
//            for (Nivel n : Nivel.values()) {
//                if (n.name().equalsIgnoreCase(nivel)) {
//                    return n;
//                }
//            }
//            throw new IllegalArgumentException("Nível inválido: " + nivel);
//        }
    }

    private Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel) {
        super(chMensal, hh);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = chMensal * hh;
        double salarioTotal = salarioBase + nivel.bonus;
        return salarioTotal;
    }
}
