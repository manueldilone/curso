public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public Motor(){

    }
    public Motor(double cilindrada, TipoMotor tipo){

    this.cilindrada = cilindrada; // 1.1
    this.tipo=tipo;


}





}
